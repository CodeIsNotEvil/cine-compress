package com.codeisnotevil.cinecompress.registry;

import java.util.ArrayList;

import com.codeisnotevil.cinecompress.CineCompress;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CompressedBlocks {
    private static final ItemGroup COMPRESS_ITEM_GROUP = CineCompress.COMPRESS_GROUP;

    //Stones
    public static ArrayList<Block> COMPRESSED_COBBLED_DEEPSLATE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_DEEPSLATE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_COBBLESTONE_BLOCKS = new ArrayList<Block>();

    public static void registerBlocks() {
        
        // TODO add the createCompressedBlocks to register every CompressedBlock
        COMPRESSED_COBBLED_DEEPSLATE_BLOCKS = createCompressedBlocks("compressed_cobbled_deepslate", Settings.copy(Blocks.COBBLED_DEEPSLATE), COMPRESS_ITEM_GROUP);
        COMPRESSED_DEEPSLATE_BLOCKS = createCompressedBlocks("compressed_deepslate", Settings.copy(Blocks.DEEPSLATE), COMPRESS_ITEM_GROUP);
        COMPRESSED_COBBLESTONE_BLOCKS = createCompressedBlocks("compressed_cobblestone", Settings.copy(Blocks.COBBLESTONE), COMPRESS_ITEM_GROUP);


    }

    private static ArrayList<Block> createCompressedBlocks(String name, Settings settings, ItemGroup group){
        ArrayList<Block> compressedBlocks = new ArrayList<Block>();
        for (int i = 1; i < 10; i++) {
            Identifier identifier = new Identifier(CineCompress.MOD_ID, name + "x" + i);
            Block block = new Block(settings);
            compressedBlocks.add(block);
            Registry.register(Registry.BLOCK, identifier, block);
            Registry.register(Registry.ITEM, identifier, new BlockItem(block, new Item.Settings().group(group)));
        }
        return compressedBlocks;
    }

}
