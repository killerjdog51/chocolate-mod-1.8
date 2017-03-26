package com.chocolatemod.specialblocks;

import java.util.List;
import java.util.Random;

import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.init.ChocolateItems;
import com.chocolatemod.init.SpecialBlocks;
import com.chocolatemod.main.Achievements;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLightChocolateBar extends Block{
	
    public static final PropertyInteger LEVEL = PropertyInteger.create("stage", 0, 5);
	private int TickRate;

	public BlockLightChocolateBar() {
		super(Material.rock);
		this.setCreativeTab(null);
		this.setHardness(2.0F);
		this.setTickRandomly(true);
        this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, Integer.valueOf(0)));

		}
	@Override
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
	
	@Override
	 public void setBlockBoundsForItemRender()
	{
        float f = 0.0625F;
        float f1 = 0.5F;
        this.setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
    }
	
		

		@Override
	    public boolean isOpaqueCube()
	    {
	        return false;
	    }

	    public boolean isFullCube()
	    {
	        return false;
	    }
	    
	    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	    {
	    	float f = 0.0625F;
	        float f1 = 0.5F;
	        this.setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
	    }
	    
	    public void setWaterLevel(World worldIn, BlockPos pos, IBlockState state, int level)
	    {
	        worldIn.setBlockState(pos, state.withProperty(LEVEL, Integer.valueOf(MathHelper.clamp_int(level, 0, 5))), 2);
	        worldIn.updateComparatorOutputLevel(pos, this);
	    }
	    
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return Item.getItemFromBlock(SpecialBlocks.BallMold);
	    }

	    @SideOnly(Side.CLIENT)
	    public Item getItem(World worldIn, BlockPos pos)
	    {
	        return Item.getItemFromBlock(SpecialBlocks.BallMold);
	    }
	    
	    public boolean hasComparatorInputOverride()
	    {
	        return true;
	    }

	    public int getComparatorInputOverride(World worldIn, BlockPos pos)
	    {
	        return ((Integer)worldIn.getBlockState(pos).getValue(LEVEL)).intValue();
	    }
	    
	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(LEVEL, Integer.valueOf(meta));
	    }
	    
	    public int getMetaFromState(IBlockState state)
	    {
	        return ((Integer)state.getValue(LEVEL)).intValue();
	    }

	    protected BlockState createBlockState()
	    {
	        return new BlockState(this, new IProperty[] {LEVEL});
	    }
	    
	    @Override
	    public int tickRate(World world)
	    {
			 
			
	            return 1;
	    }
	    
	    
	    
	    @Override
	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
	        super.updateTick(worldIn, pos, state, rand);
	    	 BlockPos blockpos1 = new BlockPos(pos.getX(), pos.getY()-1, pos.getZ());
				int meta = ((Integer)state.getValue(LEVEL)).intValue();
	    	 
			TickRate = 9000;
			worldIn.scheduleUpdate(pos, this, TickRate);
			boolean heat = worldIn.getBlockState(blockpos1).getBlock() == Blocks.fire || worldIn.getBlockState(blockpos1).getBlock() == Blocks.flowing_lava || worldIn.getBlockState(blockpos1).getBlock() == Blocks.lava;

			if (!heat) {
				if (meta < 5) {
					 worldIn.setBlockState(pos, state.withProperty(LEVEL, Integer.valueOf(meta + 1)), 2);
				} 

			}
		}
	    
	    @Override
	    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {

	    	if (worldIn.isRemote) {
				return true;
			} else {
				ItemStack itemstack = playerIn.inventory.getCurrentItem();

				if (itemstack == null) {
					int meta = ((Integer)state.getValue(LEVEL)).intValue();

                    ItemStack itemstack1;

                    if (meta == 5) {
						ItemStack itemstack2 = new ItemStack(ChocolateItems.chocolatebar, 2, 2);
						if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
						} else if (playerIn instanceof EntityPlayerMP) {
							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
						}

						worldIn.setBlockState(pos, SpecialBlocks.BarMold.getDefaultState());
						playerIn.addStat(Achievements.achievementChocolateBar, 1);

					} 
				}
			}
		    return true;

	    }
}
