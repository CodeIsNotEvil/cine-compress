package com.codeisnotevil.cinecompress.utils.datagen;

import com.codeisnotevil.cinecompress.registry.CompressedBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;

public class ModelGen extends FabricModelProvider{

    public ModelGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


        // TODO for every CompressedBlock Type add a model generator like the one below
        for (Block block : CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS) {
            blockStateModelGenerator.registerSimpleCubeAll(block);
        }

        for (Block block : CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS) {
            blockStateModelGenerator.registerSingleton(block, TexturedModel.SIDE_END_WALL);
        } 

        for (Block block : CompressedBlocks.COMPRESSED_COBBLESTONE_BLOCKS) {
            blockStateModelGenerator.registerSimpleCubeAll(block);
        }

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        
    }
    
}
