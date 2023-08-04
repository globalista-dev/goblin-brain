package com.globalista;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.globalista.block.GBlocks.MYTHRIL_ORE;
import static com.globalista.block.GBlocks.callBlocks;
import static com.globalista.item.GItems.callItems;

public class GoblinBrain implements ModInitializer {

	public static final String MODID = "goblinbrain";
    public static final Logger LOGGER = LoggerFactory.getLogger("goblinbrain");

	public static final RegistryKey<ItemGroup> GOBLINGROUP = RegistryKey.of(
			RegistryKeys.ITEM_GROUP, new Identifier(MODID, "goblingroup"));

	@Override
	public void onInitialize() {

		callBlocks();
		callItems();

		Registry.register(Registries.ITEM_GROUP, GOBLINGROUP, FabricItemGroup.builder()
				.icon(() -> new ItemStack(MYTHRIL_ORE))
				.displayName(Text.translatable("itemGroup.goblinbrain.goblingroup"))
				.build());

		LOGGER.info("Goblin Brain has been loaded!");
	}
}