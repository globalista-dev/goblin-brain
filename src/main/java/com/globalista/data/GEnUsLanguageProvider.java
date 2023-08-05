package com.globalista.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static com.globalista.block.GBlocks.*;
import static com.globalista.equipment.GEquipment.*;
import static com.globalista.item.GItems.*;

public class GEnUsLanguageProvider extends FabricLanguageProvider {
    public GEnUsLanguageProvider(FabricDataOutput output) {
        super(output, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder t) {
        t.add("itemGroup.goblinbrain.goblingroup", "Goblin Brain!!");
        t.add(TIN_ORE, "Tin Ore");
        t.add(SILVER_ORE, "Silver Ore");
        t.add(MYTHRIL_ORE, "Mythril Ore");
        t.add(TIN_BLOCK, "Tin Block");
        t.add(SILVER_BLOCK, "Silver Block");
        t.add(MYTHRIL_BLOCK, "Mythril Block");
        t.add(BRONZE_BLOCK, "Bronze Block");
        t.add(STEEL_BLOCK, "Steel Block");
        t.add(HALLOWED_BLOCK, "Hallowed Block");
        t.add(RAW_MYTHRIL_BLOCK, "Raw Mythril Block");
        t.add(RAW_SILVER_BLOCK, "Raw Silver Block");
        t.add(RAW_TIN_BLOCK, "Raw Tin Block");
        t.add(RUBY_BLOCK, "Ruby Block");
        t.add(RUBY_ORE, "Ruby Ore");
        t.add(RAW_TIN, "Raw Tin");
        t.add(RAW_SILVER, "Raw Silver");
        t.add(RAW_MYTHRIL, "Raw Mythril");
        t.add(RUBY, "Ruby");
        t.add(TIN_INGOT, "Tin Ingot");
        t.add(SILVER_INGOT, "Silver Ingot");
        t.add(MYTHRIL_INGOT, "Mythril Ingot");
        t.add(BRONZE_INGOT, "Bronze Ingot");
        t.add(STEEL_INGOT, "Steel Ingot");
        t.add(HALLOWED_INGOT, "Hallowed Ingot");
        t.add(COPPER_DUST, "Copper Dust");
        t.add(IRON_DUST, "Iron Dust");
        t.add(GOLD_DUST, "Gold Dust");
        t.add(NETHERITE_DUST, "Netherite Dust");
        t.add(TIN_DUST, "Tin Dust");
        t.add(SILVER_DUST, "Silver Dust");
        t.add(MYTHRIL_DUST, "Mythril Dust");
        t.add(RAW_BRONZE_DUST, "Raw Bronze Dust");
        t.add(RAW_STEEL_DUST, "Raw Steel Dust");
        t.add(RAW_HALLOWED_DUST, "Raw Hallowed Dust");
        t.add(COPPER_HELMET, "Copper Helmet");
        t.add(COPPER_CHESTPLATE, "Copper Chestplate");
        t.add(COPPER_LEGGINGS, "Copper Leggings");
        t.add(COPPER_BOOTS, "Copper Boots");
        t.add(SILVER_HELMET, "Silver Helmet");
        t.add(SILVER_CHESTPLATE, "Silver Chestplate");
        t.add(SILVER_LEGGINGS, "Silver Leggings");
        t.add(SILVER_BOOTS, "Silver Boots");
        t.add(BRONZE_HELMET, "Bronze Helmet");
        t.add(BRONZE_CHESTPLATE, "Bronze Chestplate");
        t.add(BRONZE_LEGGINGS, "Bronze Leggings");
        t.add(BRONZE_BOOTS, "Bronze Boots");
        t.add(MYTHRIL_HELMET, "Mythril Helmet");
        t.add(MYTHRIL_CHESTPLATE, "Mythril Chestplate");
        t.add(MYTHRIL_LEGGINGS, "Mythril Leggings");
        t.add(MYTHRIL_BOOTS, "Mythril Boots");
        t.add(STEEL_HELMET, "Steel Helmet");
        t.add(STEEL_CHESTPLATE, "Steel Chestplate");
        t.add(STEEL_LEGGINGS, "Steel Leggings");
        t.add(STEEL_BOOTS, "Steel Boots");
        t.add(HALLOWED_HELMET, "Hallowed Helmet");
        t.add(HALLOWED_CHESTPLATE, "Hallowed Chestplate");
        t.add(HALLOWED_LEGGINGS, "Hallowed Leggings");
        t.add(HALLOWED_BOOTS, "Hallowed Boots");
        t.add(RUBY_HELMET, "Ruby Helmet");
        t.add(RUBY_CHESTPLATE, "Ruby Chestplate");
        t.add(RUBY_LEGGINGS, "Ruby Leggings");
        t.add(RUBY_BOOTS, "Ruby Boots");
        t.add(HALLOWED_UPGRADE, "Hallowed Upgrade");

    }


}
