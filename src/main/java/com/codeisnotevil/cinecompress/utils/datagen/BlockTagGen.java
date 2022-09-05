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
        TagKey<Block> shovel = BlockTags.SHOVEL_MINEABLE;
        TagKey<Block> hoe = BlockTags.HOE_MINEABLE;
        TagKey<Block> axe = BlockTags.AXE_MINEABLE;

        TagKey<Block> stone = BlockTags.NEEDS_STONE_TOOL;
        TagKey<Block> diamond = BlockTags.NEEDS_DIAMOND_TOOL;

        // Stones
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_COBBLESTONE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_STONE_BLOCKS);
        generateMineableTags(pickaxe, diamond, CompressedBlocks.COMPRESSED_OBSIDIAN_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_DIORITE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_ANDESITE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_GRANITE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_TUFF_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_CALCITE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_DRIPSTONE_BLOCK_BLOCKS);

        // Dirty
        generateMineableTags(shovel, stone, CompressedBlocks.COMPRESSED_DIRT_BLOCKS);
        generateMineableTags(shovel, stone, CompressedBlocks.COMPRESSED_SAND_BLOCKS);
        generateMineableTags(shovel, stone, CompressedBlocks.COMPRESSED_RED_SAND_BLOCKS);
        generateMineableTags(shovel, stone, CompressedBlocks.COMPRESSED_CLAY_BLOCKS);
        generateMineableTags(shovel, stone, CompressedBlocks.COMPRESSED_GRAVEL_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_TERRACOTTA_BLOCKS);
        generateMineableTags(hoe, stone, CompressedBlocks.COMPRESSED_MOSS_BLOCK_BLOCKS);

        // Hellish
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_NETHERRACK_BLOCKS);
        generateMineableTags(shovel, stone, CompressedBlocks.COMPRESSED_SOUL_SAND_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_NETHER_BRICKS_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_GLOWSTONE_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_MAGMA_BLOCK_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_BASALT_BLOCKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_BLACKSTONE_BLOCKS);
        generateMineableTags(shovel, stone, CompressedBlocks.COMPRESSED_SOUL_SOIL_BLOCKS);

        // Endish
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_END_STONE);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_END_STONE_BRICKS);
        generateMineableTags(pickaxe, stone, CompressedBlocks.COMPRESSED_PURPUR_BLOCK);

        // Woods
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_OAK_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_STRIPPED_OAK_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_BIRCH_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_STRIPPED_BIRCH_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_SPRUCE_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_STRIPPED_SPRUCE_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_JUNGLE_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_STRIPPED_JUNGLE_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_ACACIA_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_STRIPPED_ACACIA_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_DARK_OAK_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_STRIPPED_DARK_OAK_LOG);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_CRIMSON_STEM);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_STRIPPED_CRIMSON_STEM);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_WARPED_STEM);
        generateMineableTags(axe, stone, CompressedBlocks.COMPRESSED_STRIPPED_WARPED_STEM);


    }

    private void generateMineableTags(TagKey<Block> mineableBy, TagKey<Block> neededToolLevel,ArrayList<Block> blocks) {
        for (Block block : blocks) {
            getOrCreateTagBuilder(mineableBy).add(block);
            getOrCreateTagBuilder(neededToolLevel).add(block);
        }
    }
    
}
