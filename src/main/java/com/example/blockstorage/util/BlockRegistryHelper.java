/**
 * 注册辅助工具 - 提供批量注册方块的辅助方法
 */
package com.example.blockstorage.util;

import net.minecraft.block.material.Material;

import com.example.blockstorage.block.BlockCustom;
import com.example.blockstorage.block.ModBlocks;

public class BlockRegistryHelper {

    /**
     * 批量注册方块
     * 
     * @param packageName 包名
     * @param blockData   方块数据，格式：{blockName, blockID, material, textures...}
     */
    public static void registerBlocks(String packageName, Object[][] blockData) {
        for (Object[] data : blockData) {
            if (data.length < 3) {
                continue; // 忽略数据不足的条目
            }

            String blockName = (String) data[0];
            int blockID = (Integer) data[1];
            Material material = getMaterialFromString((String) data[2]);

            BlockCustom block = new BlockCustom(material, packageName, blockName);

            // 如果有提供纹理信息
            if (data.length > 3) {
                String[] textures = new String[Math.min(data.length - 3, 6)];
                for (int i = 0; i < textures.length; i++) {
                    textures[i] = (String) data[i + 3];
                }
                block.setTextureNames(textures);
            }

            // 注册方块并指定ID
            if (blockID > 0) {
                ModBlocks.registerBlockWithID(packageName, blockName, block, blockID);
            } else {
                ModBlocks.registerBlock(packageName, blockName, block);
            }
        }
    }

    /**
     * 根据字符串获取对应的Material
     */
    private static Material getMaterialFromString(String materialName) {
        if ("rock".equalsIgnoreCase(materialName)) {
            return Material.rock;
        } else if ("ground".equalsIgnoreCase(materialName)) {
            return Material.ground;
        } else if ("wood".equalsIgnoreCase(materialName)) {
            return Material.wood;
        } else if ("iron".equalsIgnoreCase(materialName)) {
            return Material.iron;
        } else if ("anvil".equalsIgnoreCase(materialName)) {
            return Material.anvil;
        } else if ("water".equalsIgnoreCase(materialName)) {
            return Material.water;
        } else if ("lava".equalsIgnoreCase(materialName)) {
            return Material.lava;
        } else if ("leaves".equalsIgnoreCase(materialName)) {
            return Material.leaves;
        } else if ("plants".equalsIgnoreCase(materialName)) {
            return Material.plants;
        } else if ("vine".equalsIgnoreCase(materialName)) {
            return Material.vine;
        } else if ("sponge".equalsIgnoreCase(materialName)) {
            return Material.sponge;
        } else if ("cloth".equalsIgnoreCase(materialName)) {
            return Material.cloth;
        } else if ("fire".equalsIgnoreCase(materialName)) {
            return Material.fire;
        } else if ("sand".equalsIgnoreCase(materialName)) {
            return Material.sand;
        } else if ("circuits".equalsIgnoreCase(materialName)) {
            return Material.circuits;
        } else if ("glass".equalsIgnoreCase(materialName)) {
            return Material.glass;
        } else if ("redstoneLight".equalsIgnoreCase(materialName)) {
            return Material.redstoneLight;
        } else if ("tnt".equalsIgnoreCase(materialName)) {
            return Material.tnt;
        } else if ("coral".equalsIgnoreCase(materialName)) {
            return Material.coral;
        } else if ("ice".equalsIgnoreCase(materialName)) {
            return Material.ice;
        } else if ("snow".equalsIgnoreCase(materialName)) {
            return Material.snow;
        } else if ("craftedSnow".equalsIgnoreCase(materialName)) {
            return Material.craftedSnow;
        } else if ("cactus".equalsIgnoreCase(materialName)) {
            return Material.cactus;
        } else if ("clay".equalsIgnoreCase(materialName)) {
            return Material.clay;
        } else if ("pumpkin".equalsIgnoreCase(materialName)) {
            return Material.gourd;
        } else if ("dragonEgg".equalsIgnoreCase(materialName)) {
            return Material.dragonEgg;
        } else if ("portal".equalsIgnoreCase(materialName)) {
            return Material.portal;
        } else if ("cake".equalsIgnoreCase(materialName)) {
            return Material.cake;
        } else if ("web".equalsIgnoreCase(materialName)) {
            return Material.web;
        } else {
            // 默认为石头材质
            return Material.rock;
        }
    }
}
