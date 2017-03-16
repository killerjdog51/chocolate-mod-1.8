package com.chocolatemod.init;

import com.chocolatemod.blocks.BlockDoubleSlab;
import com.chocolatemod.blocks.BlockHalfSlab;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemBlockSlab extends ItemSlab {
    /**
     * Initializes a new instance of the ItemBlockStainedBrickSlab class.
     * @param block the block behind the item.
     * @param slab the half height slab.
     * @param doubleSlab the full height slab.
     * @param stacked whether or not the block is the stacked version.
     */
    public ItemBlockSlab(
        final Block block,
        final BlockHalfSlab slab,
        final BlockDoubleSlab doubleSlab,
        final Boolean stacked) {
        super(block, slab, doubleSlab);
    }
}