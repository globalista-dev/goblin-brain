package com.globalista.equipment;

import com.globalista.equipment.supplier.GAxeItem;
import com.globalista.equipment.supplier.GHoeItem;
import com.globalista.equipment.supplier.GPickaxeItem;
import net.minecraft.item.*;

import static com.globalista.util.GRegister.GOBLINGROUP;
import static com.globalista.util.GRegister.registerEquipment;

public class GEquipment {

    public static final Item COPPER_HELMET = registerEquipment("copper_helmet", new ArmorItem(GArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item COPPER_CHESTPLATE = registerEquipment("copper_chestplate", new ArmorItem(GArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item COPPER_LEGGINGS = registerEquipment("copper_leggings", new ArmorItem(GArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item COPPER_BOOTS = registerEquipment("copper_boots", new ArmorItem(GArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item BRONZE_HELMET = registerEquipment("bronze_helmet", new ArmorItem(GArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item BRONZE_CHESTPLATE = registerEquipment("bronze_chestplate", new ArmorItem(GArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item BRONZE_LEGGINGS = registerEquipment("bronze_leggings", new ArmorItem(GArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item BRONZE_BOOTS = registerEquipment("bronze_boots", new ArmorItem(GArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item SILVER_HELMET = registerEquipment("silver_helmet", new ArmorItem(GArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item SILVER_CHESTPLATE = registerEquipment("silver_chestplate", new ArmorItem(GArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item SILVER_LEGGINGS = registerEquipment("silver_leggings", new ArmorItem(GArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item SILVER_BOOTS = registerEquipment("silver_boots", new ArmorItem(GArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item STEEL_HELMET = registerEquipment("steel_helmet", new ArmorItem(GArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item STEEL_CHESTPLATE = registerEquipment("steel_chestplate", new ArmorItem(GArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item STEEL_LEGGINGS = registerEquipment("steel_leggings", new ArmorItem(GArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item STEEL_BOOTS = registerEquipment("steel_boots", new ArmorItem(GArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item MYTHRIL_HELMET = registerEquipment("mythril_helmet", new ArmorItem(GArmorMaterials.MYTHRIL, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item MYTHRIL_CHESTPLATE = registerEquipment("mythril_chestplate", new ArmorItem(GArmorMaterials.MYTHRIL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item MYTHRIL_LEGGINGS = registerEquipment("mythril_leggings", new ArmorItem(GArmorMaterials.MYTHRIL, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item MYTHRIL_BOOTS = registerEquipment("mythril_boots", new ArmorItem(GArmorMaterials.MYTHRIL, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item HALLOWED_HELMET = registerEquipment("hallowed_helmet", new ArmorItem(GArmorMaterials.HALLOWED, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item HALLOWED_CHESTPLATE = registerEquipment("hallowed_chestplate", new ArmorItem(GArmorMaterials.HALLOWED, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item HALLOWED_LEGGINGS = registerEquipment("hallowed_leggings", new ArmorItem(GArmorMaterials.HALLOWED, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item HALLOWED_BOOTS = registerEquipment("hallowed_boots", new ArmorItem(GArmorMaterials.HALLOWED, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item RUBY_HELMET = registerEquipment("ruby_helmet", new ArmorItem(GArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item RUBY_CHESTPLATE = registerEquipment("ruby_chestplate", new ArmorItem(GArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item RUBY_LEGGINGS = registerEquipment("ruby_leggings", new ArmorItem(GArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item RUBY_BOOTS = registerEquipment("ruby_boots", new ArmorItem(GArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item COPPER_SWORD = registerEquipment("copper_sword", new SwordItem(GToolMaterials.COPPER, 1, -2.8F, new Item.Settings()));
    public static final Item COPPER_PICKAXE = registerEquipment("copper_pickaxe", new GPickaxeItem(GToolMaterials.COPPER, 1, -2.8F, new Item.Settings()));
    public static final Item COPPER_AXE = registerEquipment("copper_axe", new GAxeItem(GToolMaterials.COPPER, 1, -2.8F, new Item.Settings()));
    public static final Item COPPER_SHOVEL = registerEquipment("copper_shovel", new SwordItem(GToolMaterials.COPPER, 1, -2.8F, new Item.Settings()));
    public static final Item COPPER_HOE = registerEquipment("copper_hoe", new GHoeItem(GToolMaterials.COPPER, 1, -2.8F, new Item.Settings()));

    public static final Item SILVER_SWORD = registerEquipment("silver_sword", new SwordItem(GToolMaterials.SILVER, 1, -2.8F, new Item.Settings()));
    public static final Item SILVER_PICKAXE = registerEquipment("silver_pickaxe", new GPickaxeItem(GToolMaterials.SILVER, 1, -2.8F, new Item.Settings()));
    public static final Item SILVER_AXE = registerEquipment("silver_axe", new GAxeItem(GToolMaterials.SILVER, 1, -2.8F, new Item.Settings()));
    public static final Item SILVER_SHOVEL = registerEquipment("silver_shovel", new ShovelItem(GToolMaterials.SILVER, 1, -2.8F, new Item.Settings()));
    public static final Item SILVER_HOE = registerEquipment("silver_hoe", new GHoeItem(GToolMaterials.SILVER, 1, -2.8F, new Item.Settings()));

    public static final Item BRONZE_SWORD = registerEquipment("bronze_sword", new SwordItem(GToolMaterials.BRONZE, 1, -2.8F, new Item.Settings()));
    public static final Item BRONZE_PICKAXE = registerEquipment("bronze_pickaxe", new GPickaxeItem(GToolMaterials.BRONZE, 1, -2.8F, new Item.Settings()));
    public static final Item BRONZE_AXE = registerEquipment("bronze_axe", new GAxeItem(GToolMaterials.BRONZE, 1, -2.8F, new Item.Settings()));
    public static final Item BRONZE_SHOVEL = registerEquipment("bronze_shovel", new ShovelItem(GToolMaterials.BRONZE, 1, -2.8F, new Item.Settings()));
    public static final Item BRONZE_HOE = registerEquipment("bronze_hoe", new GHoeItem(GToolMaterials.BRONZE, 1, -2.8F, new Item.Settings()));

    public static final Item MYTHRIL_SWORD = registerEquipment("mythril_sword", new SwordItem(GToolMaterials.MYTHRIL, 1, -2.8F, new Item.Settings()));
    public static final Item MYTHRIL_PICKAXE = registerEquipment("mythril_pickaxe", new GPickaxeItem(GToolMaterials.MYTHRIL, 1, -2.8F, new Item.Settings()));
    public static final Item MYTHRIL_AXE = registerEquipment("mythril_axe", new GAxeItem(GToolMaterials.MYTHRIL, 1, -2.8F, new Item.Settings()));
    public static final Item MYTHRIL_SHOVEL = registerEquipment("mythril_shovel", new ShovelItem(GToolMaterials.MYTHRIL, 1, -2.8F, new Item.Settings()));
    public static final Item MYTHRIL_HOE = registerEquipment("mythril_hoe", new GHoeItem(GToolMaterials.MYTHRIL, 1, -2.8F, new Item.Settings()));

    public static final Item STEEL_SWORD = registerEquipment("steel_sword", new SwordItem(GToolMaterials.STEEL, 1, -2.8F, new Item.Settings()));
    public static final Item STEEL_PICKAXE = registerEquipment("steel_pickaxe", new GPickaxeItem(GToolMaterials.STEEL, 1, -2.8F, new Item.Settings()));
    public static final Item STEEL_AXE = registerEquipment("steel_axe", new GAxeItem(GToolMaterials.STEEL, 1, -2.8F, new Item.Settings()));
    public static final Item STEEL_SHOVEL = registerEquipment("steel_shovel", new ShovelItem(GToolMaterials.STEEL, 1, -2.8F, new Item.Settings()));
    public static final Item STEEL_HOE = registerEquipment("steel_hoe", new GHoeItem(GToolMaterials.STEEL, 1, -2.8F, new Item.Settings()));

    public static final Item RUBY_SWORD = registerEquipment("ruby_sword", new SwordItem(GToolMaterials.RUBY, 1, -2.8F, new Item.Settings()));
    public static final Item RUBY_PICKAXE = registerEquipment("ruby_pickaxe", new GPickaxeItem(GToolMaterials.RUBY, 1, -2.8F, new Item.Settings()));
    public static final Item RUBY_AXE = registerEquipment("ruby_axe", new GAxeItem(GToolMaterials.RUBY, 1, -2.8F, new Item.Settings()));
    public static final Item RUBY_SHOVEL = registerEquipment("ruby_shovel", new ShovelItem(GToolMaterials.RUBY, 1, -2.8F, new Item.Settings()));
    public static final Item RUBY_HOE = registerEquipment("ruby_hoe", new GHoeItem(GToolMaterials.RUBY, 1, -2.8F, new Item.Settings()));

    public static final Item HALLOWED_SWORD = registerEquipment("hallowed_sword", new SwordItem(GToolMaterials.HALLOWED, 1, -2.8F, new Item.Settings()));
    public static final Item HALLOWED_PICKAXE = registerEquipment("hallowed_pickaxe", new GPickaxeItem(GToolMaterials.HALLOWED, 1, -2.8F, new Item.Settings()));
    public static final Item HALLOWED_AXE = registerEquipment("hallowed_axe", new GAxeItem(GToolMaterials.HALLOWED, 1, -2.8F, new Item.Settings()));
    public static final Item HALLOWED_SHOVEL = registerEquipment("hallowed_shovel", new ShovelItem(GToolMaterials.HALLOWED, 1, -2.8F, new Item.Settings()));
    public static final Item HALLOWED_HOE = registerEquipment("hallowed_hoe", new GHoeItem(GToolMaterials.HALLOWED, 1, -2.8F, new Item.Settings()));


    public static void callEquipment() {
        System.out.println("Registering GoblinBrain equipment");
    }

}
