package com.codeisnotevil.cinecompress.registry;

import com.codeisnotevil.cinecompress.CineCompress;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items


    //Block Items
    public static final BlockItem ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE = new BlockItem(ModBlocks.ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE, new Item.Settings()
    .group(ItemGroup.BUILDING_BLOCKS)
    );


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(CineCompress.MOD_ID, "one_time_compressed_cobbled_deepslate"), ONE_TIME_COMPRESSED_COBBLED_DEEPSLATE);
    }
}
