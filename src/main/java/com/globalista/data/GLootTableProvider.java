package com.globalista.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import static com.globalista.block.GBlocks.*;
import static com.globalista.item.GItems.*;

public class GLootTableProvider extends FabricBlockLootTableProvider {
    public GLootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        addDrop(TIN_ORE, drops(RAW_TIN));
        addDropWithSilkTouch(TIN_ORE);
        addDrop(SILVER_ORE, drops(RAW_SILVER));
        addDropWithSilkTouch(SILVER_ORE);
        addDrop(MYTHRIL_ORE, drops(RAW_MYTHRIL));
        addDropWithSilkTouch(MYTHRIL_ORE);
        addDrop(RUBY_ORE, drops(RUBY));
        addDropWithSilkTouch(RUBY_ORE);

        addDrop(TIN_BLOCK);
        addDrop(SILVER_BLOCK);
        addDrop(MYTHRIL_BLOCK);
        addDrop(RUBY_BLOCK);
        addDrop(BRONZE_BLOCK);
        addDrop(STEEL_BLOCK);
        addDrop(HALLOWED_BLOCK);
        addDrop(RAW_TIN_BLOCK);
        addDrop(RAW_SILVER_BLOCK);
        addDrop(RAW_MYTHRIL_BLOCK);
    }


}
