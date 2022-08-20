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

        // TODO for every CompressedBlock Type add a recipe generator like the one below
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS, Items.COBBLED_DEEPSLATE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_DEEPSLATE_BLOCKS, Items.DEEPSLATE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_COBBLESTONE_BLOCKS, Items.COBBLESTONE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_STONE_BLOCKS, Items.STONE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_OBSIDIAN_BLOCKS, Items.OBSIDIAN, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_DIORITE_BLOCKS, Items.DIORITE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_ANDESITE_BLOCKS, Items.ANDESITE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_GRANITE_BLOCKS, Items.GRANITE, exporter);
        generateAllRecipeForBlocks(CompressedBlocks.COMPRESSED_CALCITE_BLOCKS, Items.CALCITE, exporter);
        
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
