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

    // Stones
    public static ArrayList<Block> COMPRESSED_COBBLED_DEEPSLATE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_DEEPSLATE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_COBBLESTONE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STONE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_OBSIDIAN_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_DIORITE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_ANDESITE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_GRANITE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_TUFF_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_CALCITE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_DRIPSTONE_BLOCK_BLOCKS = new ArrayList<Block>();

    // Dirty
    public static ArrayList<Block> COMPRESSED_DIRT_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_SAND_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_RED_SAND_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_CLAY_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_GRAVEL_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_TERRACOTTA_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_MOSS_BLOCK_BLOCKS = new ArrayList<Block>();

    // Hellish
    public static ArrayList<Block> COMPRESSED_NETHERRACK_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_SOUL_SAND_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_NETHER_BRICKS_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_GLOWSTONE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_MAGMA_BLOCK_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_BASALT_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_BLACKSTONE_BLOCKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_SOUL_SOIL_BLOCKS = new ArrayList<Block>();

    // Endish
    public static ArrayList<Block> COMPRESSED_END_STONE = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_END_STONE_BRICKS = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_PURPUR_BLOCK = new ArrayList<Block>();

    // Woods
    public static ArrayList<Block> COMPRESSED_OAK_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STRIPPED_OAK_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_BIRCH_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STRIPPED_BIRCH_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_SPRUCE_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STRIPPED_SPRUCE_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_JUNGLE_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STRIPPED_JUNGLE_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_ACACIA_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STRIPPED_ACACIA_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_DARK_OAK_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STRIPPED_DARK_OAK_LOG = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_CRIMSON_STEM = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STRIPPED_CRIMSON_STEM = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_WARPED_STEM = new ArrayList<Block>();
    public static ArrayList<Block> COMPRESSED_STRIPPED_WARPED_STEM = new ArrayList<Block>();



    public static void registerBlocks() {
        
        // Stones
        COMPRESSED_COBBLED_DEEPSLATE_BLOCKS = createCompressedBlocks("compressed_cobbled_deepslate", Settings.copy(Blocks.COBBLED_DEEPSLATE));
        COMPRESSED_DEEPSLATE_BLOCKS = createCompressedBlocks("compressed_deepslate", Settings.copy(Blocks.DEEPSLATE));
        COMPRESSED_COBBLESTONE_BLOCKS = createCompressedBlocks("compressed_cobblestone", Settings.copy(Blocks.COBBLESTONE));
        COMPRESSED_STONE_BLOCKS = createCompressedBlocks("compressed_stone", Settings.copy(Blocks.STONE));
        COMPRESSED_OBSIDIAN_BLOCKS = createCompressedBlocks("compressed_obsidian", Settings.copy(Blocks.OBSIDIAN));
        COMPRESSED_DIORITE_BLOCKS = createCompressedBlocks("compressed_diorite", Settings.copy(Blocks.DIORITE));
        COMPRESSED_ANDESITE_BLOCKS = createCompressedBlocks("compressed_andesite", Settings.copy(Blocks.ANDESITE));
        COMPRESSED_GRANITE_BLOCKS = createCompressedBlocks("compressed_granite", Settings.copy(Blocks.GRANITE));
        COMPRESSED_TUFF_BLOCKS = createCompressedBlocks("compressed_tuff", Settings.copy(Blocks.TUFF));
        COMPRESSED_CALCITE_BLOCKS = createCompressedBlocks("compressed_calcite", Settings.copy(Blocks.CALCITE));
        COMPRESSED_DRIPSTONE_BLOCK_BLOCKS = createCompressedBlocks("compressed_dripstone_block", Settings.copy(Blocks.DRIPSTONE_BLOCK));
        
        // Dirty
        COMPRESSED_DIRT_BLOCKS = createCompressedBlocks("compressed_dirt", Settings.copy(Blocks.DIRT));
        COMPRESSED_SAND_BLOCKS = createCompressedBlocks("compressed_sand", Settings.copy(Blocks.SAND));
        COMPRESSED_RED_SAND_BLOCKS = createCompressedBlocks("compressed_red_sand", Settings.copy(Blocks.RED_SAND));
        COMPRESSED_CLAY_BLOCKS = createCompressedBlocks("compressed_clay", Settings.copy(Blocks.CLAY));
        COMPRESSED_GRAVEL_BLOCKS = createCompressedBlocks("compressed_gravel", Settings.copy(Blocks.GRAVEL));
        COMPRESSED_TERRACOTTA_BLOCKS = createCompressedBlocks("compressed_terracotta", Settings.copy(Blocks.TERRACOTTA));
        COMPRESSED_MOSS_BLOCK_BLOCKS = createCompressedBlocks("compressed_moss_block", Settings.copy(Blocks.MOSS_BLOCK));

        // Hellish
        COMPRESSED_NETHERRACK_BLOCKS = createCompressedBlocks("compressed_netherrack", Settings.copy(Blocks.NETHERRACK));
        COMPRESSED_SOUL_SAND_BLOCKS = createCompressedBlocks("compressed_soul_sand", Settings.copy(Blocks.SOUL_SAND));
        COMPRESSED_NETHER_BRICKS_BLOCKS = createCompressedBlocks("compressed_nether_bricks", Settings.copy(Blocks.NETHER_BRICKS));
        COMPRESSED_GLOWSTONE_BLOCKS = createCompressedBlocks("compressed_glowstone", Settings.copy(Blocks.GLOWSTONE));
        COMPRESSED_MAGMA_BLOCK_BLOCKS = createCompressedBlocks("compressed_magma_block", Settings.copy(Blocks.MAGMA_BLOCK));
        COMPRESSED_BASALT_BLOCKS = createCompressedBlocks("compressed_basalt", Settings.copy(Blocks.BASALT));
        COMPRESSED_BLACKSTONE_BLOCKS = createCompressedBlocks("compressed_blackstone", Settings.copy(Blocks.BLACKSTONE));
        COMPRESSED_SOUL_SOIL_BLOCKS = createCompressedBlocks("compressed_soul_soil", Settings.copy(Blocks.SOUL_SOIL));

        // Endish
        COMPRESSED_END_STONE = createCompressedBlocks("compressed_end_stone", Settings.copy(Blocks.END_STONE));
        COMPRESSED_END_STONE_BRICKS = createCompressedBlocks("compressed_end_stone_bricks", Settings.copy(Blocks.END_STONE_BRICKS));
        COMPRESSED_PURPUR_BLOCK = createCompressedBlocks("compressed_purpur_block", Settings.copy(Blocks.PURPUR_BLOCK));

        // Woods
        // Fabric or minecraft issue with the log settings... useing planksettings instead.
        COMPRESSED_OAK_LOG = createCompressedBlocks("compressed_oak_log", Settings.copy(Blocks.OAK_PLANKS));
        COMPRESSED_STRIPPED_OAK_LOG = createCompressedBlocks("compressed_stripped_oak_log", Settings.copy(Blocks.OAK_PLANKS));
        COMPRESSED_BIRCH_LOG = createCompressedBlocks("compressed_birch_log", Settings.copy(Blocks.BIRCH_PLANKS));
        COMPRESSED_STRIPPED_BIRCH_LOG = createCompressedBlocks("compressed_stripped_birch_log", Settings.copy(Blocks.BIRCH_PLANKS));
        COMPRESSED_SPRUCE_LOG = createCompressedBlocks("compressed_spruce_log", Settings.copy(Blocks.SPRUCE_PLANKS));
        COMPRESSED_STRIPPED_SPRUCE_LOG = createCompressedBlocks("compressed_stripped_spruce_log", Settings.copy(Blocks.SPRUCE_PLANKS));
        COMPRESSED_JUNGLE_LOG = createCompressedBlocks("compressed_jungle_log", Settings.copy(Blocks.JUNGLE_PLANKS));
        COMPRESSED_STRIPPED_JUNGLE_LOG = createCompressedBlocks("compressed_stripped_jungle_log", Settings.copy(Blocks.JUNGLE_PLANKS));
        COMPRESSED_ACACIA_LOG = createCompressedBlocks("compressed_acacia_log", Settings.copy(Blocks.ACACIA_PLANKS));
        COMPRESSED_STRIPPED_ACACIA_LOG = createCompressedBlocks("compressed_stripped_acacia_log", Settings.copy(Blocks.ACACIA_PLANKS));
        COMPRESSED_DARK_OAK_LOG = createCompressedBlocks("compressed_dark_oak_log", Settings.copy(Blocks.DARK_OAK_PLANKS));
        COMPRESSED_STRIPPED_DARK_OAK_LOG = createCompressedBlocks("compressed_stripped_dark_oak_log", Settings.copy(Blocks.DARK_OAK_PLANKS));
        COMPRESSED_CRIMSON_STEM = createCompressedBlocks("compressed_crimson_stem", Settings.copy(Blocks.CRIMSON_STEM));
        COMPRESSED_STRIPPED_CRIMSON_STEM = createCompressedBlocks("compressed_stripped_crimson_stem", Settings.copy(Blocks.STRIPPED_CRIMSON_STEM));
        COMPRESSED_WARPED_STEM = createCompressedBlocks("compressed_warped_stem", Settings.copy(Blocks.WARPED_STEM));
        COMPRESSED_STRIPPED_WARPED_STEM = createCompressedBlocks("compressed_stripped_warped_stem", Settings.copy(Blocks.STRIPPED_WARPED_STEM));

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
