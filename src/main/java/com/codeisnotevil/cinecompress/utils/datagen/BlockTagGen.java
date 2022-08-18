package com.codeisnotevil.cinecompress.utils.datagen;

import java.util.ArrayList;

import com.codeisnotevil.cinecompress.registry.CompressedBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;

public class BlockTagGen extends FabricTagProvider.BlockTagProvider {

    public BlockTagGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        TagKey<Block> pickaxe = BlockTags.PICKAXE_MINEABLE;
        // TagKey<Block> shovel = BlockTags.SHOVEL_MINEABLE;

        TagKey<Block> stone = BlockTags.NEEDS_STONE_TOOL;

        // TODO for every CompressedBlock Type add a tag generator a like the one below
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_COBBLESTONE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_STONE_BLOCKS);
        

    }

    private void generateMineableTags(TagKey<Block> mineableBy, TagKey<Block> neededToolLevel,ArrayList<Block> blocks) {
        for (Block block : blocks) {
            getOrCreateTagBuilder(mineableBy).add(block);
            getOrCreateTagBuilder(neededToolLevel).add(block);
        }
    }
    
}
