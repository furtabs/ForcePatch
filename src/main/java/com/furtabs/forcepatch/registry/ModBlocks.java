package com.furtabs.forcepatch.registry;

import com.furtabs.forcepatch.block.ForceBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    // Register under forcecraft namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("forcecraft");
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("forcecraft");

    public static final DeferredBlock<Block> FORCE_GEM_BLOCK = BLOCKS.register("force_gem_block", ForceBlock::new);
    public static final DeferredItem<Item> FORCE_GEM_BLOCK_ITEM = ITEMS.register("force_gem_block", 
        () -> new BlockItem(FORCE_GEM_BLOCK.get(), new Item.Properties()));
    
    public static final DeferredBlock<Block> FORCE_INGOT_BLOCK = BLOCKS.register("force_ingot_block", ForceBlock::new);
    public static final DeferredItem<Item> FORCE_INGOT_BLOCK_ITEM = ITEMS.register("force_ingot_block", 
        () -> new BlockItem(FORCE_INGOT_BLOCK.get(), new Item.Properties()));
}
