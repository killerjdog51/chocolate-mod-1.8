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

public class BlockRawCauldron extends Block{
	
    public static final PropertyInteger LEVEL = PropertyInteger.create("stage", 0, 15);
	private int TickRate;

	public BlockRawCauldron() {
		super(Material.iron);
		this.setCreativeTab(null);
		this.setHardness(2.0F);
		this.setTickRandomly(true);
        this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, Integer.valueOf(0)));

		}
	@Override
	public void addCollisionBoxesToList(World worldIn, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list, Entity collidingEntity)
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
        super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
        float f = 0.125F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
        this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
        this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
        this.setBlockBoundsForItemRender();
    }
	
	@Override
	 public void setBlockBoundsForItemRender()
	    {
	        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
	        int i = ((Integer)state.getValue(LEVEL)).intValue();
	        float f = (float)pos.getY() + (6.0F + (float)(3 * i)) / 16.0F;

	        if (!worldIn.isRemote && entityIn.isBurning() && i > 0 && entityIn.getEntityBoundingBox().minY <= (double)f)
	        {
	            entityIn.extinguish();
	            this.setWaterLevel(worldIn, pos, state, i - 1);
	        }
	    }
	    
	    public void setWaterLevel(World worldIn, BlockPos pos, IBlockState state, int level)
	    {
	        worldIn.setBlockState(pos, state.withProperty(LEVEL, Integer.valueOf(MathHelper.clamp_int(level, 0, 15))), 2);
	        worldIn.updateComparatorOutputLevel(pos, this);
	    }
	    
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return Items.cauldron;
	    }

	    @SideOnly(Side.CLIENT)
	    public Item getItem(World worldIn, BlockPos pos)
	    {
	        return Items.cauldron;
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
	    
	    @SideOnly(Side.CLIENT)
	    @Override
	    public void randomDisplayTick(World world, BlockPos pos, IBlockState state, Random par5Random) {
	    	 BlockPos blockpos1 = new BlockPos(pos.getX(), pos.getY()-1, pos.getZ());

			boolean heat = world.getBlockState(blockpos1).getBlock() == Blocks.fire || world.getBlockState(blockpos1).getBlock() == Blocks.flowing_lava || world.getBlockState(blockpos1).getBlock() == Blocks.lava;

			if (heat) {
				double d0 = (double) ((float) 0 + 0.5F);
				double d1a = (double) ((float) 0 + 1.4F);
				double d1b = (double) ((float) 0 + 1.0F);
				double d2 = (double) ((float) 0 + 0.5F);

				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL,  pos.getX()+d0, pos.getY()+d1a, pos.getZ()+d2, 0.0D, 0.0D, 0.0D, 0);
			}
		}
	    
	    @Override
	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
	        super.updateTick(worldIn, pos, state, rand);
	    	 BlockPos blockpos1 = new BlockPos(pos.getX(), pos.getY()-1, pos.getZ());
				int meta = ((Integer)state.getValue(LEVEL)).intValue();
	    	 
			if(worldIn.getBlockState(blockpos1).getBlock() == Blocks.lava){
				TickRate = 6000;
			}else if(worldIn.getBlockState(blockpos1).getBlock() == Blocks.flowing_lava){
				TickRate = 6000;
			}else if(worldIn.getBlockState(blockpos1).getBlock() == Blocks.fire){
				TickRate = 9000;
			}
			worldIn.scheduleUpdate(pos, this, TickRate);
			boolean heat = worldIn.getBlockState(blockpos1).getBlock() == Blocks.fire || worldIn.getBlockState(blockpos1).getBlock() == Blocks.flowing_lava || worldIn.getBlockState(blockpos1).getBlock() == Blocks.lava;

			if (heat) {
				if (meta > 1 && meta < 5) {
					 worldIn.setBlockState(pos, state.withProperty(LEVEL, Integer.valueOf(meta + 1)), 2);
				} else if (meta > 6 && meta < 10) {
					 worldIn.setBlockState(pos, state.withProperty(LEVEL, Integer.valueOf(meta + 1)), 2);
				} else if (meta > 11 && meta < 15) {
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
					return true;
				} else {
					
					int meta = ((Integer)state.getValue(LEVEL)).intValue();
	                Item item = itemstack.getItem();

                    ItemStack itemstack1;
                    ItemStack itemstack2;

					if (item == ChocolateItems.cocoaPowder) {
						// If the cauldron doesn't have 3 sugar yet, then:
						if (meta == 5) {
							if (!playerIn.capabilities.isCreativeMode)
                            {
                                itemstack1 = new ItemStack(ChocolateItems.cocoaPowder, 1, 0);

                                if (itemstack.stackSize <= 0)
                                {
                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
                                }
                                else if (playerIn instanceof EntityPlayerMP)
                                {
                                    ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
                                }

                                --itemstack.stackSize;

                                if (itemstack.stackSize <= 0)
                                {
                                    playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack)null);
                                }
                            }
							worldIn.setBlockState(pos, SpecialBlocks.Cauldron4.getStateFromMeta(11));						
						} else if (meta == 10) {
							if (!playerIn.capabilities.isCreativeMode)
                            {
                                itemstack1 = new ItemStack(ChocolateItems.cocoaPowder, 1, 0);

                                if (itemstack.stackSize <= 0)
                                {
                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
                                }
                                else if (playerIn instanceof EntityPlayerMP)
                                {
                                    ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
                                }

                                --itemstack.stackSize;

                                if (itemstack.stackSize <= 0)
                                {
                                    playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack)null);
                                }
                            }
							worldIn.setBlockState(pos, SpecialBlocks.Cauldron5.getStateFromMeta(11));						
						} else if(meta == 15) {
							if (!playerIn.capabilities.isCreativeMode)
                            {
                                itemstack1 = new ItemStack(ChocolateItems.cocoaPowder, 1, 0);

                                if (itemstack.stackSize <= 0)
                                {
                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
                                }
                                else if (playerIn instanceof EntityPlayerMP)
                                {
                                    ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
                                }

                                --itemstack.stackSize;

                                if (itemstack.stackSize <= 0)
                                {
                                    playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack)null);
                                }
                            }
							worldIn.setBlockState(pos, SpecialBlocks.Cauldron5.getStateFromMeta(6));						
						}
			
						return true;
					}

					// This too. You didn't include a getItemDamage() condition. That means, it will possible to use any kind of dye (not just cocoa beans). Fixed it.

					else if (item == ChocolateItems.bowlMilk) {
						if (meta < 2) {
							if (!playerIn.capabilities.isCreativeMode)
                            {
                                itemstack1 = new ItemStack(ChocolateItems.bowlMilk, 1, 0);
                                itemstack2 = new ItemStack(Items.bowl, 1, 0);

                                if (itemstack.stackSize <= 0)
                                {
                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
                                }
                                else if (playerIn instanceof EntityPlayerMP)
                                {
                                    ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
                                }

                                --itemstack.stackSize;
                                if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
        							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
        						} else if (playerIn instanceof EntityPlayerMP) {
        							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
        						}

                                if (itemstack.stackSize <= 0)
                                {
                                    playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack)null);
                                }
                            }
							 worldIn.setBlockState(pos, state.withProperty(LEVEL, Integer.valueOf(meta + 1)), 2);
						} else if(meta > 4 && meta < 7) {
							if (!playerIn.capabilities.isCreativeMode)
                            {
                                itemstack1 = new ItemStack(ChocolateItems.bowlMilk, 1, 0);
                                itemstack2 = new ItemStack(Items.bowl, 1, 0);

                                if (itemstack.stackSize <= 0)
                                {
                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
                                }
                                else if (playerIn instanceof EntityPlayerMP)
                                {
                                    ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
                                }

                                --itemstack.stackSize;
                                if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
        							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
        						} else if (playerIn instanceof EntityPlayerMP) {
        							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
        						}

                                if (itemstack.stackSize <= 0)
                                {
                                    playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack)null);
                                }
                            }
							 worldIn.setBlockState(pos, state.withProperty(LEVEL, Integer.valueOf(meta + 1)), 2);
						} else if(meta > 9 && meta < 12) {
							if (!playerIn.capabilities.isCreativeMode)
                            {
                                itemstack1 = new ItemStack(ChocolateItems.bowlMilk, 1, 0);
                                itemstack2 = new ItemStack(Items.bowl, 1, 0);

                                if (itemstack.stackSize <= 0)
                                {
                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
                                }
                                else if (playerIn instanceof EntityPlayerMP)
                                {
                                    ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
                                }

                                --itemstack.stackSize;
                                if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
        							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
        						} else if (playerIn instanceof EntityPlayerMP) {
        							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
        						}

                                if (itemstack.stackSize <= 0)
                                {
                                    playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack)null);
                                }
                            }
							 worldIn.setBlockState(pos, state.withProperty(LEVEL, Integer.valueOf(meta + 1)), 2);
						} else if(meta == 15) {
							if (!playerIn.capabilities.isCreativeMode)
                            {
                                itemstack1 = new ItemStack(ChocolateItems.bowlMilk, 1, 0);
                                itemstack2 = new ItemStack(Items.bowl, 1, 0);

                                if (itemstack.stackSize <= 0)
                                {
                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
                                }
                                else if (playerIn instanceof EntityPlayerMP)
                                {
                                    ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
                                }

                                --itemstack.stackSize;
                                if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
        							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
        						} else if (playerIn instanceof EntityPlayerMP) {
        							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
        						}

                                if (itemstack.stackSize <= 0)
                                {
                                    playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack)null);
                                }
                            }
							worldIn.setBlockState(pos, SpecialBlocks.Cauldron2.getStateFromMeta(11));						
						}
						return true;
					} else if (itemstack.getItem() == Items.bucket) {
						if (meta == 5) {
							itemstack2 = new ItemStack(ChocolateItems.bowlDarkChocolateMilk, 1, 0);
							if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
								worldIn.spawnEntityInWorld(new EntityItem(worldIn));
							} else if (playerIn instanceof EntityPlayerMP) {
								((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
							}

							if (!playerIn.capabilities.isCreativeMode) {
								--itemstack.stackSize;

								if (itemstack.stackSize <= 0) {
									playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack) null);
								}
							}

							worldIn.setBlockState(pos, Blocks.cauldron.getDefaultState());	
							playerIn.addStat(Achievements.achievementChocolateMilk, 1);

						}
					
					if (meta == 10) {
						itemstack2 = new ItemStack(ChocolateItems.bowlChocolateMilk, 1, 0);
						if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
						} else if (playerIn instanceof EntityPlayerMP) {
							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
						}

						if (!playerIn.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack) null);
							}
						}

						worldIn.setBlockState(pos, Blocks.cauldron.getDefaultState());
						playerIn.addStat(Achievements.achievementChocolateMilk, 1);

					}
					
					if (meta == 15) {
						itemstack2 = new ItemStack(ChocolateItems.bowlLightChocolateMilk, 1, 0);
						if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
						} else if (playerIn instanceof EntityPlayerMP) {
							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
						}

						if (!playerIn.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack) null);
							}
						}

						worldIn.setBlockState(pos, Blocks.cauldron.getDefaultState());		
						playerIn.addStat(Achievements.achievementChocolateMilk, 1);

					}
					
					
						if (meta == 0) {
							itemstack2 = new ItemStack(ChocolateItems.bowlRawChocolateMilk, 1, 0);
							if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
								worldIn.spawnEntityInWorld(new EntityItem(worldIn));
							} else if (playerIn instanceof EntityPlayerMP) {
								((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
							}

							if (!playerIn.capabilities.isCreativeMode) {
								--itemstack.stackSize;

								if (itemstack.stackSize <= 0) {
									playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack) null);
								}
							}

							worldIn.setBlockState(pos, Blocks.cauldron.getDefaultState());						
						}
						return true;
						
					} else if (itemstack.getItem() == Items.bowl) {
						if (meta == 5) {
							itemstack2 = new ItemStack(ChocolateItems.bowlDarkChocolateMilk, 1, 0);
							if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
								worldIn.spawnEntityInWorld(new EntityItem(worldIn));
							} else if (playerIn instanceof EntityPlayerMP) {
								((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
							}

							if (!playerIn.capabilities.isCreativeMode) {
								--itemstack.stackSize;

								if (itemstack.stackSize <= 0) {
									playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack) null);
								}
							}

							worldIn.setBlockState(pos, Blocks.cauldron.getDefaultState());	
							playerIn.addStat(Achievements.achievementChocolateMilk, 1);

						}
					
					if (meta == 10) {
						itemstack2 = new ItemStack(ChocolateItems.bowlChocolateMilk, 1, 0);
						if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
						} else if (playerIn instanceof EntityPlayerMP) {
							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
						}

						if (!playerIn.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack) null);
							}
						}

						worldIn.setBlockState(pos, Blocks.cauldron.getDefaultState());		
						playerIn.addStat(Achievements.achievementChocolateMilk, 1);

					}
					
					if (meta == 15) {
						itemstack2 = new ItemStack(ChocolateItems.bowlLightChocolateMilk, 1, 0);
						if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
							worldIn.spawnEntityInWorld(new EntityItem(worldIn));
						} else if (playerIn instanceof EntityPlayerMP) {
							((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
						}

						if (!playerIn.capabilities.isCreativeMode) {
							--itemstack.stackSize;

							if (itemstack.stackSize <= 0) {
								playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack) null);
							}
						}

						worldIn.setBlockState(pos, Blocks.cauldron.getDefaultState());	
						playerIn.addStat(Achievements.achievementChocolateMilk, 1);

					}
					
					
						if (meta == 0) {
							itemstack2 = new ItemStack(ChocolateItems.bowlRawChocolateMilk, 1, 0);
							if (!playerIn.inventory.addItemStackToInventory(itemstack2)) {
								worldIn.spawnEntityInWorld(new EntityItem(worldIn));
							} else if (playerIn instanceof EntityPlayerMP) {
								((EntityPlayerMP) playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
							}

							if (!playerIn.capabilities.isCreativeMode) {
								--itemstack.stackSize;

								if (itemstack.stackSize <= 0) {
									playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack) null);
								}
							}

							worldIn.setBlockState(pos, Blocks.cauldron.getDefaultState());						
						}
						return true;
					}
				}
			}
		    return true;

				}
			}