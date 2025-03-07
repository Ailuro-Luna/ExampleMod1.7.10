#!/usr/bin/env python3
"""
资源整理工具 - 将多个mod资源域整合到单一的blockstorage资源域
用法: python resource_organizer.py [源目录] [目标目录]
"""

import os
import sys
import shutil
from pathlib import Path
import json

# 需要处理的包列表
PACKAGES = [
    "ic2", "buildcraft", "forestry", "thermal", "applied",
    "railcraft", "mekanism", "immersive", "redpower", "enderio", 
    "extra", "computercraft", "gregtech", "thaumcraft",
    "botania", "custom", "minecraft"
]

def create_directory_if_not_exists(directory):
    """创建目录（如果不存在）"""
    if not os.path.exists(directory):
        os.makedirs(directory)
        print(f"创建目录: {directory}")

def copy_textures(source_root, target_root):
    """
    复制所有纹理文件到目标目录
    """
    source_assets = os.path.join(source_root, "assets")
    target_assets = os.path.join(target_root, "assets", "blockstorage")
    
    # 确保目标目录存在
    create_directory_if_not_exists(target_assets)

    # 遍历所有已知mod包
    for package in PACKAGES:
        source_package = os.path.join(source_assets, package)
        
        # 如果源包目录不存在，跳过
        if not os.path.exists(source_package):
            print(f"跳过不存在的包: {package}")
            continue
        
        print(f"处理包: {package}")
        
        # 处理纹理文件
        source_textures = os.path.join(source_package, "textures")
        if os.path.exists(source_textures):
            target_textures = os.path.join(target_assets, "textures", package)
            create_directory_if_not_exists(target_textures)
            
            # 复制所有纹理文件，保持子目录结构
            for root, dirs, files in os.walk(source_textures):
                for file in files:
                    if file.endswith((".png", ".mcmeta")):
                        # 计算相对路径
                        rel_path = os.path.relpath(root, source_textures)
                        source_file = os.path.join(root, file)
                        target_dir = os.path.join(target_textures, rel_path)
                        target_file = os.path.join(target_dir, file)
                        
                        # 确保目标目录存在
                        create_directory_if_not_exists(target_dir)
                        
                        # 复制文件
                        shutil.copy2(source_file, target_file)
                        print(f"复制: {source_file} -> {target_file}")

def generate_models(target_root, metadata_file=None):
    """
    为复制的纹理生成模型文件
    """
    # 为每个包创建模型目录
    target_assets = os.path.join(target_root, "assets", "blockstorage")
    models_block_dir = os.path.join(target_assets, "models", "block")
    models_item_dir = os.path.join(target_assets, "models", "item")
    blockstates_dir = os.path.join(target_assets, "blockstates")
    
    create_directory_if_not_exists(models_block_dir)
    create_directory_if_not_exists(models_item_dir)
    create_directory_if_not_exists(blockstates_dir)
    
    # 如果提供了元数据文件，使用它生成模型
    if metadata_file and os.path.exists(metadata_file):
        with open(metadata_file, 'r') as f:
            metadata = json.load(f)
            
        for block_data in metadata:
            package = block_data.get('package', 'custom')
            block_name = block_data.get('name', '')
            textures = block_data.get('textures', [])
            
            if block_name:
                # 为每个方块创建子目录
                block_model_dir = os.path.join(models_block_dir, package)
                item_model_dir = os.path.join(models_item_dir, package)
                
                create_directory_if_not_exists(block_model_dir)
                create_directory_if_not_exists(item_model_dir)
                
                # 生成方块模型文件
                generate_block_model(block_model_dir, package, block_name, textures)
                
                # 生成物品模型文件
                generate_item_model(item_model_dir, package, block_name)
                
                # 生成blockstate文件
                generate_blockstate(blockstates_dir, package, block_name)
                
                print(f"为 {package}:{block_name} 生成模型文件")
    else:
        print("未提供元数据文件，跳过模型生成")

def generate_block_model(dir_path, package, block_name, textures):
    """生成方块模型文件"""
    file_path = os.path.join(dir_path, f"{block_name}.json")
    
    model = {
        "parent": "block/cube",
        "textures": {
            "particle": f"blockstorage:textures/{package}/{textures[0] if textures else 'blocks/' + block_name}",
            "down": f"blockstorage:textures/{package}/{textures[0] if textures and len(textures) > 0 else 'blocks/' + block_name}",
            "up": f"blockstorage:textures/{package}/{textures[1] if textures and len(textures) > 1 else textures[0] if textures else 'blocks/' + block_name}",
            "north": f"blockstorage:textures/{package}/{textures[2] if textures and len(textures) > 2 else textures[0] if textures else 'blocks/' + block_name}",
            "east": f"blockstorage:textures/{package}/{textures[3] if textures and len(textures) > 3 else textures[0] if textures else 'blocks/' + block_name}",
            "south": f"blockstorage:textures/{package}/{textures[4] if textures and len(textures) > 4 else textures[0] if textures else 'blocks/' + block_name}",
            "west": f"blockstorage:textures/{package}/{textures[5] if textures and len(textures) > 5 else textures[0] if textures else 'blocks/' + block_name}"
        }
    }
    
    with open(file_path, 'w') as f:
        json.dump(model, f, indent=2)

def generate_item_model(dir_path, package, block_name):
    """生成物品模型文件"""
    file_path = os.path.join(dir_path, f"{block_name}.json")
    
    model = {
        "parent": f"blockstorage:block/{package}/{block_name}"
    }
    
    with open(file_path, 'w') as f:
        json.dump(model, f, indent=2)

def generate_blockstate(dir_path, package, block_name):
    """生成blockstate文件"""
    file_path = os.path.join(dir_path, f"{package}_{block_name}.json")
    
    blockstate = {
        "variants": {
            "normal": {
                "model": f"blockstorage:block/{package}/{block_name}"
            }
        }
    }
    
    with open(file_path, 'w') as f:
        json.dump(blockstate, f, indent=2)

def extract_block_metadata(mod_blocks_file):
    """
    从ModBlocks.java文件中提取方块元数据
    (简化版本，实际上需要更复杂的解析)
    """
    metadata = []
    
    try:
        with open(mod_blocks_file, 'r') as f:
            content = f.read()
            
            # 这里只是一个非常简单的示例
            # 实际上你可能需要更复杂的正则表达式或解析器
            # 从ModBlocks.java和GeneratedBlocks.java中提取方块信息
            
            # 此处省略实际的解析逻辑
            
            print("警告: 方块元数据提取尚未实现")
            print("请手动准备metadata.json文件或改进此函数")
            
    except Exception as e:
        print(f"无法解析ModBlocks.java: {e}")
    
    return metadata

def main():
    # 获取命令行参数
    source_dir = "."
    target_dir = "./converted_resources"
    metadata_file = None
    
    if len(sys.argv) > 1:
        source_dir = sys.argv[1]
    if len(sys.argv) > 2:
        target_dir = sys.argv[2]
    if len(sys.argv) > 3:
        metadata_file = sys.argv[3]
    
    print(f"源目录: {source_dir}")
    print(f"目标目录: {target_dir}")
    print(f"元数据文件: {metadata_file if metadata_file else '无'}")
    
    # 复制纹理文件
    copy_textures(source_dir, target_dir)
    
    # 生成模型文件
    generate_models(target_dir, metadata_file)
    
    print("\n资源整理完成!")
    print(f"所有资源已整理到: {os.path.join(target_dir, 'assets', 'blockstorage')}")
    print("请检查整理后的文件，并确保模型文件的路径正确指向纹理文件。")

if __name__ == "__main__":
    main()