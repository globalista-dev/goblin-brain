package com.globalista.data;

import com.globalista.item.GItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SingleItemRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Util;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.function.Consumer;

import static com.globalista.block.GBlocks.*;
import static com.globalista.item.GItems.*;
import static net.minecraft.item.Items.*;

public class GRecipeProvider extends FabricRecipeProvider {
    public GRecipeProvider(FabricDataOutput generator) {
        super(generator);
    }

    public static final List<ItemConvertible> TIN_SMELTABLE = Util.make(Lists.newArrayList(), list -> {
       list.add(TIN_ORE); list.add(RAW_TIN); list.add(TIN_DUST);});

    public static final List<ItemConvertible> SILVER_SMELTABLE = Util.make(Lists.newArrayList(), list -> {
        list.add(SILVER_ORE); list.add(RAW_TIN); list.add(SILVER_DUST);});

    public static final List<ItemConvertible> MYTHRIL_SMELTABLE = Util.make(Lists.newArrayList(), list -> {
        list.add(MYTHRIL_ORE); list.add(RAW_MYTHRIL); list.add(MYTHRIL_DUST);});

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(RAW_IRON), RecipeCategory.MISC, IRON_DUST);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(RAW_COPPER), RecipeCategory.MISC, COPPER_DUST);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(RAW_GOLD), RecipeCategory.MISC, GOLD_DUST);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(NETHERITE_INGOT), RecipeCategory.MISC, NETHERITE_DUST);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(RAW_TIN), RecipeCategory.MISC, TIN_DUST);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(RAW_MYTHRIL), RecipeCategory.MISC, MYTHRIL_DUST);
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(RAW_SILVER), RecipeCategory.MISC, SILVER_DUST);

        RecipeProvider.offerSmelting(exporter, TIN_SMELTABLE, RecipeCategory.MISC, TIN_INGOT, 0.45F, 200, "tin");
        RecipeProvider.offerSmelting(exporter, SILVER_SMELTABLE, RecipeCategory.MISC, SILVER_INGOT, 0.45F, 300, "silver");
        RecipeProvider.offerSmelting(exporter, MYTHRIL_SMELTABLE, RecipeCategory.MISC, MYTHRIL_INGOT, 0.45F, 400, "mythril");

        RecipeProvider.offerBlasting(exporter, TIN_SMELTABLE, RecipeCategory.MISC, TIN_INGOT, 0.45F, 100, "tin");
        RecipeProvider.offerBlasting(exporter, SILVER_SMELTABLE, RecipeCategory.MISC, SILVER_INGOT, 0.45F, 150, "silver");
        RecipeProvider.offerBlasting(exporter, MYTHRIL_SMELTABLE, RecipeCategory.MISC, MYTHRIL_INGOT, 0.45F, 200, "mythril");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, RAW_BRONZE_DUST)
                .pattern("aab").input('a', COPPER_DUST).input('b',  TIN_DUST)
                .criterion(FabricRecipeProvider.hasItem(COPPER_DUST), FabricRecipeProvider.conditionsFromItem(COPPER_DUST))
                .criterion(FabricRecipeProvider.hasItem(TIN_DUST), FabricRecipeProvider.conditionsFromItem(TIN_DUST))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, RAW_STEEL_DUST)
                .pattern("ab").input('a', IRON_DUST).input('b',  COAL)
                .criterion(FabricRecipeProvider.hasItem(IRON_DUST), FabricRecipeProvider.conditionsFromItem(IRON_DUST))
                .criterion(FabricRecipeProvider.hasItem(COAL), FabricRecipeProvider.conditionsFromItem(COAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, RAW_HALLOWED_DUST)
                .pattern("gms").pattern("ntn").pattern("smg")
                .input('g', GOLD_DUST).input('m',  MYTHRIL_DUST).input('s', SILVER_DUST).input('n', NETHERITE_DUST).input('t', NETHER_STAR)
                .criterion(FabricRecipeProvider.hasItem(COPPER_DUST), FabricRecipeProvider.conditionsFromItem(COPPER_DUST))
                .criterion(FabricRecipeProvider.hasItem(TIN_DUST), FabricRecipeProvider.conditionsFromItem(TIN_DUST))
                .offerTo(exporter);

    }

}
