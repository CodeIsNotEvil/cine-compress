package com.codeisnotevil.cinecompress.registry;

import com.codeisnotevil.cinecompress.CineCompress;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //Cobblestone
    /*
    private static final Settings COBBLEDSTONE_SETTINGS = Settings.copy(Blocks.COBBLESTONE);

    public static final Block ONE_TIME_COMPRESSED_COBBLEDSTONE = new Block(COBBLEDSTONE_SETTINGS);
    */

    //Cobbled Deepslate
    private static final Settings COBBLED_DEEPSLATE_SETTINGS = Settings.copy(Blocks.COBBLED_DEEPSLATE);

    public static final Block ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    /*
    public static final Block TWO_TIMES_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block TREE_TIMES_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block FOUR_TIMES_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block FIVE_TIMES_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block SIX_TIMES_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block SEVEN_TIMES_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block EIGHT_TIMES_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block NINE_TIMES_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    */

    public static void registerBlocks() { //modid:one_time_compressed_cobbled_deepslate
        //Cobblestone

        //Cobbled Deepslate
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "one_time_compressed_cobbled_deepslate"), ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
    }

}
