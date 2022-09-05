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
        
        // Stones
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
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_DRIPSTONE_BLOCK_BLOCKS, blockStateModelGenerator);
        // pillar like blocks
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS, blockStateModelGenerator);
        

        // Dirty
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_DIRT_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_SAND_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_RED_SAND_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_CLAY_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_GRAVEL_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_TERRACOTTA_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_MOSS_BLOCK_BLOCKS, blockStateModelGenerator);

        // Hellish
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_NETHERRACK_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_SOUL_SAND_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_NETHER_BRICKS_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_GLOWSTONE_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_MAGMA_BLOCK_BLOCKS, blockStateModelGenerator);
        generateCubeColum(CompressedBlocks.COMPRESSED_BASALT_BLOCKS, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_BLACKSTONE_BLOCKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_SOUL_SOIL_BLOCKS, blockStateModelGenerator);

        // Endish
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_END_STONE, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_END_STONE_BRICKS, blockStateModelGenerator);
        generateSimpleCubeAll(CompressedBlocks.COMPRESSED_PURPUR_BLOCK, blockStateModelGenerator);

        // Woods
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_OAK_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_STRIPPED_OAK_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_BIRCH_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_STRIPPED_BIRCH_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_SPRUCE_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_STRIPPED_SPRUCE_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_JUNGLE_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_STRIPPED_JUNGLE_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_ACACIA_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_STRIPPED_ACACIA_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_DARK_OAK_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_STRIPPED_DARK_OAK_LOG, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_CRIMSON_STEM, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_STRIPPED_CRIMSON_STEM, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_WARPED_STEM, blockStateModelGenerator);
        generateTopSideCubeAll(CompressedBlocks.COMPRESSED_STRIPPED_WARPED_STEM, blockStateModelGenerator);

    }

    /*
     * generates a cube model where evey side has the same (default) texture.
     */
    private void generateSimpleCubeAll(ArrayList<Block> blocks, BlockStateModelGenerator blockStateModelGenerator){
        for (Block block : blocks) {
            blockStateModelGenerator.registerSimpleCubeAll(block);
        }
    }

    /*
     * generates a cube model where the top and bottom (_top) have the same texture, the default texture defines the other four sides
     */
    private void generateTopSideCubeAll(ArrayList<Block> blocks, BlockStateModelGenerator blockStateModelGenerator){
        for (Block block : blocks) {
            blockStateModelGenerator.registerSingleton(block, TexturedModel.SIDE_END_WALL);
        }
    }

    /*
     * generates a cube model where the top and bottom (_top) have the same texture, the sides (_side) texture defines the other four sides
     */
    private void generateCubeColum(ArrayList<Block> blocks, BlockStateModelGenerator blockStateModelGenerator){
        for (Block block : blocks) {
            blockStateModelGenerator.registerSingleton(block, TexturedModel.CUBE_COLUMN);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        
    }
    
}
