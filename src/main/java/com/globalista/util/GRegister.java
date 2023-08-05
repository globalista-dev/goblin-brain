package com.globalista.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.globalista.GoblinBrain.MODID;
import static com.globalista.block.GBlocks.MYTHRIL_ORE;

public class GRegister {

    public static Item registerEquipment(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(GOBLINGROUP).register(content -> content.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MODID, name), item);
    }

    public static Item registerItem(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(GOBLINGROUP).register(content -> content.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MODID, name), item);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MODID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(GOBLINGROUP).register(content -> content.add(block));
        return item;
    }

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MODID, name), block);
    }

    public static final RegistryKey<ItemGroup> GOBLINGROUP = RegistryKey.of(
            RegistryKeys.ITEM_GROUP, new Identifier(MODID, "goblingroup"));

    public static void callItemGroups() {
        Registry.register(Registries.ITEM_GROUP, GOBLINGROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MYTHRIL_ORE))
                .displayName(Text.translatable("itemGroup.goblinbrain.goblingroup"))
                .build());
    }

}
