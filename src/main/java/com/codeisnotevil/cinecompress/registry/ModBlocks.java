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
    public static final Block TWO_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block THREE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block FOUR_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block FIVE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block SIX_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block SEVEN_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block EIGHT_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);
    public static final Block NINE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new Block(COBBLED_DEEPSLATE_SETTINGS);

    public static void registerBlocks() { //modid:block_name
        //Cobblestone

        //Cobbled Deepslate
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "one_time_compressed_cobbled_deepslate"), ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "two_time_compressed_cobbled_deepslate"), TWO_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "three_time_compressed_cobbled_deepslate"), THREE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "four_time_compressed_cobbled_deepslate"), FOUR_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "five_time_compressed_cobbled_deepslate"), FIVE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "six_time_compressed_cobbled_deepslate"), SIX_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "seven_time_compressed_cobbled_deepslate"), SEVEN_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "eight_time_compressed_cobbled_deepslate"), EIGHT_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(CineCompress.MOD_ID, "nine_time_compressed_cobbled_deepslate"), NINE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
    }

}
