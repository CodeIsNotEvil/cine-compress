package com.codeisnotevil.cinecompress.utils.datagen;

import java.util.ArrayList;

import com.codeisnotevil.cinecompress.registry.CompressedBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;

public class BlockLootTableGen extends FabricBlockLootTableProvider{

    protected BlockLootTableGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {

        // Stones
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_COBBLESTONE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_STONE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_OBSIDIAN_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_DIORITE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_ANDESITE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_GRANITE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_TUFF_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_CALCITE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_DRIPSTONE_BLOCK_BLOCKS);

        // Dirty
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_DIRT_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_SAND_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_RED_SAND_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_CLAY_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_GRAVEL_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_TERRACOTTA_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_MOSS_BLOCK_BLOCKS);

        //Hellish
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_NETHERRACK_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_SOUL_SAND_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_NETHER_BRICKS_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_GLOWSTONE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_MAGMA_BLOCK_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_BASALT_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_BLACKSTONE_BLOCKS);
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_SOUL_SOIL_BLOCKS);
        
    }

    private void generateSelfDropLootTableForAll(ArrayList<Block> blocks) {
        for (Block block : blocks) {
            addDrop(block);
        }
    }
    
}
