package com.codeisnotevil.cinecompress;

import com.codeisnotevil.cinecompress.registry.CompressedBlocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CineCompress implements ModInitializer{

    public static final String MOD_ID = "cinecp";

    public static final ItemGroup COMPRESS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "compressed"), () -> new ItemStack(CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS.get(8)));

    @Override
    public void onInitialize() {
        CompressedBlocks.registerBlocks();
    }   
    
}
