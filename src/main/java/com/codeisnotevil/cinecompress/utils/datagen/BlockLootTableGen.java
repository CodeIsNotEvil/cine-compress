package com.codeisnotevil.cinecompress.utils.datagen;

import java.util.ArrayList;

import com.codeisnotevil.cinecompress.registry.CompressedBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;

public class BlockLootTableGen extends FabricBlockLootTableProvider{

    protected BlockLootTableGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {

        // TODO for every CompressedBlock Type add a loot table generator a like the one below if it drops itself.
        generateSelfDropLootTableForAll(CompressedBlocks.COMPRESSED_COBBLED_DEEPSLATE_BLOCKS);
        
        
    }

    private void generateSelfDropLootTableForAll(ArrayList<Block> blocks) {
        for (Block block : blocks) {
            addDrop(block);
        }
    }
    
}
