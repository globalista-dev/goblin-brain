package com.globalista.equipment;

import com.globalista.item.GItems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum GToolMaterials implements ToolMaterial {
    COPPER(1, 162, 4.5F, 1.2F, 9, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    SILVER(2, 88, 12.0F, 1.0F, 19, () -> {
        return Ingredient.ofItems(GItems.SILVER_INGOT);
    }),
    BRONZE(2, 210, 6.2F, 2.0F, 12, () -> {
        return Ingredient.ofItems(GItems.BRONZE_INGOT);
    }),
    STEEL(2, 1102, 7.0F, 2.5F, 14, () -> {
        return Ingredient.ofItems(GItems.STEEL_INGOT);
    }),
    RUBY(3, 689, 7.5F, 2.8F, 13, () -> {
        return Ingredient.ofItems(GItems.RUBY);
    }),
    MYTHRIL(3, 1712, 8.5F, 3.0F, 10, () -> {
        return Ingredient.ofItems(GItems.MYTHRIL_INGOT);
    }),
    HALLOWED(5, 3951, 12.0F, 5.0F, 25, () -> {
        return Ingredient.ofItems(GItems.HALLOWED_INGOT);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private GToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}

