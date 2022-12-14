package com.codeisnotevil.cinecompress.utils.datagen;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.codeisnotevil.cinecompress.registry.CompressedBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class RecipeGen extends FabricRecipeProvider{

    public RecipeGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

        // Stones
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS, Items.COBBLED_DEEPSLATE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS, Items.DEEPSLATE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_COBBLESTONE_BLOCKS, Items.COBBLESTONE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STONE_BLOCKS, Items.STONE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_OBSIDIAN_BLOCKS, Items.OBSIDIAN, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_DIORITE_BLOCKS, Items.DIORITE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_ANDESITE_BLOCKS, Items.ANDESITE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_GRANITE_BLOCKS, Items.GRANITE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_TUFF_BLOCKS, Items.TUFF, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_CALCITE_BLOCKS, Items.CALCITE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_DRIPSTONE_BLOCK_BLOCKS, Items.DRIPSTONE_BLOCK, exporter);

        // Dirty
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_DIRT_BLOCKS, Items.DIRT, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_SAND_BLOCKS, Items.SAND, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_RED_SAND_BLOCKS, Items.RED_SAND, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_CLAY_BLOCKS, Items.CLAY, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_GRAVEL_BLOCKS, Items.GRAVEL, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_TERRACOTTA_BLOCKS, Items.TERRACOTTA, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_MOSS_BLOCK_BLOCKS, Items.MOSS_BLOCK, exporter);

        // Hellish
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_NETHERRACK_BLOCKS, Items.NETHERRACK, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_SOUL_SAND_BLOCKS, Items.SOUL_SAND, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_NETHER_BRICKS_BLOCKS, Items.NETHER_BRICKS, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_GLOWSTONE_BLOCKS, Items.GLOWSTONE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_MAGMA_BLOCK_BLOCKS, Items.MAGMA_BLOCK, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_BASALT_BLOCKS, Items.BASALT, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_BLACKSTONE_BLOCKS, Items.BLACKSTONE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_SOUL_SOIL_BLOCKS, Items.SOUL_SOIL, exporter);

        // Endish
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_END_STONE, Items.END_STONE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_END_STONE_BRICKS, Items.END_STONE_BRICKS, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_PURPUR_BLOCK, Items.PURPUR_BLOCK, exporter);

        // Woods
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_OAK_LOG, Items.OAK_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STRIPPED_OAK_LOG, Items.STRIPPED_OAK_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_BIRCH_LOG, Items.BIRCH_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STRIPPED_BIRCH_LOG, Items.STRIPPED_BIRCH_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_SPRUCE_LOG, Items.SPRUCE_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STRIPPED_SPRUCE_LOG, Items.STRIPPED_SPRUCE_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_JUNGLE_LOG, Items.JUNGLE_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STRIPPED_JUNGLE_LOG, Items.STRIPPED_JUNGLE_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_ACACIA_LOG, Items.ACACIA_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STRIPPED_ACACIA_LOG, Items.STRIPPED_ACACIA_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_DARK_OAK_LOG, Items.DARK_OAK_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STRIPPED_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_LOG, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_CRIMSON_STEM, Items.CRIMSON_STEM, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STRIPPED_CRIMSON_STEM, Items.STRIPPED_CRIMSON_STEM, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_WARPED_STEM, Items.WARPED_STEM, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STRIPPED_WARPED_STEM, Items.STRIPPED_WARPED_STEM, exporter);
        
    }

    private void generateAllRecipeForBlocks(ArrayList<Block> blocks, Item uncompressedItem, Consumer<RecipeJsonProvider> exporter) {
        
        String critationName = "has_" + uncompressedItem.getName().toString();

        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                //compression Recipes
                ShapelessRecipeJsonBuilder.create(blocks.get(i).asItem())
                .input(uncompressedItem, 9)
                .criterion(critationName, conditionsFromItem(uncompressedItem))
                .offerTo(exporter, "compress_" + blocks.get(i).asItem().getName().getString());

                //decompression Recipes
                ShapelessRecipeJsonBuilder.create(uncompressedItem, 9)
                .input(blocks.get(i).asItem())
                .criterion(critationName, conditionsFromItem(uncompressedItem))
                .offerTo(exporter, "decompress_" + blocks.get(i).asItem().getName().getString());
            } else {
                //compression Recipes
                ShapelessRecipeJsonBuilder.create(blocks.get(i).asItem())
                .input(blocks.get(i-1).asItem(), 9)
                .criterion(critationName, conditionsFromItem(uncompressedItem))
                .offerTo(exporter, "compress_" + blocks.get(i).asItem().getName().getString());

                //decompression Recipes
                ShapelessRecipeJsonBuilder.create(blocks.get(i-1).asItem(), 9)
                .input(blocks.get(i).asItem())
                .criterion(critationName, conditionsFromItem(uncompressedItem))
                .offerTo(exporter, "decompress_" + blocks.get(i).asItem().getName().getString());
            }
        }
    }
    
}
