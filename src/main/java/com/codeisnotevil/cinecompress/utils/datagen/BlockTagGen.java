package com.codeisnotevil.cinecompress.utils.datagen;

import com.codeisnotevil.cinecompress.registry.CompressedBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;

public class BlockTagGen extends FabricTagProvider.BlockTagProvider {

    public BlockTagGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {

        // TODO for every CompressedBlock Type add a tag generator a like the one below
        for (Block block : CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
        }
        
        for (Block block : CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
        } 
        

    }
    
}
