import os
import shutil
import argparse
from pathlib import Path

def organize_textures(source_dir, target_dir, mod_id="blockstorage"):
    """
    将原始mod纹理整理到目标mod的资源域下
    
    Args:
        source_dir: 包含原始mod资源的目录（包含assets文件夹）
        target_dir: 目标目录，将在其中创建新的资源结构
        mod_id: 目标mod的ID，默认为"blockstorage"
    """
    source_assets = Path(source_dir) / "assets"
    if not source_assets.exists():
        print(f"错误: {source_assets} 目录不存在")
        return

    # 原始mod的包名列表
    original_packages = [
        "bamboo", "customnpcs", "flansmod", "harvestcraft", "ic2",
        "jojobadv", "moreplayermodels", "mw", "nuclearcontrol", "railcraft", 
        "shincolle", "tf", "thaumcraft", "thkaguyamod", "twilightforest"
    ]
    
    # 创建目标mod的assets目录
    target_assets = Path(target_dir) / "assets" / mod_id
    textures_dir = target_assets / "textures"
    os.makedirs(textures_dir, exist_ok=True)
    
    # 为blockstates和models创建目录
    models_dir = target_assets / "models" / "block"
    blockstates_dir = target_assets / "blockstates"
    os.makedirs(models_dir, exist_ok=True)
    os.makedirs(blockstates_dir, exist_ok=True)
    
    total_files = 0
    
    # 处理每个原始mod包
    for package in original_packages:
        package_dir = source_assets / package
        if not package_dir.exists():
            print(f"跳过 {package}: 目录不存在")
            continue
            
        print(f"处理 {package}...")
        
        # 创建对应的目标子目录
        package_textures_dir = textures_dir / package
        os.makedirs(package_textures_dir, exist_ok=True)
        
        # 复制纹理文件
        copied = copy_textures(package_dir, package_textures_dir, package)
        total_files += copied
    
    print(f"资源整理完成! 总共复制了 {total_files} 个文件。")

def copy_textures(source_mod_dir, target_textures_dir, package_name):
    """复制一个mod的所有纹理文件到目标目录"""
    copied_files = 0
    
    # 可能的纹理目录列表
    texture_dirs = [
        source_mod_dir / "textures",  # 标准纹理目录
        source_mod_dir / "blocks",    # 旧格式的方块纹理
        source_mod_dir / "items",     # 旧格式的物品纹理
        source_mod_dir / "block",     # 另一种旧格式
        source_mod_dir / "item"       # 另一种旧格式
    ]
    
    # 遍历所有可能的目录
    for texture_dir in texture_dirs:
        if not texture_dir.exists():
            continue
            
        # 获取目录名称
        dir_name = texture_dir.name
        if dir_name != "textures":
            # 如果不是标准textures目录，创建适当的子目录
            target_subdir = target_textures_dir / dir_name
            os.makedirs(target_subdir, exist_ok=True)
        else:
            target_subdir = target_textures_dir
        
        # 复制纹理文件
        for root, dirs, files in os.walk(texture_dir):
            rel_path = os.path.relpath(root, texture_dir)
            if rel_path == ".":
                rel_path = ""
                
            # 创建目标子目录
            current_target_dir = target_subdir / rel_path
            os.makedirs(current_target_dir, exist_ok=True)
            
            # 复制文件
            for file in files:
                if file.endswith((".png", ".mcmeta")):  # 只复制纹理文件和元数据
                    source_file = Path(root) / file
                    target_file = current_target_dir / file
                    if not target_file.exists():  # 避免覆盖已存在的文件
                        shutil.copy2(source_file, target_file)
                        rel_source = os.path.relpath(source_file, source_mod_dir)
                        rel_target = os.path.relpath(target_file, target_textures_dir.parent)
                        print(f"  复制: {rel_source} -> {rel_target}")
                        copied_files += 1
    
    if copied_files == 0:
        print(f"  警告: 没有在 {package_name} 中找到任何纹理文件")
    else:
        print(f"  从 {package_name} 复制了 {copied_files} 个纹理文件")
    
    return copied_files

def add_package_mapping(source_file, target_file_path):
    """创建一个包名到资源路径的映射文件"""
    package_mapping = {}
    
    # 读取原始文件（如果存在）
    if os.path.exists(source_file):
        with open(source_file, 'r') as f:
            for line in f:
                parts = line.strip().split('=')
                if len(parts) == 2:
                    package_mapping[parts[0]] = parts[1]
    
    # 写入新的映射文件
    with open(target_file_path, 'w') as f:
        for package, path in sorted(package_mapping.items()):
            f.write(f"{package}={path}\n")

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="整理mod纹理到统一的资源域")
    parser.add_argument("source_dir", help="包含原始mod资源的目录")
    parser.add_argument("target_dir", help="目标目录（通常是你mod的src/main/resources）")
    parser.add_argument("--mod-id", default="blockstorage", help="目标mod的ID，默认为'blockstorage'")
    
    args = parser.parse_args()
    organize_textures(args.source_dir, args.target_dir, args.mod_id)