package com.chocolatemod.specialitems;

import com.chocolatemod.init.SpecialBlocks;
import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCauldron;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BowlWarmLightMilk extends ItemFood {

	public BowlWarmLightMilk(int par1, float f, boolean par3) {
		super(par1, par3);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(MainRegistry.tabChocolateMisc);
		this.setMaxStackSize(1);
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
		return new ItemStack(net.minecraft.init.Items.bowl);
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.DRINK;
	}

	
	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		return par1ItemStack;
	}

	@Override
	public boolean onItemUse(ItemStack stackIn, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float par8, float par9, float par10) {

		if (!playerIn.canPlayerEdit(pos, side, stackIn)) {
			return false;
		} else {
			// the metadata of the cauldron; 0 = empty, 3 = full
			// the ID of your new Cauldron

			// set to false if you don't want the item to return anything (like Water Bucket -> Empty Bucket);
			boolean doesReturn = true;
			// the returning item
			Item retItem = net.minecraft.init.Items.bowl;

			if (worldIn.getBlockState(pos).getBlock() == SpecialBlocks.BarMold && worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == 0) {
				if (!playerIn.capabilities.isCreativeMode && doesReturn) {
					playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, new ItemStack(retItem));
				}
				
				worldIn.setBlockState(pos, SpecialBlocks.LightChocolateBarMold.getDefaultState());
			} else if (worldIn.getBlockState(pos).getBlock() == SpecialBlocks.BallMold && worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == 0) {
				if (!playerIn.capabilities.isCreativeMode && doesReturn) {
					playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, new ItemStack(retItem));
				}
				
				worldIn.setBlockState(pos, SpecialBlocks.LightChocolateBallMold.getDefaultState());
			}
			return true;
		}
	}

}