/**
 * 自定义方块类 - 用于创建具有不同纹理的方块
 */
package com.example.blockstorage.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustom extends Block {

    private String modId;
    private String blockName;
    private String[] textureNames = new String[6];

    @SideOnly(Side.CLIENT)
    private IIcon[] icons = new IIcon[6];

    public BlockCustom(Material material, String modId, String blockName) {
        super(material);
        this.modId = modId;
        this.blockName = blockName;
        this.setBlockName(blockName);
        this.setCreativeTab(CreativeTabs.tabBlock);

        // 设置默认纹理名称，如果没有特别指定
        for (int i = 0; i < 6; i++) {
            this.textureNames[i] = modId + ":" + blockName;
        }
    }

    /**
     * 设置所有面的纹理名称
     */
    public BlockCustom setTextureNames(String... textureNames) {
        if (textureNames.length > 0) {
            // 如果提供的纹理名称不足6个，用最后一个填充其余的
            String lastTexture = textureNames[textureNames.length - 1];
            for (int i = 0; i < 6; i++) {
                if (i < textureNames.length) {
                    this.textureNames[i] = textureNames[i];
                } else {
                    this.textureNames[i] = lastTexture;
                }
            }
        }
        return this;
    }

    /**
     * 设置特定面的纹理名称
     */
    public BlockCustom setTextureName(int side, String textureName) {
        if (side >= 0 && side < 6) {
            this.textureNames[side] = textureName;
        }
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        for (int i = 0; i < 6; i++) {
            // 处理纹理名称，支持 "modid:blockname:variant" 格式
            String fullTextureName = textureNames[i];
            String iconName = fullTextureName;

            // 处理可能包含变体的纹理名称
            if (fullTextureName.contains(":")) {
                String[] parts = fullTextureName.split(":");
                if (parts.length >= 3) {
                    // 格式是 "modid:blockname:variant"
                    iconName = parts[0] + ":" + parts[1] + "_" + parts[2];
                }
            }

            icons[i] = register.registerIcon(iconName);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side >= 0 && side < 6) {
            return icons[side];
        }
        return icons[0];
    }

    /**
     * 设置方块的基本属性
     */
    public BlockCustom setBlockProperties(float hardness, float resistance, String soundType) {
        this.setHardness(hardness);
        this.setResistance(resistance);

        // 设置方块的声音类型
        if ("stone".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeStone);
        } else if ("wood".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeWood);
        } else if ("gravel".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeGravel);
        } else if ("grass".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeGrass);
        } else if ("metal".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeMetal);
        } else if ("glass".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeGlass);
        } else if ("cloth".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeCloth);
        } else if ("sand".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeSand);
        } else if ("snow".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeSnow);
        } else if ("ladder".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeLadder);
        } else if ("anvil".equalsIgnoreCase(soundType)) {
            this.setStepSound(Block.soundTypeAnvil);
        }

        return this;
    }
}
