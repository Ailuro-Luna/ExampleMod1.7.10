package com.example.blockstorage.block;

import com.example.blockstorage.util.BlockRegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * 自动生成的方块注册代码
 * 由日志解析脚本生成
 */
public class GeneratedBlocks {
    
    /**
     * 注册所有从日志中解析出的方块
     */
    public static void registerAll() {
        // // 注册来自 minecraft 的方块
        // registerMinecraftBlocks();

        // 注册来自 BambooMod 的方块
        registerBamboomodBlocks();

        // 注册来自 customnpcs 的方块
        registerCustomnpcsBlocks();

        // 注册来自 flansmod 的方块
        registerFlansmodBlocks();

        // 注册来自 IC2 的方块
        registerIc2Blocks();

        // 注册来自 mw 的方块
        registerMwBlocks();

        // 注册来自 Thaumcraft 的方块
        registerThaumcraftBlocks();

        // 注册来自 harvestcraft 的方块
        registerHarvestcraftBlocks();

        // 注册来自 Railcraft 的方块
        registerRailcraftBlocks();

        // 注册来自 shincolle 的方块
        registerShincolleBlocks();

        // 注册来自 THKaguyaMod 的方块
        registerThkaguyamodBlocks();

        // 注册来自 TwilightForest 的方块
        registerTwilightforestBlocks();

        // 注册来自 TacticalFrame 的方块
        registerTacticalframeBlocks();

        // 注册来自 IC2NuclearControl 的方块
        registerIc2nuclearcontrolBlocks();

    }

    /**
     * 注册来自 minecraft 的方块
     */
    private static void registerMinecraftBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] minecraftBlockData = {
            {"air", 0, "rock", "minecraft:air", "minecraft:air", "minecraft:air", "minecraft:air", "minecraft:air", "minecraft:air"},
            {"stone", 1, "rock", "stone", "stone", "stone", "stone", "stone", "stone"},
            {"grass", 2, "ground", "dirt", "grass_top", "grass_side", "grass_side", "grass_side", "grass_side"},
            {"dirt", 3, "ground", "dirt", "dirt", "dirt", "dirt", "dirt", "dirt"},
            {"cobblestone", 4, "rock", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone"},
            {"planks", 5, "wood", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"sapling", 6, "rock", "sapling_oak", "sapling_oak", "sapling_oak", "sapling_oak", "sapling_oak", "sapling_oak"},
            {"bedrock", 7, "rock", "bedrock", "bedrock", "bedrock", "bedrock", "bedrock", "bedrock"},
            {"flowing_water", 8, "rock", "water_still", "water_still", "water_flow", "water_flow", "water_flow", "water_flow"},
            {"water", 9, "rock", "water_still", "water_still", "water_flow", "water_flow", "water_flow", "water_flow"},
            {"flowing_lava", 10, "rock", "lava_still", "lava_still", "lava_flow", "lava_flow", "lava_flow", "lava_flow"},
            {"lava", 11, "rock", "lava_still", "lava_still", "lava_flow", "lava_flow", "lava_flow", "lava_flow"},
            {"sand", 12, "sand", "sand", "sand", "sand", "sand", "sand", "sand"},
            {"gravel", 13, "rock", "gravel", "gravel", "gravel", "gravel", "gravel", "gravel"},
            {"gold_ore", 14, "iron", "gold_ore", "gold_ore", "gold_ore", "gold_ore", "gold_ore", "gold_ore"},
            {"iron_ore", 15, "iron", "iron_ore", "iron_ore", "iron_ore", "iron_ore", "iron_ore", "iron_ore"},
            {"coal_ore", 16, "rock", "coal_ore", "coal_ore", "coal_ore", "coal_ore", "coal_ore", "coal_ore"},
            {"log", 17, "wood", "log_oak_top", "log_oak_top", "log_oak", "log_oak", "log_oak", "log_oak"},
            {"leaves", 18, "leaves", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak"},
            {"sponge", 19, "rock", "sponge", "sponge", "sponge", "sponge", "sponge", "sponge"},
            {"glass", 20, "glass", "glass", "glass", "glass", "glass", "glass", "glass"},
            {"lapis_ore", 21, "rock", "lapis_ore", "lapis_ore", "lapis_ore", "lapis_ore", "lapis_ore", "lapis_ore"},
            {"lapis_block", 22, "rock", "lapis_block", "lapis_block", "lapis_block", "lapis_block", "lapis_block", "lapis_block"},
            {"dispenser", 23, "rock", "dispenser_front_vertical", "furnace_top", "furnace_top", "furnace_top", "furnace_top", "furnace_top"},
            {"sandstone", 24, "rock", "sandstone_bottom", "sandstone_top", "sandstone_normal", "sandstone_normal", "sandstone_normal", "sandstone_normal"},
            {"noteblock", 25, "rock", "noteblock", "noteblock", "noteblock", "noteblock", "noteblock", "noteblock"},
            {"bed", 26, "rock", "planks_oak", "bed_feet_top", "bed_feet_end", "bed_feet_top", "bed_feet_side", "bed_feet_side"},
            {"golden_rail", 27, "iron", "rail_golden", "rail_golden", "rail_golden", "rail_golden", "rail_golden", "rail_golden"},
            {"detector_rail", 28, "rock", "rail_detector", "rail_detector", "rail_detector", "rail_detector", "rail_detector", "rail_detector"},
            {"sticky_piston", 29, "rock", "piston_top_sticky", "piston_bottom", "piston_side", "piston_side", "piston_side", "piston_side"},
            {"web", 30, "rock", "web", "web", "web", "web", "web", "web"},
            {"tallgrass", 31, "ground", "deadbush", "deadbush", "deadbush", "deadbush", "deadbush", "deadbush"},
            {"deadbush", 32, "rock", "deadbush", "deadbush", "deadbush", "deadbush", "deadbush", "deadbush"},
            {"piston", 33, "rock", "piston_top_normal", "piston_bottom", "piston_side", "piston_side", "piston_side", "piston_side"},
            {"piston_head", 34, "rock", "piston_top_normal", "piston_top_normal", "piston_side", "piston_side", "piston_side", "piston_side"},
            {"wool", 35, "cloth", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white"},
            {"piston_extension", 36, "rock", "piston_top_normal", "piston_top_normal", "piston_top_normal", "piston_top_normal", "piston_top_normal", "piston_top_normal"},
            {"yellow_flower", 37, "rock", "flower_dandelion", "flower_dandelion", "flower_dandelion", "flower_dandelion", "flower_dandelion", "flower_dandelion"},
            {"red_flower", 38, "rock", "flower_rose", "flower_rose", "flower_rose", "flower_rose", "flower_rose", "flower_rose"},
            {"brown_mushroom", 39, "rock", "mushroom_brown", "mushroom_brown", "mushroom_brown", "mushroom_brown", "mushroom_brown", "mushroom_brown"},
            {"red_mushroom", 40, "rock", "mushroom_red", "mushroom_red", "mushroom_red", "mushroom_red", "mushroom_red", "mushroom_red"},
            {"gold_block", 41, "iron", "gold_block", "gold_block", "gold_block", "gold_block", "gold_block", "gold_block"},
            {"iron_block", 42, "iron", "iron_block", "iron_block", "iron_block", "iron_block", "iron_block", "iron_block"},
            {"double_stone_slab", 43, "rock", "stone_slab_top", "stone_slab_top", "stone_slab_side", "stone_slab_side", "stone_slab_side", "stone_slab_side"},
            {"stone_slab", 44, "rock", "stone_slab_top", "stone_slab_top", "stone_slab_side", "stone_slab_side", "stone_slab_side", "stone_slab_side"},
            {"brick_block", 45, "rock", "brick", "brick", "brick", "brick", "brick", "brick"},
            {"tnt", 46, "rock", "tnt_bottom", "tnt_top", "tnt_side", "tnt_side", "tnt_side", "tnt_side"},
            {"bookshelf", 47, "rock", "planks_oak", "planks_oak", "bookshelf", "bookshelf", "bookshelf", "bookshelf"},
            {"mossy_cobblestone", 48, "rock", "cobblestone_mossy", "cobblestone_mossy", "cobblestone_mossy", "cobblestone_mossy", "cobblestone_mossy", "cobblestone_mossy"},
            {"obsidian", 49, "rock", "obsidian", "obsidian", "obsidian", "obsidian", "obsidian", "obsidian"},
            {"torch", 50, "rock", "torch_on", "torch_on", "torch_on", "torch_on", "torch_on", "torch_on"},
            {"fire", 51, "rock", "fire_layer_0", "fire_layer_0", "fire_layer_0", "fire_layer_0", "fire_layer_0", "fire_layer_0"},
            {"mob_spawner", 52, "rock", "mob_spawner", "mob_spawner", "mob_spawner", "mob_spawner", "mob_spawner", "mob_spawner"},
            {"oak_stairs", 53, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"chest", 54, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"redstone_wire", 55, "rock", "redstone_dust_cross", "redstone_dust_cross", "redstone_dust_cross", "redstone_dust_cross", "redstone_dust_cross", "redstone_dust_cross"},
            {"diamond_ore", 56, "rock", "diamond_ore", "diamond_ore", "diamond_ore", "diamond_ore", "diamond_ore", "diamond_ore"},
            {"diamond_block", 57, "rock", "diamond_block", "diamond_block", "diamond_block", "diamond_block", "diamond_block", "diamond_block"},
            {"crafting_table", 58, "rock", "planks_oak", "crafting_table_top", "crafting_table_front", "crafting_table_side", "crafting_table_front", "crafting_table_side"},
            {"wheat", 59, "rock", "wheat_stage_0", "wheat_stage_0", "wheat_stage_0", "wheat_stage_0", "wheat_stage_0", "wheat_stage_0"},
            {"farmland", 60, "rock", "dirt", "farmland_dry", "dirt", "dirt", "dirt", "dirt"},
            {"furnace", 61, "rock", "furnace_top", "furnace_top", "furnace_side", "furnace_side", "furnace_side", "furnace_side"},
            {"lit_furnace", 62, "rock", "furnace_top", "furnace_top", "furnace_side", "furnace_side", "furnace_side", "furnace_side"},
            {"standing_sign", 63, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"wooden_door", 64, "wood", "door_wood_lower", "door_wood_lower", "door_wood_lower", "door_wood_lower", "door_wood_lower", "door_wood_lower"},
            {"ladder", 65, "rock", "ladder", "ladder", "ladder", "ladder", "ladder", "ladder"},
            {"rail", 66, "rock", "rail_normal", "rail_normal", "rail_normal", "rail_normal", "rail_normal", "rail_normal"},
            {"stone_stairs", 67, "rock", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone"},
            {"wall_sign", 68, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"lever", 69, "rock", "lever", "lever", "lever", "lever", "lever", "lever"},
            {"stone_pressure_plate", 70, "rock", "stone", "stone", "stone", "stone", "stone", "stone"},
            {"iron_door", 71, "iron", "door_iron_lower", "door_iron_lower", "door_iron_lower", "door_iron_lower", "door_iron_lower", "door_iron_lower"},
            {"wooden_pressure_plate", 72, "wood", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"redstone_ore", 73, "rock", "redstone_ore", "redstone_ore", "redstone_ore", "redstone_ore", "redstone_ore", "redstone_ore"},
            {"lit_redstone_ore", 74, "rock", "redstone_ore", "redstone_ore", "redstone_ore", "redstone_ore", "redstone_ore", "redstone_ore"},
            {"unlit_redstone_torch", 75, "rock", "redstone_torch_off", "redstone_torch_off", "redstone_torch_off", "redstone_torch_off", "redstone_torch_off", "redstone_torch_off"},
            {"redstone_torch", 76, "rock", "redstone_torch_on", "redstone_torch_on", "redstone_torch_on", "redstone_torch_on", "redstone_torch_on", "redstone_torch_on"},
            {"stone_button", 77, "rock", "stone", "stone", "stone", "stone", "stone", "stone"},
            {"snow_layer", 78, "rock", "snow", "snow", "snow", "snow", "snow", "snow"},
            {"ice", 79, "ice", "ice", "ice", "ice", "ice", "ice", "ice"},
            {"snow", 80, "rock", "snow", "snow", "snow", "snow", "snow", "snow"},
            {"cactus", 81, "rock", "cactus_bottom", "cactus_top", "cactus_side", "cactus_side", "cactus_side", "cactus_side"},
            {"clay", 82, "rock", "clay", "clay", "clay", "clay", "clay", "clay"},
            {"reeds", 83, "rock", "reeds", "reeds", "reeds", "reeds", "reeds", "reeds"},
            {"jukebox", 84, "rock", "jukebox_side", "jukebox_top", "jukebox_side", "jukebox_side", "jukebox_side", "jukebox_side"},
            {"fence", 85, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"pumpkin", 86, "rock", "pumpkin_top", "pumpkin_top", "pumpkin_side", "pumpkin_face_off", "pumpkin_side", "pumpkin_side"},
            {"netherrack", 87, "rock", "netherrack", "netherrack", "netherrack", "netherrack", "netherrack", "netherrack"},
            {"soul_sand", 88, "sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
            {"glowstone", 89, "rock", "glowstone", "glowstone", "glowstone", "glowstone", "glowstone", "glowstone"},
            {"portal", 90, "rock", "portal", "portal", "portal", "portal", "portal", "portal"},
            {"lit_pumpkin", 91, "rock", "pumpkin_top", "pumpkin_top", "pumpkin_side", "pumpkin_face_on", "pumpkin_side", "pumpkin_side"},
            {"cake", 92, "rock", "cake_bottom", "cake_top", "cake_side", "cake_side", "cake_side", "cake_side"},
            {"unpowered_repeater", 93, "rock", "redstone_torch_off", "repeater_off", "stone_slab_top", "stone_slab_top", "stone_slab_top", "stone_slab_top"},
            {"powered_repeater", 94, "rock", "redstone_torch_on", "repeater_on", "stone_slab_top", "stone_slab_top", "stone_slab_top", "stone_slab_top"},
            {"stained_glass", 95, "glass", "glass_white", "glass_white", "glass_white", "glass_white", "glass_white", "glass_white"},
            {"trapdoor", 96, "rock", "trapdoor", "trapdoor", "trapdoor", "trapdoor", "trapdoor", "trapdoor"},
            {"monster_egg", 97, "rock", "stone", "stone", "stone", "stone", "stone", "stone"},
            {"stonebrick", 98, "rock", "stonebrick", "stonebrick", "stonebrick", "stonebrick", "stonebrick", "stonebrick"},
            {"brown_mushroom_block", 99, "rock", "mushroom_block_inside", "mushroom_block_inside", "mushroom_block_inside", "mushroom_block_inside", "mushroom_block_inside", "mushroom_block_inside"},
            {"red_mushroom_block", 100, "rock", "mushroom_block_inside", "mushroom_block_inside", "mushroom_block_inside", "mushroom_block_inside", "mushroom_block_inside", "mushroom_block_inside"},
            {"iron_bars", 101, "iron", "iron_bars", "iron_bars", "iron_bars", "iron_bars", "iron_bars", "iron_bars"},
            {"glass_pane", 102, "glass", "glass", "glass", "glass", "glass", "glass", "glass"},
            {"melon_block", 103, "rock", "melon_top", "melon_top", "melon_side", "melon_side", "melon_side", "melon_side"},
            {"pumpkin_stem", 104, "rock", "pumpkin_stem_disconnected", "pumpkin_stem_disconnected", "pumpkin_stem_disconnected", "pumpkin_stem_disconnected", "pumpkin_stem_disconnected", "pumpkin_stem_disconnected"},
            {"melon_stem", 105, "rock", "melon_stem_disconnected", "melon_stem_disconnected", "melon_stem_disconnected", "melon_stem_disconnected", "melon_stem_disconnected", "melon_stem_disconnected"},
            {"vine", 106, "rock", "vine", "vine", "vine", "vine", "vine", "vine"},
            {"fence_gate", 107, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"brick_stairs", 108, "rock", "brick", "brick", "brick", "brick", "brick", "brick"},
            {"stone_brick_stairs", 109, "rock", "stonebrick", "stonebrick", "stonebrick", "stonebrick", "stonebrick", "stonebrick"},
            {"mycelium", 110, "rock", "dirt", "mycelium_top", "mycelium_side", "mycelium_side", "mycelium_side", "mycelium_side"},
            {"waterlily", 111, "rock", "waterlily", "waterlily", "waterlily", "waterlily", "waterlily", "waterlily"},
            {"nether_brick", 112, "rock", "nether_brick", "nether_brick", "nether_brick", "nether_brick", "nether_brick", "nether_brick"},
            {"nether_brick_fence", 113, "rock", "nether_brick", "nether_brick", "nether_brick", "nether_brick", "nether_brick", "nether_brick"},
            {"nether_brick_stairs", 114, "rock", "nether_brick", "nether_brick", "nether_brick", "nether_brick", "nether_brick", "nether_brick"},
            {"nether_wart", 115, "rock", "nether_wart_stage_0", "nether_wart_stage_0", "nether_wart_stage_0", "nether_wart_stage_0", "nether_wart_stage_0", "nether_wart_stage_0"},
            {"enchanting_table", 116, "rock", "enchanting_table_bottom", "enchanting_table_top", "enchanting_table_side", "enchanting_table_side", "enchanting_table_side", "enchanting_table_side"},
            {"brewing_stand", 117, "rock", "brewing_stand", "brewing_stand", "brewing_stand", "brewing_stand", "brewing_stand", "brewing_stand"},
            {"cauldron", 118, "rock", "cauldron_bottom", "cauldron_top", "cauldron_side", "cauldron_side", "cauldron_side", "cauldron_side"},
            {"end_portal", 119, "rock", "portal", "portal", "portal", "portal", "portal", "portal"},
            {"end_portal_frame", 120, "rock", "end_stone", "endframe_top", "endframe_side", "endframe_side", "endframe_side", "endframe_side"},
            {"end_stone", 121, "rock", "end_stone", "end_stone", "end_stone", "end_stone", "end_stone", "end_stone"},
            {"dragon_egg", 122, "rock", "dragon_egg", "dragon_egg", "dragon_egg", "dragon_egg", "dragon_egg", "dragon_egg"},
            {"redstone_lamp", 123, "rock", "redstone_lamp_off", "redstone_lamp_off", "redstone_lamp_off", "redstone_lamp_off", "redstone_lamp_off", "redstone_lamp_off"},
            {"lit_redstone_lamp", 124, "rock", "redstone_lamp_on", "redstone_lamp_on", "redstone_lamp_on", "redstone_lamp_on", "redstone_lamp_on", "redstone_lamp_on"},
            {"double_wooden_slab", 125, "wood", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"wooden_slab", 126, "wood", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"cocoa", 127, "rock", "cocoa_stage_2", "cocoa_stage_2", "cocoa_stage_2", "cocoa_stage_2", "cocoa_stage_2", "cocoa_stage_2"},
            {"sandstone_stairs", 128, "rock", "sandstone_bottom", "sandstone_top", "sandstone_normal", "sandstone_normal", "sandstone_normal", "sandstone_normal"},
            {"emerald_ore", 129, "rock", "emerald_ore", "emerald_ore", "emerald_ore", "emerald_ore", "emerald_ore", "emerald_ore"},
            {"ender_chest", 130, "rock", "obsidian", "obsidian", "obsidian", "obsidian", "obsidian", "obsidian"},
            {"tripwire_hook", 131, "rock", "trip_wire_source", "trip_wire_source", "trip_wire_source", "trip_wire_source", "trip_wire_source", "trip_wire_source"},
            {"tripwire", 132, "rock", "trip_wire", "trip_wire", "trip_wire", "trip_wire", "trip_wire", "trip_wire"},
            {"emerald_block", 133, "rock", "emerald_block", "emerald_block", "emerald_block", "emerald_block", "emerald_block", "emerald_block"},
            {"spruce_stairs", 134, "rock", "planks_spruce", "planks_spruce", "planks_spruce", "planks_spruce", "planks_spruce", "planks_spruce"},
            {"birch_stairs", 135, "rock", "planks_birch", "planks_birch", "planks_birch", "planks_birch", "planks_birch", "planks_birch"},
            {"jungle_stairs", 136, "rock", "planks_jungle", "planks_jungle", "planks_jungle", "planks_jungle", "planks_jungle", "planks_jungle"},
            {"command_block", 137, "rock", "command_block", "command_block", "command_block", "command_block", "command_block", "command_block"},
            {"beacon", 138, "rock", "beacon", "beacon", "beacon", "beacon", "beacon", "beacon"},
            {"cobblestone_wall", 139, "rock", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone"},
            {"flower_pot", 140, "rock", "flower_pot", "flower_pot", "flower_pot", "flower_pot", "flower_pot", "flower_pot"},
            {"carrots", 141, "rock", "carrots_stage_0", "carrots_stage_0", "carrots_stage_0", "carrots_stage_0", "carrots_stage_0", "carrots_stage_0"},
            {"potatoes", 142, "rock", "potatoes_stage_0", "potatoes_stage_0", "potatoes_stage_0", "potatoes_stage_0", "potatoes_stage_0", "potatoes_stage_0"},
            {"wooden_button", 143, "wood", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"skull", 144, "rock", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
            {"anvil", 145, "rock", "anvil_base", "anvil_base", "anvil_base", "anvil_base", "anvil_base", "anvil_base"},
            {"trapped_chest", 146, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"light_weighted_pressure_plate", 147, "rock", "gold_block", "gold_block", "gold_block", "gold_block", "gold_block", "gold_block"},
            {"heavy_weighted_pressure_plate", 148, "rock", "iron_block", "iron_block", "iron_block", "iron_block", "iron_block", "iron_block"},
            {"unpowered_comparator", 149, "rock", "redstone_torch_off", "comparator_off", "stone_slab_top", "stone_slab_top", "stone_slab_top", "stone_slab_top"},
            {"powered_comparator", 150, "rock", "redstone_torch_on", "comparator_on", "stone_slab_top", "stone_slab_top", "stone_slab_top", "stone_slab_top"},
            {"daylight_detector", 151, "rock", "daylight_detector_side", "daylight_detector_top", "daylight_detector_side", "daylight_detector_side", "daylight_detector_side", "daylight_detector_side"},
            {"redstone_block", 152, "rock", "redstone_block", "redstone_block", "redstone_block", "redstone_block", "redstone_block", "redstone_block"},
            {"quartz_ore", 153, "rock", "quartz_ore", "quartz_ore", "quartz_ore", "quartz_ore", "quartz_ore", "quartz_ore"},
            {"hopper", 154, "rock", "hopper_outside", "hopper_top", "hopper_outside", "hopper_outside", "hopper_outside", "hopper_outside"},
            {"quartz_block", 155, "rock", "quartz_block_bottom", "quartz_block_top", "quartz_block_side", "quartz_block_side", "quartz_block_side", "quartz_block_side"},
            {"quartz_stairs", 156, "rock", "quartz_block_bottom", "quartz_block_top", "quartz_block_side", "quartz_block_side", "quartz_block_side", "quartz_block_side"},
            {"activator_rail", 157, "rock", "rail_activator", "rail_activator", "rail_activator", "rail_activator", "rail_activator", "rail_activator"},
            {"dropper", 158, "rock", "dropper_front_vertical", "furnace_top", "furnace_top", "furnace_top", "furnace_top", "furnace_top"},
            {"stained_hardened_clay", 159, "rock", "hardened_clay_stained_white", "hardened_clay_stained_white", "hardened_clay_stained_white", "hardened_clay_stained_white", "hardened_clay_stained_white", "hardened_clay_stained_white"},
            {"stained_glass_pane", 160, "glass", "glass_white", "glass_white", "glass_white", "glass_white", "glass_white", "glass_white"},
            {"leaves2", 161, "leaves", "leaves_acacia", "leaves_acacia", "leaves_acacia", "leaves_acacia", "leaves_acacia", "leaves_acacia"},
            {"log2", 162, "wood", "log_acacia_top", "log_acacia_top", "log_acacia", "log_acacia", "log_acacia", "log_acacia"},
            {"acacia_stairs", 163, "rock", "planks_acacia", "planks_acacia", "planks_acacia", "planks_acacia", "planks_acacia", "planks_acacia"},
            {"dark_oak_stairs", 164, "rock", "planks_big_oak", "planks_big_oak", "planks_big_oak", "planks_big_oak", "planks_big_oak", "planks_big_oak"},
            {"hay_block", 170, "rock", "hay_block_top", "hay_block_top", "hay_block_side", "hay_block_side", "hay_block_side", "hay_block_side"},
            {"carpet", 171, "rock", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white"},
            {"hardened_clay", 172, "rock", "hardened_clay", "hardened_clay", "hardened_clay", "hardened_clay", "hardened_clay", "hardened_clay"},
            {"coal_block", 173, "rock", "coal_block", "coal_block", "coal_block", "coal_block", "coal_block", "coal_block"},
            {"packed_ice", 174, "ice", "ice_packed", "ice_packed", "ice_packed", "ice_packed", "ice_packed", "ice_packed"},
            {"double_plant", 175, "rock", "double_plant_sunflower_bottom", "double_plant_sunflower_bottom", "double_plant_sunflower_bottom", "double_plant_sunflower_bottom", "double_plant_sunflower_bottom", "double_plant_sunflower_bottom"},
        };
        BlockRegistryHelper.registerBlocks("minecraft", minecraftBlockData);
    }

    /**
     * 注册来自 BambooMod 的方块
     */
    private static void registerBamboomodBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] BambooModBlockData = {
            {"bamboo", 165, "rock", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo"},
            {"bamboosingle", 166, "rock", "bamboo:bamboosingle", "bamboo:bamboosingle", "bamboo:bamboosingle", "bamboo:bamboosingle", "bamboo:bamboosingle", "bamboo:bamboosingle"},
            {"bamboo2", 167, "rock", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo"},
            {"blockbambooshoot", 168, "rock", "bamboo:bambooshoot", "bamboo:bambooshoot", "bamboo:bambooshoot", "bamboo:bambooshoot", "bamboo:bambooshoot", "bamboo:bambooshoot"},
            {"singleTexDeco", 169, "rock", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo", "bamboo:bamboo"},
            {"kitunebi", 176, "rock", "bamboo:kitunebi", "bamboo:kitunebi", "bamboo:kitunebi", "bamboo:kitunebi", "bamboo:kitunebi", "bamboo:kitunebi"},
            {"jpChest", 177, "rock", "bamboo:jpchest_o", "bamboo:jpchest_o", "bamboo:jpchest_o", "bamboo:jpchest_f", "bamboo:jpchest_o", "bamboo:jpchest_o"},
            {"dirSquare", 178, "rock", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x"},
            {"halfDirSquare", 179, "rock", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x"},
            {"andon", 180, "rock", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white"},
            {"bambooPanel", 181, "rock", "bamboo:bamboopane", "bamboo:bamboopane", "bamboo:bamboopane", "bamboo:bamboopane", "bamboo:bamboopane", "bamboo:bamboopane"},
            {"sakuraLeaves", 182, "leaves", "bamboo:broadleaf", "bamboo:broadleaf", "bamboo:broadleaf", "bamboo:broadleaf", "bamboo:broadleaf", "bamboo:broadleaf"},
            {"sakuraSapling", 183, "rock", "bamboo:sakura", "bamboo:sakura", "bamboo:sakura", "bamboo:sakura", "bamboo:sakura", "bamboo:sakura"},
            {"kayabukiRoof", 184, "rock", "bamboo:kaya_x", "bamboo:kaya_x", "bamboo:kaya_x", "bamboo:kaya_x", "bamboo:kaya_x", "bamboo:kaya_x"},
            {"spaWater", 185, "rock", "water_still", "water_still", "water_flow", "water_flow", "water_flow", "water_flow"},
            {"spaUnit", 186, "rock", "piston_bottom", "piston_top_normal", "piston_bottom", "piston_bottom", "piston_bottom", "piston_bottom"},
            {"sakuraLog", 187, "wood", "bamboo:sakuralog_t", "bamboo:sakuralog_t", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s"},
            {"delude_width", 188, "rock", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude"},
            {"delude_height", 189, "rock", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude"},
            {"delude_stair", 190, "rock", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude"},
            {"campfire", 191, "rock", "wool_colored_black", "wool_colored_black", "wool_colored_black", "wool_colored_black", "wool_colored_black", "wool_colored_black"},
            {"deco", 192, "rock", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster"},
            {"halfDeco", 193, "rock", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster"},
            {"twoDirDeco", 194, "rock", "bamboo:yoroiita_x", "bamboo:yoroiita_x", "bamboo:yoroiita_x", "bamboo:yoroiita_x", "bamboo:yoroiita_x", "bamboo:yoroiita_x"},
            {"halfTwoDirDeco", 195, "rock", "bamboo:yoroiita_x", "bamboo:yoroiita_x", "bamboo:yoroiita_x", "bamboo:yoroiita_x", "bamboo:yoroiita_x", "bamboo:yoroiita_x"},
            {"kawara_stair", 196, "rock", "bamboo:kawara", "bamboo:kawara", "bamboo:kawara", "bamboo:kawara", "bamboo:kawara", "bamboo:kawara"},
            {"wara_stair", 197, "rock", "bamboo:wara_y", "bamboo:wara_y", "bamboo:wara_y", "bamboo:wara_y", "bamboo:wara_y", "bamboo:wara_y"},
            {"decoCarpet", 198, "rock", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x", "bamboo:tatami_x"},
            {"thickSakuraPillar", 199, "rock", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x"},
            {"thinSakuraPillar", 200, "rock", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x", "bamboo:sakuraplank_x"},
            {"thickOrcPillar", 201, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"thinOrcPillar", 202, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"thickSprucePillar", 203, "rock", "log_spruce", "log_spruce", "log_spruce", "log_spruce", "log_spruce", "log_spruce"},
            {"thinSprucePillar", 204, "rock", "log_spruce", "log_spruce", "log_spruce", "log_spruce", "log_spruce", "log_spruce"},
            {"thickBirchPillar", 205, "rock", "log_birch", "log_birch", "log_birch", "log_birch", "log_birch", "log_birch"},
            {"thinBirchPillar", 206, "rock", "log_birch", "log_birch", "log_birch", "log_birch", "log_birch", "log_birch"},
            {"delude_plate", 207, "rock", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude", "bamboo:delude"},
            {"ricePlant", 208, "ice", "bamboo:riceplant_stage_0", "bamboo:riceplant_stage_0", "bamboo:riceplant_stage_0", "bamboo:riceplant_stage_0", "bamboo:riceplant_stage_0", "bamboo:riceplant_stage_0"},
            {"bambooMillStone", 209, "rock", "wool_colored_gray", "wool_colored_gray", "wool_colored_gray", "wool_colored_gray", "wool_colored_gray", "wool_colored_gray"},
            {"bambooMoss", 210, "rock", "bamboo:moss", "bamboo:moss", "bamboo:moss", "bamboo:moss", "bamboo:moss", "bamboo:moss"},
            {"bambooMultiPot", 211, "rock", "flower_pot", "flower_pot", "flower_pot", "flower_pot", "flower_pot", "flower_pot"},
            {"blobkbroom", 212, "rock", "bamboo:broom_straight", "bamboo:broom_straight", "bamboo:broom_straight", "bamboo:broom_straight", "bamboo:broom_straight", "bamboo:broom_straight"},
            {"bamboohuton", 213, "rock", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white", "wool_colored_white"},
            {"bamboomultiblock", 214, "rock", "bamboo:multiblock", "bamboo:multiblock", "bamboo:multiblock", "bamboo:multiblock", "bamboo:multiblock", "bamboo:multiblock"},
            {"alphamultiblock", 215, "rock", "bamboo:alphamultiblock", "bamboo:alphamultiblock", "bamboo:alphamultiblock", "bamboo:alphamultiblock", "bamboo:alphamultiblock", "bamboo:alphamultiblock"},
            {"sakuracarpet", 216, "rock", "bamboo:sakuracarpet", "bamboo:sakuracarpet", "bamboo:sakuracarpet", "bamboo:sakuracarpet", "bamboo:sakuracarpet", "bamboo:sakuracarpet"},
            {"decoPlaster", 217, "rock", "bamboo:decoplaster_i_0", "bamboo:decoplaster_i_0", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster"},
            {"decoCurvePlaster", 218, "rock", "bamboo:decoplaster_l_0", "bamboo:decoplaster_l_0", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster"},
            {"decoDCurvePlaster", 219, "rock", "bamboo:decoplaster_d_0", "bamboo:decoplaster_d_0", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster", "bamboo:plaster"},
            {"seaweed", 220, "rock", "bamboo:seaweed_stage_0", "bamboo:seaweed_stage_0", "bamboo:seaweed_stage_0", "bamboo:seaweed_stage_0", "bamboo:seaweed_stage_0", "bamboo:seaweed_stage_0"},
            {"beanPlant", 221, "rock", "bamboo:beanplant_stage_0", "bamboo:beanplant_stage_0", "bamboo:beanplant_stage_0", "bamboo:beanplant_stage_0", "bamboo:beanplant_stage_0", "bamboo:beanplant_stage_0"},
            {"tomatoPlant", 222, "rock", "bamboo:tomato_stage_0", "bamboo:tomato_stage_0", "bamboo:tomato_stage_0", "bamboo:tomato_stage_0", "bamboo:tomato_stage_0", "bamboo:tomato_stage_0"},
            {"villagerBlock", 223, "rock", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
            {"crossLamp", 224, "rock", "bamboo:kagaribi", "bamboo:kagaribi", "bamboo:kagaribi", "bamboo:kagaribi", "bamboo:kagaribi", "bamboo:kagaribi"},
            {"bambooLiangThick", 225, "rock", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s"},
            {"bambooLiangVLogThick", 226, "wood", "log_oak", "log_oak", "log_oak", "log_oak", "log_oak", "log_oak"},
            {"bambooLiangVLog2Thick", 227, "wood", "log_acacia", "log_acacia", "log_acacia", "log_acacia", "log_acacia", "log_acacia"},
            {"bambooLiangVWoodThick", 228, "wood", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"bambooLiangThin", 229, "rock", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s", "bamboo:sakuralog_s"},
            {"bambooLiangVLogThin", 230, "wood", "log_oak", "log_oak", "log_oak", "log_oak", "log_oak", "log_oak"},
            {"bambooLiangVLog2Thin", 231, "wood", "log_acacia", "log_acacia", "log_acacia", "log_acacia", "log_acacia", "log_acacia"},
            {"bambooLiangVWoodThin", 232, "wood", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"maneki", 233, "rock", "wool_colored_red", "wool_colored_red", "wool_colored_red", "wool_colored_red", "wool_colored_red", "wool_colored_red"},
        };
        BlockRegistryHelper.registerBlocks("BambooMod", BambooModBlockData);
    }

    /**
     * 注册来自 customnpcs 的方块
     */
    private static void registerCustomnpcsBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] customnpcsBlockData = {
            {"npcRedstoneBlock", 234, "rock", "customnpcs:npcRedstoneBlock", "customnpcs:npcRedstoneBlock", "customnpcs:npcRedstoneBlock", "customnpcs:npcRedstoneBlock", "customnpcs:npcRedstoneBlock", "customnpcs:npcRedstoneBlock"},
            {"npcCarpentyBench", 235, "rock", "customnpcs:npcCarpentyBench", "customnpcs:npcCarpentyBench", "customnpcs:npcCarpentyBench", "customnpcs:npcCarpentyBench", "customnpcs:npcCarpentyBench", "customnpcs:npcCarpentyBench"},
            {"npcMailbox", 236, "rock", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
            {"npcWaypoint", 237, "rock", "customnpcs:npcWaypoint", "customnpcs:npcWaypoint", "customnpcs:npcWaypoint", "customnpcs:npcWaypoint", "customnpcs:npcWaypoint", "customnpcs:npcWaypoint"},
            {"npcBorder", 238, "rock", "iron_block", "customnpcs:npcBorder", "iron_block", "iron_block", "iron_block", "iron_block"},
            {"npcBloodBlock", 239, "rock", "customnpcs:npcBloodBlock", "customnpcs:npcBloodBlock2", "customnpcs:npcBloodBlock3", "customnpcs:npcBloodBlock", "customnpcs:npcBloodBlock2", "customnpcs:npcBloodBlock3"},
            {"npcBanner", 240, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcWallBanner", 241, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcTallLamp", 242, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcChair", 243, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcCrate", 244, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcWeaponRack", 245, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcCouchWool", 246, "cloth", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcCouchWood", 247, "wood", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcTable", 248, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcStool", 249, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcPlaceholder", 250, "rock", "customnpcs:placeholder_0", "customnpcs:placeholder_0", "customnpcs:placeholder_0", "customnpcs:placeholder_0", "customnpcs:placeholder_0", "customnpcs:placeholder_0"},
            {"npcBigSign", 251, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcBarrel", 252, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcTombstone", 253, "rock", "stone", "stone", "stone", "stone", "stone", "stone"},
            {"npcShelf", 254, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcSign", 255, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcBeam", 409, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcBook", 410, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcPedestal", 411, "rock", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak", "planks_oak"},
            {"npcCrystalBlock", 412, "rock", "customnpcs:npcCrystal", "customnpcs:npcCrystal", "customnpcs:npcCrystal", "customnpcs:npcCrystal", "customnpcs:npcCrystal", "customnpcs:npcCrystal"},
            {"npcCampfire", 413, "rock", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone"},
            {"npcLamp", 414, "rock", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
            {"npcCandle", 415, "rock", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
            {"npcCampfireUnlit", 416, "rock", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone"},
            {"npcLampUnlit", 423, "rock", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
            {"npcCandleUnlit", 424, "rock", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
        };
        BlockRegistryHelper.registerBlocks("customnpcs", customnpcsBlockData);
    }

    /**
     * 注册来自 flansmod 的方块
     */
    private static void registerFlansmodBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] flansmodBlockData = {
            {"flansWorkbench", 425, "rock", "FlansMod:planeCraftingTableSide", "FlansMod:planeCraftingTableSmall", "FlansMod:planeCraftingTableSide", "FlansMod:planeCraftingTableSide", "FlansMod:planeCraftingTableSide", "FlansMod:planeCraftingTableSide"},
            {"teamsSpawner", 426, "rock", "FlansMod:spawner_item_1", "FlansMod:spawner_item_1", "FlansMod:spawner_item_1", "FlansMod:spawner_item_1", "FlansMod:spawner_item_1", "FlansMod:spawner_item_1"},
            {"armorBox.mwArmour", 427, "rock", "FlansMod:ModernArmourBoxTop", "FlansMod:ModernArmourBoxTop", "FlansMod:ModernArmourBoxSide", "FlansMod:ModernArmourBoxSide", "FlansMod:ModernArmourBoxSide", "FlansMod:ModernArmourBoxSide"},
            {"armorBox.ww2Armour", 428, "rock", "FlansMod:ww2ArmourBox", "FlansMod:ww2ArmourBox", "FlansMod:ww2ArmourBoxSide", "FlansMod:ww2ArmourBoxSide", "FlansMod:ww2ArmourBoxSide", "FlansMod:ww2ArmourBoxSide"},
            {"gunBox.modern", 429, "rock", "FlansMod:boxBottom", "FlansMod:ModernBoxTop", "FlansMod:ModernBoxSide", "FlansMod:ModernBoxSide", "FlansMod:ModernBoxSide", "FlansMod:ModernBoxSide"},
            {"gunBox.american", 430, "rock", "FlansMod:boxBottom", "FlansMod:boxTop", "FlansMod:AmericanBox", "FlansMod:AmericanBox", "FlansMod:AmericanBox", "FlansMod:AmericanBox"},
            {"gunBox.british", 431, "rock", "FlansMod:boxBottom", "FlansMod:boxTop", "FlansMod:BritishBox", "FlansMod:BritishBox", "FlansMod:BritishBox", "FlansMod:BritishBox"},
            {"gunBox.german", 432, "rock", "FlansMod:boxBottom", "FlansMod:boxTop", "FlansMod:GermanBox", "FlansMod:GermanBox", "FlansMod:GermanBox", "FlansMod:GermanBox"},
            {"gunBox.japanese", 433, "rock", "FlansMod:boxBottom", "FlansMod:boxTop", "FlansMod:JapaneseBox", "FlansMod:JapaneseBox", "FlansMod:JapaneseBox", "FlansMod:JapaneseBox"},
            {"gunBox.russian", 434, "rock", "FlansMod:boxBottom", "FlansMod:boxTop", "FlansMod:RussianBox", "FlansMod:RussianBox", "FlansMod:RussianBox", "FlansMod:RussianBox"},
        };
        BlockRegistryHelper.registerBlocks("flansmod", flansmodBlockData);
    }

    /**
     * 注册来自 IC2 的方块
     */
    private static void registerIc2Blocks() {
        // 使用辅助方法批量注册方块
        Object[][] IC2BlockData = {
            {"blockOreCopper", 435, "rock", "ic2:blockOreCopper:0", "ic2:blockOreCopper:1", "ic2:blockOreCopper:5", "ic2:blockOreCopper:3", "ic2:blockOreCopper:2", "ic2:blockOreCopper:4"},
            {"blockOreTin", 436, "rock", "ic2:blockOreTin:0", "ic2:blockOreTin:1", "ic2:blockOreTin:5", "ic2:blockOreTin:3", "ic2:blockOreTin:2", "ic2:blockOreTin:4"},
            {"blockOreUran", 437, "rock", "ic2:blockOreUran:0", "ic2:blockOreUran:1", "ic2:blockOreUran:5", "ic2:blockOreUran:3", "ic2:blockOreUran:2", "ic2:blockOreUran:4"},
            {"blockOreLead", 438, "rock", "ic2:blockOreLead:0", "ic2:blockOreLead:1", "ic2:blockOreLead:5", "ic2:blockOreLead:3", "ic2:blockOreLead:2", "ic2:blockOreLead:4"},
            {"blockRubWood", 439, "wood", "ic2:blockRubWood:0", "ic2:blockRubWood:1", "ic2:blockRubWood:5", "ic2:blockRubWood:3", "ic2:blockRubWood:2", "ic2:blockRubWood:4"},
            {"blockRubLeaves", 440, "leaves", "ic2:blockRubLeaves", "ic2:blockRubLeaves", "ic2:blockRubLeaves", "ic2:blockRubLeaves", "ic2:blockRubLeaves", "ic2:blockRubLeaves"},
            {"blockRubSapling", 441, "rock", "ic2:blockRubSapling", "ic2:blockRubSapling", "ic2:blockRubSapling", "ic2:blockRubSapling", "ic2:blockRubSapling", "ic2:blockRubSapling"},
            {"blockHarz", 442, "rock", "ic2:blockHarz:0", "ic2:blockHarz:1", "ic2:blockHarz:5", "ic2:blockHarz:3", "ic2:blockHarz:2", "ic2:blockHarz:4"},
            {"blockRubber", 443, "rock", "ic2:blockRubber:0", "ic2:blockRubber:1", "ic2:blockRubber:5", "ic2:blockRubber:3", "ic2:blockRubber:2", "ic2:blockRubber:4"},
            {"blockFenceIron", 444, "iron", "ic2:blockFenceIron:0", "ic2:blockFenceIron:1", "ic2:blockFenceIron:5", "ic2:blockFenceIron:3", "ic2:blockFenceIron:2", "ic2:blockFenceIron:4"},
            {"blockAlloy", 445, "rock", "ic2:blockAlloy:0", "ic2:blockAlloy:1", "ic2:blockAlloy:5", "ic2:blockAlloy:3", "ic2:blockAlloy:2", "ic2:blockAlloy:4"},
            {"blockBasalt", 446, "rock", "ic2:blockBasalt:0", "ic2:blockBasalt:1", "ic2:blockBasalt:5", "ic2:blockBasalt:3", "ic2:blockBasalt:2", "ic2:blockBasalt:4"},
            {"blockAlloyGlass", 447, "glass", "ic2:blockAlloyGlass:0", "ic2:blockAlloyGlass:1", "ic2:blockAlloyGlass:5", "ic2:blockAlloyGlass:3", "ic2:blockAlloyGlass:2", "ic2:blockAlloyGlass:4"},
            {"blockDoorAlloy", 448, "rock", "ic2:blockDoorAlloy.bottom", "ic2:blockDoorAlloy.bottom", "ic2:blockDoorAlloy.bottom", "ic2:blockDoorAlloy.bottom", "ic2:blockDoorAlloy.bottom", "ic2:blockDoorAlloy.bottom"},
            {"blockReinforcedFoam", 449, "rock", "ic2:cf/blockReinforcedFoam:0", "ic2:cf/blockReinforcedFoam:1", "ic2:cf/blockReinforcedFoam:5", "ic2:cf/blockReinforcedFoam:3", "ic2:cf/blockReinforcedFoam:2", "ic2:cf/blockReinforcedFoam:4"},
            {"blockFoam", 450, "rock", "ic2:cf/blockFoam:0", "ic2:cf/blockFoam:1", "ic2:cf/blockFoam:5", "ic2:cf/blockFoam:3", "ic2:cf/blockFoam:2", "ic2:cf/blockFoam:4"},
            {"blockWall", 451, "rock", "ic2:cf/blockWall.black:0", "ic2:cf/blockWall.black:1", "ic2:cf/blockWall.black:5", "ic2:cf/blockWall.black:3", "ic2:cf/blockWall.black:2", "ic2:cf/blockWall.black:4"},
            {"blockScaffold", 452, "rock", "ic2:blockScaffold:0", "ic2:blockScaffold:1", "ic2:blockScaffold:5", "ic2:blockScaffold:3", "ic2:blockScaffold:2", "ic2:blockScaffold:4"},
            {"blockIronScaffold", 453, "iron", "ic2:blockIronScaffold:0", "ic2:blockIronScaffold:1", "ic2:blockIronScaffold:5", "ic2:blockIronScaffold:3", "ic2:blockIronScaffold:2", "ic2:blockIronScaffold:4"},
            {"blockMetal", 454, "iron", "ic2:blockMetalCopper:0", "ic2:blockMetalCopper:1", "ic2:blockMetalCopper:5", "ic2:blockMetalCopper:3", "ic2:blockMetalCopper:2", "ic2:blockMetalCopper:4"},
            {"blockCable", 455, "rock", "ic2:wiring/cable/blockCable:0", "ic2:wiring/cable/blockCable:1", "ic2:wiring/cable/blockCable:5", "ic2:wiring/cable/blockCable:3", "ic2:wiring/cable/blockCable:2", "ic2:wiring/cable/blockCable:4"},
            {"blockKineticGenerator", 456, "rock", "ic2:kineticgenerator/blockWindKineticGenerator:0", "ic2:kineticgenerator/blockWindKineticGenerator:1", "ic2:kineticgenerator/blockWindKineticGenerator:5", "ic2:kineticgenerator/blockWindKineticGenerator:3", "ic2:kineticgenerator/blockWindKineticGenerator:2", "ic2:kineticgenerator/blockWindKineticGenerator:4"},
            {"blockHeatGenerator", 457, "rock", "ic2:heatgenerator/blockSolidHeatGenerator:0", "ic2:heatgenerator/blockSolidHeatGenerator:1", "ic2:heatgenerator/blockSolidHeatGenerator:5", "ic2:heatgenerator/blockSolidHeatGenerator:3", "ic2:heatgenerator/blockSolidHeatGenerator:2", "ic2:heatgenerator/blockSolidHeatGenerator:4"},
            {"blockGenerator", 458, "rock", "ic2:generator/blockGenerator:0", "ic2:generator/blockGenerator:1", "ic2:generator/blockGenerator:5", "ic2:generator/blockGenerator:3", "ic2:generator/blockGenerator:2", "ic2:generator/blockGenerator:4"},
            {"blockReactorChamber", 459, "rock", "ic2:reactor/blockReactorChamber:0", "ic2:reactor/blockReactorChamber:1", "ic2:reactor/blockReactorChamber:5", "ic2:reactor/blockReactorChamber:3", "ic2:reactor/blockReactorChamber:2", "ic2:reactor/blockReactorChamber:4"},
            {"blockReactorFluidPort", 460, "rock", "ic2:reactor/blockReactorFluidPort:0", "ic2:reactor/blockReactorFluidPort:1", "ic2:reactor/blockReactorFluidPort:5", "ic2:reactor/blockReactorFluidPort:3", "ic2:reactor/blockReactorFluidPort:2", "ic2:reactor/blockReactorFluidPort:4"},
            {"blockReactorAccessHatch", 461, "rock", "ic2:reactor/blockReactorAccessHatch:0", "ic2:reactor/blockReactorAccessHatch:1", "ic2:reactor/blockReactorAccessHatch:5", "ic2:reactor/blockReactorAccessHatch:3", "ic2:reactor/blockReactorAccessHatch:2", "ic2:reactor/blockReactorAccessHatch:4"},
            {"blockReactorRedstonePort", 462, "rock", "ic2:reactor/blockReactorRedstonePort:0", "ic2:reactor/blockReactorRedstonePort:1", "ic2:reactor/blockReactorRedstonePort:5", "ic2:reactor/blockReactorRedstonePort:3", "ic2:reactor/blockReactorRedstonePort:2", "ic2:reactor/blockReactorRedstonePort:4"},
            {"blockreactorvessel", 463, "rock", "ic2:reactor/blockreactorvessel:0", "ic2:reactor/blockreactorvessel:1", "ic2:reactor/blockreactorvessel:5", "ic2:reactor/blockreactorvessel:3", "ic2:reactor/blockreactorvessel:2", "ic2:reactor/blockreactorvessel:4"},
            {"blockElectric", 464, "rock", "ic2:wiring/blockBatBox:0", "ic2:wiring/blockBatBox:1", "ic2:wiring/blockBatBox:5", "ic2:wiring/blockBatBox:3", "ic2:wiring/blockBatBox:2", "ic2:wiring/blockBatBox:4"},
            {"blockChargepad", 465, "rock", "ic2:wiring/blockChargepadBatBox:0", "ic2:wiring/blockChargepadBatBox:1", "ic2:wiring/blockChargepadBatBox:5", "ic2:wiring/blockChargepadBatBox:3", "ic2:wiring/blockChargepadBatBox:2", "ic2:wiring/blockChargepadBatBox:4"},
            {"blockMachine", 466, "rock", "ic2:machine/blockMachine:0", "ic2:machine/blockMachine:1", "ic2:machine/blockMachine:5", "ic2:machine/blockMachine:3", "ic2:machine/blockMachine:2", "ic2:machine/blockMachine:4"},
            {"blockMachine2", 467, "rock", "ic2:machine/blockTeleporter:0", "ic2:machine/blockTeleporter:1", "ic2:machine/blockTeleporter:5", "ic2:machine/blockTeleporter:3", "ic2:machine/blockTeleporter:2", "ic2:machine/blockTeleporter:4"},
            {"blockMachine3", 468, "rock", "ic2:machine/blockSteamGenerator:0", "ic2:machine/blockSteamGenerator:1", "ic2:machine/blockSteamGenerator:5", "ic2:machine/blockSteamGenerator:3", "ic2:machine/blockSteamGenerator:2", "ic2:machine/blockSteamGenerator:4"},
            {"blockLuminatorDark", 469, "rock", "ic2:wiring/blockLuminatorDark:0", "ic2:wiring/blockLuminatorDark:1", "ic2:wiring/blockLuminatorDark:5", "ic2:wiring/blockLuminatorDark:3", "ic2:wiring/blockLuminatorDark:2", "ic2:wiring/blockLuminatorDark:4"},
            {"blockLuminator", 470, "rock", "ic2:wiring/blockLuminator:0", "ic2:wiring/blockLuminator:1", "ic2:wiring/blockLuminator:5", "ic2:wiring/blockLuminator:3", "ic2:wiring/blockLuminator:2", "ic2:wiring/blockLuminator:4"},
            {"blockMiningPipe", 471, "rock", "ic2:machine/blockMiningPipe:0", "ic2:machine/blockMiningPipe:1", "ic2:machine/blockMiningPipe:5", "ic2:machine/blockMiningPipe:3", "ic2:machine/blockMiningPipe:2", "ic2:machine/blockMiningPipe:4"},
            {"blockMiningTip", 472, "rock", "ic2:machine/blockMiningTip:0", "ic2:machine/blockMiningTip:1", "ic2:machine/blockMiningTip:5", "ic2:machine/blockMiningTip:3", "ic2:machine/blockMiningTip:2", "ic2:machine/blockMiningTip:4"},
            {"blockPersonal", 473, "rock", "ic2:personal/blockPersonalChest:0", "ic2:personal/blockPersonalChest:1", "ic2:personal/blockPersonalChest:5", "ic2:personal/blockPersonalChest:3", "ic2:personal/blockPersonalChest:2", "ic2:personal/blockPersonalChest:4"},
            {"blockITNT", 474, "rock", "ic2:blockITNT:0", "ic2:blockITNT:1", "ic2:blockITNT:5", "ic2:blockITNT:3", "ic2:blockITNT:2", "ic2:blockITNT:4"},
            {"blockNuke", 475, "rock", "ic2:blockNuke:0", "ic2:blockNuke:1", "ic2:blockNuke:5", "ic2:blockNuke:3", "ic2:blockNuke:2", "ic2:blockNuke:4"},
            {"blockDynamite", 476, "rock", "ic2:blockDynamite:0", "ic2:blockDynamite:1", "ic2:blockDynamite:5", "ic2:blockDynamite:3", "ic2:blockDynamite:2", "ic2:blockDynamite:4"},
            {"blockDynamiteRemote", 477, "rock", "ic2:blockDynamiteRemote:0", "ic2:blockDynamiteRemote:1", "ic2:blockDynamiteRemote:5", "ic2:blockDynamiteRemote:3", "ic2:blockDynamiteRemote:2", "ic2:blockDynamiteRemote:4"},
            {"blockCrop", 478, "rock", "ic2:crop/stick:0", "ic2:crop/stick:1", "ic2:crop/stick:5", "ic2:crop/stick:3", "ic2:crop/stick:2", "ic2:crop/stick:4"},
            {"blockBarrel", 479, "rock", "ic2:blockBarrel:0", "ic2:blockBarrel:1", "ic2:blockBarrel:5", "ic2:blockBarrel:3", "ic2:blockBarrel:2", "ic2:blockBarrel:4"},
            {"fluidUuMatter", 480, "rock", "ic2:fluids/uumatter_still", "ic2:fluids/uumatter_still", "ic2:fluids/uumatter_flow", "ic2:fluids/uumatter_flow", "ic2:fluids/uumatter_flow", "ic2:fluids/uumatter_flow"},
            {"fluidConstructionFoam", 481, "rock", "ic2:fluids/constructionfoam_still", "ic2:fluids/constructionfoam_still", "ic2:fluids/constructionfoam_flow", "ic2:fluids/constructionfoam_flow", "ic2:fluids/constructionfoam_flow", "ic2:fluids/constructionfoam_flow"},
            {"fluidCoolant", 482, "rock", "ic2:fluids/coolant_still", "ic2:fluids/coolant_still", "ic2:fluids/coolant_flow", "ic2:fluids/coolant_flow", "ic2:fluids/coolant_flow", "ic2:fluids/coolant_flow"},
            {"fluidHotCoolant", 483, "rock", "ic2:fluids/hotcoolant_still", "ic2:fluids/hotcoolant_still", "ic2:fluids/hotcoolant_flow", "ic2:fluids/hotcoolant_flow", "ic2:fluids/hotcoolant_flow", "ic2:fluids/hotcoolant_flow"},
            {"fluidPahoehoeLava", 484, "rock", "ic2:fluids/pahoehoelava_still", "ic2:fluids/pahoehoelava_still", "ic2:fluids/pahoehoelava_still", "ic2:fluids/pahoehoelava_still", "ic2:fluids/pahoehoelava_still", "ic2:fluids/pahoehoelava_still"},
            {"fluidBiomass", 485, "rock", "ic2:fluids/biomass_still", "ic2:fluids/biomass_still", "ic2:fluids/biomass_flow", "ic2:fluids/biomass_flow", "ic2:fluids/biomass_flow", "ic2:fluids/biomass_flow"},
            {"fluidBiogas", 486, "rock", "ic2:fluids/biogas_still", "ic2:fluids/biogas_still", "ic2:fluids/biogas_still", "ic2:fluids/biogas_still", "ic2:fluids/biogas_still", "ic2:fluids/biogas_still"},
            {"fluidDistilledWater", 487, "rock", "ic2:fluids/distilledwater_still", "ic2:fluids/distilledwater_still", "ic2:fluids/distilledwater_flow", "ic2:fluids/distilledwater_flow", "ic2:fluids/distilledwater_flow", "ic2:fluids/distilledwater_flow"},
            {"fluidSuperheatedSteam", 488, "rock", "ic2:fluids/superheatedsteam_still", "ic2:fluids/superheatedsteam_still", "ic2:fluids/superheatedsteam_still", "ic2:fluids/superheatedsteam_still", "ic2:fluids/superheatedsteam_still", "ic2:fluids/superheatedsteam_still"},
            {"fluidSteam", 489, "rock", "ic2:fluids/steam_still", "ic2:fluids/steam_still", "ic2:fluids/steam_still", "ic2:fluids/steam_still", "ic2:fluids/steam_still", "ic2:fluids/steam_still"},
            {"fluidHotWater", 490, "rock", "ic2:fluids/hotwater_still", "ic2:fluids/hotwater_still", "ic2:fluids/hotwater_flow", "ic2:fluids/hotwater_flow", "ic2:fluids/hotwater_flow", "ic2:fluids/hotwater_flow"},
        };
        BlockRegistryHelper.registerBlocks("IC2", IC2BlockData);
    }

    /**
     * 注册来自 mw 的方块
     */
    private static void registerMwBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] mwBlockData = {
            {"TitaniumOre", 491, "rock", "mw:titaniumore", "mw:titaniumore", "mw:titaniumore", "mw:titaniumore", "mw:titaniumore", "mw:titaniumore"},
            {"LeadOre", 492, "rock", "mw:leadore", "mw:leadore", "mw:leadore", "mw:leadore", "mw:leadore", "mw:leadore"},
            {"CopperOre", 493, "rock", "mw:copperore", "mw:copperore", "mw:copperore", "mw:copperore", "mw:copperore", "mw:copperore"},
            {"TinOre", 494, "rock", "mw:tinore", "mw:tinore", "mw:tinore", "mw:tinore", "mw:tinore", "mw:tinore"},
            {"SulfurOre", 495, "rock", "mw:sulfurore", "mw:sulfurore", "mw:sulfurore", "mw:sulfurore", "mw:sulfurore", "mw:sulfurore"},
            {"BauxiteOre", 496, "rock", "mw:bauxiteore", "mw:bauxiteore", "mw:bauxiteore", "mw:bauxiteore", "mw:bauxiteore", "mw:bauxiteore"},
            {"SiliconOre", 497, "rock", "mw:siliconore", "mw:siliconore", "mw:siliconore", "mw:siliconore", "mw:siliconore", "mw:siliconore"},
            {"TantalumOre", 498, "rock", "mw:tantalumore", "mw:tantalumore", "mw:tantalumore", "mw:tantalumore", "mw:tantalumore", "mw:tantalumore"},
            {"RubyOre", 499, "rock", "mw:rubyore", "mw:rubyore", "mw:rubyore", "mw:rubyore", "mw:rubyore", "mw:rubyore"},
        };
        BlockRegistryHelper.registerBlocks("mw", mwBlockData);
    }

    /**
     * 注册来自 Thaumcraft 的方块
     */
    private static void registerThaumcraftBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] ThaumcraftBlockData = {
            {"blockFluxGoo", 500, "rock", "thaumcraft:fluxgoo", "thaumcraft:fluxgoo", "thaumcraft:fluxgoo", "thaumcraft:fluxgoo", "thaumcraft:fluxgoo", "thaumcraft:fluxgoo"},
            {"blockFluxGas", 501, "rock", "thaumcraft:fluxgas", "thaumcraft:fluxgas", "thaumcraft:fluxgas", "thaumcraft:fluxgas", "thaumcraft:fluxgas", "thaumcraft:fluxgas"},
            {"blockFluidPure", 502, "rock", "thaumcraft:fluidpure", "thaumcraft:fluidpure", "thaumcraft:fluidpure", "thaumcraft:fluidpure", "thaumcraft:fluidpure", "thaumcraft:fluidpure"},
            {"blockFluidDeath", 503, "rock", "thaumcraft:fluiddeath", "thaumcraft:fluiddeath", "thaumcraft:fluiddeath", "thaumcraft:fluiddeath", "thaumcraft:fluiddeath", "thaumcraft:fluiddeath"},
            {"blockCustomOre", 504, "rock", "thaumcraft:cinnibar", "thaumcraft:cinnibar", "thaumcraft:cinnibar", "thaumcraft:cinnibar", "thaumcraft:cinnibar", "thaumcraft:cinnibar"},
            {"blockMagicalLog", 505, "wood", "thaumcraft:greatwoodtop", "thaumcraft:greatwoodtop", "thaumcraft:greatwoodside", "thaumcraft:greatwoodside", "thaumcraft:greatwoodside", "thaumcraft:greatwoodside"},
            {"blockMagicalLeaves", 506, "leaves", "thaumcraft:greatwoodleaveslow", "thaumcraft:greatwoodleaveslow", "thaumcraft:greatwoodleaveslow", "thaumcraft:greatwoodleaveslow", "thaumcraft:greatwoodleaveslow", "thaumcraft:greatwoodleaveslow"},
            {"blockCustomPlant", 507, "rock", "thaumcraft:greatwoodsapling", "thaumcraft:greatwoodsapling", "thaumcraft:greatwoodsapling", "thaumcraft:greatwoodsapling", "thaumcraft:greatwoodsapling", "thaumcraft:greatwoodsapling"},
            {"blockTaint", 508, "rock", "thaumcraft:taint_crust", "thaumcraft:taint_crust", "thaumcraft:taint_crust", "thaumcraft:taint_crust", "thaumcraft:taint_crust", "thaumcraft:taint_crust"},
            {"blockTaintFibres", 509, "rock", "thaumcraft:taint_fibres", "thaumcraft:taint_fibres", "thaumcraft:taint_fibres", "thaumcraft:taint_fibres", "thaumcraft:taint_fibres", "thaumcraft:taint_fibres"},
            {"blockCosmeticOpaque", 510, "rock", "thaumcraft:amberblock_top", "thaumcraft:amberblock_top", "thaumcraft:amberblock", "thaumcraft:amberblock", "thaumcraft:amberblock", "thaumcraft:amberblock"},
            {"blockCosmeticSolid", 511, "rock", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile"},
            {"blockCrystal", 512, "rock", "thaumcraft:crystal", "thaumcraft:crystal", "thaumcraft:crystal", "thaumcraft:crystal", "thaumcraft:crystal", "thaumcraft:crystal"},
            {"blockTube", 513, "rock", "thaumcraft:pipe_1", "thaumcraft:pipe_1", "thaumcraft:pipe_1", "thaumcraft:pipe_1", "thaumcraft:pipe_1", "thaumcraft:pipe_1"},
            {"blockMetalDevice", 514, "iron", "thaumcraft:metalbase", "thaumcraft:metalbase", "thaumcraft:metalbase", "thaumcraft:metalbase", "thaumcraft:metalbase", "thaumcraft:metalbase"},
            {"blockWoodenDevice", 515, "wood", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain"},
            {"blockStoneDevice", 516, "rock", "thaumcraft:pedestal_top", "thaumcraft:al_furnace_top", "thaumcraft:al_furnace_front_off", "thaumcraft:al_furnace_front_off", "thaumcraft:al_furnace_front_off", "thaumcraft:al_furnace_front_off"},
            {"blockMirror", 517, "rock", "thaumcraft:mirrorframe", "thaumcraft:mirrorframe", "thaumcraft:mirrorframe", "thaumcraft:mirrorframe", "thaumcraft:mirrorframe", "thaumcraft:mirrorframe"},
            {"blockTable", 518, "rock", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain"},
            {"blockChestHungry", 519, "rock", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain"},
            {"blockArcaneDoor", 520, "rock", "thaumcraft:adoortop", "thaumcraft:adoortop", "thaumcraft:adoortop", "thaumcraft:adoortop", "thaumcraft:adoortop", "thaumcraft:adoortop"},
            {"blockLifter", 521, "rock", "thaumcraft:arcaneearbottom", "thaumcraft:liftertop", "thaumcraft:lifterside", "thaumcraft:lifterside", "thaumcraft:lifterside", "thaumcraft:lifterside"},
            {"blockMagicBox", 522, "rock", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain", "thaumcraft:woodplain"},
            {"blockAlchemyFurnace", 523, "rock", "thaumcraft:metalbase", "thaumcraft:metalbase", "thaumcraft:metalbase", "thaumcraft:metalbase", "thaumcraft:metalbase", "thaumcraft:metalbase"},
            {"blockJar", 524, "rock", "thaumcraft:jar_bottom", "thaumcraft:jar_top", "thaumcraft:jar_side", "thaumcraft:jar_side", "thaumcraft:jar_side", "thaumcraft:jar_side"},
            {"blockCandle", 525, "rock", "thaumcraft:candle", "thaumcraft:candle", "thaumcraft:candle", "thaumcraft:candle", "thaumcraft:candle", "thaumcraft:candle"},
            {"blockEldritch", 526, "rock", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile", "thaumcraft:obsidiantile"},
            {"blockAiry", 527, "rock", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank"},
            {"blockManaPod", 528, "rock", "thaumcraft:manapod_stem_0", "thaumcraft:manapod_stem_0", "thaumcraft:manapod_stem_0", "thaumcraft:manapod_stem_0", "thaumcraft:manapod_stem_0", "thaumcraft:manapod_stem_0"},
            {"blockArcaneFurnace", 529, "rock", "Thaumcraft:blockArcaneFurnace", "Thaumcraft:blockArcaneFurnace", "Thaumcraft:blockArcaneFurnace", "Thaumcraft:blockArcaneFurnace", "Thaumcraft:blockArcaneFurnace", "Thaumcraft:blockArcaneFurnace"},
            {"blockWarded", 530, "rock", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank"},
            {"blockHole", 531, "rock", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank"},
            {"blockPortalEldritch", 532, "rock", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank"},
            {"blockEssentiaReservoir", 533, "rock", "thaumcraft:essentiareservoir", "thaumcraft:essentiareservoir", "thaumcraft:essentiareservoir", "thaumcraft:essentiareservoir", "thaumcraft:essentiareservoir", "thaumcraft:essentiareservoir"},
            {"blockEldritchNothing", 534, "rock", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank", "thaumcraft:blank"},
            {"blockStairsArcaneStone", 535, "rock", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone"},
            {"blockStairsGreatwood", 536, "wood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood"},
            {"blockStairsSilverwood", 537, "wood", "thaumcraft:planks_silverwood", "thaumcraft:planks_silverwood", "thaumcraft:planks_silverwood", "thaumcraft:planks_silverwood", "thaumcraft:planks_silverwood", "thaumcraft:planks_silverwood"},
            {"blockStairsEldritch", 538, "rock", "thaumcraft:es_1", "thaumcraft:es_1", "thaumcraft:es_1", "thaumcraft:es_1", "thaumcraft:es_1", "thaumcraft:es_1"},
            {"blockCosmeticSlabWood", 539, "wood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood"},
            {"blockCosmeticSlabStone", 540, "rock", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone"},
            {"blockCosmeticDoubleSlabWood", 541, "wood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood", "thaumcraft:planks_greatwood"},
            {"blockCosmeticDoubleSlabStone", 542, "rock", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone", "thaumcraft:arcane_stone"},
            {"blockLootUrn", 543, "rock", "thaumcraft:urn_top", "thaumcraft:urn_top", "thaumcraft:urn_side_0", "thaumcraft:urn_side_0", "thaumcraft:urn_side_0", "thaumcraft:urn_side_0"},
            {"blockLootCrate", 544, "rock", "thaumcraft:crate_top", "thaumcraft:crate_top", "thaumcraft:crate_side_0", "thaumcraft:crate_side_0", "thaumcraft:crate_side_0", "thaumcraft:crate_side_0"},
        };
        BlockRegistryHelper.registerBlocks("Thaumcraft", ThaumcraftBlockData);
    }

    /**
     * 注册来自 harvestcraft 的方块
     */
    private static void registerHarvestcraftBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] harvestcraftBlockData = {
            {"cuttingboard", 545, "rock", "harvestcraft:cuttingboardsidebottom", "harvestcraft:cuttingboardtop", "harvestcraft:cuttingboardsidebottom", "harvestcraft:cuttingboardsidebottom", "harvestcraft:cuttingboardsidebottom", "harvestcraft:cuttingboardsidebottom"},
            {"pot", 546, "rock", "harvestcraft:potsidebottom", "harvestcraft:pottop", "harvestcraft:potsidebottom", "harvestcraft:potsidebottom", "harvestcraft:potsidebottom", "harvestcraft:potsidebottom"},
            {"beehive", 547, "rock", "harvestcraft:beehivebottom", "harvestcraft:beehivetop", "harvestcraft:beehiveside", "harvestcraft:beehiveside", "harvestcraft:beehiveside", "harvestcraft:beehiveside"},
            {"apiary", 548, "rock", "harvestcraft:sinkbottom_0", "harvestcraft:apiarytop", "harvestcraft:apiaryside", "harvestcraft:apiaryside", "harvestcraft:apiaryside", "harvestcraft:apiaryside"},
            {"presser", 549, "rock", "harvestcraft:sinkbottom_0", "harvestcraft:pressertop", "harvestcraft:presserside", "harvestcraft:presserside", "harvestcraft:presserside", "harvestcraft:presserside"},
            {"sink", 550, "rock", "harvestcraft:sinkbottom_0", "harvestcraft:sinktop_0", "harvestcraft:sinkside_0", "harvestcraft:sinkside_0", "harvestcraft:sinkside_0", "harvestcraft:sinkside_0"},
            {"salt", 551, "rock", "harvestcraft:salt", "harvestcraft:salt", "harvestcraft:salt", "harvestcraft:salt", "harvestcraft:salt", "harvestcraft:salt"},
            {"spamcompressedsaltBlockalt", 552, "rock", "harvestcraft:pamcompressedsaltBlock", "harvestcraft:pamcompressedsaltBlock", "harvestcraft:pamcompressedsaltBlock", "harvestcraft:pamcompressedsaltBlock", "harvestcraft:pamcompressedsaltBlock", "harvestcraft:pamcompressedsaltBlock"},
            {"market", 553, "rock", "harvestcraft:marketbottom", "harvestcraft:markettop", "harvestcraft:marketside", "harvestcraft:marketside", "harvestcraft:marketside", "harvestcraft:marketside"},
            {"oven", 554, "rock", "harvestcraft:oventop", "harvestcraft:oventop", "harvestcraft:ovenside", "harvestcraft:ovenside", "harvestcraft:ovenside", "harvestcraft:ovenside"},
            {"ovenon", 555, "rock", "harvestcraft:oventop", "harvestcraft:oventop", "harvestcraft:ovenside", "harvestcraft:ovenside", "harvestcraft:ovenside", "harvestcraft:ovenside"},
            {"churn", 556, "rock", "harvestcraft:churntop", "harvestcraft:churnside", "harvestcraft:churnside", "harvestcraft:churnside", "harvestcraft:churnside", "harvestcraft:churnside"},
            {"churnon", 557, "rock", "harvestcraft:churntop", "harvestcraft:churnside", "harvestcraft:churnside", "harvestcraft:churnside", "harvestcraft:churnside", "harvestcraft:churnside"},
            {"quern", 558, "rock", "harvestcraft:querntop", "harvestcraft:quernside", "harvestcraft:quernside", "harvestcraft:quernside", "harvestcraft:quernside", "harvestcraft:quernside"},
            {"quernon", 559, "rock", "harvestcraft:querntop", "harvestcraft:quernside", "harvestcraft:quernside", "harvestcraft:quernside", "harvestcraft:quernside", "harvestcraft:quernside"},
            {"fishtrap", 560, "rock", "harvestcraft:fishtrap", "harvestcraft:fishtrap", "harvestcraft:fishtrap", "harvestcraft:fishtrap", "harvestcraft:fishtrap", "harvestcraft:fishtrap"},
            {"animaltrap", 561, "rock", "harvestcraft:animaltrap", "harvestcraft:animaltrap", "harvestcraft:animaltrap", "harvestcraft:animaltrap", "harvestcraft:animaltrap", "harvestcraft:animaltrap"},
            {"berrygarden", 562, "rock", "harvestcraft:berrygarden0", "harvestcraft:berrygarden0", "harvestcraft:berrygarden0", "harvestcraft:berrygarden0", "harvestcraft:berrygarden0", "harvestcraft:berrygarden0"},
            {"desertgarden", 563, "rock", "harvestcraft:desertgarden0", "harvestcraft:desertgarden0", "harvestcraft:desertgarden0", "harvestcraft:desertgarden0", "harvestcraft:desertgarden0", "harvestcraft:desertgarden0"},
            {"grassgarden", 564, "ground", "harvestcraft:grassgarden0", "harvestcraft:grassgarden0", "harvestcraft:grassgarden0", "harvestcraft:grassgarden0", "harvestcraft:grassgarden0", "harvestcraft:grassgarden0"},
            {"gourdgarden", 565, "rock", "harvestcraft:gourdgarden0", "harvestcraft:gourdgarden0", "harvestcraft:gourdgarden0", "harvestcraft:gourdgarden0", "harvestcraft:gourdgarden0", "harvestcraft:gourdgarden0"},
            {"groundgarden", 566, "rock", "harvestcraft:groundgarden0", "harvestcraft:groundgarden0", "harvestcraft:groundgarden0", "harvestcraft:groundgarden0", "harvestcraft:groundgarden0", "harvestcraft:groundgarden0"},
            {"herbgarden", 567, "rock", "harvestcraft:herbgarden0", "harvestcraft:herbgarden0", "harvestcraft:herbgarden0", "harvestcraft:herbgarden0", "harvestcraft:herbgarden0", "harvestcraft:herbgarden0"},
            {"leafygarden", 568, "leaves", "harvestcraft:leafygarden0", "harvestcraft:leafygarden0", "harvestcraft:leafygarden0", "harvestcraft:leafygarden0", "harvestcraft:leafygarden0", "harvestcraft:leafygarden0"},
            {"mushroomgarden", 569, "rock", "harvestcraft:mushroomgarden0", "harvestcraft:mushroomgarden0", "harvestcraft:mushroomgarden0", "harvestcraft:mushroomgarden0", "harvestcraft:mushroomgarden0", "harvestcraft:mushroomgarden0"},
            {"stalkgarden", 570, "rock", "harvestcraft:stalkgarden0", "harvestcraft:stalkgarden0", "harvestcraft:stalkgarden0", "harvestcraft:stalkgarden0", "harvestcraft:stalkgarden0", "harvestcraft:stalkgarden0"},
            {"textilegarden", 571, "rock", "harvestcraft:textilegarden0", "harvestcraft:textilegarden0", "harvestcraft:textilegarden0", "harvestcraft:textilegarden0", "harvestcraft:textilegarden0", "harvestcraft:textilegarden0"},
            {"tropicalgarden", 572, "rock", "harvestcraft:tropicalgarden0", "harvestcraft:tropicalgarden0", "harvestcraft:tropicalgarden0", "harvestcraft:tropicalgarden0", "harvestcraft:tropicalgarden0", "harvestcraft:tropicalgarden0"},
            {"watergarden", 573, "rock", "harvestcraft:watergarden0", "harvestcraft:watergarden0", "harvestcraft:watergarden0", "harvestcraft:watergarden0", "harvestcraft:watergarden0", "harvestcraft:watergarden0"},
            {"pamApple", 574, "rock", "harvestcraft:apple_0", "harvestcraft:apple_0", "harvestcraft:apple_0", "harvestcraft:apple_0", "harvestcraft:apple_0", "harvestcraft:apple_0"},
            {"pamappleSapling", 575, "rock", "harvestcraft:appleSapling", "harvestcraft:appleSapling", "harvestcraft:appleSapling", "harvestcraft:appleSapling", "harvestcraft:appleSapling", "harvestcraft:appleSapling"},
            {"pamAlmond", 576, "rock", "harvestcraft:almond_0", "harvestcraft:almond_0", "harvestcraft:almond_0", "harvestcraft:almond_0", "harvestcraft:almond_0", "harvestcraft:almond_0"},
            {"pamalmondSapling", 577, "rock", "harvestcraft:almondSapling", "harvestcraft:almondSapling", "harvestcraft:almondSapling", "harvestcraft:almondSapling", "harvestcraft:almondSapling", "harvestcraft:almondSapling"},
            {"pamApricot", 578, "rock", "harvestcraft:apricot_0", "harvestcraft:apricot_0", "harvestcraft:apricot_0", "harvestcraft:apricot_0", "harvestcraft:apricot_0", "harvestcraft:apricot_0"},
            {"pamapricotSapling", 579, "rock", "harvestcraft:apricotSapling", "harvestcraft:apricotSapling", "harvestcraft:apricotSapling", "harvestcraft:apricotSapling", "harvestcraft:apricotSapling", "harvestcraft:apricotSapling"},
            {"pamAvocado", 580, "rock", "harvestcraft:avocado_0", "harvestcraft:avocado_0", "harvestcraft:avocado_0", "harvestcraft:avocado_0", "harvestcraft:avocado_0", "harvestcraft:avocado_0"},
            {"pamavocadoSapling", 581, "rock", "harvestcraft:avocadoSapling", "harvestcraft:avocadoSapling", "harvestcraft:avocadoSapling", "harvestcraft:avocadoSapling", "harvestcraft:avocadoSapling", "harvestcraft:avocadoSapling"},
            {"pamBanana", 582, "rock", "harvestcraft:banana_0", "harvestcraft:banana_0", "harvestcraft:banana_0", "harvestcraft:banana_0", "harvestcraft:banana_0", "harvestcraft:banana_0"},
            {"pambananaSapling", 583, "rock", "harvestcraft:bananaSapling", "harvestcraft:bananaSapling", "harvestcraft:bananaSapling", "harvestcraft:bananaSapling", "harvestcraft:bananaSapling", "harvestcraft:bananaSapling"},
            {"pamCashew", 584, "rock", "harvestcraft:cashew_0", "harvestcraft:cashew_0", "harvestcraft:cashew_0", "harvestcraft:cashew_0", "harvestcraft:cashew_0", "harvestcraft:cashew_0"},
            {"pamcashewSapling", 585, "rock", "harvestcraft:cashewSapling", "harvestcraft:cashewSapling", "harvestcraft:cashewSapling", "harvestcraft:cashewSapling", "harvestcraft:cashewSapling", "harvestcraft:cashewSapling"},
            {"pamCherry", 586, "rock", "harvestcraft:cherry_0", "harvestcraft:cherry_0", "harvestcraft:cherry_0", "harvestcraft:cherry_0", "harvestcraft:cherry_0", "harvestcraft:cherry_0"},
            {"pamcherrySapling", 587, "rock", "harvestcraft:cherrySapling", "harvestcraft:cherrySapling", "harvestcraft:cherrySapling", "harvestcraft:cherrySapling", "harvestcraft:cherrySapling", "harvestcraft:cherrySapling"},
            {"pamChestnut", 588, "rock", "harvestcraft:chestnut_0", "harvestcraft:chestnut_0", "harvestcraft:chestnut_0", "harvestcraft:chestnut_0", "harvestcraft:chestnut_0", "harvestcraft:chestnut_0"},
            {"pamchestnutSapling", 589, "rock", "harvestcraft:chestnutSapling", "harvestcraft:chestnutSapling", "harvestcraft:chestnutSapling", "harvestcraft:chestnutSapling", "harvestcraft:chestnutSapling", "harvestcraft:chestnutSapling"},
            {"pamCinnamon", 590, "rock", "harvestcraft:cinnamon_top", "harvestcraft:cinnamon_top", "harvestcraft:cinnamon_0", "harvestcraft:cinnamon_0", "harvestcraft:cinnamon_0", "harvestcraft:cinnamon_0"},
            {"pamcinnamonSapling", 591, "rock", "harvestcraft:cinnamonSapling", "harvestcraft:cinnamonSapling", "harvestcraft:cinnamonSapling", "harvestcraft:cinnamonSapling", "harvestcraft:cinnamonSapling", "harvestcraft:cinnamonSapling"},
            {"pamCoconut", 592, "rock", "harvestcraft:coconut_0", "harvestcraft:coconut_0", "harvestcraft:coconut_0", "harvestcraft:coconut_0", "harvestcraft:coconut_0", "harvestcraft:coconut_0"},
            {"pamcoconutSapling", 593, "rock", "harvestcraft:coconutSapling", "harvestcraft:coconutSapling", "harvestcraft:coconutSapling", "harvestcraft:coconutSapling", "harvestcraft:coconutSapling", "harvestcraft:coconutSapling"},
            {"pamDate", 594, "rock", "harvestcraft:date_0", "harvestcraft:date_0", "harvestcraft:date_0", "harvestcraft:date_0", "harvestcraft:date_0", "harvestcraft:date_0"},
            {"pamdateSapling", 595, "rock", "harvestcraft:dateSapling", "harvestcraft:dateSapling", "harvestcraft:dateSapling", "harvestcraft:dateSapling", "harvestcraft:dateSapling", "harvestcraft:dateSapling"},
            {"pamDragonfruit", 596, "rock", "harvestcraft:dragonfruit_0", "harvestcraft:dragonfruit_0", "harvestcraft:dragonfruit_0", "harvestcraft:dragonfruit_0", "harvestcraft:dragonfruit_0", "harvestcraft:dragonfruit_0"},
            {"pamdragonfruitSapling", 597, "rock", "harvestcraft:dragonfruitSapling", "harvestcraft:dragonfruitSapling", "harvestcraft:dragonfruitSapling", "harvestcraft:dragonfruitSapling", "harvestcraft:dragonfruitSapling", "harvestcraft:dragonfruitSapling"},
            {"pamDurian", 598, "rock", "harvestcraft:durian_0", "harvestcraft:durian_0", "harvestcraft:durian_0", "harvestcraft:durian_0", "harvestcraft:durian_0", "harvestcraft:durian_0"},
            {"pamdurianSapling", 599, "rock", "harvestcraft:durianSapling", "harvestcraft:durianSapling", "harvestcraft:durianSapling", "harvestcraft:durianSapling", "harvestcraft:durianSapling", "harvestcraft:durianSapling"},
            {"pamFig", 600, "rock", "harvestcraft:fig_0", "harvestcraft:fig_0", "harvestcraft:fig_0", "harvestcraft:fig_0", "harvestcraft:fig_0", "harvestcraft:fig_0"},
            {"pamfigSapling", 601, "rock", "harvestcraft:figSapling", "harvestcraft:figSapling", "harvestcraft:figSapling", "harvestcraft:figSapling", "harvestcraft:figSapling", "harvestcraft:figSapling"},
            {"pamGrapefruit", 602, "rock", "harvestcraft:grapefruit_0", "harvestcraft:grapefruit_0", "harvestcraft:grapefruit_0", "harvestcraft:grapefruit_0", "harvestcraft:grapefruit_0", "harvestcraft:grapefruit_0"},
            {"pamgrapefruitSapling", 603, "rock", "harvestcraft:grapefruitSapling", "harvestcraft:grapefruitSapling", "harvestcraft:grapefruitSapling", "harvestcraft:grapefruitSapling", "harvestcraft:grapefruitSapling", "harvestcraft:grapefruitSapling"},
            {"pamLemon", 604, "rock", "harvestcraft:lemon_0", "harvestcraft:lemon_0", "harvestcraft:lemon_0", "harvestcraft:lemon_0", "harvestcraft:lemon_0", "harvestcraft:lemon_0"},
            {"pamlemonSapling", 605, "rock", "harvestcraft:lemonSapling", "harvestcraft:lemonSapling", "harvestcraft:lemonSapling", "harvestcraft:lemonSapling", "harvestcraft:lemonSapling", "harvestcraft:lemonSapling"},
            {"pamLime", 606, "rock", "harvestcraft:lime_0", "harvestcraft:lime_0", "harvestcraft:lime_0", "harvestcraft:lime_0", "harvestcraft:lime_0", "harvestcraft:lime_0"},
            {"pamlimeSapling", 607, "rock", "harvestcraft:limeSapling", "harvestcraft:limeSapling", "harvestcraft:limeSapling", "harvestcraft:limeSapling", "harvestcraft:limeSapling", "harvestcraft:limeSapling"},
            {"pamMaple", 608, "rock", "harvestcraft:maple_top", "harvestcraft:maple_top", "harvestcraft:maple_0", "harvestcraft:maple_0", "harvestcraft:maple_0", "harvestcraft:maple_0"},
            {"pammapleSapling", 609, "rock", "harvestcraft:mapleSapling", "harvestcraft:mapleSapling", "harvestcraft:mapleSapling", "harvestcraft:mapleSapling", "harvestcraft:mapleSapling", "harvestcraft:mapleSapling"},
            {"pamMango", 610, "rock", "harvestcraft:mango_0", "harvestcraft:mango_0", "harvestcraft:mango_0", "harvestcraft:mango_0", "harvestcraft:mango_0", "harvestcraft:mango_0"},
            {"pammangoSapling", 611, "rock", "harvestcraft:mangoSapling", "harvestcraft:mangoSapling", "harvestcraft:mangoSapling", "harvestcraft:mangoSapling", "harvestcraft:mangoSapling", "harvestcraft:mangoSapling"},
            {"pamNutmeg", 612, "rock", "harvestcraft:nutmeg_0", "harvestcraft:nutmeg_0", "harvestcraft:nutmeg_0", "harvestcraft:nutmeg_0", "harvestcraft:nutmeg_0", "harvestcraft:nutmeg_0"},
            {"pamnutmegSapling", 613, "rock", "harvestcraft:nutmegSapling", "harvestcraft:nutmegSapling", "harvestcraft:nutmegSapling", "harvestcraft:nutmegSapling", "harvestcraft:nutmegSapling", "harvestcraft:nutmegSapling"},
            {"pamOlive", 614, "rock", "harvestcraft:olive_0", "harvestcraft:olive_0", "harvestcraft:olive_0", "harvestcraft:olive_0", "harvestcraft:olive_0", "harvestcraft:olive_0"},
            {"pamoliveSapling", 615, "rock", "harvestcraft:oliveSapling", "harvestcraft:oliveSapling", "harvestcraft:oliveSapling", "harvestcraft:oliveSapling", "harvestcraft:oliveSapling", "harvestcraft:oliveSapling"},
            {"pamOrange", 616, "rock", "harvestcraft:orange_0", "harvestcraft:orange_0", "harvestcraft:orange_0", "harvestcraft:orange_0", "harvestcraft:orange_0", "harvestcraft:orange_0"},
            {"pamorangeSapling", 617, "rock", "harvestcraft:orangeSapling", "harvestcraft:orangeSapling", "harvestcraft:orangeSapling", "harvestcraft:orangeSapling", "harvestcraft:orangeSapling", "harvestcraft:orangeSapling"},
            {"pamPapaya", 618, "rock", "harvestcraft:papaya_0", "harvestcraft:papaya_0", "harvestcraft:papaya_0", "harvestcraft:papaya_0", "harvestcraft:papaya_0", "harvestcraft:papaya_0"},
            {"pampapayaSapling", 619, "rock", "harvestcraft:papayaSapling", "harvestcraft:papayaSapling", "harvestcraft:papayaSapling", "harvestcraft:papayaSapling", "harvestcraft:papayaSapling", "harvestcraft:papayaSapling"},
            {"pamPaperbark", 620, "rock", "harvestcraft:paperbark_top", "harvestcraft:paperbark_top", "harvestcraft:paperbark_0", "harvestcraft:paperbark_0", "harvestcraft:paperbark_0", "harvestcraft:paperbark_0"},
            {"pampaperbarkSapling", 621, "rock", "harvestcraft:paperbarkSapling", "harvestcraft:paperbarkSapling", "harvestcraft:paperbarkSapling", "harvestcraft:paperbarkSapling", "harvestcraft:paperbarkSapling", "harvestcraft:paperbarkSapling"},
            {"pamPeach", 622, "rock", "harvestcraft:peach_0", "harvestcraft:peach_0", "harvestcraft:peach_0", "harvestcraft:peach_0", "harvestcraft:peach_0", "harvestcraft:peach_0"},
            {"pampeachSapling", 623, "rock", "harvestcraft:peachSapling", "harvestcraft:peachSapling", "harvestcraft:peachSapling", "harvestcraft:peachSapling", "harvestcraft:peachSapling", "harvestcraft:peachSapling"},
            {"pamPear", 624, "rock", "harvestcraft:pear_0", "harvestcraft:pear_0", "harvestcraft:pear_0", "harvestcraft:pear_0", "harvestcraft:pear_0", "harvestcraft:pear_0"},
            {"pampearSapling", 625, "rock", "harvestcraft:pearSapling", "harvestcraft:pearSapling", "harvestcraft:pearSapling", "harvestcraft:pearSapling", "harvestcraft:pearSapling", "harvestcraft:pearSapling"},
            {"pamPecan", 626, "rock", "harvestcraft:pecan_0", "harvestcraft:pecan_0", "harvestcraft:pecan_0", "harvestcraft:pecan_0", "harvestcraft:pecan_0", "harvestcraft:pecan_0"},
            {"pampecanSapling", 627, "rock", "harvestcraft:pecanSapling", "harvestcraft:pecanSapling", "harvestcraft:pecanSapling", "harvestcraft:pecanSapling", "harvestcraft:pecanSapling", "harvestcraft:pecanSapling"},
            {"pamPeppercorn", 628, "rock", "harvestcraft:peppercorn_0", "harvestcraft:peppercorn_0", "harvestcraft:peppercorn_0", "harvestcraft:peppercorn_0", "harvestcraft:peppercorn_0", "harvestcraft:peppercorn_0"},
            {"pampeppercornSapling", 629, "rock", "harvestcraft:peppercornSapling", "harvestcraft:peppercornSapling", "harvestcraft:peppercornSapling", "harvestcraft:peppercornSapling", "harvestcraft:peppercornSapling", "harvestcraft:peppercornSapling"},
            {"pamPersimmon", 630, "rock", "harvestcraft:persimmon_0", "harvestcraft:persimmon_0", "harvestcraft:persimmon_0", "harvestcraft:persimmon_0", "harvestcraft:persimmon_0", "harvestcraft:persimmon_0"},
            {"pampersimmonSapling", 631, "rock", "harvestcraft:persimmonSapling", "harvestcraft:persimmonSapling", "harvestcraft:persimmonSapling", "harvestcraft:persimmonSapling", "harvestcraft:persimmonSapling", "harvestcraft:persimmonSapling"},
            {"pamPistachio", 632, "rock", "harvestcraft:pistachio_0", "harvestcraft:pistachio_0", "harvestcraft:pistachio_0", "harvestcraft:pistachio_0", "harvestcraft:pistachio_0", "harvestcraft:pistachio_0"},
            {"pampistachioSapling", 633, "rock", "harvestcraft:pistachioSapling", "harvestcraft:pistachioSapling", "harvestcraft:pistachioSapling", "harvestcraft:pistachioSapling", "harvestcraft:pistachioSapling", "harvestcraft:pistachioSapling"},
            {"pamPlum", 634, "rock", "harvestcraft:plum_0", "harvestcraft:plum_0", "harvestcraft:plum_0", "harvestcraft:plum_0", "harvestcraft:plum_0", "harvestcraft:plum_0"},
            {"pamplumSapling", 635, "rock", "harvestcraft:plumSapling", "harvestcraft:plumSapling", "harvestcraft:plumSapling", "harvestcraft:plumSapling", "harvestcraft:plumSapling", "harvestcraft:plumSapling"},
            {"pamPomegranate", 636, "rock", "harvestcraft:pomegranate_0", "harvestcraft:pomegranate_0", "harvestcraft:pomegranate_0", "harvestcraft:pomegranate_0", "harvestcraft:pomegranate_0", "harvestcraft:pomegranate_0"},
            {"pampomegranateSapling", 637, "rock", "harvestcraft:pomegranateSapling", "harvestcraft:pomegranateSapling", "harvestcraft:pomegranateSapling", "harvestcraft:pomegranateSapling", "harvestcraft:pomegranateSapling", "harvestcraft:pomegranateSapling"},
            {"pamStarfruit", 638, "rock", "harvestcraft:starfruit_0", "harvestcraft:starfruit_0", "harvestcraft:starfruit_0", "harvestcraft:starfruit_0", "harvestcraft:starfruit_0", "harvestcraft:starfruit_0"},
            {"pamstarfruitSapling", 639, "rock", "harvestcraft:starfruitSapling", "harvestcraft:starfruitSapling", "harvestcraft:starfruitSapling", "harvestcraft:starfruitSapling", "harvestcraft:starfruitSapling", "harvestcraft:starfruitSapling"},
            {"pamVanillabean", 640, "rock", "harvestcraft:vanillabean_0", "harvestcraft:vanillabean_0", "harvestcraft:vanillabean_0", "harvestcraft:vanillabean_0", "harvestcraft:vanillabean_0", "harvestcraft:vanillabean_0"},
            {"pamvanillabeanSapling", 641, "rock", "harvestcraft:vanillabeanSapling", "harvestcraft:vanillabeanSapling", "harvestcraft:vanillabeanSapling", "harvestcraft:vanillabeanSapling", "harvestcraft:vanillabeanSapling", "harvestcraft:vanillabeanSapling"},
            {"pamWalnut", 642, "rock", "harvestcraft:walnut_0", "harvestcraft:walnut_0", "harvestcraft:walnut_0", "harvestcraft:walnut_0", "harvestcraft:walnut_0", "harvestcraft:walnut_0"},
            {"pamwalnutSapling", 643, "rock", "harvestcraft:walnutSapling", "harvestcraft:walnutSapling", "harvestcraft:walnutSapling", "harvestcraft:walnutSapling", "harvestcraft:walnutSapling", "harvestcraft:walnutSapling"},
            {"pamGooseberry", 644, "rock", "harvestcraft:gooseberry_0", "harvestcraft:gooseberry_0", "harvestcraft:gooseberry_0", "harvestcraft:gooseberry_0", "harvestcraft:gooseberry_0", "harvestcraft:gooseberry_0"},
            {"pamgooseberrySapling", 645, "rock", "harvestcraft:gooseberrySapling", "harvestcraft:gooseberrySapling", "harvestcraft:gooseberrySapling", "harvestcraft:gooseberrySapling", "harvestcraft:gooseberrySapling", "harvestcraft:gooseberrySapling"},
            {"pamblackberryCrop", 646, "rock", "harvestcraft:blackberrycrop_0", "harvestcraft:blackberrycrop_0", "harvestcraft:blackberrycrop_0", "harvestcraft:blackberrycrop_0", "harvestcraft:blackberrycrop_0", "harvestcraft:blackberrycrop_0"},
            {"pamblueberryCrop", 647, "rock", "harvestcraft:blueberrycrop_0", "harvestcraft:blueberrycrop_0", "harvestcraft:blueberrycrop_0", "harvestcraft:blueberrycrop_0", "harvestcraft:blueberrycrop_0", "harvestcraft:blueberrycrop_0"},
            {"pamcandleberryCrop", 648, "rock", "harvestcraft:candleberrycrop_0", "harvestcraft:candleberrycrop_0", "harvestcraft:candleberrycrop_0", "harvestcraft:candleberrycrop_0", "harvestcraft:candleberrycrop_0", "harvestcraft:candleberrycrop_0"},
            {"pamraspberryCrop", 649, "rock", "harvestcraft:raspberrycrop_0", "harvestcraft:raspberrycrop_0", "harvestcraft:raspberrycrop_0", "harvestcraft:raspberrycrop_0", "harvestcraft:raspberrycrop_0", "harvestcraft:raspberrycrop_0"},
            {"pamstrawberryCrop", 650, "rock", "harvestcraft:strawberrycrop_0", "harvestcraft:strawberrycrop_0", "harvestcraft:strawberrycrop_0", "harvestcraft:strawberrycrop_0", "harvestcraft:strawberrycrop_0", "harvestcraft:strawberrycrop_0"},
            {"pamcactusfruitCrop", 651, "rock", "harvestcraft:cactusfruitcrop_0", "harvestcraft:cactusfruitcrop_0", "harvestcraft:cactusfruitcrop_0", "harvestcraft:cactusfruitcrop_0", "harvestcraft:cactusfruitcrop_0", "harvestcraft:cactusfruitcrop_0"},
            {"pamasparagusCrop", 652, "rock", "harvestcraft:asparaguscrop_0", "harvestcraft:asparaguscrop_0", "harvestcraft:asparaguscrop_0", "harvestcraft:asparaguscrop_0", "harvestcraft:asparaguscrop_0", "harvestcraft:asparaguscrop_0"},
            {"pambarleyCrop", 653, "rock", "harvestcraft:barleycrop_0", "harvestcraft:barleycrop_0", "harvestcraft:barleycrop_0", "harvestcraft:barleycrop_0", "harvestcraft:barleycrop_0", "harvestcraft:barleycrop_0"},
            {"pamoatsCrop", 654, "rock", "harvestcraft:oatscrop_0", "harvestcraft:oatscrop_0", "harvestcraft:oatscrop_0", "harvestcraft:oatscrop_0", "harvestcraft:oatscrop_0", "harvestcraft:oatscrop_0"},
            {"pamryeCrop", 655, "rock", "harvestcraft:ryecrop_0", "harvestcraft:ryecrop_0", "harvestcraft:ryecrop_0", "harvestcraft:ryecrop_0", "harvestcraft:ryecrop_0", "harvestcraft:ryecrop_0"},
            {"pamcornCrop", 656, "rock", "harvestcraft:corncrop_0", "harvestcraft:corncrop_0", "harvestcraft:corncrop_0", "harvestcraft:corncrop_0", "harvestcraft:corncrop_0", "harvestcraft:corncrop_0"},
            {"pambambooshootCrop", 657, "rock", "harvestcraft:bambooshootcrop_0", "harvestcraft:bambooshootcrop_0", "harvestcraft:bambooshootcrop_0", "harvestcraft:bambooshootcrop_0", "harvestcraft:bambooshootcrop_0", "harvestcraft:bambooshootcrop_0"},
            {"pamcantaloupeCrop", 658, "rock", "harvestcraft:cantaloupecrop_0", "harvestcraft:cantaloupecrop_0", "harvestcraft:cantaloupecrop_0", "harvestcraft:cantaloupecrop_0", "harvestcraft:cantaloupecrop_0", "harvestcraft:cantaloupecrop_0"},
            {"pamcucumberCrop", 659, "rock", "harvestcraft:cucumbercrop_0", "harvestcraft:cucumbercrop_0", "harvestcraft:cucumbercrop_0", "harvestcraft:cucumbercrop_0", "harvestcraft:cucumbercrop_0", "harvestcraft:cucumbercrop_0"},
            {"pamwintersquashCrop", 660, "rock", "harvestcraft:wintersquashcrop_0", "harvestcraft:wintersquashcrop_0", "harvestcraft:wintersquashcrop_0", "harvestcraft:wintersquashcrop_0", "harvestcraft:wintersquashcrop_0", "harvestcraft:wintersquashcrop_0"},
            {"pamzucchiniCrop", 661, "rock", "harvestcraft:zucchinicrop_0", "harvestcraft:zucchinicrop_0", "harvestcraft:zucchinicrop_0", "harvestcraft:zucchinicrop_0", "harvestcraft:zucchinicrop_0", "harvestcraft:zucchinicrop_0"},
            {"pambeetCrop", 662, "rock", "harvestcraft:beetcrop_0", "harvestcraft:beetcrop_0", "harvestcraft:beetcrop_0", "harvestcraft:beetcrop_0", "harvestcraft:beetcrop_0", "harvestcraft:beetcrop_0"},
            {"pamonionCrop", 663, "rock", "harvestcraft:onioncrop_0", "harvestcraft:onioncrop_0", "harvestcraft:onioncrop_0", "harvestcraft:onioncrop_0", "harvestcraft:onioncrop_0", "harvestcraft:onioncrop_0"},
            {"pamparsnipCrop", 664, "rock", "harvestcraft:parsnipcrop_0", "harvestcraft:parsnipcrop_0", "harvestcraft:parsnipcrop_0", "harvestcraft:parsnipcrop_0", "harvestcraft:parsnipcrop_0", "harvestcraft:parsnipcrop_0"},
            {"pampeanutCrop", 665, "rock", "harvestcraft:peanutcrop_0", "harvestcraft:peanutcrop_0", "harvestcraft:peanutcrop_0", "harvestcraft:peanutcrop_0", "harvestcraft:peanutcrop_0", "harvestcraft:peanutcrop_0"},
            {"pamradishCrop", 666, "rock", "harvestcraft:radishcrop_0", "harvestcraft:radishcrop_0", "harvestcraft:radishcrop_0", "harvestcraft:radishcrop_0", "harvestcraft:radishcrop_0", "harvestcraft:radishcrop_0"},
            {"pamrutabagaCrop", 667, "rock", "harvestcraft:rutabagacrop_0", "harvestcraft:rutabagacrop_0", "harvestcraft:rutabagacrop_0", "harvestcraft:rutabagacrop_0", "harvestcraft:rutabagacrop_0", "harvestcraft:rutabagacrop_0"},
            {"pamsweetpotatoCrop", 668, "rock", "harvestcraft:sweetpotatocrop_0", "harvestcraft:sweetpotatocrop_0", "harvestcraft:sweetpotatocrop_0", "harvestcraft:sweetpotatocrop_0", "harvestcraft:sweetpotatocrop_0", "harvestcraft:sweetpotatocrop_0"},
            {"pamturnipCrop", 669, "rock", "harvestcraft:turnipcrop_0", "harvestcraft:turnipcrop_0", "harvestcraft:turnipcrop_0", "harvestcraft:turnipcrop_0", "harvestcraft:turnipcrop_0", "harvestcraft:turnipcrop_0"},
            {"pamrhubarbCrop", 670, "rock", "harvestcraft:rhubarbcrop_0", "harvestcraft:rhubarbcrop_0", "harvestcraft:rhubarbcrop_0", "harvestcraft:rhubarbcrop_0", "harvestcraft:rhubarbcrop_0", "harvestcraft:rhubarbcrop_0"},
            {"pamceleryCrop", 671, "rock", "harvestcraft:celerycrop_0", "harvestcraft:celerycrop_0", "harvestcraft:celerycrop_0", "harvestcraft:celerycrop_0", "harvestcraft:celerycrop_0", "harvestcraft:celerycrop_0"},
            {"pamgarlicCrop", 672, "rock", "harvestcraft:garliccrop_0", "harvestcraft:garliccrop_0", "harvestcraft:garliccrop_0", "harvestcraft:garliccrop_0", "harvestcraft:garliccrop_0", "harvestcraft:garliccrop_0"},
            {"pamgingerCrop", 673, "rock", "harvestcraft:gingercrop_0", "harvestcraft:gingercrop_0", "harvestcraft:gingercrop_0", "harvestcraft:gingercrop_0", "harvestcraft:gingercrop_0", "harvestcraft:gingercrop_0"},
            {"pamspiceleafCrop", 674, "leaves", "harvestcraft:spiceleafcrop_0", "harvestcraft:spiceleafcrop_0", "harvestcraft:spiceleafcrop_0", "harvestcraft:spiceleafcrop_0", "harvestcraft:spiceleafcrop_0", "harvestcraft:spiceleafcrop_0"},
            {"pamtealeafCrop", 675, "leaves", "harvestcraft:tealeafcrop_0", "harvestcraft:tealeafcrop_0", "harvestcraft:tealeafcrop_0", "harvestcraft:tealeafcrop_0", "harvestcraft:tealeafcrop_0", "harvestcraft:tealeafcrop_0"},
            {"pamcoffeebeanCrop", 676, "rock", "harvestcraft:coffeebeancrop_0", "harvestcraft:coffeebeancrop_0", "harvestcraft:coffeebeancrop_0", "harvestcraft:coffeebeancrop_0", "harvestcraft:coffeebeancrop_0", "harvestcraft:coffeebeancrop_0"},
            {"pammustardseedsCrop", 677, "rock", "harvestcraft:mustardseedscrop_0", "harvestcraft:mustardseedscrop_0", "harvestcraft:mustardseedscrop_0", "harvestcraft:mustardseedscrop_0", "harvestcraft:mustardseedscrop_0", "harvestcraft:mustardseedscrop_0"},
            {"pambroccoliCrop", 678, "rock", "harvestcraft:broccolicrop_0", "harvestcraft:broccolicrop_0", "harvestcraft:broccolicrop_0", "harvestcraft:broccolicrop_0", "harvestcraft:broccolicrop_0", "harvestcraft:broccolicrop_0"},
            {"pamcauliflowerCrop", 679, "rock", "harvestcraft:cauliflowercrop_0", "harvestcraft:cauliflowercrop_0", "harvestcraft:cauliflowercrop_0", "harvestcraft:cauliflowercrop_0", "harvestcraft:cauliflowercrop_0", "harvestcraft:cauliflowercrop_0"},
            {"pamleekCrop", 680, "rock", "harvestcraft:leekcrop_0", "harvestcraft:leekcrop_0", "harvestcraft:leekcrop_0", "harvestcraft:leekcrop_0", "harvestcraft:leekcrop_0", "harvestcraft:leekcrop_0"},
            {"pamlettuceCrop", 681, "rock", "harvestcraft:lettucecrop_0", "harvestcraft:lettucecrop_0", "harvestcraft:lettucecrop_0", "harvestcraft:lettucecrop_0", "harvestcraft:lettucecrop_0", "harvestcraft:lettucecrop_0"},
            {"pamscallionCrop", 682, "rock", "harvestcraft:scallioncrop_0", "harvestcraft:scallioncrop_0", "harvestcraft:scallioncrop_0", "harvestcraft:scallioncrop_0", "harvestcraft:scallioncrop_0", "harvestcraft:scallioncrop_0"},
            {"pamartichokeCrop", 683, "rock", "harvestcraft:artichokecrop_0", "harvestcraft:artichokecrop_0", "harvestcraft:artichokecrop_0", "harvestcraft:artichokecrop_0", "harvestcraft:artichokecrop_0", "harvestcraft:artichokecrop_0"},
            {"pambrusselsproutCrop", 684, "rock", "harvestcraft:brusselsproutcrop_0", "harvestcraft:brusselsproutcrop_0", "harvestcraft:brusselsproutcrop_0", "harvestcraft:brusselsproutcrop_0", "harvestcraft:brusselsproutcrop_0", "harvestcraft:brusselsproutcrop_0"},
            {"pamcabbageCrop", 685, "rock", "harvestcraft:cabbagecrop_0", "harvestcraft:cabbagecrop_0", "harvestcraft:cabbagecrop_0", "harvestcraft:cabbagecrop_0", "harvestcraft:cabbagecrop_0", "harvestcraft:cabbagecrop_0"},
            {"pamspinachCrop", 686, "rock", "harvestcraft:spinachcrop_0", "harvestcraft:spinachcrop_0", "harvestcraft:spinachcrop_0", "harvestcraft:spinachcrop_0", "harvestcraft:spinachcrop_0", "harvestcraft:spinachcrop_0"},
            {"pamwhitemushroomCrop", 687, "rock", "harvestcraft:whitemushroomcrop_0", "harvestcraft:whitemushroomcrop_0", "harvestcraft:whitemushroomcrop_0", "harvestcraft:whitemushroomcrop_0", "harvestcraft:whitemushroomcrop_0", "harvestcraft:whitemushroomcrop_0"},
            {"pambeanCrop", 688, "rock", "harvestcraft:beancrop_0", "harvestcraft:beancrop_0", "harvestcraft:beancrop_0", "harvestcraft:beancrop_0", "harvestcraft:beancrop_0", "harvestcraft:beancrop_0"},
            {"pamsoybeanCrop", 689, "rock", "harvestcraft:soybeancrop_0", "harvestcraft:soybeancrop_0", "harvestcraft:soybeancrop_0", "harvestcraft:soybeancrop_0", "harvestcraft:soybeancrop_0", "harvestcraft:soybeancrop_0"},
            {"pambellpepperCrop", 690, "rock", "harvestcraft:bellpeppercrop_0", "harvestcraft:bellpeppercrop_0", "harvestcraft:bellpeppercrop_0", "harvestcraft:bellpeppercrop_0", "harvestcraft:bellpeppercrop_0", "harvestcraft:bellpeppercrop_0"},
            {"pamchilipepperCrop", 691, "rock", "harvestcraft:chilipeppercrop_0", "harvestcraft:chilipeppercrop_0", "harvestcraft:chilipeppercrop_0", "harvestcraft:chilipeppercrop_0", "harvestcraft:chilipeppercrop_0", "harvestcraft:chilipeppercrop_0"},
            {"pameggplantCrop", 692, "rock", "harvestcraft:eggplantcrop_0", "harvestcraft:eggplantcrop_0", "harvestcraft:eggplantcrop_0", "harvestcraft:eggplantcrop_0", "harvestcraft:eggplantcrop_0", "harvestcraft:eggplantcrop_0"},
            {"pamokraCrop", 693, "rock", "harvestcraft:okracrop_0", "harvestcraft:okracrop_0", "harvestcraft:okracrop_0", "harvestcraft:okracrop_0", "harvestcraft:okracrop_0", "harvestcraft:okracrop_0"},
            {"pampeasCrop", 694, "rock", "harvestcraft:peascrop_0", "harvestcraft:peascrop_0", "harvestcraft:peascrop_0", "harvestcraft:peascrop_0", "harvestcraft:peascrop_0", "harvestcraft:peascrop_0"},
            {"pamtomatoCrop", 695, "rock", "harvestcraft:tomatocrop_0", "harvestcraft:tomatocrop_0", "harvestcraft:tomatocrop_0", "harvestcraft:tomatocrop_0", "harvestcraft:tomatocrop_0", "harvestcraft:tomatocrop_0"},
            {"pamcottonCrop", 696, "rock", "harvestcraft:cottoncrop_0", "harvestcraft:cottoncrop_0", "harvestcraft:cottoncrop_0", "harvestcraft:cottoncrop_0", "harvestcraft:cottoncrop_0", "harvestcraft:cottoncrop_0"},
            {"pampineappleCrop", 697, "rock", "harvestcraft:pineapplecrop_0", "harvestcraft:pineapplecrop_0", "harvestcraft:pineapplecrop_0", "harvestcraft:pineapplecrop_0", "harvestcraft:pineapplecrop_0", "harvestcraft:pineapplecrop_0"},
            {"pamgrapeCrop", 698, "rock", "harvestcraft:grapecrop_0", "harvestcraft:grapecrop_0", "harvestcraft:grapecrop_0", "harvestcraft:grapecrop_0", "harvestcraft:grapecrop_0", "harvestcraft:grapecrop_0"},
            {"pamkiwiCrop", 699, "rock", "harvestcraft:kiwicrop_0", "harvestcraft:kiwicrop_0", "harvestcraft:kiwicrop_0", "harvestcraft:kiwicrop_0", "harvestcraft:kiwicrop_0", "harvestcraft:kiwicrop_0"},
            {"pamcranberryCrop", 700, "rock", "harvestcraft:cranberrycrop_0", "harvestcraft:cranberrycrop_0", "harvestcraft:cranberrycrop_0", "harvestcraft:cranberrycrop_0", "harvestcraft:cranberrycrop_0", "harvestcraft:cranberrycrop_0"},
            {"pamriceCrop", 701, "ice", "harvestcraft:ricecrop_0", "harvestcraft:ricecrop_0", "harvestcraft:ricecrop_0", "harvestcraft:ricecrop_0", "harvestcraft:ricecrop_0", "harvestcraft:ricecrop_0"},
            {"pamseaweedCrop", 702, "rock", "harvestcraft:seaweedcrop_0", "harvestcraft:seaweedcrop_0", "harvestcraft:seaweedcrop_0", "harvestcraft:seaweedcrop_0", "harvestcraft:seaweedcrop_0", "harvestcraft:seaweedcrop_0"},
            {"pamcurryleafCrop", 703, "leaves", "harvestcraft:curryleafcrop_0", "harvestcraft:curryleafcrop_0", "harvestcraft:curryleafcrop_0", "harvestcraft:curryleafcrop_0", "harvestcraft:curryleafcrop_0", "harvestcraft:curryleafcrop_0"},
            {"pamsesameseedsCrop", 704, "rock", "harvestcraft:sesameseedscrop_0", "harvestcraft:sesameseedscrop_0", "harvestcraft:sesameseedscrop_0", "harvestcraft:sesameseedscrop_0", "harvestcraft:sesameseedscrop_0", "harvestcraft:sesameseedscrop_0"},
            {"pamwaterchestnutCrop", 705, "rock", "harvestcraft:waterchestnutcrop_0", "harvestcraft:waterchestnutcrop_0", "harvestcraft:waterchestnutcrop_0", "harvestcraft:waterchestnutcrop_0", "harvestcraft:waterchestnutcrop_0", "harvestcraft:waterchestnutcrop_0"},
            {"pamcandleDeco1", 706, "rock", "harvestcraft:candle_0", "harvestcraft:candle_0", "harvestcraft:candle_0", "harvestcraft:candle_0", "harvestcraft:candle_0", "harvestcraft:candle_0"},
            {"pamcandleDeco2", 707, "rock", "harvestcraft:candle_1", "harvestcraft:candle_1", "harvestcraft:candle_1", "harvestcraft:candle_1", "harvestcraft:candle_1", "harvestcraft:candle_1"},
            {"pamcandleDeco3", 708, "rock", "harvestcraft:candle_2", "harvestcraft:candle_2", "harvestcraft:candle_2", "harvestcraft:candle_2", "harvestcraft:candle_2", "harvestcraft:candle_2"},
            {"pamcandleDeco4", 709, "rock", "harvestcraft:candle_3", "harvestcraft:candle_3", "harvestcraft:candle_3", "harvestcraft:candle_3", "harvestcraft:candle_3", "harvestcraft:candle_3"},
            {"pamcandleDeco5", 710, "rock", "harvestcraft:candle_4", "harvestcraft:candle_4", "harvestcraft:candle_4", "harvestcraft:candle_4", "harvestcraft:candle_4", "harvestcraft:candle_4"},
            {"pamcandleDeco6", 711, "rock", "harvestcraft:candle_5", "harvestcraft:candle_5", "harvestcraft:candle_5", "harvestcraft:candle_5", "harvestcraft:candle_5", "harvestcraft:candle_5"},
            {"pamcandleDeco7", 712, "rock", "harvestcraft:candle_6", "harvestcraft:candle_6", "harvestcraft:candle_6", "harvestcraft:candle_6", "harvestcraft:candle_6", "harvestcraft:candle_6"},
            {"pamcandleDeco8", 713, "rock", "harvestcraft:candle_7", "harvestcraft:candle_7", "harvestcraft:candle_7", "harvestcraft:candle_7", "harvestcraft:candle_7", "harvestcraft:candle_7"},
            {"pamcandleDeco9", 714, "rock", "harvestcraft:candle_8", "harvestcraft:candle_8", "harvestcraft:candle_8", "harvestcraft:candle_8", "harvestcraft:candle_8", "harvestcraft:candle_8"},
            {"pamcandleDeco10", 715, "rock", "harvestcraft:candle_9", "harvestcraft:candle_9", "harvestcraft:candle_9", "harvestcraft:candle_9", "harvestcraft:candle_9", "harvestcraft:candle_9"},
            {"pamcandleDeco11", 716, "rock", "harvestcraft:candle_10", "harvestcraft:candle_10", "harvestcraft:candle_10", "harvestcraft:candle_10", "harvestcraft:candle_10", "harvestcraft:candle_10"},
            {"pamcandleDeco12", 717, "rock", "harvestcraft:candle_11", "harvestcraft:candle_11", "harvestcraft:candle_11", "harvestcraft:candle_11", "harvestcraft:candle_11", "harvestcraft:candle_11"},
            {"pamcandleDeco13", 718, "rock", "harvestcraft:candle_12", "harvestcraft:candle_12", "harvestcraft:candle_12", "harvestcraft:candle_12", "harvestcraft:candle_12", "harvestcraft:candle_12"},
            {"pamcandleDeco14", 719, "rock", "harvestcraft:candle_13", "harvestcraft:candle_13", "harvestcraft:candle_13", "harvestcraft:candle_13", "harvestcraft:candle_13", "harvestcraft:candle_13"},
            {"pamcandleDeco15", 720, "rock", "harvestcraft:candle_14", "harvestcraft:candle_14", "harvestcraft:candle_14", "harvestcraft:candle_14", "harvestcraft:candle_14", "harvestcraft:candle_14"},
            {"pamcandleDeco16", 721, "rock", "harvestcraft:candle_15", "harvestcraft:candle_15", "harvestcraft:candle_15", "harvestcraft:candle_15", "harvestcraft:candle_15", "harvestcraft:candle_15"},
            {"pamcarrotCake", 722, "rock", "harvestcraft:pamcarrotcake_bottom", "harvestcraft:pamcarrotcake_top", "harvestcraft:pamcarrotcake_side", "harvestcraft:pamcarrotcake_side", "harvestcraft:pamcarrotcake_side", "harvestcraft:pamcarrotcake_side"},
            {"pamcheeseCake", 723, "rock", "harvestcraft:pamcheesecake_bottom", "harvestcraft:pamcheesecake_top", "harvestcraft:pamcheesecake_side", "harvestcraft:pamcheesecake_side", "harvestcraft:pamcheesecake_side", "harvestcraft:pamcheesecake_side"},
            {"pamcherrycheeseCake", 724, "rock", "harvestcraft:pamcherrycheesecake_bottom", "harvestcraft:pamcherrycheesecake_top", "harvestcraft:pamcherrycheesecake_side", "harvestcraft:pamcherrycheesecake_side", "harvestcraft:pamcherrycheesecake_side", "harvestcraft:pamcherrycheesecake_side"},
            {"pampineappleupsidedownCake", 725, "rock", "harvestcraft:pampineappleupsidedowncake_bottom", "harvestcraft:pampineappleupsidedowncake_top", "harvestcraft:pampineappleupsidedowncake_side", "harvestcraft:pampineappleupsidedowncake_side", "harvestcraft:pampineappleupsidedowncake_side", "harvestcraft:pampineappleupsidedowncake_side"},
            {"pamchocolatesprinkleCake", 726, "rock", "harvestcraft:pamchocolatesprinklecake_bottom", "harvestcraft:pamchocolatesprinklecake_top", "harvestcraft:pamchocolatesprinklecake_side", "harvestcraft:pamchocolatesprinklecake_side", "harvestcraft:pamchocolatesprinklecake_side", "harvestcraft:pamchocolatesprinklecake_side"},
            {"pamredvelvetCake", 727, "rock", "harvestcraft:pamredvelvetcake_bottom", "harvestcraft:pamredvelvetcake_top", "harvestcraft:pamredvelvetcake_side", "harvestcraft:pamredvelvetcake_side", "harvestcraft:pamredvelvetcake_side", "harvestcraft:pamredvelvetcake_side"},
            {"pamlamingtonCake", 728, "rock", "harvestcraft:pamlamingtoncake_bottom", "harvestcraft:pamlamingtoncake_top", "harvestcraft:pamlamingtoncake_side", "harvestcraft:pamlamingtoncake_side", "harvestcraft:pamlamingtoncake_side", "harvestcraft:pamlamingtoncake_side"},
            {"pampavlovaCake", 729, "rock", "harvestcraft:pampavlovacake_bottom", "harvestcraft:pampavlovacake_top", "harvestcraft:pampavlovacake_side", "harvestcraft:pampavlovacake_side", "harvestcraft:pampavlovacake_side", "harvestcraft:pampavlovacake_side"},
            {"pamholidayCake", 730, "rock", "harvestcraft:pamholidaycake_bottom", "harvestcraft:pamholidaycake_top", "harvestcraft:pamholidaycake_side", "harvestcraft:pamholidaycake_side", "harvestcraft:pamholidaycake_side", "harvestcraft:pamholidaycake_side"},
            {"pampumpkincheeseCake", 731, "rock", "harvestcraft:pampumpkincheesecake_bottom", "harvestcraft:pampumpkincheesecake_top", "harvestcraft:pampumpkincheesecake_side", "harvestcraft:pampumpkincheesecake_side", "harvestcraft:pampumpkincheesecake_side", "harvestcraft:pampumpkincheesecake_side"},
        };
        BlockRegistryHelper.registerBlocks("harvestcraft", harvestcraftBlockData);
    }

    /**
     * 注册来自 Railcraft 的方块
     */
    private static void registerRailcraftBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] RailcraftBlockData = {
            {"fluid.creosote", 732, "rock", "railcraft:fluids/creosote_still", "railcraft:fluids/creosote_still", "railcraft:fluids/creosote_flow", "railcraft:fluids/creosote_flow", "railcraft:fluids/creosote_flow", "railcraft:fluids/creosote_flow"},
            {"fluid.steam", 733, "rock", "railcraft:fluids/steam_still", "railcraft:fluids/steam_still", "railcraft:fluids/steam_still", "railcraft:fluids/steam_still", "railcraft:fluids/steam_still", "railcraft:fluids/steam_still"},
            {"residual.heat", 734, "rock", "deadbush", "deadbush", "deadbush", "deadbush", "deadbush", "deadbush"},
            {"cube", 735, "rock", "railcraft:cube.coke", "railcraft:cube.coke", "railcraft:cube.coke", "railcraft:cube.coke", "railcraft:cube.coke", "railcraft:cube.coke"},
            {"anvil", 736, "rock", "railcraft:anvil_base", "railcraft:anvil_base", "railcraft:anvil_base", "railcraft:anvil_base", "railcraft:anvil_base", "railcraft:anvil_base"},
            {"machine.alpha", 737, "rock", "railcraft:anchor.world.0", "railcraft:anchor.world.0", "railcraft:anchor.world.1", "railcraft:anchor.world.1", "railcraft:anchor.world.1", "railcraft:anchor.world.1"},
            {"machine.beta", 738, "rock", "railcraft:tank.iron.wall.0", "railcraft:tank.iron.wall.0", "railcraft:tank.iron.wall.1", "railcraft:tank.iron.wall.1", "railcraft:tank.iron.wall.1", "railcraft:tank.iron.wall.1"},
            {"track", 739, "rock", "rail_normal", "rail_normal", "rail_normal", "rail_normal", "rail_normal", "rail_normal"},
            {"track.elevator", 740, "rock", "railcraft:tracks/track.elevator.1", "railcraft:tracks/track.elevator.1", "railcraft:tracks/track.elevator.1", "railcraft:tracks/track.elevator.1", "railcraft:tracks/track.elevator.1", "railcraft:tracks/track.elevator.1"},
            {"signal", 741, "rock", "railcraft:signal.box.interlock", "railcraft:signal.box.interlock", "railcraft:signal.box.interlock", "railcraft:signal.box.interlock", "railcraft:signal.box.interlock", "railcraft:signal.box.interlock"},
            {"stair", 742, "rock", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0"},
            {"slab", 743, "rock", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0"},
            {"lantern.stone", 744, "rock", "railcraft:brick.abyssal.2", "railcraft:brick.abyssal.2", "railcraft:brick.abyssal.2", "railcraft:brick.abyssal.2", "railcraft:brick.abyssal.2", "railcraft:brick.abyssal.2"},
            {"lantern.metal", 745, "iron", "iron_block", "iron_block", "iron_block", "iron_block", "iron_block", "iron_block"},
            {"brick.abyssal", 746, "rock", "railcraft:brick.abyssal.0", "railcraft:brick.abyssal.0", "railcraft:brick.abyssal.0", "railcraft:brick.abyssal.0", "railcraft:brick.abyssal.0", "railcraft:brick.abyssal.0"},
            {"brick.bleachedbone", 747, "rock", "railcraft:brick.bleachedbone.0", "railcraft:brick.bleachedbone.0", "railcraft:brick.bleachedbone.0", "railcraft:brick.bleachedbone.0", "railcraft:brick.bleachedbone.0", "railcraft:brick.bleachedbone.0"},
            {"brick.bloodstained", 748, "rock", "railcraft:brick.bloodstained.0", "railcraft:brick.bloodstained.0", "railcraft:brick.bloodstained.0", "railcraft:brick.bloodstained.0", "railcraft:brick.bloodstained.0", "railcraft:brick.bloodstained.0"},
            {"brick.frostbound", 749, "rock", "railcraft:brick.frostbound.0", "railcraft:brick.frostbound.0", "railcraft:brick.frostbound.0", "railcraft:brick.frostbound.0", "railcraft:brick.frostbound.0", "railcraft:brick.frostbound.0"},
            {"brick.infernal", 750, "rock", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0"},
            {"brick.quarried", 751, "rock", "railcraft:brick.quarried.0", "railcraft:brick.quarried.0", "railcraft:brick.quarried.0", "railcraft:brick.quarried.0", "railcraft:brick.quarried.0", "railcraft:brick.quarried.0"},
            {"brick.sandy", 752, "sand", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0", "railcraft:brick.sandy.0"},
            {"brick.nether", 753, "rock", "railcraft:brick.nether.0", "railcraft:brick.nether.0", "railcraft:brick.nether.0", "railcraft:brick.nether.0", "railcraft:brick.nether.0", "railcraft:brick.nether.0"},
            {"post", 754, "rock", "railcraft:post.wood", "railcraft:post.wood", "railcraft:post.wood", "railcraft:post.wood", "railcraft:post.wood", "railcraft:post.wood"},
            {"post.metal", 755, "iron", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0"},
            {"post.metal.platform", 756, "iron", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0", "railcraft:post.metal.painted.0"},
            {"wall.alpha", 757, "rock", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0", "railcraft:brick.infernal.0"},
            {"wall.beta", 758, "rock", "quartz_block_bottom", "quartz_block_top", "quartz_block_side", "quartz_block_side", "quartz_block_side", "quartz_block_side"},
            {"glass", 759, "glass", "railcraft:glass.0", "railcraft:glass.0", "railcraft:glass.0", "railcraft:glass.0", "railcraft:glass.0", "railcraft:glass.0"},
            {"detector", 760, "rock", "railcraft:detector.item.0", "railcraft:detector.item.0", "railcraft:detector.item.0", "railcraft:detector.item.2", "railcraft:detector.item.0", "railcraft:detector.item.0"},
            {"machine.gamma", 761, "rock", "railcraft:loader.item.2", "railcraft:loader.item.0", "railcraft:loader.item.1", "railcraft:loader.item.1", "railcraft:loader.item.1", "railcraft:loader.item.1"},
            {"machine.epsilon", 762, "rock", "railcraft:electric.feeder.0", "railcraft:electric.feeder.0", "railcraft:electric.feeder.0", "railcraft:electric.feeder.0", "railcraft:electric.feeder.0", "railcraft:electric.feeder.0"},
            {"ore", 763, "rock", "stone", "stone", "stone", "stone", "stone", "stone"},
            {"worldlogic", 764, "wood", "bedrock", "bedrock", "bedrock", "bedrock", "bedrock", "bedrock"},
            {"firestone.recharge", 765, "rock", "obsidian", "obsidian", "obsidian", "obsidian", "obsidian", "obsidian"},
            {"frame", 766, "rock", "railcraft:frame.1", "railcraft:frame.0", "railcraft:frame.1", "railcraft:frame.1", "railcraft:frame.1", "railcraft:frame.1"},
            {"machine.delta", 767, "rock", "railcraft:wire.0", "railcraft:wire.0", "railcraft:wire.0", "railcraft:wire.0", "railcraft:wire.0", "railcraft:wire.0"},
        };
        BlockRegistryHelper.registerBlocks("Railcraft", RailcraftBlockData);
    }

    /**
     * 注册来自 shincolle 的方块
     */
    private static void registerShincolleBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] shincolleBlockData = {
            {"BlockCrane", 768, "rock", "shincolle:BlockCraneBtm", "shincolle:BlockCraneTop", "shincolle:BlockCraneSide", "shincolle:BlockCraneSide", "shincolle:BlockCraneSide", "shincolle:BlockCraneSide"},
            {"BlockDesk", 769, "rock", "shincolle:BlockDesk", "shincolle:BlockDesk", "shincolle:BlockDesk", "shincolle:BlockDesk", "shincolle:BlockDesk", "shincolle:BlockDesk"},
            {"BlockFrame", 770, "rock", "shincolle:BlockFrameTop", "shincolle:BlockFrameTop", "shincolle:BlockFrame2", "shincolle:BlockFrame3", "shincolle:BlockFrame4", "shincolle:BlockFrame5"},
            {"BlockLightAir", 771, "rock", "shincolle:BlockLightAir", "shincolle:BlockLightAir", "shincolle:BlockLightAir", "shincolle:BlockLightAir", "shincolle:BlockLightAir", "shincolle:BlockLightAir"},
            {"BlockLightLiquid", 772, "rock", "water_still", "water_still", "water_flow", "water_flow", "water_flow", "water_flow"},
            {"BlockPolymetalOre", 773, "iron", "shincolle:BlockPolymetalOre", "shincolle:BlockPolymetalOre", "shincolle:BlockPolymetalOre", "shincolle:BlockPolymetalOre", "shincolle:BlockPolymetalOre", "shincolle:BlockPolymetalOre"},
            {"BlockSmallShipyard", 774, "rock", "shincolle:BlockSmallShipyard", "shincolle:BlockSmallShipyard", "shincolle:BlockSmallShipyard", "shincolle:BlockSmallShipyard", "shincolle:BlockSmallShipyard", "shincolle:BlockSmallShipyard"},
            {"BlockVolBlock", 775, "rock", "shincolle:BlockVolCore", "shincolle:BlockVolCore", "shincolle:BlockVolCore", "shincolle:BlockVolCore", "shincolle:BlockVolCore", "shincolle:BlockVolCore"},
            {"BlockVolCore", 776, "rock", "shincolle:BlockVolCore", "shincolle:BlockVolCore", "shincolle:BlockVolCore", "shincolle:BlockVolCore", "shincolle:BlockVolCore", "shincolle:BlockVolCore"},
            {"BlockLightFluid", 777, "rock", "water_still", "water_still", "water_flow", "water_flow", "water_flow", "water_flow"},
            {"BlockAbyssium", 778, "rock", "shincolle:BlockAbyssium", "shincolle:BlockAbyssium", "shincolle:BlockAbyssium", "shincolle:BlockAbyssium", "shincolle:BlockAbyssium", "shincolle:BlockAbyssium"},
            {"BlockGrudge", 779, "rock", "shincolle:BlockGrudge", "shincolle:BlockGrudge", "shincolle:BlockGrudge", "shincolle:BlockGrudge", "shincolle:BlockGrudge", "shincolle:BlockGrudge"},
            {"BlockPolymetal", 780, "iron", "shincolle:BlockPolymetal", "shincolle:BlockPolymetal", "shincolle:BlockPolymetal", "shincolle:BlockPolymetal", "shincolle:BlockPolymetal", "shincolle:BlockPolymetal"},
            {"BlockPolymetalGravel", 781, "iron", "shincolle:BlockPolymetalGravel", "shincolle:BlockPolymetalGravel", "shincolle:BlockPolymetalGravel", "shincolle:BlockPolymetalGravel", "shincolle:BlockPolymetalGravel", "shincolle:BlockPolymetalGravel"},
            {"BlockGrudgeHeavy", 782, "rock", "shincolle:BlockGrudgeHeavy", "shincolle:BlockGrudgeHeavy", "shincolle:BlockGrudgeHeavy", "shincolle:BlockGrudgeHeavy", "shincolle:BlockGrudgeHeavy", "shincolle:BlockGrudgeHeavy"},
            {"BlockWaypoint", 783, "rock", "shincolle:BlockWaypoint", "shincolle:BlockWaypoint", "shincolle:BlockWaypoint", "shincolle:BlockWaypoint", "shincolle:BlockWaypoint", "shincolle:BlockWaypoint"},
        };
        BlockRegistryHelper.registerBlocks("shincolle", shincolleBlockData);
    }

    /**
     * 注册来自 THKaguyaMod 的方块
     */
    private static void registerThkaguyamodBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] THKaguyaModBlockData = {
            {"Danmaku Crafting Table", 784, "rock", "thkaguyamod:danmaku_crafting_table", "thkaguyamod:danmaku_crafting_table", "thkaguyamod:danmaku_crafting_table", "thkaguyamod:danmaku_crafting_table", "thkaguyamod:danmaku_crafting_table", "thkaguyamod:danmaku_crafting_table"},
            {"Divine Spirit", 785, "rock", "thkaguyamod:divineSpirit_Red", "thkaguyamod:divineSpirit_Red", "thkaguyamod:divineSpirit_Red", "thkaguyamod:divineSpirit_Red", "thkaguyamod:divineSpirit_Red", "thkaguyamod:divineSpirit_Red"},
        };
        BlockRegistryHelper.registerBlocks("THKaguyaMod", THKaguyaModBlockData);
    }

    /**
     * 注册来自 TwilightForest 的方块
     */
    private static void registerTwilightforestBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] TwilightForestBlockData = {
            {"tile.TFLog", 786, "wood", "TwilightForest:oak_top", "TwilightForest:oak_top", "TwilightForest:oak_side", "TwilightForest:oak_side", "TwilightForest:oak_side", "TwilightForest:oak_side"},
            {"tile.TFRoots", 787, "rock", "TwilightForest:rootblock", "TwilightForest:rootblock", "TwilightForest:rootblock", "TwilightForest:rootblock", "TwilightForest:rootblock", "TwilightForest:rootblock"},
            {"tile.TFLeaves", 788, "leaves", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak"},
            {"tile.TFFirefly", 789, "rock", "TwilightForest:TFFirefly", "TwilightForest:TFFirefly", "TwilightForest:TFFirefly", "TwilightForest:TFFirefly", "TwilightForest:TFFirefly", "TwilightForest:TFFirefly"},
            {"tile.TFCicada", 790, "rock", "TwilightForest:TFCicada", "TwilightForest:TFCicada", "TwilightForest:TFCicada", "TwilightForest:TFCicada", "TwilightForest:TFCicada", "TwilightForest:TFCicada"},
            {"tile.TFPortal", 791, "rock", "portal", "portal", "portal", "portal", "portal", "portal"},
            {"tile.TFMazestone", 792, "rock", "TwilightForest:mazestone_plain", "TwilightForest:mazestone_plain", "TwilightForest:mazestone_plain", "TwilightForest:mazestone_plain", "TwilightForest:mazestone_plain", "TwilightForest:mazestone_plain"},
            {"tile.TFHedge", 793, "rock", "TwilightForest:hedge", "TwilightForest:hedge", "TwilightForest:hedge", "TwilightForest:hedge", "TwilightForest:hedge", "TwilightForest:hedge"},
            {"tile.TFBossSpawner", 794, "rock", "mob_spawner", "mob_spawner", "mob_spawner", "mob_spawner", "mob_spawner", "mob_spawner"},
            {"tile.TFFireflyJar", 795, "rock", "TwilightForest:fireflyjar_top", "TwilightForest:fireflyjar_top", "TwilightForest:fireflyjar_side", "TwilightForest:fireflyjar_side", "TwilightForest:fireflyjar_side", "TwilightForest:fireflyjar_side"},
            {"tile.TFPlant", 796, "rock", "TwilightForest:tile.TFPlant", "TwilightForest:tile.TFPlant", "TwilightForest:tile.TFPlant", "TwilightForest:tile.TFPlant", "TwilightForest:tile.TFPlant", "TwilightForest:tile.TFPlant"},
            {"tile.TFUncraftingTable", 797, "rock", "TwilightForest:uncrafting_side", "TwilightForest:uncrafting_top", "TwilightForest:uncrafting_side", "TwilightForest:uncrafting_side", "TwilightForest:uncrafting_side", "TwilightForest:uncrafting_side"},
            {"tile.TFFireJet", 798, "rock", "TwilightForest:firejet_side", "TwilightForest:firejet_top", "TwilightForest:firejet_side", "TwilightForest:firejet_side", "TwilightForest:firejet_side", "TwilightForest:firejet_side"},
            {"tile.TFNagastone", 799, "rock", "TwilightForest:nagastone_bottom_tip", "TwilightForest:nagastone_top_tip", "TwilightForest:nagastone_face_front", "TwilightForest:nagastone_cross_section", "TwilightForest:nagastone_face_left", "TwilightForest:nagastone_face_left"},
            {"tile.TFSapling", 800, "rock", "TwilightForest:sapling_oak", "TwilightForest:sapling_oak", "TwilightForest:sapling_oak", "TwilightForest:sapling_oak", "TwilightForest:sapling_oak", "TwilightForest:sapling_oak"},
            {"tile.TFMoonworm", 801, "rock", "TwilightForest:TFMoonworm", "TwilightForest:TFMoonworm", "TwilightForest:TFMoonworm", "TwilightForest:TFMoonworm", "TwilightForest:TFMoonworm", "TwilightForest:TFMoonworm"},
            {"tile.TFMagicLog", 802, "wood", "TwilightForest:time_section", "TwilightForest:time_section", "TwilightForest:time_side", "TwilightForest:time_side", "TwilightForest:time_side", "TwilightForest:time_side"},
            {"tile.TFMagicLeaves", 803, "leaves", "TwilightForest:time_leaves", "TwilightForest:time_leaves", "TwilightForest:time_leaves", "TwilightForest:time_leaves", "TwilightForest:time_leaves", "TwilightForest:time_leaves"},
            {"tile.TFMagicLogSpecial", 804, "wood", "TwilightForest:time_section", "TwilightForest:time_section", "TwilightForest:time_clock", "TwilightForest:time_clock", "TwilightForest:time_clock", "TwilightForest:time_clock"},
            {"tile.TFTowerStone", 805, "rock", "TwilightForest:towerwood_planks", "TwilightForest:towerwood_planks", "TwilightForest:towerwood_planks", "TwilightForest:towerwood_planks", "TwilightForest:towerwood_planks", "TwilightForest:towerwood_planks"},
            {"tile.TFTowerDevice", 806, "ice", "TwilightForest:towerdev_reappearing_off", "TwilightForest:towerdev_reappearing_off", "TwilightForest:towerdev_reappearing_off", "TwilightForest:towerdev_reappearing_off", "TwilightForest:towerdev_reappearing_off", "TwilightForest:towerdev_reappearing_off"},
            {"tile.TFTowerTranslucent", 807, "rock", "TwilightForest:towerdev_reappearing_trace_off", "TwilightForest:towerdev_reappearing_trace_off", "TwilightForest:towerdev_reappearing_trace_off", "TwilightForest:towerdev_reappearing_trace_off", "TwilightForest:towerdev_reappearing_trace_off", "TwilightForest:towerdev_reappearing_trace_off"},
            {"tile.TFTrophy", 808, "rock", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand", "soul_sand"},
            {"tile.TFShield", 809, "rock", "TwilightForest:shield_inside", "TwilightForest:shield_outside", "TwilightForest:shield_outside", "TwilightForest:shield_outside", "TwilightForest:shield_outside", "TwilightForest:shield_outside"},
            {"tile.TFTrophyPedestal", 810, "rock", "TwilightForest:pedestal_top", "TwilightForest:pedestal_top", "TwilightForest:pedestal_naga", "TwilightForest:pedestal_lich", "TwilightForest:pedestal_hydra", "TwilightForest:pedestal_urghast"},
            {"tile.TFAuroraBrick", 811, "rock", "TwilightForest:aurorabrick0", "TwilightForest:aurorabrick0", "TwilightForest:aurorabrick0", "TwilightForest:aurorabrick0", "TwilightForest:aurorabrick0", "TwilightForest:aurorabrick0"},
            {"tile.TFUnderBrick", 812, "rock", "TwilightForest:knightbrick", "TwilightForest:knightbrick", "TwilightForest:knightbrick", "TwilightForest:knightbrick", "TwilightForest:knightbrick", "TwilightForest:knightbrick"},
            {"tile.TFThorns", 813, "rock", "TwilightForest:brown_thorns_top", "TwilightForest:brown_thorns_top", "TwilightForest:brown_thorns_side", "TwilightForest:brown_thorns_side", "TwilightForest:brown_thorns_side", "TwilightForest:brown_thorns_side"},
            {"tile.TFBurntThorns", 814, "rock", "TwilightForest:burnt_thorns_top", "TwilightForest:burnt_thorns_top", "TwilightForest:burnt_thorns_side", "TwilightForest:burnt_thorns_side", "TwilightForest:burnt_thorns_side", "TwilightForest:burnt_thorns_side"},
            {"tile.TFThornRose", 815, "rock", "TwilightForest:thornRose", "TwilightForest:thornRose", "TwilightForest:thornRose", "TwilightForest:thornRose", "TwilightForest:thornRose", "TwilightForest:thornRose"},
            {"tile.TFLeaves3", 816, "leaves", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak"},
            {"tile.TFDeadrock", 817, "rock", "TwilightForest:deadrock_surface", "TwilightForest:deadrock_surface", "TwilightForest:deadrock_surface", "TwilightForest:deadrock_surface", "TwilightForest:deadrock_surface", "TwilightForest:deadrock_surface"},
            {"tile.DarkLeaves", 818, "leaves", "TwilightForest:darkwood_leaves2", "TwilightForest:darkwood_leaves2", "TwilightForest:darkwood_leaves2", "TwilightForest:darkwood_leaves2", "TwilightForest:darkwood_leaves2", "TwilightForest:darkwood_leaves2"},
            {"tile.AuroraPillar", 819, "rock", "TwilightForest:aurora_pillar_top", "TwilightForest:aurora_pillar_top", "TwilightForest:aurora_pillar_side", "TwilightForest:aurora_pillar_side", "TwilightForest:aurora_pillar_side", "TwilightForest:aurora_pillar_side"},
            {"tile.AuroraSlab", 820, "rock", "TwilightForest:aurora_pillar_top", "TwilightForest:aurora_pillar_top", "TwilightForest:aurora_slab_side", "TwilightForest:aurora_slab_side", "TwilightForest:aurora_slab_side", "TwilightForest:aurora_slab_side"},
            {"tile.AuroraDoubleSlab", 821, "rock", "TwilightForest:aurora_pillar_top", "TwilightForest:aurora_pillar_top", "TwilightForest:aurora_slab_side", "TwilightForest:aurora_slab_side", "TwilightForest:aurora_slab_side", "TwilightForest:aurora_slab_side"},
            {"tile.TrollSteinn", 822, "rock", "TwilightForest:trollsteinn", "TwilightForest:trollsteinn", "TwilightForest:trollsteinn", "TwilightForest:trollsteinn", "TwilightForest:trollsteinn", "TwilightForest:trollsteinn"},
            {"tile.WispyCloud", 823, "rock", "TwilightForest:wispy_cloud", "TwilightForest:wispy_cloud", "TwilightForest:wispy_cloud", "TwilightForest:wispy_cloud", "TwilightForest:wispy_cloud", "TwilightForest:wispy_cloud"},
            {"tile.FluffyCloud", 824, "rock", "TwilightForest:fluffy_cloud", "TwilightForest:fluffy_cloud", "TwilightForest:fluffy_cloud", "TwilightForest:fluffy_cloud", "TwilightForest:fluffy_cloud", "TwilightForest:fluffy_cloud"},
            {"tile.GiantCobble", 825, "rock", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone"},
            {"tile.GiantLog", 826, "wood", "log_oak_top", "log_oak_top", "log_oak", "log_oak", "log_oak", "log_oak"},
            {"tile.GiantLeaves", 827, "leaves", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak", "leaves_oak"},
            {"tile.GiantObsidian", 828, "rock", "obsidian", "obsidian", "obsidian", "obsidian", "obsidian", "obsidian"},
            {"tile.UberousSoil", 829, "ground", "TwilightForest:uberous_soil", "TwilightForest:uberous_soil", "TwilightForest:uberous_soil", "TwilightForest:uberous_soil", "TwilightForest:uberous_soil", "TwilightForest:uberous_soil"},
            {"tile.HugeStalk", 830, "rock", "TwilightForest:huge_stalk_top", "TwilightForest:huge_stalk_top", "TwilightForest:huge_stalk", "TwilightForest:huge_stalk", "TwilightForest:huge_stalk", "TwilightForest:huge_stalk"},
            {"tile.HugeGloomBlock", 831, "rock", "TwilightForest:huge_gloom_inside", "TwilightForest:huge_gloom_inside", "TwilightForest:huge_gloom_inside", "TwilightForest:huge_gloom_inside", "TwilightForest:huge_gloom_inside", "TwilightForest:huge_gloom_inside"},
            {"tile.TrollVidr", 832, "rock", "TwilightForest:troll_root", "TwilightForest:troll_root", "TwilightForest:troll_root", "TwilightForest:troll_root", "TwilightForest:troll_root", "TwilightForest:troll_root"},
            {"tile.UnripeTrollBer", 833, "rock", "TwilightForest:unripe_torch_cluster", "TwilightForest:unripe_torch_cluster", "TwilightForest:unripe_torch_cluster", "TwilightForest:unripe_torch_cluster", "TwilightForest:unripe_torch_cluster", "TwilightForest:unripe_torch_cluster"},
            {"tile.TrollBer", 834, "rock", "TwilightForest:ripe_torch_cluster", "TwilightForest:ripe_torch_cluster", "TwilightForest:ripe_torch_cluster", "TwilightForest:ripe_torch_cluster", "TwilightForest:ripe_torch_cluster", "TwilightForest:ripe_torch_cluster"},
            {"tile.KnightmetalBlock", 835, "iron", "TwilightForest:knightmetal_block", "TwilightForest:knightmetal_block", "TwilightForest:knightmetal_block", "TwilightForest:knightmetal_block", "TwilightForest:knightmetal_block", "TwilightForest:knightmetal_block"},
            {"tile.HugeLilyPad", 836, "rock", "TwilightForest:huge_lilypad_0", "TwilightForest:huge_lilypad_0", "TwilightForest:blank", "TwilightForest:blank", "TwilightForest:blank", "TwilightForest:blank"},
            {"tile.HugeWaterLily", 837, "rock", "TwilightForest:huge_waterlily", "TwilightForest:huge_waterlily", "TwilightForest:huge_waterlily", "TwilightForest:huge_waterlily", "TwilightForest:huge_waterlily", "TwilightForest:huge_waterlily"},
            {"tile.Slider", 838, "rock", "TwilightForest:slider_top", "TwilightForest:slider_top", "TwilightForest:slider_v", "TwilightForest:slider_v", "TwilightForest:slider_v", "TwilightForest:slider_v"},
            {"tile.CastleBrick", 839, "rock", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick"},
            {"tile.CastleMagic", 840, "rock", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick", "TwilightForest:castleblock_brick"},
            {"tile.ForceField", 841, "rock", "TwilightForest:forcefield_purple", "TwilightForest:forcefield_purple", "TwilightForest:forcefield_purple", "TwilightForest:forcefield_purple", "TwilightForest:forcefield_purple", "TwilightForest:forcefield_purple"},
        };
        BlockRegistryHelper.registerBlocks("TwilightForest", TwilightForestBlockData);
    }

    /**
     * 注册来自 TacticalFrame 的方块
     */
    private static void registerTacticalframeBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] TacticalFrameBlockData = {
            {"guncraft", 842, "rock", "tf:guncraft", "tf:guncraft_top", "tf:guncraft_side", "tf:guncraft_side", "tf:guncraft_side", "tf:guncraft_side"},
            {"cupola", 843, "rock", "tf:cupola_top", "tf:cupola_top", "tf:cupola", "tf:cupola", "tf:cupola", "tf:cupola"},
            {"cupolaframe", 844, "rock", "tf:cupola_top", "tf:cupola_top", "tf:cupola_top", "tf:cupola_top", "tf:cupola_top", "tf:cupola_top"},
            {"cokeoven", 845, "rock", "tf:cokeoven_top", "tf:cokeoven_top", "tf:cokeoven", "tf:cokeoven", "tf:cokeoven", "tf:cokeoven"},
            {"cokeframe", 846, "rock", "tf:cokeoven_top", "tf:cokeoven_top", "tf:cokeoven_top", "tf:cokeoven_top", "tf:cokeoven_top", "tf:cokeoven_top"},
            {"biogenerator", 847, "rock", "tf:biogenerator_top", "tf:biogenerator_top", "tf:biogenerator", "tf:biogenerator_face", "tf:biogenerator", "tf:biogenerator"},
            {"smeltgenerator", 848, "rock", "tf:smeltgenerator_top", "tf:smeltgenerator_top", "tf:smeltgenerator", "tf:smeltgenerator_face", "tf:smeltgenerator", "tf:smeltgenerator"},
            {"energyreactor", 849, "rock", "tf:energyreactor_top", "tf:energyreactor_top", "tf:energyreactor", "tf:energyreactor_face", "tf:energyreactor", "tf:energyreactor"},
            {"metalseparator", 850, "iron", "tf:separator_top", "tf:separator_top", "tf:separator", "tf:separator_face", "tf:separator", "tf:separator"},
            {"stonemaker", 851, "rock", "tf:stonemaker", "tf:stonemaker", "tf:stonemaker", "tf:stonemaker_face", "tf:stonemaker", "tf:stonemaker"},
            {"rigidocontainer", 852, "rock", "tf:rigidocontainer_top", "tf:rigidocontainer_top", "tf:rigidocontainer_side", "tf:rigidocontainer_face", "tf:rigidocontainer_side", "tf:rigidocontainer_side"},
            {"flamcontainer", 853, "rock", "tf:flamcontainer_top", "tf:flamcontainer_top", "tf:flamcontainer_side", "tf:flamcontainer_face", "tf:flamcontainer_side", "tf:flamcontainer_side"},
            {"pulverizer", 854, "rock", "tf:pulverizer_top", "tf:pulverizer_top", "tf:pulverizer_side", "tf:pulverizer_face", "tf:pulverizer_side", "tf:pulverizer_side"},
            {"repair", 855, "rock", "tf:repair_top", "tf:repair_top", "tf:repair_side", "tf:repair_face", "tf:repair_side", "tf:repair_side"},
            {"rigidofurnace", 856, "rock", "tf:rigidofurnace", "tf:rigidofurnace", "tf:rigidofurnace", "tf:rigidofurnace_face", "tf:rigidofurnace", "tf:rigidofurnace"},
            {"arsfurnace", 857, "rock", "tf:arsfurnace", "tf:arsfurnace", "tf:arsfurnace", "tf:arsfurnace_face", "tf:arsfurnace", "tf:arsfurnace"},
            {"fierytrap", 858, "rock", "cobblestone", "cobblestone", "tf:fierytrap", "tf:fierytrap", "tf:fierytrap", "tf:fierytrap"},
            {"explodetrap", 859, "rock", "grass_top", "grass_top", "tf:explodetrap", "tf:explodetrap", "tf:explodetrap", "tf:explodetrap"},
            {"flower_blue", 860, "rock", "tf:tile.flower_blue_0", "tf:tile.flower_blue_0", "tf:tile.flower_blue_0", "tf:tile.flower_blue_0", "tf:tile.flower_blue_0", "tf:tile.flower_blue_0"},
            {"flower_red", 861, "rock", "tf:tile.flower_red_0", "tf:tile.flower_red_0", "tf:tile.flower_red_0", "tf:tile.flower_red_0", "tf:tile.flower_red_0", "tf:tile.flower_red_0"},
            {"flower_purple", 862, "rock", "tf:tile.flower_purple_0", "tf:tile.flower_purple_0", "tf:tile.flower_purple_0", "tf:tile.flower_purple_0", "tf:tile.flower_purple_0", "tf:tile.flower_purple_0"},
            {"flower_green", 863, "rock", "tf:tile.flower_green_0", "tf:tile.flower_green_0", "tf:tile.flower_green_0", "tf:tile.flower_green_0", "tf:tile.flower_green_0", "tf:tile.flower_green_0"},
            {"riceplant", 864, "ice", "tf:riceplant_0", "tf:riceplant_0", "tf:riceplant_0", "tf:riceplant_0", "tf:riceplant_0", "tf:riceplant_0"},
            {"radishplant", 865, "rock", "tf:radishplant_0", "tf:radishplant_0", "tf:radishplant_0", "tf:radishplant_0", "tf:radishplant_0", "tf:radishplant_0"},
            {"temperedironblock", 866, "iron", "tf:temperedironblock", "tf:temperedironblock", "tf:temperedironblock", "tf:temperedironblock", "tf:temperedironblock", "tf:temperedironblock"},
            {"cubeblock", 867, "rock", "tf:cubeblock_top", "tf:cubeblock_top", "tf:cubeblock_side", "tf:cubeblock_side", "tf:cubeblock_side", "tf:cubeblock_side"},
            {"coreblock0", 868, "rock", "tf:coreblock_top_0", "tf:coreblock_top_0", "tf:coreblock_side_0", "tf:coreblock_side_0", "tf:coreblock_side_0", "tf:coreblock_side_0"},
            {"coreblock1", 869, "rock", "tf:coreblock_top_1", "tf:coreblock_top_1", "tf:coreblock_side_1", "tf:coreblock_side_1", "tf:coreblock_side_1", "tf:coreblock_side_1"},
            {"coreblock2", 870, "rock", "tf:coreblock_top_2", "tf:coreblock_top_2", "tf:coreblock_side_2", "tf:coreblock_side_2", "tf:coreblock_side_2", "tf:coreblock_side_2"},
            {"coreblock3", 871, "rock", "tf:coreblock_top_3", "tf:coreblock_top_3", "tf:coreblock_side_3", "tf:coreblock_side_3", "tf:coreblock_side_3", "tf:coreblock_side_3"},
            {"pigironblock", 872, "iron", "iron_block", "iron_block", "iron_block", "iron_block", "iron_block", "iron_block"},
            {"flamlightblock", 873, "rock", "tf:flamlightblock", "tf:flamlightblock", "tf:flamlightblock", "tf:flamlightblock", "tf:flamlightblock", "tf:flamlightblock"},
            {"rigidoblock", 874, "rock", "tf:rigidoblock", "tf:rigidoblock", "tf:rigidoblock", "tf:rigidoblock", "tf:rigidoblock", "tf:rigidoblock"},
            {"lepreblock", 875, "rock", "tf:lepreblock", "tf:lepreblock", "tf:lepreblock", "tf:lepreblock", "tf:lepreblock", "tf:lepreblock"},
            {"rnanoblock", 876, "rock", "tf:nanoblock", "tf:nanoblock", "tf:nanoblock", "tf:nanoblock", "tf:nanoblock", "tf:nanoblock"},
            {"flamgem", 877, "rock", "tf:flamgem", "tf:flamgem", "tf:flamgem", "tf:flamgem", "tf:flamgem", "tf:flamgem"},
            {"glowgem", 878, "rock", "tf:glowgem", "tf:glowgem", "tf:glowgem", "tf:glowgem", "tf:glowgem", "tf:glowgem"},
            {"soltcauldron", 879, "rock", "tf:soltcauldron", "tf:soltcauldron", "tf:soltcauldron", "tf:soltcauldron", "tf:soltcauldron", "tf:soltcauldron"},
            {"soltblock", 880, "rock", "tf:soltblock", "tf:soltblock", "tf:soltblock", "tf:soltblock", "tf:soltblock", "tf:soltblock"},
            {"sulfurblock", 881, "rock", "tf:sulfurblock", "tf:sulfurblock", "tf:sulfurblock", "tf:sulfurblock", "tf:sulfurblock", "tf:sulfurblock"},
            {"cokeblock", 882, "rock", "tf:cokeblock", "tf:cokeblock", "tf:cokeblock", "tf:cokeblock", "tf:cokeblock", "tf:cokeblock"},
            {"machineblock0", 883, "rock", "tf:machineblock", "tf:machineblock", "tf:machineblock", "tf:machineblock", "tf:machineblock", "tf:machineblock"},
            {"machineblock1", 884, "rock", "tf:machineblock_0", "tf:machineblock_0", "tf:machineblock_0", "tf:machineblock_0", "tf:machineblock_0", "tf:machineblock_0"},
            {"slowice", 885, "ice", "ice", "ice", "ice", "ice", "ice", "ice"},
            {"carryline", 886, "rock", "tf:carryline", "tf:carryline", "tf:carryline", "tf:carryline_face", "tf:carryline", "tf:carryline"},
            {"carryline_up", 887, "rock", "tf:carryline_up", "tf:carryline_up", "tf:carryline_up", "tf:carryline_up", "tf:carryline_up", "tf:carryline_up"},
            {"carryline_down", 888, "rock", "tf:carryline_down", "tf:carryline_down", "tf:carryline_down", "tf:carryline_down", "tf:carryline_down", "tf:carryline_down"},
            {"catapult", 889, "rock", "tf:catapult", "tf:catapult", "tf:catapult", "tf:catapult_face", "tf:catapult", "tf:catapult"},
            {"hardstone", 890, "rock", "tf:hardstone_0", "tf:hardstone_0", "tf:hardstone_0", "tf:hardstone_0", "tf:hardstone_0", "tf:hardstone_0"},
            {"hardstone_slab", 891, "rock", "tf:hardstone_0", "tf:hardstone_0", "tf:hardstone_0", "tf:hardstone_0", "tf:hardstone_0", "tf:hardstone_0"},
            {"hardstone_stairs", 892, "rock", "tf:hardstone_2", "tf:hardstone_2", "tf:hardstone_2", "tf:hardstone_2", "tf:hardstone_2", "tf:hardstone_2"},
            {"hardstone_stairs2", 893, "rock", "tf:hardstone_3", "tf:hardstone_3", "tf:hardstone_3", "tf:hardstone_3", "tf:hardstone_3", "tf:hardstone_3"},
            {"temperedstone", 894, "rock", "tf:temperedstone_0", "tf:temperedstone_0", "tf:temperedstone_0", "tf:temperedstone_0", "tf:temperedstone_0", "tf:temperedstone_0"},
            {"hardglass", 895, "glass", "tf:hardglass_0", "tf:hardglass_0", "tf:hardglass_0", "tf:hardglass_0", "tf:hardglass_0", "tf:hardglass_0"},
            {"pipe", 896, "rock", "tf:pipe_top", "tf:pipe_top", "tf:pipe", "tf:pipe", "tf:pipe", "tf:pipe"},
            {"led_white", 897, "rock", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0"},
            {"led_white_off", 898, "rock", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0"},
            {"led_black", 899, "rock", "tf:led_1", "tf:led_1", "tf:led_1", "tf:led_1", "tf:led_1", "tf:led_1"},
            {"led_black_off", 900, "rock", "tf:led_1", "tf:led_1", "tf:led_1", "tf:led_1", "tf:led_1", "tf:led_1"},
            {"led_red", 901, "rock", "tf:led_2", "tf:led_2", "tf:led_2", "tf:led_2", "tf:led_2", "tf:led_2"},
            {"led_red_off", 902, "rock", "tf:led_2", "tf:led_2", "tf:led_2", "tf:led_2", "tf:led_2", "tf:led_2"},
            {"led_orange", 903, "rock", "tf:led_3", "tf:led_3", "tf:led_3", "tf:led_3", "tf:led_3", "tf:led_3"},
            {"led_orange_off", 904, "rock", "tf:led_3", "tf:led_3", "tf:led_3", "tf:led_3", "tf:led_3", "tf:led_3"},
            {"led_yellow", 905, "rock", "tf:led_4", "tf:led_4", "tf:led_4", "tf:led_4", "tf:led_4", "tf:led_4"},
            {"led_yellow_off", 906, "rock", "tf:led_4", "tf:led_4", "tf:led_4", "tf:led_4", "tf:led_4", "tf:led_4"},
            {"led_green", 907, "rock", "tf:led_5", "tf:led_5", "tf:led_5", "tf:led_5", "tf:led_5", "tf:led_5"},
            {"led_green_off", 908, "rock", "tf:led_5", "tf:led_5", "tf:led_5", "tf:led_5", "tf:led_5", "tf:led_5"},
            {"led_cyan", 909, "rock", "tf:led_6", "tf:led_6", "tf:led_6", "tf:led_6", "tf:led_6", "tf:led_6"},
            {"led_cyan_off", 910, "rock", "tf:led_6", "tf:led_6", "tf:led_6", "tf:led_6", "tf:led_6", "tf:led_6"},
            {"led_blue", 911, "rock", "tf:led_7", "tf:led_7", "tf:led_7", "tf:led_7", "tf:led_7", "tf:led_7"},
            {"led_blue_off", 912, "rock", "tf:led_7", "tf:led_7", "tf:led_7", "tf:led_7", "tf:led_7", "tf:led_7"},
            {"led_purple", 913, "rock", "tf:led_8", "tf:led_8", "tf:led_8", "tf:led_8", "tf:led_8", "tf:led_8"},
            {"led_purple_off", 914, "rock", "tf:led_8", "tf:led_8", "tf:led_8", "tf:led_8", "tf:led_8", "tf:led_8"},
            {"led_lime", 915, "rock", "tf:led_9", "tf:led_9", "tf:led_9", "tf:led_9", "tf:led_9", "tf:led_9"},
            {"led_lime_off", 916, "rock", "tf:led_9", "tf:led_9", "tf:led_9", "tf:led_9", "tf:led_9", "tf:led_9"},
            {"led_pink", 917, "rock", "tf:led_10", "tf:led_10", "tf:led_10", "tf:led_10", "tf:led_10", "tf:led_10"},
            {"led_pink_off", 918, "rock", "tf:led_10", "tf:led_10", "tf:led_10", "tf:led_10", "tf:led_10", "tf:led_10"},
            {"led_panel", 919, "rock", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0", "tf:led_0"},
            {"aidstone", 920, "rock", "tf:aidstone_0", "tf:aidstone_0", "tf:aidstone_0", "tf:aidstone_0", "tf:aidstone_0", "tf:aidstone_0"},
        };
        BlockRegistryHelper.registerBlocks("TacticalFrame", TacticalFrameBlockData);
    }

    /**
     * 注册来自 IC2NuclearControl 的方块
     */
    private static void registerIc2nuclearcontrolBlocks() {
        // 使用辅助方法批量注册方块
        Object[][] IC2NuclearControlBlockData = {
            {"blockNuclearControlMain", 921, "rock", "IC2NuclearControl:blockNuclearControlMain", "IC2NuclearControl:blockNuclearControlMain", "IC2NuclearControl:blockNuclearControlMain", "IC2NuclearControl:blockNuclearControlMain", "IC2NuclearControl:blockNuclearControlMain", "IC2NuclearControl:blockNuclearControlMain"},
            {"blockNuclearControlLight", 922, "rock", "IC2NuclearControl:blockNuclearControlLight", "IC2NuclearControl:blockNuclearControlLight", "IC2NuclearControl:blockNuclearControlLight", "IC2NuclearControl:blockNuclearControlLight", "IC2NuclearControl:blockNuclearControlLight", "IC2NuclearControl:blockNuclearControlLight"},
        };
        BlockRegistryHelper.registerBlocks("IC2NuclearControl", IC2NuclearControlBlockData);
    }

}