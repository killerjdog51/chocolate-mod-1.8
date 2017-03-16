package com.chocolatemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHalfSlab extends Blockslab {
	
    public BlockHalfSlab(final int blockType, final int block) {
    	super(block, blockType);
		}
    
    @Override
    public final boolean isDouble() {
        return false;
    }
}