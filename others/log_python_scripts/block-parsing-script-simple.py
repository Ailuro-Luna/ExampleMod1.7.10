#!/usr/bin/env python3
import re
import os
from collections import defaultdict

def parse_log_file(log_file_path):
    """解析日志文件并提取方块信息"""
    blocks = []
    
    # 方块信息的正则模式
    block_pattern = re.compile(r'\[\d+:\d+:\d+\] 方块ID: (\d+), 注册名称: ([^,]+), 未本地化名称: ([^\n]+)')
    texture_pattern = re.compile(r'\[\d+:\d+:\d+\]   面 (\d+) 纹理: ([^\n]+)')
    null_texture_pattern = re.compile(r'\[\d+:\d+:\d+\]   面 (\d+) 纹理为null')
    
    current_block = None
    
    with open(log_file_path, 'r', encoding='utf-8') as file:
        for line in file:
            # 尝试匹配新的方块信息
            block_match = block_pattern.search(line)
            if block_match:
                # 如果已有当前处理的方块，将其添加到方块列表
                if current_block:
                    blocks.append(current_block)
                
                # 创建新的方块信息
                block_id, registry_name, unlocalized_name = block_match.groups()
                # 从注册名称中提取mod ID
                mod_id = registry_name.split(':')[0] if ':' in registry_name else "unknown"
                block_name = registry_name.split(':')[1] if ':' in registry_name else registry_name
                
                current_block = {
                    'id': int(block_id),
                    'registry_name': registry_name,
                    'unlocalized_name': unlocalized_name,
                    'mod_id': mod_id,
                    'block_name': block_name,
                    'textures': [None] * 6  # 初始化6个面的纹理为None
                }
                continue
            
            # 尝试匹配纹理信息
            texture_match = texture_pattern.search(line)
            if texture_match and current_block:
                face, texture = texture_match.groups()
                current_block['textures'][int(face)] = texture
                continue
            
            # 尝试匹配null纹理信息
            null_texture_match = null_texture_pattern.search(line)
            if null_texture_match and current_block:
                face = null_texture_match.group(1)
                current_block['textures'][int(face)] = None
    
    # 添加最后一个方块
    if current_block:
        blocks.append(current_block)
    
    return blocks

def group_blocks_by_mod(blocks):
    """按照mod ID对方块进行分组"""
    grouped_blocks = defaultdict(list)
    for block in blocks:
        grouped_blocks[block['mod_id']].append(block)
    return grouped_blocks

def generate_java_code(grouped_blocks):
    """生成Java代码用于注册方块"""
    # 包含所有mod的注册代码
    all_mods_code = []
    
    for mod_id, blocks in grouped_blocks.items():
        # 为每个mod生成一个数组定义
        blocks_array = []
        
        for block in blocks:
            # 处理纹理
            textures = []
            for texture in block['textures']:
                if texture is None:
                    textures.append("null")
                else:
                    textures.append('"{0}"'.format(texture))
            
            # 构建方块数据数组
            texture_str = ", ".join(textures)
            block_str = '    {{"{0}", {1}, "rock", {2}}}'.format(
                block["block_name"], block["id"], texture_str)
            blocks_array.append(block_str)
        
        # 构建完整的数组定义 - 使用传统的字符串格式化
        mod_variable_name = mod_id.lower()
        mod_array_code = 'Object[][] {0}BlockData = {{\n{1}\n}};\nBlockRegistryHelper.registerBlocks("{2}", {0}BlockData);'.format(
            mod_variable_name, ",\n".join(blocks_array), mod_id)
        
        all_mods_code.append(mod_array_code)
    
    # 构建最终的方法
    java_method = '/**\n * 自动生成的方块注册代码\n * 由日志解析脚本生成\n */\nprivate static void registerGeneratedBlocks() {{\n    // 注册所有从日志中解析的方块\n    \n{0}\n}}'.format("\n\n".join(all_mods_code))
    
    return java_method

def write_to_file(java_code, output_file):
    """将生成的Java代码写入文件"""
    with open(output_file, 'w', encoding='utf-8') as file:
        file.write(java_code)
    print(f"Java代码已生成到文件: {output_file}")

def generate_integration_code():
    """生成将自动生成代码集成到ModBlocks类的代码"""
    integration_code = '''
/**
 * 在ModBlocks.java中添加以下代码:
 * 
 * 1. 在类开头导入必要的包:
 * import java.util.List;
 * import java.util.ArrayList;
 * 
 * 2. 在preInit()方法中添加调用:
 * public static void preInit() {
 *     // 初始化包集合
 *     for (String packageName : PACKAGES) {
 *         BLOCK_PACKAGES.put(packageName, new HashMap<String, Block>());
 *     }
 *     
 *     // 示例：注册几个方块
 *     registerExampleBlocks();
 *     
 *     // 注册从日志解析的方块
 *     registerGeneratedBlocks();
 * }
 * 
 * 3. 将generateCode.java文件中的registerGeneratedBlocks()方法复制到ModBlocks类中
 */
'''
    return integration_code

def main():
    # 设置输入和输出文件路径
    log_file_path = "minecraft_log.txt"
    output_file = "generatedCode.java"
    
    # 检查日志文件是否存在
    if not os.path.exists(log_file_path):
        print(f"错误：找不到日志文件 {log_file_path}")
        log_file_path = input("请输入日志文件的路径: ")
        if not os.path.exists(log_file_path):
            print("错误：找不到指定的日志文件")
            return
    
    # 解析日志文件
    print(f"正在解析日志文件: {log_file_path}")
    blocks = parse_log_file(log_file_path)
    print(f"已解析 {len(blocks)} 个方块")
    
    # 按mod分组
    grouped_blocks = group_blocks_by_mod(blocks)
    print(f"发现 {len(grouped_blocks)} 个mod")
    
    # 生成Java代码
    java_code = generate_java_code(grouped_blocks)
    
    # 添加集成指南
    java_code += "\n\n" + generate_integration_code()
    
    # 写入输出文件
    write_to_file(java_code, output_file)
    
    # 输出统计信息
    for mod_id, mod_blocks in grouped_blocks.items():
        print(f"Mod: {mod_id}, 方块数量: {len(mod_blocks)}")

if __name__ == "__main__":
    main()
