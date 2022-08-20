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
    public static ArrayList<Block> COMPRESSED_STONE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_OBSIDIAN_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_DIORITE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_ANDESITE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_GRANITE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_CALCITE_BLOCKS = new ArrayList<Block>();

    public static void registerBlocks() {
        
        // TODO add the createCompressedBlocks to register every CompressedBlock
        COMPRESSED_COBBLED_DEEPSLATE_BLOCKS = createCompressedBlocks("compressed_cobbled_deepslate", Settings.copy(Blocks.COBBLED_DEEPSLATE));
        COMPRESSED_DEEPSLATE_BLOCKS = createCompressedBlocks("compressed_deepslate", Settings.copy(Blocks.DEEPSLATE));
        COMPRESSED_COBBLESTONE_BLOCKS = createCompressedBlocks("compressed_cobblestone", Settings.copy(Blocks.COBBLESTONE));
        COMPRESSED_STONE_BLOCKS = createCompressedBlocks("compressed_stone", Settings.copy(Blocks.STONE));
        COMPRESSED_OBSIDIAN_BLOCKS = createCompressedBlocks("compressed_obsidian", Settings.copy(Blocks.OBSIDIAN));
        COMPRESSED_DIORITE_BLOCKS = createCompressedBlocks("compressed_diorite", Settings.copy(Blocks.DIORITE));
        COMPRESSED_ANDESITE_BLOCKS = createCompressedBlocks("compressed_andesite", Settings.copy(Blocks.ANDESITE));
        COMPRESSED_GRANITE_BLOCKS = createCompressedBlocks("compressed_granite", Settings.copy(Blocks.GRANITE));
        COMPRESSED_CALCITE_BLOCKS = createCompressedBlocks("compressed_calcite", Settings.copy(Blocks.CALCITE));

    }

    private static ArrayList<Block> createCompressedBlocks(String name, Settings settings){
        ArrayList<Block> compressedBlocks = new ArrayList<Block>();
        for (int i = 1; i < 10; i++) {
            Identifier identifier = new Identifier(CineCompress.MOD_ID, name + "x" + i);
            Block block = new Block(settings);
            compressedBlocks.add(block);
            Registry.register(Registry.BLOCK, identifier, block);
            Registry.register(Registry.ITEM, identifier, new BlockItem(block, new Item.Settings().group(COMPRESS_ITEM_GROUP)));
        }
        return compressedBlocks;
    }

}
