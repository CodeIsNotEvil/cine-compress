package com.codeisnotevil.cinecompress.utils.datagen;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        generateSelfDropForEveryCompressedBlock();
    }

    private void generateSelfDropLootTableForAll(ArrayList<Block> blocks) {
        for (Block block : blocks) {
            addDrop(block);
        }
    }

    @SuppressWarnings("unchecked")
    private void generateSelfDropForEveryCompressedBlock() {
        Pattern compressed = Pattern.compile("COMPRESSED_[A-Z_]*");
        Field[] compressedBlocksFields = CompressedBlocks.class.getDeclaredFields();
        for (Field field : compressedBlocksFields) {
            Matcher fieldIsCompressedBlock = compressed.matcher(field.getName());
            if (fieldIsCompressedBlock.matches()) {
                field.setAccessible(true);
                try {
                    generateSelfDropLootTableForAll((ArrayList<Block>) field.get(null));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
