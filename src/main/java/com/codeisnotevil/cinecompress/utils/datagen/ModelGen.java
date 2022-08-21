package com.codeisnotevil.cinecompress.utils.datagen;

import java.util.ArrayList;

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
        // all sides are the same
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_COBBLESTONE_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_STONE_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_OBSIDIAN_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_DIORITE_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_ANDESITE_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_GRANITE_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_TUFF_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_CALCITE_BLOCKS, blockStateModelGenerator);

        // pillar like blocks
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS, blockStateModelGenerator);

    }

    /*
     * generates a cube model where evey side has the same (default) texture.
     */
    private void generateSimpleCubeAll(ArrayList<Block> blocks, BlockStateModelGenerator generator){
        for (Block block : blocks) {
            generator.registerSimpleCubeAll(block);
        }
    }

    /*
     * generates a cube model where the top and bottom (_top) have the same texture, the default texture defines the other four sides
     */
    private void generateTopSideCubeAll(ArrayList<Block> blocks, BlockStateModelGenerator generator){
        for (Block block : blocks) {
            generator.registerSingleton(block, TexturedModel.SIDE_END_WALL);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        
    }
    
}
