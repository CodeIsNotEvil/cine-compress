package com.codeisnotevil.cinecompress.utils.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Generator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        dataGenerator.addProvider(RecipeGen::new);
        dataGenerator.addProvider(ModelGen::new);
        dataGenerator.addProvider(BlockLootTableGen::new);
        dataGenerator.addProvider(BlockTagGen::new);
        
    }
    
}
