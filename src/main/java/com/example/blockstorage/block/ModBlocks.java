/**
 * 方块管理器 - 负责管理所有方块的注册
 */
package com.example.blockstorage.block;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    // 使用HashMap存储所有方块，便于后期访问
    private static final Map<String, Block> BLOCKS = new HashMap<String, Block>();

    // 为每个包/模组创建一个集合
    private static final Map<String, Map<String, Block>> BLOCK_PACKAGES = new HashMap<String, Map<String, Block>>();

    // 预定义16个包名，方便分类管理
    private static final String[] PACKAGES = new String[] { "bamboo", "customnpcs", "flansmod", "harvestcraft", "ic2",
        "jojobadv", "moreplayermodels", "mw", "nuclearcontrol", "railcraft", "shincolle", "tf", "thaumcraft",
        "thkaguyamod", "twilightforest" };

    /**
     * 调用生成的方块注册代码
     */
    private static void registerGeneratedBlocks() {
        // 注册自动生成的方块
        GeneratedBlocks.registerAll();
    }

    public static void preInit() {
        // 初始化包集合
        for (String packageName : PACKAGES) {
            BLOCK_PACKAGES.put(packageName, new HashMap<String, Block>());
        }

        // // 示例：注册几个方块
        // registerExampleBlocks();

        // 这里之后会由脚本自动填充大量方块注册
        registerGeneratedBlocks();

    }

    public static void init() {
        // init阶段需要进行的方块设置，比如合成表等
    }

    /**
     * 注册一个方块并存储到对应包集合
     */
    public static Block registerBlock(String packageName, String blockName, Block block) {
        // 规范化包名，确保它属于预定义的16个包之一
        String normalizedPackage = normalizePackageName(packageName);

        // 注册方块
        GameRegistry.registerBlock(block, blockName);

        // 添加到全局方块集合
        BLOCKS.put(blockName, block);

        // 添加到对应包的集合
        if (BLOCK_PACKAGES.containsKey(normalizedPackage)) {
            BLOCK_PACKAGES.get(normalizedPackage)
                .put(blockName, block);
        }

        return block;
    }

    /**
     * 根据ID注册一个方块并存储到对应包集合
     * 注意：在Minecraft 1.7.10中，不再支持显式指定方块ID，
     * 但我们保留此方法以便于数据处理，blockID参数仅用于记录
     */
    public static Block registerBlockWithID(String packageName, String blockName, Block block, int blockID) {
        // 规范化包名，确保它属于预定义的16个包之一
        String normalizedPackage = normalizePackageName(packageName);

        // 注册方块 (在1.7.10中不再使用ID)
        GameRegistry.registerBlock(block, blockName);

        // 记录方块和ID的映射关系 (仅用于参考)
        System.out.println("Registered block: " + blockName + " with reference ID: " + blockID);

        // 添加到全局方块集合
        BLOCKS.put(blockName, block);

        // 添加到对应包的集合
        if (BLOCK_PACKAGES.containsKey(normalizedPackage)) {
            BLOCK_PACKAGES.get(normalizedPackage)
                .put(blockName, block);
        }

        return block;
    }

    /**
     * 获取所有已注册的方块
     */
    public static Map<String, Block> getAllBlocks() {
        return BLOCKS;
    }

    /**
     * 获取特定包内的所有方块
     */
    public static Map<String, Block> getPackageBlocks(String packageName) {
        String normalizedPackage = normalizePackageName(packageName);
        return BLOCK_PACKAGES.getOrDefault(normalizedPackage, new HashMap<String, Block>());
    }

    /**
     * 获取单个方块
     */
    public static Block getBlock(String blockName) {
        return BLOCKS.get(blockName);
    }

    /**
     * 规范化包名，确保它属于预定义的16个包之一
     */
    private static String normalizePackageName(String packageName) {
        for (String predefined : PACKAGES) {
            if (packageName.equalsIgnoreCase(predefined) || packageName.contains(predefined)) {
                return predefined;
            }
        }
        // 如果没有匹配的，归为custom包
        return "custom";
    }

    /**
     * 示例方块注册，实际项目会由脚本自动填充
     */
    private static void registerExampleBlocks() {
        // 示例：注册IC2的方块
        Block blockHarz = new BlockCustom(Material.rock, "ic2", "blockHarz").setTextureNames(
            "ic2:blockHarz:0",
            "ic2:blockHarz:1",
            "ic2:blockHarz:5",
            "ic2:blockHarz:3",
            "ic2:blockHarz:2",
            "ic2:blockHarz:4");
        registerBlock("ic2", "blockHarz", blockHarz);

        // 更多示例方块...
    }
}
