package com.codeisnotevil.cinecompress;

import com.codeisnotevil.cinecompress.registry.CompressedBlocks;

import net.fabricmc.api.ModInitializer;

public class CineCompress implements ModInitializer{

    public static final String MOD_ID = "cinecp";

    @Override
    public void onInitialize() {
        CompressedBlocks.registerBlocks();
    }
    
}
