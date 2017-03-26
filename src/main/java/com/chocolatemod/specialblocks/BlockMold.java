package com.chocolatemod.specialblocks;

import java.util.Random;

import com.chocolatemod.init.SpecialBlocks;
import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMold extends Block {

	int val;
	public BlockMold(String name, int val) {
		super(Material.rock);
		this.setUnlocalizedName(name);
		this.setHardness(2.0F);
		this.setCreativeTab(MainRegistry.tabChocolateBlocks);
		this.val = val;
	}

	public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos)
    {
        float f = 0.0625F;
        float f1 = (float)(1 + (0) * 2) / 16.0F;
        float f2 = 0.5F;
        this.setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        float f = 0.0625F;
        float f1 = 0.5F;
        this.setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
    }

    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
    {
        float f = 0.0625F;
        float f1 = (float)(1 + (0) * 2) / 16.0F;
        float f2 = 0.5F;
        return new AxisAlignedBB((double)((float)pos.getX() + f1), (double)pos.getY(), (double)((float)pos.getZ() + f), (double)((float)(pos.getX() + 1) - f), (double)((float)pos.getY() + f2), (double)((float)(pos.getZ() + 1) - f));
    }

    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBox(World worldIn, BlockPos pos)
    {
        return this.getCollisionBoundingBox(worldIn, pos, worldIn.getBlockState(pos));
    }

    public boolean isFullCube()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	if(val == 0){
        return Item.getItemFromBlock(SpecialBlocks.BarMold);
    	} else {
            return Item.getItemFromBlock(SpecialBlocks.BallMold);
    	}
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos)
    {
    	if(val == 0){
            return Item.getItemFromBlock(SpecialBlocks.BarMold);
        	} else {
                return Item.getItemFromBlock(SpecialBlocks.BallMold);
        	}    }
}
