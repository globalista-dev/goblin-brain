package com.globalista.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import static com.globalista.GoblinBrain.MODID;
import static com.globalista.block.GBlocks.*;
import static com.globalista.equipment.GEquipment.*;
import static com.globalista.item.GItems.*;

public class GModelProvider extends FabricModelProvider {
    public GModelProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsGen) {
        bsGen.registerParentedItemModel(TIN_ORE, new Identifier(MODID, "block/tin_ore"));
        bsGen.registerParentedItemModel(SILVER_ORE, new Identifier(MODID, "block/silver_ore"));
        bsGen.registerParentedItemModel(MYTHRIL_ORE, new Identifier(MODID, "block/mythril_ore"));
        bsGen.registerParentedItemModel(RUBY_ORE, new Identifier(MODID, "block/ruby_ore"));
        bsGen.registerParentedItemModel(TIN_BLOCK, new Identifier(MODID, "block/tin_block"));
        bsGen.registerParentedItemModel(SILVER_BLOCK, new Identifier(MODID, "block/silver_block"));
        bsGen.registerParentedItemModel(MYTHRIL_BLOCK, new Identifier(MODID, "block/mythril_block"));
        bsGen.registerParentedItemModel(BRONZE_BLOCK, new Identifier(MODID, "block/bronze_block"));
        bsGen.registerParentedItemModel(STEEL_BLOCK, new Identifier(MODID, "block/steel_block"));
        bsGen.registerParentedItemModel(HALLOWED_BLOCK, new Identifier(MODID, "block/hallowed_block"));
        bsGen.registerParentedItemModel(RUBY_BLOCK, new Identifier(MODID, "block/ruby_block"));
        bsGen.registerParentedItemModel(RAW_TIN_BLOCK, new Identifier(MODID, "block/raw_tin_block"));
        bsGen.registerParentedItemModel(RAW_SILVER_BLOCK, new Identifier(MODID, "block/raw_silver_block"));
        bsGen.registerParentedItemModel(RAW_MYTHRIL_BLOCK, new Identifier(MODID, "block/raw_mythril_block"));

        bsGen.registerSimpleCubeAll(TIN_ORE);
        bsGen.registerSimpleCubeAll(SILVER_ORE);
        bsGen.registerSimpleCubeAll(MYTHRIL_ORE);
        bsGen.registerSimpleCubeAll(RUBY_ORE);
        bsGen.registerSimpleCubeAll(TIN_BLOCK);
        bsGen.registerSimpleCubeAll(SILVER_BLOCK);
        bsGen.registerSimpleCubeAll(MYTHRIL_BLOCK);
        bsGen.registerSimpleCubeAll(BRONZE_BLOCK);
        bsGen.registerSimpleCubeAll(STEEL_BLOCK);
        bsGen.registerSimpleCubeAll(HALLOWED_BLOCK);
        bsGen.registerSimpleCubeAll(RUBY_BLOCK);
        bsGen.registerSimpleCubeAll(RAW_TIN_BLOCK);
        bsGen.registerSimpleCubeAll(RAW_SILVER_BLOCK);
        bsGen.registerSimpleCubeAll(RAW_MYTHRIL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator iGen) {
        iGen.register(RAW_TIN, Models.GENERATED);
        iGen.register(RAW_SILVER, Models.GENERATED);
        iGen.register(RAW_MYTHRIL, Models.GENERATED);
        iGen.register(RUBY, Models.GENERATED);
        iGen.register(TIN_INGOT, Models.GENERATED);
        iGen.register(SILVER_INGOT, Models.GENERATED);
        iGen.register(MYTHRIL_INGOT, Models.GENERATED);
        iGen.register(BRONZE_INGOT, Models.GENERATED);
        iGen.register(STEEL_INGOT, Models.GENERATED);
        iGen.register(HALLOWED_INGOT, Models.GENERATED);
        iGen.register(TIN_DUST, Models.GENERATED);
        iGen.register(SILVER_DUST, Models.GENERATED);
        iGen.register(MYTHRIL_DUST, Models.GENERATED);
        iGen.register(IRON_DUST, Models.GENERATED);
        iGen.register(COPPER_DUST, Models.GENERATED);
        iGen.register(GOLD_DUST, Models.GENERATED);
        iGen.register(NETHERITE_DUST, Models.GENERATED);
        iGen.register(RAW_BRONZE_DUST, Models.GENERATED);
        iGen.register(RAW_STEEL_DUST, Models.GENERATED);
        iGen.register(RAW_HALLOWED_DUST, Models.GENERATED);

        iGen.register(COPPER_HELMET, Models.GENERATED);
        iGen.register(COPPER_CHESTPLATE, Models.GENERATED);
        iGen.register(COPPER_LEGGINGS, Models.GENERATED);
        iGen.register(COPPER_BOOTS, Models.GENERATED);
        iGen.register(SILVER_HELMET, Models.GENERATED);
        iGen.register(SILVER_CHESTPLATE, Models.GENERATED);
        iGen.register(SILVER_LEGGINGS, Models.GENERATED);
        iGen.register(SILVER_BOOTS, Models.GENERATED);
        iGen.register(BRONZE_HELMET, Models.GENERATED);
        iGen.register(BRONZE_CHESTPLATE, Models.GENERATED);
        iGen.register(BRONZE_LEGGINGS, Models.GENERATED);
        iGen.register(BRONZE_BOOTS, Models.GENERATED);
        iGen.register(MYTHRIL_HELMET, Models.GENERATED);
        iGen.register(MYTHRIL_CHESTPLATE, Models.GENERATED);
        iGen.register(MYTHRIL_LEGGINGS, Models.GENERATED);
        iGen.register(MYTHRIL_BOOTS, Models.GENERATED);
        iGen.register(HALLOWED_HELMET, Models.GENERATED);
        iGen.register(HALLOWED_CHESTPLATE, Models.GENERATED);
        iGen.register(HALLOWED_LEGGINGS, Models.GENERATED);
        iGen.register(HALLOWED_BOOTS, Models.GENERATED);
        iGen.register(STEEL_HELMET, Models.GENERATED);
        iGen.register(STEEL_CHESTPLATE, Models.GENERATED);
        iGen.register(STEEL_LEGGINGS, Models.GENERATED);
        iGen.register(STEEL_BOOTS, Models.GENERATED);
        iGen.register(RUBY_HELMET, Models.GENERATED);
        iGen.register(RUBY_CHESTPLATE, Models.GENERATED);
        iGen.register(RUBY_LEGGINGS, Models.GENERATED);
        iGen.register(RUBY_BOOTS, Models.GENERATED);
        iGen.register(HALLOWED_UPGRADE, Models.GENERATED);

        iGen.register(COPPER_SWORD, Models.HANDHELD);
        iGen.register(COPPER_PICKAXE, Models.HANDHELD);
        iGen.register(COPPER_AXE, Models.HANDHELD);
        iGen.register(COPPER_SHOVEL, Models.HANDHELD);
        iGen.register(COPPER_HOE, Models.HANDHELD);
        iGen.register(SILVER_SWORD, Models.HANDHELD);
        iGen.register(SILVER_PICKAXE, Models.HANDHELD);
        iGen.register(SILVER_AXE, Models.HANDHELD);
        iGen.register(SILVER_SHOVEL, Models.HANDHELD);
        iGen.register(SILVER_HOE, Models.HANDHELD);
        iGen.register(MYTHRIL_SWORD, Models.HANDHELD);
        iGen.register(MYTHRIL_PICKAXE, Models.HANDHELD);
        iGen.register(MYTHRIL_AXE, Models.HANDHELD);
        iGen.register(MYTHRIL_SHOVEL, Models.HANDHELD);
        iGen.register(MYTHRIL_HOE, Models.HANDHELD);
        iGen.register(BRONZE_SWORD, Models.HANDHELD);
        iGen.register(BRONZE_PICKAXE, Models.HANDHELD);
        iGen.register(BRONZE_AXE, Models.HANDHELD);
        iGen.register(BRONZE_SHOVEL, Models.HANDHELD);
        iGen.register(BRONZE_HOE, Models.HANDHELD);
        iGen.register(STEEL_SWORD, Models.HANDHELD);
        iGen.register(STEEL_PICKAXE, Models.HANDHELD);
        iGen.register(STEEL_AXE, Models.HANDHELD);
        iGen.register(STEEL_SHOVEL, Models.HANDHELD);
        iGen.register(STEEL_HOE, Models.HANDHELD);
        iGen.register(HALLOWED_SWORD, Models.HANDHELD);
        iGen.register(HALLOWED_PICKAXE, Models.HANDHELD);
        iGen.register(HALLOWED_AXE, Models.HANDHELD);
        iGen.register(HALLOWED_SHOVEL, Models.HANDHELD);
        iGen.register(HALLOWED_HOE, Models.HANDHELD);
        iGen.register(RUBY_SWORD, Models.HANDHELD);
        iGen.register(RUBY_PICKAXE, Models.HANDHELD);
        iGen.register(RUBY_AXE, Models.HANDHELD);
        iGen.register(RUBY_SHOVEL, Models.HANDHELD);
        iGen.register(RUBY_HOE, Models.HANDHELD);
    }
}