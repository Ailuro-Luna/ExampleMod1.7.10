import os
import json
import shutil
from pathlib import Path

# Define constants
SOURCE_DIR = "assets"
OUTPUT_DIR = "assets_1.12"
MOD_FOLDERS = [
    "bamboo", "customnpcs", "flansmod", "harvestcraft", "ic2", 
    "jojobadv", "moreplayermodels", "mw", "nuclearcontrol", "railcraft", 
    "shincolle", "tf", "thaumcraft", "thkaguyamod", "twilightforest"
]

def ensure_dir(directory):
    """Ensure directory exists, create if it doesn't"""
    os.makedirs(directory, exist_ok=True)

def create_blockstate_json(block_name, mod_domain):
    """Create a basic blockstate JSON file"""
    blockstate = {
        "variants": {
            "normal": {
                "model": f"{mod_domain}:block/{block_name}"
            }
        }
    }
    return blockstate

def create_block_model_json(block_name, mod_domain):
    """Create a basic block model JSON file"""
    model = {
        "parent": "block/cube_all",
        "textures": {
            "all": f"{mod_domain}:blocks/{block_name}"
        }
    }
    return model

def create_item_model_json(item_name, mod_domain, is_block=False):
    """Create a basic item model JSON file"""
    if is_block:
        model = {
            "parent": f"{mod_domain}:block/{item_name}"
        }
    else:
        model = {
            "parent": "item/generated",
            "textures": {
                "layer0": f"{mod_domain}:items/{item_name}"
            }
        }
    return model

def process_block_textures(mod_folder):
    """Process block textures and create necessary JSON files"""
    mod_domain = mod_folder
    
    # Check for block textures
    block_textures_dir = os.path.join(SOURCE_DIR, mod_folder, "textures", "blocks")
    if os.path.exists(block_textures_dir):
        # Create output directories
        output_blockstates_dir = os.path.join(OUTPUT_DIR, mod_folder, "blockstates")
        output_models_block_dir = os.path.join(OUTPUT_DIR, mod_folder, "models", "block")
        output_models_item_dir = os.path.join(OUTPUT_DIR, mod_folder, "models", "item")
        output_textures_blocks_dir = os.path.join(OUTPUT_DIR, mod_folder, "textures", "blocks")
        
        ensure_dir(output_blockstates_dir)
        ensure_dir(output_models_block_dir)
        ensure_dir(output_models_item_dir)
        ensure_dir(output_textures_blocks_dir)
        
        # Process each block texture
        for filename in os.listdir(block_textures_dir):
            if filename.endswith(".png"):
                block_name = os.path.splitext(filename)[0]
                
                # Copy texture
                src_texture = os.path.join(block_textures_dir, filename)
                dst_texture = os.path.join(output_textures_blocks_dir, filename)
                shutil.copy2(src_texture, dst_texture)
                
                # Create blockstate JSON
                blockstate_json = create_blockstate_json(block_name, mod_domain)
                with open(os.path.join(output_blockstates_dir, f"{block_name}.json"), 'w') as f:
                    json.dump(blockstate_json, f, indent=4)
                
                # Create block model JSON
                block_model_json = create_block_model_json(block_name, mod_domain)
                with open(os.path.join(output_models_block_dir, f"{block_name}.json"), 'w') as f:
                    json.dump(block_model_json, f, indent=4)
                
                # Create item model JSON for block item
                item_model_json = create_item_model_json(block_name, mod_domain, is_block=True)
                with open(os.path.join(output_models_item_dir, f"{block_name}.json"), 'w') as f:
                    json.dump(item_model_json, f, indent=4)

def process_item_textures(mod_folder):
    """Process item textures and create necessary JSON files"""
    mod_domain = mod_folder
    
    # Check for item textures
    item_textures_dir = os.path.join(SOURCE_DIR, mod_folder, "textures", "items")
    if os.path.exists(item_textures_dir):
        # Create output directories
        output_models_item_dir = os.path.join(OUTPUT_DIR, mod_folder, "models", "item")
        output_textures_items_dir = os.path.join(OUTPUT_DIR, mod_folder, "textures", "items")
        
        ensure_dir(output_models_item_dir)
        ensure_dir(output_textures_items_dir)
        
        # Process each item texture
        for filename in os.listdir(item_textures_dir):
            if filename.endswith(".png"):
                item_name = os.path.splitext(filename)[0]
                
                # Copy texture
                src_texture = os.path.join(item_textures_dir, filename)
                dst_texture = os.path.join(output_textures_items_dir, filename)
                shutil.copy2(src_texture, dst_texture)
                
                # Create item model JSON
                item_model_json = create_item_model_json(item_name, mod_domain)
                with open(os.path.join(output_models_item_dir, f"{item_name}.json"), 'w') as f:
                    json.dump(item_model_json, f, indent=4)

def copy_other_assets(mod_folder):
    """Copy other assets that don't need conversion (like sounds, lang files, etc.)"""
    mod_dir = os.path.join(SOURCE_DIR, mod_folder)
    output_mod_dir = os.path.join(OUTPUT_DIR, mod_folder)
    
    for root, dirs, files in os.walk(mod_dir):
        # Skip textures directories (handled separately)
        if "textures" in root:
            continue
            
        # Determine output path
        rel_path = os.path.relpath(root, SOURCE_DIR)
        output_path = os.path.join(OUTPUT_DIR, rel_path)
        ensure_dir(output_path)
        
        # Copy files
        for file in files:
            src_file = os.path.join(root, file)
            dst_file = os.path.join(output_path, file)
            shutil.copy2(src_file, dst_file)

def process_mod_folder(mod_folder):
    """Process a mod folder"""
    print(f"Processing mod: {mod_folder}")
    
    # Create the main mod output directory
    output_mod_dir = os.path.join(OUTPUT_DIR, mod_folder)
    ensure_dir(output_mod_dir)
    
    # Process block textures
    process_block_textures(mod_folder)
    
    # Process item textures
    process_item_textures(mod_folder)
    
    # Copy other assets
    copy_other_assets(mod_folder)

def main():
    """Main function"""
    print("Starting Minecraft 1.7.10 to 1.12 assets converter")
    
    # Create output directory
    ensure_dir(OUTPUT_DIR)
    
    # Process each mod folder
    for mod_folder in MOD_FOLDERS:
        if os.path.exists(os.path.join(SOURCE_DIR, mod_folder)):
            process_mod_folder(mod_folder)
        else:
            print(f"Warning: Mod folder '{mod_folder}' not found in assets directory")
    
    print("Conversion complete!")
    print(f"Output saved to: {OUTPUT_DIR}")

if __name__ == "__main__":
    main()
