package com.globalista.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

import static com.globalista.GoblinBrain.MODID;
import static com.globalista.block.GBlocks.*;
import static com.globalista.equipment.GEquipment.*;
import static com.globalista.item.GItems.*;
import static net.minecraft.item.Items.*;

public class GRecipeProvider extends FabricRecipeProvider {
    public GRecipeProvider(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    protected Identifier getRecipeIdentifier(Identifier identifier) {
        return new Identifier(MODID, identifier.getPath());
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //Dust recipes
        GRecipeBuilder.offerDustRecipe(exporter, RAW_IRON, IRON_DUST);
        GRecipeBuilder.offerDustRecipe(exporter, RAW_COPPER, COPPER_DUST);
        GRecipeBuilder.offerDustRecipe(exporter, RAW_GOLD, GOLD_DUST);
        GRecipeBuilder.offerDustRecipe(exporter, NETHERITE_INGOT, NETHERITE_DUST);
        GRecipeBuilder.offerDustRecipe(exporter, RAW_TIN, TIN_DUST);
        GRecipeBuilder.offerDustRecipe(exporter, RAW_MYTHRIL, MYTHRIL_DUST);
        GRecipeBuilder.offerDustRecipe(exporter, RAW_SILVER, SILVER_DUST);

        //Smelting recipes
        RecipeProvider.offerSmelting(exporter, List.of(TIN_ORE, RAW_TIN), RecipeCategory.MISC, TIN_INGOT, 0.45F, 200, "tin");
        RecipeProvider.offerSmelting(exporter, List.of(RUBY_ORE), RecipeCategory.MISC, RUBY, 0.45F, 200, "ruby");
        RecipeProvider.offerSmelting(exporter, List.of(SILVER_ORE, RAW_SILVER), RecipeCategory.MISC, SILVER_INGOT, 0.45F, 300, "silver");
        RecipeProvider.offerSmelting(exporter, List.of(MYTHRIL_ORE, RAW_MYTHRIL), RecipeCategory.MISC, MYTHRIL_INGOT, 0.45F, 400, "mythril");

        RecipeProvider.offerBlasting(exporter, List.of(TIN_ORE, RAW_TIN), RecipeCategory.MISC, TIN_INGOT, 0.45F, 100, "tin");
        RecipeProvider.offerBlasting(exporter, List.of(RUBY_ORE), RecipeCategory.MISC, RUBY, 0.45F, 100, "ruby");
        RecipeProvider.offerBlasting(exporter, List.of(SILVER_ORE, RAW_SILVER), RecipeCategory.MISC, SILVER_INGOT, 0.45F, 150, "silver");
        RecipeProvider.offerBlasting(exporter, List.of(MYTHRIL_ORE, RAW_MYTHRIL), RecipeCategory.MISC, MYTHRIL_INGOT, 0.45F, 200, "mythril");

        RecipeProvider.offerSmelting(exporter, List.of(TIN_DUST), RecipeCategory.MISC, TIN_INGOT, 0, 200, "dust_resmelting");
        RecipeProvider.offerSmelting(exporter, List.of(SILVER_DUST), RecipeCategory.MISC, SILVER_INGOT, 0, 300, "dust_resmelting");
        RecipeProvider.offerSmelting(exporter, List.of(MYTHRIL_DUST), RecipeCategory.MISC, MYTHRIL_INGOT, 0, 400, "dust_resmelting");
        RecipeProvider.offerSmelting(exporter, List.of(NETHERITE_DUST), RecipeCategory.MISC, NETHERITE_INGOT, 0, 400, "dust_resmelting");
        RecipeProvider.offerSmelting(exporter, List.of(IRON_DUST), RecipeCategory.MISC, IRON_INGOT, 0, 200, "dust_resmelting");
        RecipeProvider.offerSmelting(exporter, List.of(COPPER_DUST), RecipeCategory.MISC, COPPER_INGOT, 0, 200, "dust_resmelting");
        RecipeProvider.offerSmelting(exporter, List.of(GOLD_DUST), RecipeCategory.MISC, GOLD_INGOT, 0, 200, "dust_resmelting");

        RecipeProvider.offerBlasting(exporter, List.of(TIN_DUST), RecipeCategory.MISC, TIN_INGOT, 0, 100, "dust_resmelting");
        RecipeProvider.offerBlasting(exporter, List.of(SILVER_DUST), RecipeCategory.MISC, SILVER_INGOT, 0, 150, "dust_resmelting");
        RecipeProvider.offerBlasting(exporter, List.of(MYTHRIL_DUST), RecipeCategory.MISC, MYTHRIL_INGOT, 0, 200, "dust_resmelting");
        RecipeProvider.offerBlasting(exporter, List.of(NETHERITE_DUST), RecipeCategory.MISC, NETHERITE_INGOT, 0, 200, "dust_resmelting");
        RecipeProvider.offerBlasting(exporter, List.of(IRON_DUST), RecipeCategory.MISC, IRON_INGOT, 0, 100, "dust_resmelting");
        RecipeProvider.offerBlasting(exporter, List.of(COPPER_DUST), RecipeCategory.MISC, COPPER_INGOT, 0, 100, "dust_resmelting");
        RecipeProvider.offerBlasting(exporter, List.of(GOLD_DUST), RecipeCategory.MISC, GOLD_INGOT, 0, 100, "dust_resmelting");

        //Alloy dust crafting
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, RAW_BRONZE_DUST, 3)
                .pattern("aab").input('a', COPPER_DUST).input('b',  TIN_DUST)
                .criterion(FabricRecipeProvider.hasItem(COPPER_DUST), FabricRecipeProvider.conditionsFromItem(COPPER_DUST))
                .criterion(FabricRecipeProvider.hasItem(TIN_DUST), FabricRecipeProvider.conditionsFromItem(TIN_DUST))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, RAW_STEEL_DUST, 2)
                .pattern("ab").input('a', IRON_DUST).input('b',  COAL)
                .criterion(FabricRecipeProvider.hasItem(IRON_DUST), FabricRecipeProvider.conditionsFromItem(IRON_DUST))
                .criterion(FabricRecipeProvider.hasItem(COAL), FabricRecipeProvider.conditionsFromItem(COAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, RAW_HALLOWED_DUST, 4)
                .pattern("sg").pattern("nm")
                .input('g', GOLD_DUST).input('m',  MYTHRIL_DUST).input('s', SILVER_DUST).input('n', NETHERITE_DUST)
                .criterion(FabricRecipeProvider.hasItem(GOLD_DUST), FabricRecipeProvider.conditionsFromItem(GOLD_DUST))
                .criterion(FabricRecipeProvider.hasItem(MYTHRIL_DUST), FabricRecipeProvider.conditionsFromItem(MYTHRIL_DUST))
                .criterion(FabricRecipeProvider.hasItem(SILVER_DUST), FabricRecipeProvider.conditionsFromItem(SILVER_DUST))
                .criterion(FabricRecipeProvider.hasItem(NETHERITE_DUST), FabricRecipeProvider.conditionsFromItem(NETHERITE_DUST))
                .offerTo(exporter);

        //Compacting
        GRecipeBuilder.offerMaterialCompactingRecipe(exporter, BRONZE_BLOCK, BRONZE_INGOT);
        GRecipeBuilder.offerMaterialCompactingRecipe(exporter, SILVER_BLOCK, SILVER_INGOT);
        GRecipeBuilder.offerMaterialCompactingRecipe(exporter, MYTHRIL_BLOCK, MYTHRIL_INGOT);
        GRecipeBuilder.offerMaterialCompactingRecipe(exporter, HALLOWED_BLOCK, HALLOWED_INGOT);
        GRecipeBuilder.offerMaterialCompactingRecipe(exporter, STEEL_BLOCK, STEEL_INGOT);
        GRecipeBuilder.offerMaterialCompactingRecipe(exporter, TIN_BLOCK, TIN_INGOT);
        GRecipeBuilder.offerMaterialCompactingRecipe(exporter, RUBY_BLOCK, RUBY);


        //Alloy smelting
        RecipeProvider.offerBlasting(exporter, List.of(RAW_BRONZE_DUST), RecipeCategory.MISC, BRONZE_INGOT, 0.5F, 150, "alloy_smelting");
        RecipeProvider.offerBlasting(exporter, List.of(RAW_STEEL_DUST), RecipeCategory.MISC, STEEL_INGOT, 0.7F, 200, "alloy_smelting");
        RecipeProvider.offerBlasting(exporter, List.of(RAW_HALLOWED_DUST), RecipeCategory.MISC, HALLOWED_INGOT, 1.5F, 300, "alloy_smelting");

        //Armor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, HALLOWED_UPGRADE)
                .pattern("ghg").pattern("hrh").pattern("ghg")
                .input('g', GOLD_INGOT).input('h',  HALLOWED_INGOT).input('r', RUBY)
                .criterion(FabricRecipeProvider.hasItem(HALLOWED_INGOT), FabricRecipeProvider.conditionsFromItem(HALLOWED_INGOT))
                .offerTo(exporter);

        GRecipeBuilder.offerSetUpgrade(exporter, HALLOWED_UPGRADE, HALLOWED_INGOT,
                NETHERITE_HELMET, NETHERITE_CHESTPLATE, NETHERITE_LEGGINGS, NETHERITE_BOOTS,
                HALLOWED_HELMET, HALLOWED_CHESTPLATE, HALLOWED_LEGGINGS, HALLOWED_BOOTS,
                NETHERITE_SWORD, NETHERITE_PICKAXE, NETHERITE_AXE, NETHERITE_SHOVEL, NETHERITE_HOE,
                HALLOWED_SWORD, HALLOWED_PICKAXE, HALLOWED_AXE, HALLOWED_SHOVEL, HALLOWED_HOE);

        GRecipeBuilder.offerArmorRecipe(exporter, RUBY, RUBY_HELMET, RUBY_CHESTPLATE, RUBY_LEGGINGS, RUBY_BOOTS);
        GRecipeBuilder.offerArmorRecipe(exporter, COPPER_INGOT, COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS);
        GRecipeBuilder.offerArmorRecipe(exporter, SILVER_INGOT, SILVER_HELMET, SILVER_CHESTPLATE, SILVER_LEGGINGS, SILVER_BOOTS);
        GRecipeBuilder.offerArmorRecipe(exporter, MYTHRIL_INGOT, MYTHRIL_HELMET, MYTHRIL_CHESTPLATE, MYTHRIL_LEGGINGS, MYTHRIL_BOOTS);
        GRecipeBuilder.offerArmorRecipe(exporter, STEEL_INGOT, STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS);
        GRecipeBuilder.offerArmorRecipe(exporter, BRONZE_INGOT, BRONZE_HELMET, BRONZE_CHESTPLATE, BRONZE_LEGGINGS, BRONZE_BOOTS);

        //Toolsets

        GRecipeBuilder.offerToolsetRecipe(exporter, RUBY, RUBY_SWORD, RUBY_PICKAXE, RUBY_AXE, RUBY_SHOVEL, RUBY_HOE);
        GRecipeBuilder.offerToolsetRecipe(exporter, COPPER_INGOT, COPPER_SWORD, COPPER_PICKAXE, COPPER_AXE, COPPER_SHOVEL, COPPER_HOE);
        GRecipeBuilder.offerToolsetRecipe(exporter, SILVER_INGOT, SILVER_SWORD, SILVER_PICKAXE, SILVER_AXE, SILVER_SHOVEL, SILVER_HOE);
        GRecipeBuilder.offerToolsetRecipe(exporter, MYTHRIL_INGOT, MYTHRIL_SWORD, MYTHRIL_PICKAXE, MYTHRIL_AXE, MYTHRIL_SHOVEL, MYTHRIL_HOE);
        GRecipeBuilder.offerToolsetRecipe(exporter, STEEL_INGOT, STEEL_SWORD, STEEL_PICKAXE, STEEL_AXE, STEEL_SHOVEL, STEEL_HOE);
        GRecipeBuilder.offerToolsetRecipe(exporter, BRONZE_INGOT, BRONZE_SWORD, BRONZE_PICKAXE, BRONZE_AXE, BRONZE_SHOVEL, BRONZE_HOE);

    }

}
