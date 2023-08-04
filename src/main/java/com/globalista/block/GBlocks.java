package com.globalista.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static com.globalista.GoblinBrain.GOBLINGROUP;
import static com.globalista.GoblinBrain.MODID;

public class GBlocks {

    //Metal ores
    public static final Block TIN_ORE = registerBlock("tin_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(10f,10f).requiresTool()), GOBLINGROUP);
    public static final Block SILVER_ORE = registerBlock("silver_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(10f,10f).requiresTool()), GOBLINGROUP);
    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DEEPSLATE).strength(10f,10f).requiresTool()), GOBLINGROUP);

    //Natural metal blocks
    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);
    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);

    //Alloy blocks
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);
    public static final Block HALLOWED_BLOCK = registerBlock("hallowed_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);

    //Raw blocks
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);
    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);

    //Gem ores
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.NETHERRACK).strength(10f,10f).requiresTool()), GOBLINGROUP);

    //Gem blocks
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(10f,10f).requiresTool()), GOBLINGROUP);

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MODID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(tab).register(content -> content.add(block));
        return item;
    }

    public static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(MODID, name), block);
    }

    public static void callBlocks() {
        System.out.println("Registering GoblinBrain blocks");
    }

}
