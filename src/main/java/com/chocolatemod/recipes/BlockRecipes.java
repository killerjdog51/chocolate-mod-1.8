package com.chocolatemod.recipes;

import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.init.ChocolateItems;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRecipes {
	
	public static void Recipes() {
	
	//Crafting
		
	 //Chocolate Blocks
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateBlock, 1, 0), new Object[]{
		   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.chocolatebar, 0, 0)
	   });
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 9, 0), new Object[]{
			   new ItemStack(ChocolateBlocks.chocolateBlock, 0, 0)
	   });
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateBlock, 1, 1), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.chocolatebar, 1, 1)
	   });
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 9, 1), new Object[]{
				   new ItemStack(ChocolateBlocks.chocolateBlock, 1, 1)
	   });
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateBlock, 1, 2), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.chocolatebar, 2, 2)
	   });
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 9, 2), new Object[]{
				   new ItemStack(ChocolateBlocks.chocolateBlock, 2, 2)
	   });
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateBlock, 1, 3), new Object[]{
				   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.chocolatebar, 3, 3)
	   });
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 9, 3), new Object[]{
					   new ItemStack(ChocolateBlocks.chocolateBlock, 3, 3)
	   });
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateBlock, 1, 4), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.chocolatebar, 4, 4)
	   });
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 9, 4), new Object[]{
				   new ItemStack(ChocolateBlocks.chocolateBlock, 4, 4)
	   });
	   
	   
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fruitBlock, 1, 0), new Object[]{
			   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.fruitbar, 0, 0)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 9, 0), new Object[]{
				   new ItemStack(ChocolateBlocks.fruitBlock, 0, 0)
		   });
		   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fruitBlock, 1, 1), new Object[]{
				   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.fruitbar, 1, 1)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 9, 1), new Object[]{
					   new ItemStack(ChocolateBlocks.fruitBlock, 1, 1)
		   });
		   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fruitBlock, 1, 2), new Object[]{
				   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.fruitbar, 2, 2)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 9, 2), new Object[]{
					   new ItemStack(ChocolateBlocks.fruitBlock, 2, 2)
		   });
		   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fruitBlock, 1, 3), new Object[]{
					   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.fruitbar, 3, 3)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 9, 3), new Object[]{
						   new ItemStack(ChocolateBlocks.fruitBlock, 3, 3)
		   });
		   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fruitBlock, 1, 4), new Object[]{
				   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.fruitbar, 4, 4)
		   });
		   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 9, 4), new Object[]{
					   new ItemStack(ChocolateBlocks.fruitBlock, 4, 4)
		   });
		   
		   
		   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.nutBlock, 1, 0), new Object[]{
				   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.nutbar, 0, 0)
			   });
			   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 9, 0), new Object[]{
					   new ItemStack(ChocolateBlocks.nutBlock, 0, 0)
			   });
			   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.nutBlock, 1, 1), new Object[]{
					   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.nutbar, 1, 1)
			   });
			   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 9, 1), new Object[]{
						   new ItemStack(ChocolateBlocks.nutBlock, 1, 1)
			   });
			   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.nutBlock, 1, 2), new Object[]{
					   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.nutbar, 2, 2)
			   });
			   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 9, 2), new Object[]{
						   new ItemStack(ChocolateBlocks.nutBlock, 2, 2)
			   });
			   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.nutBlock, 1, 3), new Object[]{
						   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.nutbar, 3, 3)
			   });
			   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 9, 3), new Object[]{
							   new ItemStack(ChocolateBlocks.nutBlock, 3, 3)
			   });
			   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.nutBlock, 1, 4), new Object[]{
					   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.nutbar, 4, 4)
			   });
			   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 9, 4), new Object[]{
						   new ItemStack(ChocolateBlocks.nutBlock, 4, 4)
			   });
			   
			   
			   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.mintBlock, 1, 0), new Object[]{
					   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.mintbar, 0, 0)
				   });
				   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 9, 0), new Object[]{
						   new ItemStack(ChocolateBlocks.mintBlock, 0, 0)
				   });
				   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.mintBlock, 1, 1), new Object[]{
						   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.mintbar, 1, 1)
				   });
				   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 9, 1), new Object[]{
							   new ItemStack(ChocolateBlocks.mintBlock, 1, 1)
				   });
				   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.mintBlock, 1, 2), new Object[]{
						   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.mintbar, 2, 2)
				   });
				   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 9, 2), new Object[]{
							   new ItemStack(ChocolateBlocks.mintBlock, 2, 2)
				   });
				   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.mintBlock, 1, 3), new Object[]{
							   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.mintbar, 3, 3)
				   });
				   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 9, 3), new Object[]{
								   new ItemStack(ChocolateBlocks.mintBlock, 3, 3)
				   });
				   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.mintBlock, 1, 4), new Object[]{
						   "BBB", "BBB", "BBB", 'B', new ItemStack(ChocolateItems.mintbar, 4, 4)
				   });
				   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 9, 4), new Object[]{
							   new ItemStack(ChocolateBlocks.mintBlock, 4, 4)
				   });
	   
	 //Bricks
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brick, 4, 0), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.hardChocolate, 0, 0)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brick, 4, 1), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.hardChocolate, 1, 1)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brick, 4, 2), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.hardChocolate, 2, 2)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brick, 4, 3), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.hardChocolate, 3, 3)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brick, 4, 4), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.hardChocolate, 4, 4)
		});
	   
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrick, 4, 0), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.brick, 0, 0)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrick, 4, 1), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.brick, 1, 1)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrick, 4, 2), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.brick, 2, 2)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrick, 4, 3), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.brick, 3, 3)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrick, 4, 4), new Object[]{
				"CC", "CC", 'C', new ItemStack(ChocolateBlocks.brick, 4, 4)
		});
	   
	 //Stairs
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateStair_default, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 0, 0)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateStair_dark, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 1, 1)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateStair_light, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 2, 2)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateStair_white, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 3, 3)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateStair_raw, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 4, 4)
		});
	   
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brickStair_default, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.brick, 0, 0)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brickStair_dark, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.brick, 1, 1)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brickStair_light, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.brick, 2, 2)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brickStair_white, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.brick, 3, 3)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brickStair_raw, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.brick, 4, 4)
		});
	   
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrickStair_default, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 0, 0)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrickStair_dark, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 1, 1)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrickStair_light, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 2, 2)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrickStair_white, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 3, 3)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallBrickStair_raw, 4), new Object[]{
				"B  ", "BB ", "BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 4, 4)
		});
	   
	 //Slabs
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chocolateSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 0, 0)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.darkchocolateSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 1, 1)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.lightchocolateSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 2, 2)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.whitechocolateSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 3, 3)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.rawchocolateSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.hardChocolate, 4, 4)
		});
	   
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.brickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.brick, 0, 0)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.darkbrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.brick, 1, 1)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.lightbrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.brick, 2, 2)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.whitebrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.brick, 3, 3)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.rawbrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.brick, 4, 4)
		});
	   
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallbrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 0, 0)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smalldarkbrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 1, 1)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smalllightbrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 2, 2)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallwhitebrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 3, 3)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.smallrawbrickSlab, 6), new Object[]{
				"BBB", 'B', new ItemStack(ChocolateBlocks.smallBrick, 4, 4)
		});
	   
	 //Fancy Blocks
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chiseled, 1, 0), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.chocolateSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chiseled, 1, 1), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.darkchocolateSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chiseled, 1, 2), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.lightchocolateSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chiseled, 1, 3), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.whitechocolateSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.chiseled, 1, 4), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.rawchocolateSlab)
		});
	   
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.roundBrick, 1, 0), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.brickSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.roundBrick, 1, 1), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.darkbrickSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.roundBrick, 1, 2), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.lightbrickSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.roundBrick, 1, 3), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.whitebrickSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.roundBrick, 1, 4), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.rawbrickSlab)
		});
	   
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fancyBrick, 1, 0), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.smallbrickSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fancyBrick, 1, 1), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.smalldarkbrickSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fancyBrick, 1, 2), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.smalllightbrickSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fancyBrick, 1, 3), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.smallwhitebrickSlab)
		});
	   GameRegistry.addRecipe(new ItemStack(ChocolateBlocks.fancyBrick, 1, 4), new Object[]{
				"C", "C", 'C', new ItemStack(ChocolateBlocks.smallrawbrickSlab)
		});
	   
	 //Etched
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateBlocks.etched, 1, 0), new Object[]{
				new ItemStack(ChocolateBlocks.hardChocolate, 0, 0)
		});
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateBlocks.etched, 1, 1), new Object[]{
				new ItemStack(ChocolateBlocks.hardChocolate, 1, 1)
		});
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateBlocks.etched, 1, 2), new Object[]{
				new ItemStack(ChocolateBlocks.hardChocolate, 2, 2)
		});
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateBlocks.etched, 1, 3), new Object[]{
				new ItemStack(ChocolateBlocks.hardChocolate, 3, 3)
		});
	   GameRegistry.addShapelessRecipe(new ItemStack(ChocolateBlocks.etched, 1, 4), new Object[]{
				new ItemStack(ChocolateBlocks.hardChocolate, 4, 4)
		});
	   
  //Smelting/Furnace
	   ItemStack chocolateblock = new ItemStack(ChocolateBlocks.chocolateBlock);
	   ItemStack darkchocolateblock = new ItemStack(ChocolateBlocks.chocolateBlock);
	   ItemStack lightchocolateblock = new ItemStack(ChocolateBlocks.chocolateBlock);
	   ItemStack whitechocolateblock = new ItemStack(ChocolateBlocks.chocolateBlock);
	   ItemStack rawchocolateblock = new ItemStack(ChocolateBlocks.chocolateBlock);

	   chocolateblock.setItemDamage(0);
	   darkchocolateblock.setItemDamage(1);
	   lightchocolateblock.setItemDamage(2);
	   whitechocolateblock.setItemDamage(3);
	   rawchocolateblock.setItemDamage(4);
	   
	   ItemStack hardchocolateblock = new ItemStack(ChocolateBlocks.hardChocolate);
	   ItemStack harddarkchocolateblock = new ItemStack(ChocolateBlocks.hardChocolate);
	   ItemStack hardlightchocolateblock = new ItemStack(ChocolateBlocks.hardChocolate);
	   ItemStack hardwhitechocolateblock = new ItemStack(ChocolateBlocks.hardChocolate);
	   ItemStack hardrawchocolateblock = new ItemStack(ChocolateBlocks.hardChocolate);

	   hardchocolateblock.setItemDamage(0);
	   harddarkchocolateblock.setItemDamage(1);
	   hardlightchocolateblock.setItemDamage(2);
	   hardwhitechocolateblock.setItemDamage(3);
	   hardrawchocolateblock.setItemDamage(4);
	   
	   FurnaceRecipes.instance().addSmeltingRecipe(chocolateblock, hardchocolateblock, 1.0f);
	   FurnaceRecipes.instance().addSmeltingRecipe(darkchocolateblock, harddarkchocolateblock, 1.0f);
	   FurnaceRecipes.instance().addSmeltingRecipe(lightchocolateblock, hardlightchocolateblock, 1.0f);
	   FurnaceRecipes.instance().addSmeltingRecipe(whitechocolateblock, hardwhitechocolateblock, 1.0f);
	   FurnaceRecipes.instance().addSmeltingRecipe(rawchocolateblock, hardrawchocolateblock, 1.0f);

	}
}
