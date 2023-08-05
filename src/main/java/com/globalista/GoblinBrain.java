package com.globalista;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.globalista.block.GBlocks.callBlocks;
import static com.globalista.equipment.GEquipment.callEquipment;
import static com.globalista.item.GItems.callItems;
import static com.globalista.util.GRegister.callItemGroups;
import static com.globalista.util.GWorldGen.*;

public class GoblinBrain implements ModInitializer {

	public static final String MODID = "goblinbrain";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		callWorldGen();
		callBlocks();
		callItems();
		callEquipment();
		callItemGroups();

		LOGGER.info("Goblin Brain has been loaded!");
	}
}