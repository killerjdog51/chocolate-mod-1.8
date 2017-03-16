package com.chocolatemod.blocks;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockStair extends BlockStairs {
    /**
     * Initializes a new instance of the BlockStainedBrickStairs class.
     * @param block the stained bricks block.
      */
    public BlockStair(Block block, int Meta) {
        super(block.getStateFromMeta(Meta));
        this.useNeighborBrightness = true;
        this.setCreativeTab(MainRegistry.tabChocolateBlocks);

    }
}