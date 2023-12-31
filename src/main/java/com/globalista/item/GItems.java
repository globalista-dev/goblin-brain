package com.globalista.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import static com.globalista.util.GRegister.GOBLINGROUP;
import static com.globalista.util.GRegister.registerItem;

public class GItems {

    //Raw ores
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new FabricItemSettings()));

    //Gems
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    //Ingots
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item HALLOWED_INGOT = registerItem("hallowed_ingot", new Item(new FabricItemSettings()));

    // Dusts
    public static final Item COPPER_DUST = registerItem("copper_dust", new Item(new FabricItemSettings()));
    public static final Item IRON_DUST = registerItem("iron_dust", new Item(new FabricItemSettings()));
    public static final Item GOLD_DUST = registerItem("gold_dust", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_DUST = registerItem("netherite_dust", new Item(new FabricItemSettings()));
    public static final Item TIN_DUST = registerItem("tin_dust", new Item(new FabricItemSettings()));
    public static final Item SILVER_DUST = registerItem("silver_dust", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_DUST = registerItem("mythril_dust", new Item(new FabricItemSettings()));
    public static final Item RAW_BRONZE_DUST = registerItem("raw_bronze_dust", new Item(new FabricItemSettings()));
    public static final Item RAW_STEEL_DUST = registerItem("raw_steel_dust", new Item(new FabricItemSettings()));
    public static final Item RAW_HALLOWED_DUST = registerItem("raw_hallowed_dust", new Item(new FabricItemSettings()));

    //Other items
    public static final Item HALLOWED_UPGRADE = registerItem("hallowed_upgrade", new Item(new FabricItemSettings()));

    public static void callItems() {
        System.out.println("Registering GoblinBrain items");
    }

}
