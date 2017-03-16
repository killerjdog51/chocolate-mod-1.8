package com.chocolatemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDoubleSlab extends Blockslab {
	
    public BlockDoubleSlab(final int block, final int blockType) {
		super(block, blockType);
			}

	/**
     * Gets whether or not this is a double stacked slab.
     * @return always true.
     */
    @Override
    public final boolean isDouble() {
        return true;
    }
}