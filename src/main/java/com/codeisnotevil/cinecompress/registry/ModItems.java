package com.codeisnotevil.cinecompress.registry;

import com.codeisnotevil.cinecompress.CineCompress;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    private static final Settings DEFAULT_ITEM_SETTING = new Item.Settings().group(ItemGroup.BUILDING_BLOCKS);

    //Items


    //Block Items

    //cobbled Deepslate
    public static final BlockItem ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);
    public static final BlockItem TWO_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.TWO_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);
    public static final BlockItem THREE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.THREE_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);
    public static final BlockItem FOUR_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.FOUR_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);
    public static final BlockItem FIVE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.FIVE_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);
    public static final BlockItem SIX_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.SIX_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);
    public static final BlockItem SEVEN_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.SEVEN_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);
    public static final BlockItem EIGHT_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.EIGHT_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);
    public static final BlockItem NINE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.NINE_TIME_COMPRESSED_COBBLED_DEEPSLATE, DEFAULT_ITEM_SETTING);


    public static void registerItems() { //modid:item_name
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "one_time_compressed_cobbled_deepslate"), ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "two_time_compressed_cobbled_deepslate"), TWO_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "three_time_compressed_cobbled_deepslate"), THREE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "four_time_compressed_cobbled_deepslate"), FOUR_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "five_time_compressed_cobbled_deepslate"), FIVE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "six_time_compressed_cobbled_deepslate"), SIX_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "seven_time_compressed_cobbled_deepslate"), SEVEN_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "eight_time_compressed_cobbled_deepslate"), EIGHT_TIME_COMPRESSED_COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "nine_time_compressed_cobbled_deepslate"), NINE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
    }
}
