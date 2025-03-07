import os
import re
import json
import glob

def parse_log_file(log_file_path):
    """解析日志文件，提取方块信息"""
    blocks = []
    current_block = None
    
    with open(log_file_path, 'r', encoding='GB18030') as file:
        for line in file:
            line = line.strip()
            
            # 匹配方块基本信息
            block_info_match = re.match(r'方块ID: (\d+), 注册名称: ([^,]+), 未本地化名称: (.+)', line)
            if block_info_match:
                if current_block:
                    blocks.append(current_block)
                
                block_id, registry_name, unlocalized_name = block_info_match.groups()
                current_block = {
                    'id': int(block_id),
                    'registry_name': registry_name,
                    'unlocalized_name': unlocalized_name,
                    'textures': [None] * 6,
                    'render_type': None
                }
                continue
            
            # 匹配纹理信息
            texture_match = re.match(r'面 (\d+) 纹理: (.+)', line)
            if texture_match and current_block:
                face_index, texture = texture_match.groups()
                current_block['textures'][int(face_index)] = texture
                continue
                
            # 纹理为null的情况
            null_texture_match = re.match(r'面 (\d+) 纹理为null', line)
            if null_texture_match and current_block:
                face_index = int(null_texture_match.group(1))
                current_block['textures'][int(face_index)] = None
                continue
            
            # 匹配渲染类型结果
            render_type_match = re.match(r'结果: (.+)', line)
            if render_type_match and current_block:
                current_block['render_type'] = render_type_match.group(1)
                continue
    
    # 添加最后一个方块
    if current_block:
        blocks.append(current_block)
    
    return blocks

def normalize_texture_path(texture_path):
    """处理各种纹理路径格式"""
    if texture_path is None:
        return None, None, None
    
    # 分割路径，处理带变体的情况 (modid:texturename:variant)
    parts = texture_path.split(':')
    
    if len(parts) == 1:
        # 仅纹理名称
        return "minecraft", parts[0], None
    elif len(parts) == 2:
        # modid:texturename
        return parts[0].lower(), parts[1], None
    elif len(parts) == 3 or len(parts) > 3:
        # modid:texturename:variant (可能有多个冒号)
        mod_id = parts[0].lower()
        texture_name = parts[1]
        variant = parts[2]
        # 如果有更多部分，附加到variant
        if len(parts) > 3:
            variant += ":" + ":".join(parts[3:])
        return mod_id, texture_name, variant
    
    # 默认情况
    return "minecraft", texture_path, None

def find_texture_file(texture_path, base_dir):
    """查找纹理文件的实际位置"""
    if texture_path is None:
        return None
    
    mod_id, texture_name, variant = normalize_texture_path(texture_path)
    
    # 处理变体
    if variant:
        texture_name_with_variant = f"{texture_name}_{variant}"
    else:
        texture_name_with_variant = texture_name
    
    # 可能的子目录，按优先级排序
    possible_subdirs = [
        f"textures/{mod_id}/blocks",
        f"textures/{mod_id}/block",
        f"textures/{mod_id}"
    ]
    
    # 首先尝试带变体的纹理名称
    for subdir in possible_subdirs:
        search_pattern = os.path.join(base_dir, subdir, f"{texture_name_with_variant}.png")
        matching_files = glob.glob(search_pattern)
        
        if matching_files:
            rel_path = os.path.relpath(matching_files[0], base_dir)
            return f"blockstorage:{os.path.splitext(rel_path)[0]}"
    
    # 如果带变体的找不到，再尝试不带变体的纹理名称
    for subdir in possible_subdirs:
        search_pattern = os.path.join(base_dir, subdir, f"{texture_name}.png")
        matching_files = glob.glob(search_pattern)
        
        if matching_files:
            rel_path = os.path.relpath(matching_files[0], base_dir)
            return f"blockstorage:{os.path.splitext(rel_path)[0]}"
    
    # 如果都找不到，返回一个合理的推测路径
    return f"blockstorage:textures/{mod_id}/blocks/{texture_name_with_variant}"

def safe_filename(name):
    """将方块名称转换为安全的文件名"""
    # 替换点号和其他不安全的字符
    return re.sub(r'[.\\/:"*?<>|]', '_', name)

def parse_block_registry_name(registry_name):
    """解析方块的注册名称，处理特殊情况"""
    if not registry_name or ':' not in registry_name:
        return "minecraft", registry_name or "unknown"
    
    # 分割mod_id和block_name
    parts = registry_name.split(':', 1)
    mod_id = parts[0].lower()
    block_name = parts[1]
    
    return mod_id, block_name

def create_blockstate_file(block, output_dir):
    """为方块创建blockstate文件"""
    mod_id, block_name = parse_block_registry_name(block['registry_name'])
    safe_block_name = safe_filename(block_name)
    
    # 构建文件路径：blockstates/mod_id_blockname.json
    file_path = os.path.join(output_dir, 'blockstates', f"{mod_id}_{safe_block_name}.json")
    
    # 创建目录（如果不存在）
    os.makedirs(os.path.dirname(file_path), exist_ok=True)
    
    # 创建blockstate内容
    blockstate_content = {
        "variants": {
            "normal": { "model": f"blockstorage:block/{mod_id}/{safe_block_name}" }
        }
    }
    
    # 写入文件
    with open(file_path, 'w', encoding='utf-8') as file:
        json.dump(blockstate_content, file, indent=4)
    
    return file_path

def create_model_file(block, output_dir, base_dir):
    """为方块创建模型文件"""
    mod_id, block_name = parse_block_registry_name(block['registry_name'])
    safe_block_name = safe_filename(block_name)
    
    # 构建目录路径：models/block/mod_id/
    block_dir = os.path.join(output_dir, 'models', 'block', mod_id)
    
    # 创建目录（如果不存在）
    os.makedirs(block_dir, exist_ok=True)
    
    # 构建文件路径：models/block/mod_id/blockname.json
    file_path = os.path.join(block_dir, f"{safe_block_name}.json")
    
    # 确定方块类型并创建适当的模型
    textures = block['textures']
    render_type = block['render_type'] or ""
    
    # 如果所有面纹理均为null，可能需要自定义渲染
    if all(texture is None for texture in textures):
        # 创建一个简单的占位模型
        model_content = {
            "parent": "block/cube_all",
            "textures": {
                "all": "minecraft:blocks/stone"  # 使用默认纹理作为占位符
            }
        }
    else:
        # 规范化纹理路径
        normalized_textures = []
        for t in textures:
            if t is not None:
                normalized_textures.append(find_texture_file(t, base_dir))
            else:
                normalized_textures.append(None)
        
        # 替换任何null值为第一个非null纹理
        first_non_null = next((t for t in normalized_textures if t is not None), "minecraft:blocks/stone")
        normalized_textures = [t if t is not None else first_non_null for t in normalized_textures]
        
        # 根据渲染类型创建不同的模型
        if "所有面使用相同纹理" in render_type or len(set(normalized_textures)) == 1:
            model_content = {
                "parent": "block/cube_all",
                "textures": {
                    "all": normalized_textures[0]
                }
            }
        else:
            # 不同面使用不同纹理
            model_content = {
                "parent": "block/cube",
                "textures": {
                    "particle": normalized_textures[0],
                    "down": normalized_textures[0],
                    "up": normalized_textures[1],
                    "north": normalized_textures[2],
                    "east": normalized_textures[3],
                    "south": normalized_textures[4],
                    "west": normalized_textures[5]
                }
            }
    
    # 写入文件
    with open(file_path, 'w', encoding='utf-8') as file:
        json.dump(model_content, file, indent=4)
    
    return file_path

def create_item_model_file(block, output_dir):
    """为方块创建物品模型文件"""
    mod_id, block_name = parse_block_registry_name(block['registry_name'])
    safe_block_name = safe_filename(block_name)
    
    # 构建目录路径：models/item/
    item_dir = os.path.join(output_dir, 'models', 'item')
    
    # 创建目录（如果不存在）
    os.makedirs(item_dir, exist_ok=True)
    
    # 构建文件路径：models/item/mod_id_blockname.json
    file_path = os.path.join(item_dir, f"{mod_id}_{safe_block_name}.json")
    
    # 创建物品模型内容（引用方块模型）
    item_model_content = {
        "parent": f"blockstorage:block/{mod_id}/{safe_block_name}"
    }
    
    # 写入文件
    with open(file_path, 'w', encoding='utf-8') as file:
        json.dump(item_model_content, file, indent=4)
    
    return file_path

def process_log_file(log_file_path, output_dir):
    """处理日志文件并生成所有需要的JSON文件"""
    blocks = parse_log_file(log_file_path)
    base_dir = os.path.join(output_dir, "assets", "blockstorage")
    
    results = {
        'total': len(blocks),
        'blockstates': 0,
        'block_models': 0,
        'item_models': 0,
        'errors': 0
    }
    
    for i, block in enumerate(blocks):
        try:
            print(f"[{i+1}/{len(blocks)}] 处理方块: {block['registry_name']}")
            
            blockstate_path = create_blockstate_file(block, base_dir)
            results['blockstates'] += 1
            print(f"  生成blockstate文件: {os.path.relpath(blockstate_path, base_dir)}")
            
            model_path = create_model_file(block, base_dir, base_dir)
            results['block_models'] += 1
            print(f"  生成block model文件: {os.path.relpath(model_path, base_dir)}")
            
            item_model_path = create_item_model_file(block, base_dir)
            results['item_models'] += 1
            print(f"  生成item model文件: {os.path.relpath(item_model_path, base_dir)}")
        except Exception as e:
            print(f"  错误: {str(e)}")
            import traceback
            print(traceback.format_exc())
            results['errors'] += 1
    
    print(f"\n处理完成:")
    print(f"总共处理了 {results['total']} 个方块")
    print(f"生成了 {results['blockstates']} 个blockstate文件")
    print(f"生成了 {results['block_models']} 个block model文件")
    print(f"生成了 {results['item_models']} 个item model文件")
    print(f"处理过程中有 {results['errors']} 个错误")

if __name__ == "__main__":
    import sys
    
    if len(sys.argv) != 3:
        print("用法: python generate_block_json.py <日志文件路径> <输出目录>")
        sys.exit(1)
    
    log_file_path = sys.argv[1]
    output_dir = sys.argv[2]
    
    process_log_file(log_file_path, output_dir)