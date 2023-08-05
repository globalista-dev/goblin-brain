package com.globalista.data;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.getItemPath;
import static net.minecraft.item.Items.STICK;

public abstract class GRecipeBuilder {

    public static void offerArmorRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible material, ItemConvertible helmet, ItemConvertible chestplate, ItemConvertible leggings, ItemConvertible boots) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, helmet).pattern("iii").pattern("i i").pattern("i i").input('i', material)
                .criterion(FabricRecipeProvider.hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, chestplate)
                .pattern("i i").pattern("iii").pattern("iii").input('i', material)
                .criterion(FabricRecipeProvider.hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, leggings)
                .pattern("iii").pattern("i i").pattern("i i").input('i', material)
                .criterion(FabricRecipeProvider.hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, boots)
                .pattern("i i").pattern("i i").input('i', material)
                .criterion(FabricRecipeProvider.hasItem(material), conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void offerSetUpgrade(Consumer<RecipeJsonProvider> exporter, ItemConvertible upgrade, Item material, Item helmet_in, Item chestplate_in, Item leggings_in, Item boots_in, Item helmet_out, Item chestplate_out, Item leggings_out, Item boots_out, Item sword_in, Item pickaxe_in, Item axe_in, Item shovel_in, Item hoe_in, Item sword_out, Item pickaxe_out, Item axe_out, Item shovel_out, Item hoe_out) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(helmet_in), Ingredient.ofItems(material),
                RecipeCategory.COMBAT, helmet_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(helmet_out) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(chestplate_in), Ingredient.ofItems(material),
                RecipeCategory.COMBAT, chestplate_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(chestplate_out) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(leggings_in), Ingredient.ofItems(material),
                RecipeCategory.COMBAT, leggings_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(leggings_out) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(boots_in), Ingredient.ofItems(material),
                RecipeCategory.COMBAT, boots_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(boots_out) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(sword_in), Ingredient.ofItems(material),
                RecipeCategory.COMBAT, sword_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(sword_out) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(pickaxe_in), Ingredient.ofItems(material),
                RecipeCategory.TOOLS, pickaxe_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(pickaxe_out) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(axe_in), Ingredient.ofItems(material),
                RecipeCategory.TOOLS, axe_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(axe_out) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(shovel_in), Ingredient.ofItems(material),
                RecipeCategory.TOOLS, shovel_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(shovel_out) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(upgrade),
                Ingredient.ofItems(hoe_in), Ingredient.ofItems(material),
                RecipeCategory.TOOLS, hoe_out).criterion("has_" + material.toString().toLowerCase(),
                conditionsFromItem(material)).offerTo(exporter, getItemPath(hoe_out) + "_smithing");

    }

    public static void offerMaterialCompactingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible material, ItemConvertible block) {
        RecipeProvider.offerCompactingRecipe(exporter, RecipeCategory.DECORATIONS, block, material);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, material, 9).input(block).criterion(FabricRecipeProvider.hasItem(block), FabricRecipeProvider.conditionsFromItem(block)).offerTo(exporter, getItemPath(material) + "_from_" + getItemPath(block));
    }

    public static void offerDustRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible material, ItemConvertible dust) {
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(material), RecipeCategory.MISC, dust).criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material));
    }



    public static void offerToolsetRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible material, ItemConvertible sword, ItemConvertible pickaxe, ItemConvertible axe, ItemConvertible shovel, ItemConvertible hoe) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, sword).pattern(" m ").pattern(" m ").pattern(" s ").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxe).pattern("mmm").pattern(" s ").pattern(" s ").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe).pattern(" mm").pattern(" sm").pattern(" s ").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe).pattern("mm ").pattern("ms ").pattern(" s ").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter, getItemPath(axe) + "_left");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel).pattern(" m ").pattern(" s ").pattern(" s ").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel).pattern("m  ").pattern("s  ").pattern("s  ").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter, getItemPath(shovel) + "_left");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel).pattern("  m").pattern("  s").pattern("  s").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter, getItemPath(shovel) + "_right");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe).pattern(" mm").pattern(" s ").pattern(" s ").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter, getItemPath(hoe) + "_right");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe).pattern("mm ").pattern(" s ").pattern(" s ").input('m', material).input('s', STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material)).offerTo(exporter);

    }

    public static void offerFullSetRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible material, ItemConvertible sword, ItemConvertible pickaxe, ItemConvertible axe, ItemConvertible shovel, ItemConvertible hoe, ItemConvertible helmet, ItemConvertible chestplate, ItemConvertible leggings, ItemConvertible boots) {
        offerToolsetRecipe(exporter, material, sword, pickaxe, axe, shovel, hoe);
        offerArmorRecipe(exporter, material, helmet, chestplate, leggings, boots);
    }

}
