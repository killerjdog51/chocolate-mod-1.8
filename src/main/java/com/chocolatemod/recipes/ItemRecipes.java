package com.chocolatemod.recipes;

import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.init.ChocolateItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRecipes {
	
	public static void Recipes() {
		
		GameRegistry.addRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 0), new Object[]{
				   "S", "M", "S", 'S', new ItemStack(Items.sugar), 'M', new ItemStack(Items.dye, 3, 3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 1), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 0, 0), new ItemStack(Items.dye, 3, 3)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 4), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 1, 1), new ItemStack(Items.dye, 3, 3)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 2, 2), new ItemStack(Items.dye, 3, 3)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 2), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 3, 3), new ItemStack(Items.dye, 3, 3)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 2), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 0, 0), new ItemStack(Items.dye, 15, 15)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 3), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 2, 2), new ItemStack(Items.dye, 15, 15)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 1), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 4, 4), new ItemStack(Items.dye, 15, 15)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.chocolatebar, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 1, 1), new ItemStack(Items.dye, 15, 15)
		});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 0, 0), new ItemStack(Items.apple)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 1), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 1, 1), new ItemStack(Items.apple)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 2), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 2, 2), new ItemStack(Items.apple)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 3), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 3, 3), new ItemStack(Items.apple)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 4), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 4, 4), new ItemStack(Items.apple)
		});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 0, 0), new ItemStack(Items.dye, 10, 10)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 1, 1), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 1, 1), new ItemStack(Items.dye, 10, 10)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 1, 2), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 2, 2), new ItemStack(Items.dye, 10, 10)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 1, 3), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 3, 3), new ItemStack(Items.dye, 10, 10)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.mintbar, 1, 4), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 4, 4), new ItemStack(Items.dye, 10, 10)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 0, 0), new ItemStack(Items.wheat_seeds)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 1, 1), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 1, 1), new ItemStack(Items.wheat_seeds)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 1, 2), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 2, 2), new ItemStack(Items.wheat_seeds)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 1, 3), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 3, 3), new ItemStack(Items.wheat_seeds)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.nutbar, 1, 4), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 4, 4), new ItemStack(Items.wheat_seeds)
		});
	}

}
