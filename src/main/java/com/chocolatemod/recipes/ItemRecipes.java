package com.chocolatemod.recipes;

import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.init.ChocolateItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRecipes {
	
	public static void Recipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cocoaPowder, 1, 0), new Object[]{
				new ItemStack(Items.dye, 3, 3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitBits, 4, 0), new Object[]{
				new ItemStack(Items.apple)
		});
		GameRegistry.addRecipe(new ItemStack(Items.apple, 1, 0), new Object[]{
				"FF", "FF", 'F', new ItemStack(ChocolateItems.fruitBits)
		});
		
		
		GameRegistry.addRecipe(new ItemStack(ChocolateItems.goldChocolate, 1, 0), new Object[]{
				"GGG", "GBG", "GGG", 'G', new ItemStack(Items.gold_nugget), 'B', new ItemStack(ChocolateItems.chocolatebar, 0, 0)
		});
		GameRegistry.addRecipe(new ItemStack(ChocolateItems.goldChocolate, 1, 0), new Object[]{
				"GGG", "GBG", "GGG", 'G', new ItemStack(Items.gold_nugget), 'B', new ItemStack(ChocolateItems.chocolatebar, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(ChocolateItems.goldChocolate, 1, 0), new Object[]{
				"GGG", "GBG", "GGG", 'G', new ItemStack(Items.gold_nugget), 'B', new ItemStack(ChocolateItems.chocolatebar, 2, 2)
		});
		GameRegistry.addRecipe(new ItemStack(ChocolateItems.goldChocolate, 1, 0), new Object[]{
				"GGG", "GBG", "GGG", 'G', new ItemStack(Items.gold_nugget), 'B', new ItemStack(ChocolateItems.chocolatebar, 3, 3)
		});
		GameRegistry.addRecipe(new ItemStack(ChocolateItems.goldChocolate, 1, 0), new Object[]{
				"GGG", "GBG", "GGG", 'G', new ItemStack(Items.gold_nugget), 'B', new ItemStack(ChocolateItems.chocolatebar, 4, 4)
		});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 0, 0), new ItemStack(Items.cookie), new ItemStack(Items.milk_bucket)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 0, 0), new ItemStack(Items.cookie), new ItemStack(ChocolateItems.bowlMilk)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 1, 1), new ItemStack(Items.cookie), new ItemStack(Items.milk_bucket)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 1, 1), new ItemStack(Items.cookie), new ItemStack(ChocolateItems.bowlMilk)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 2, 2), new ItemStack(Items.cookie), new ItemStack(Items.milk_bucket)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 2, 2), new ItemStack(Items.cookie), new ItemStack(ChocolateItems.bowlMilk)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 3, 3), new ItemStack(Items.cookie), new ItemStack(Items.milk_bucket)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 3, 3), new ItemStack(Items.cookie), new ItemStack(ChocolateItems.bowlMilk)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 4, 4), new ItemStack(Items.cookie), new ItemStack(Items.milk_bucket)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.cookiesCream, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 4, 4), new ItemStack(Items.cookie), new ItemStack(ChocolateItems.bowlMilk)
		});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 0), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 0, 0), new ItemStack(ChocolateItems.fruitBits)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 1), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 1, 1), new ItemStack(ChocolateItems.fruitBits)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 2), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 2, 2), new ItemStack(ChocolateItems.fruitBits)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 3), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 3, 3), new ItemStack(ChocolateItems.fruitBits)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ChocolateItems.fruitbar, 1, 4), new Object[]{
				new ItemStack(ChocolateItems.chocolatebar, 4, 4), new ItemStack(ChocolateItems.fruitBits)
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
		
		
		//Furnace Recipes
		GameRegistry.addSmelting(ChocolateItems.bowlChocolateMilk, new ItemStack(ChocolateItems.bowlWarmChocolateMilk), 1.0f);
		GameRegistry.addSmelting(ChocolateItems.bowlDarkChocolateMilk, new ItemStack(ChocolateItems.bowlWarmDarkMilk), 1.0f);
		GameRegistry.addSmelting(ChocolateItems.bowlLightChocolateMilk, new ItemStack(ChocolateItems.bowlWarmLightMilk), 1.0f);
		GameRegistry.addSmelting(ChocolateItems.bowlWhiteChocolateMilk, new ItemStack(ChocolateItems.bowlWarmWhiteMilk), 1.0f);
		GameRegistry.addSmelting(ChocolateItems.bowlRawChocolateMilk, new ItemStack(ChocolateItems.bowlWarmRawMilk), 1.0f);

	}

}
