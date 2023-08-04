package com.globalista.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class GData implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var data = fabricDataGenerator.createPack();
        data.addProvider(GModelProvider::new);
        data.addProvider(GRecipeProvider::new);
    }
}
