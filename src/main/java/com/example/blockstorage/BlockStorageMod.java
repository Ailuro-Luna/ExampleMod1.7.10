/**
 * 主类 - 模组的入口点
 */
package com.example.blockstorage;

import com.example.blockstorage.block.ModBlocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BlockStorageMod.MODID, name = BlockStorageMod.NAME, version = BlockStorageMod.VERSION)
public class BlockStorageMod {

    public static final String MODID = "blockstorage";
    public static final String NAME = "Block Storage Mod";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // 初始化并注册所有方块
        ModBlocks.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // 任何需要在init阶段执行的方块相关代码
        ModBlocks.init();
    }
}
