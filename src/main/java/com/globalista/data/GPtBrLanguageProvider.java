package com.globalista.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static com.globalista.block.GBlocks.*;
import static com.globalista.equipment.GEquipment.*;
import static com.globalista.item.GItems.*;

public class GPtBrLanguageProvider extends FabricLanguageProvider {
    public GPtBrLanguageProvider(FabricDataOutput output) {
        super(output, "pt_br");
    }

    @Override
    public void generateTranslations(TranslationBuilder t) {
        t.add("itemGroup.goblinbrain.goblingroup", "Goblin Brain!!");
        t.add(TIN_ORE, "Minério de estanho");
        t.add(SILVER_ORE, "Minério de prata");
        t.add(MYTHRIL_ORE, "Minério de mithril");
        t.add(TIN_BLOCK, "Bloco de estanho");
        t.add(SILVER_BLOCK, "Bloco de prata");
        t.add(MYTHRIL_BLOCK, "Bloco de mithril");
        t.add(BRONZE_BLOCK, "Bloco de bronze");
        t.add(STEEL_BLOCK, "Bloco de aço");
        t.add(HALLOWED_BLOCK, "Bloco de ferro-santo");
        t.add(RAW_MYTHRIL_BLOCK, "Bloco de mithril bruto");
        t.add(RAW_SILVER_BLOCK, "Bloco de prata bruta");
        t.add(RAW_TIN_BLOCK, "Bloco de estanho bruto");
        t.add(RUBY_BLOCK, "Bloco de rubi");
        t.add(RUBY_ORE, "Minério de rubi");
        t.add(RAW_TIN, "Estanho bruto");
        t.add(RAW_SILVER, "Prata bruta");
        t.add(RAW_MYTHRIL, "Mithril bruto");
        t.add(RUBY, "Rubi");
        t.add(TIN_INGOT, "Barra de estanho");
        t.add(SILVER_INGOT, "Barra de prata");
        t.add(MYTHRIL_INGOT, "Barra de mithril");
        t.add(BRONZE_INGOT, "Barra de bronze");
        t.add(STEEL_INGOT, "Barra de aço");
        t.add(HALLOWED_INGOT, "Barra de ferro-santo");
        t.add(COPPER_DUST, "Barra de cobre");
        t.add(IRON_DUST, "Pó de ferro");
        t.add(GOLD_DUST, "Pó de ouro");
        t.add(NETHERITE_DUST, "Pó de netherita");
        t.add(TIN_DUST, "Pó de estanho");
        t.add(SILVER_DUST, "Pó de prata");
        t.add(MYTHRIL_DUST, "Pó de mithril");
        t.add(RAW_BRONZE_DUST, "Pó bruto de bronze");
        t.add(RAW_STEEL_DUST, "Pó bruto de aço");
        t.add(RAW_HALLOWED_DUST, "Pó bruto de ferro-santo");
        t.add(COPPER_HELMET, "Capacete de cobre");
        t.add(COPPER_CHESTPLATE, "Peitoral de cobre");
        t.add(COPPER_LEGGINGS, "Calças de cobre");
        t.add(COPPER_BOOTS, "Botas de cobre");
        t.add(SILVER_HELMET, "Capacete de prata");
        t.add(SILVER_CHESTPLATE, "Peitoral de prata");
        t.add(SILVER_LEGGINGS, "Calças de prata");
        t.add(SILVER_BOOTS, "Botas de prata");
        t.add(BRONZE_HELMET, "Capacete de bronze");
        t.add(BRONZE_CHESTPLATE, "Peitoral de bronze");
        t.add(BRONZE_LEGGINGS, "Calças de bronze");
        t.add(BRONZE_BOOTS, "Botas de bronze");
        t.add(MYTHRIL_HELMET, "Capacete de mithril");
        t.add(MYTHRIL_CHESTPLATE, "Peitoral de mithril");
        t.add(MYTHRIL_LEGGINGS, "Calças de mithril");
        t.add(MYTHRIL_BOOTS, "Botas de mithril");
        t.add(STEEL_HELMET, "Capacete de aço");
        t.add(STEEL_CHESTPLATE, "Peitoral de aço");
        t.add(STEEL_LEGGINGS, "Calças de aço");
        t.add(STEEL_BOOTS, "Botas de aço");
        t.add(HALLOWED_HELMET, "Capacete de ferro-santo");
        t.add(HALLOWED_CHESTPLATE, "Peitoral de ferro-santo");
        t.add(HALLOWED_LEGGINGS, "Calças de ferro-santo");
        t.add(HALLOWED_BOOTS, "Botas de ferro-santo");
        t.add(RUBY_HELMET, "Capacete de rubi");
        t.add(RUBY_CHESTPLATE, "Peitoral de rubi");
        t.add(RUBY_LEGGINGS, "Calças de rubi");
        t.add(RUBY_BOOTS, "Botas de rubi");
        t.add(HALLOWED_UPGRADE, "Melhoria de ferro-santo");
    }


}
