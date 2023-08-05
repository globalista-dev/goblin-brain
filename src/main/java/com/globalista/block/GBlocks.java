package com.globalista.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

import static com.globalista.util.GRegister.GOBLINGROUP;
import static com.globalista.util.GRegister.registerBlock;

public class GBlocks {

    //Metal ores
    public static final Block TIN_ORE = registerBlock("tin_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(10f,10f).requiresTool()));
    public static final Block SILVER_ORE = registerBlock("silver_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(10f,10f).requiresTool()));
    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DEEPSLATE).strength(10f,10f).requiresTool()));

    //Natural metal blocks
    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));
    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));

    //Alloy blocks
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));
    public static final Block HALLOWED_BLOCK = registerBlock("hallowed_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));

    //Raw blocks
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));
    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));

    //Gem ores
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.NETHERRACK).strength(10f,10f).requiresTool()));

    //Gem blocks
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()));

    public static void callBlocks() {
        System.out.println("Registering GoblinBrain blocks");
    }

}
