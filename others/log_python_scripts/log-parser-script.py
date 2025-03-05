#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Minecraft方块日志解析脚本
用于解析日志文件中的方块信息，并生成Java代码用于批量注册方块
"""

import re
import os
import sys
from collections import defaultdict

# 定义正则表达式模式，用于提取方块信息
BLOCK_PATTERN = re.compile(r'\[\d+:\d+:\d+\]\s+方块ID:\s+(\d+),\s+注册名称:\s+([^,]+),\s+未本地化名称:\s+([^\n]+)')
TEXTURE_PATTERN = re.compile(r'\[\d+:\d+:\d+\]\s+面\s+(\d+)\s+纹理:\s+([^\n]+)')
NULL_TEXTURE_PATTERN = re.compile(r'\[\d+:\d+:\d+\]\s+面\s+(\d+)\s+纹理为null')
RESULT_PATTERN = re.compile(r'\[\d+:\d+:\d+\]\s+结果:\s+([^\n]+)')

def parse_log_file(log_file):
    """解析日志文件，提取方块信息"""
    blocks = []
    current_block = None
    
    # 尝试多种编码方式打开文件
    encodings = ['gb2312', 'utf-8', 'cp1252', 'gbk', 'latin-1']
    
    for encoding in encodings:
        try:
            with open(log_file, 'r', encoding=encoding) as f:
                content = f.read()
            break
        except UnicodeDecodeError:
            if encoding == encodings[-1]:  # 如果所有编码都失败了
                print(f"无法解码日志文件。尝试使用latin-1编码作为最后手段。")
                with open(log_file, 'r', encoding='latin-1', errors='replace') as f:
                    content = f.read()
                break
            continue
    
    # 逐行处理文件内容
    for line in content.splitlines():
            print(line)
            # 尝试匹配方块ID、注册名称和未本地化名称
            block_match = BLOCK_PATTERN.search(line)
            if block_match:
                # 如果找到了一个新的方块，并且之前已经有一个方块在处理中，则保存之前的方块
                if current_block is not None:
                    blocks.append(current_block)
                
                # 创建一个新的方块字典
                block_id, registry_name, unlocalized_name = block_match.groups()
                current_block = {
                    'id': int(block_id),
                    'registry_name': registry_name,
                    'unlocalized_name': unlocalized_name,
                    'textures': [None] * 6,
                    'type': 'unknown'
                }
                continue
            
            # 如果当前没有处理中的方块，跳过其他行
            if current_block is None:
                continue
            
            # 尝试匹配纹理信息
            texture_match = TEXTURE_PATTERN.search(line)
            null_texture_match = NULL_TEXTURE_PATTERN.search(line)
            
            if texture_match:
                face, texture = texture_match.groups()
                current_block['textures'][int(face)] = texture
            elif null_texture_match:
                face = int(null_texture_match.group(1))
                current_block['textures'][face] = "null"
            
            # 尝试匹配结果行
            result_match = RESULT_PATTERN.search(line)
            if result_match:
                current_block['type'] = result_match.group(1)
    
    # 添加最后一个方块
    if current_block is not None:
        blocks.append(current_block)
    
    return blocks

def group_blocks_by_mod(blocks):
    """按mod名称对方块进行分组"""
    mod_blocks = defaultdict(list)
    
    for block in blocks:
        # 从注册名称中提取mod ID
        mod_id = block['registry_name'].split(':')[0] if ':' in block['registry_name'] else "unknown"
        mod_blocks[mod_id].append(block)
    
    return mod_blocks

def get_material_type(block):
    """根据方块类型猜测可能的材质类型"""
    name = block['registry_name'].lower()
    
    if any(keyword in name for keyword in ['wood', 'log', 'plank']):
        return "wood"
    elif any(keyword in name for keyword in ['stone', 'rock', 'cobble']):
        return "rock"
    elif any(keyword in name for keyword in ['dirt', 'grass', 'soil']):
        return "ground"
    elif any(keyword in name for keyword in ['iron', 'steel', 'metal', 'gold']):
        return "iron"
    elif any(keyword in name for keyword in ['glass']):
        return "glass"
    elif any(keyword in name for keyword in ['leaf', 'leaves']):
        return "leaves"
    elif any(keyword in name for keyword in ['ice']):
        return "ice"
    elif any(keyword in name for keyword in ['sand']):
        return "sand"
    elif any(keyword in name for keyword in ['cloth', 'wool']):
        return "cloth"
    else:
        return "rock"  # 默认为石头材质

def generate_java_code(mod_blocks):
    """生成Java代码"""
    java_code = []
    
    # 导入语句
    java_code.append("package com.example.blockstorage.block;")
    java_code.append("")
    java_code.append("import com.example.blockstorage.util.BlockRegistryHelper;")
    java_code.append("import net.minecraft.block.Block;")
    java_code.append("import net.minecraft.block.material.Material;")
    java_code.append("")
    java_code.append("/**")
    java_code.append(" * 自动生成的方块注册代码")
    java_code.append(" * 由日志解析脚本生成")
    java_code.append(" */")
    java_code.append("public class GeneratedBlocks {")
    java_code.append("    ")
    java_code.append("    /**")
    java_code.append("     * 注册所有从日志中解析出的方块")
    java_code.append("     */")
    java_code.append("    public static void registerAll() {")
    
    # 为每个mod生成注册代码
    for mod_id, blocks in mod_blocks.items():
        if not blocks:
            continue
            
        java_code.append(f"        // 注册来自 {mod_id} 的方块")
        java_code.append(f"        register{mod_id.capitalize()}Blocks();")
        java_code.append("")
    
    java_code.append("    }")
    java_code.append("")
    
    # 为每个mod生成详细的注册方法
    for mod_id, blocks in mod_blocks.items():
        if not blocks:
            continue
            
        java_code.append(f"    /**")
        java_code.append(f"     * 注册来自 {mod_id} 的方块")
        java_code.append(f"     */")
        java_code.append(f"    private static void register{mod_id.capitalize()}Blocks() {{")
        java_code.append(f"        // 使用辅助方法批量注册方块")
        java_code.append(f"        Object[][] {mod_id}BlockData = {{")
        
        # 为每个方块生成数据数组
        for block in blocks:
            block_name = block['registry_name'].split(':')[1] if ':' in block['registry_name'] else block['registry_name']
            material = get_material_type(block)
            
            # 构建纹理数组
            textures = []
            for i, texture in enumerate(block['textures']):
                if texture is None or texture == "null":
                    # 如果纹理为null，使用方块的默认纹理
                    textures.append(f'"{mod_id}:{block_name}"')
                else:
                    textures.append(f'"{texture}"')
            
            # 生成方块数据数组
            texture_str = ", ".join(textures)
            java_code.append(f'            {{"{block_name}", {block["id"]}, "{material}", {texture_str}}},')
        
        java_code.append("        };")
        java_code.append(f'        BlockRegistryHelper.registerBlocks("{mod_id}", {mod_id}BlockData);')
        java_code.append("    }")
        java_code.append("")
    
    java_code.append("}")
    
    return "\n".join(java_code)

def generate_import_code(mod_blocks):
    """生成在ModBlocks类中导入GeneratedBlocks的代码片段"""
    import_code = []
    import_code.append("    /**")
    import_code.append("     * 调用生成的方块注册代码")
    import_code.append("     */")
    import_code.append("    private static void registerGeneratedBlocks() {")
    import_code.append("        // 注册自动生成的方块")
    import_code.append("        GeneratedBlocks.registerAll();")
    import_code.append("    }")
    
    return "\n".join(import_code)

def main():
    # 检查命令行参数
    if len(sys.argv) < 2:
        print("用法: python block_log_parser.py <日志文件路径> [输出目录]")
        sys.exit(1)
    
    log_file = sys.argv[1]
    output_dir = sys.argv[2] if len(sys.argv) > 2 else "."
    
    # 解析日志文件
    print(f"正在解析日志文件: {log_file}")
    blocks = parse_log_file(log_file)
    print(f"解析完成，找到 {len(blocks)} 个方块")
    
    # 按mod对方块进行分组
    mod_blocks = group_blocks_by_mod(blocks)
    print(f"方块分组完成，共有 {len(mod_blocks)} 个mod")
    
    # 生成Java代码
    java_code = generate_java_code(mod_blocks)
    import_code = generate_import_code(mod_blocks)
    
    # 创建输出目录（如果不存在）
    os.makedirs(output_dir, exist_ok=True)
    
    # 写入Java代码文件
    java_file = os.path.join(output_dir, "GeneratedBlocks.java")
    with open(java_file, "w", encoding="utf-8") as f:
        f.write(java_code)
    
    # 写入导入代码片段
    import_file = os.path.join(output_dir, "ImportCode.txt")
    with open(import_file, "w", encoding="utf-8") as f:
        f.write(import_code)
    
    print(f"代码生成完成!")
    print(f"Java类文件: {java_file}")
    print(f"导入代码片段: {import_file}")
    print("请将导入代码片段添加到ModBlocks.java文件中的preInit方法内")

if __name__ == "__main__":
    main()