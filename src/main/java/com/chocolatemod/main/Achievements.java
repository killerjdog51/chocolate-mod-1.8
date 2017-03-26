package com.chocolatemod.main;

import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.init.ChocolateItems;
import com.google.common.eventbus.Subscribe;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class Achievements {
			
	public static Achievement achievementStartChocolate = 
		      new Achievement("achievement.startchocolate", "cocoabean", 
		      0, 0, new ItemStack(Items.dye, 3, 3), (Achievement)null);
	public static Achievement achievementChocolatePowder = 
		      new Achievement("achievement.chocolatepowder", "cocoapowder", 
		      2, 1, ChocolateItems.cocoaPowder, 
		      Achievements.achievementStartChocolate).setSpecial();
	public static Achievement achievementChocolateMilk = 
		      new Achievement("achievement.chocolatemilk", "chocolatemilk", 
		      3, 3, ChocolateItems.bowlChocolateMilk, 
		      Achievements.achievementChocolatePowder).setSpecial();
	public static Achievement achievementChocolateBar = 
		      new Achievement("achievement.chocolatebar", "chocolatebar", 
		      1, 4, ChocolateItems.chocolatebar, 
		      Achievements.achievementChocolateMilk).setSpecial();
	public static Achievement achievementChocolateBall = 
		      new Achievement("achievement.chocolateball", "chocolateball", 
		      2, 5, ChocolateItems.chocolateball, 
		      Achievements.achievementChocolateMilk).setSpecial();
	public static Achievement achievementCookieBar = 
		      new Achievement("achievement.cookiebar", "cookiebar", 
		      1, 7, ChocolateItems.cookiesCream, 
		      Achievements.achievementChocolateBar).setSpecial();
	public static Achievement achievementGoldChocolateBar = 
		      new Achievement("achievement.goldchocolatebar", "goldchocolatebar", 
		      3, 6, ChocolateItems.goldChocolate, 
		      Achievements.achievementChocolateBar).setSpecial();
	public static Achievement achievementChocolateBlock = 
		      new Achievement("achievement.chocolateblock", "chocolateblock", 
		      -1, 6, ChocolateBlocks.chocolateBlock, 
		      Achievements.achievementChocolateBar).setSpecial();
	public static Achievement achievementAdditions = 
		      new Achievement("achievement.additions", "additions", 
		      -1, 2, ChocolateItems.fruitBits, 
		      Achievements.achievementChocolateBar).setSpecial();
	public static Achievement achievementCookieWorld = 
		      new Achievement("achievement.cookieworld", "cookieworld", 
		      1, 9, ChocolateBlocks.cookiesCream, 
		      Achievements.achievementCookieBar).setSpecial();
	public static Achievement achievementChocolateWorld = 
		      new Achievement("achievement.chocolateworld", "chocolateworld", 
		      3, 9, ChocolateBlocks.goldChocolate, 
		      Achievements.achievementGoldChocolateBar).setSpecial();
	public static Achievement achievementBuilding = 
		      new Achievement("achievement.building", "building", 
		      -1, 9, ChocolateBlocks.brick, 
		      Achievements.achievementChocolateBlock).setSpecial();
	
	public static void Register() {
		
		Achievements.achievementStartChocolate.registerStat();
		Achievements.achievementChocolatePowder.registerStat();
		Achievements.achievementChocolateMilk.registerStat();
		Achievements.achievementChocolateBar.registerStat();
		Achievements.achievementChocolateBall.registerStat();
		Achievements.achievementCookieBar.registerStat();
		Achievements.achievementGoldChocolateBar.registerStat();
		Achievements.achievementChocolateBlock.registerStat();
		Achievements.achievementAdditions.registerStat();
		Achievements.achievementCookieWorld.registerStat();
		Achievements.achievementChocolateWorld.registerStat();
		Achievements.achievementBuilding.registerStat();
		
		AchievementPage.registerAchievementPage(
			      new AchievementPage("Chocolate Achievements", 
			            new Achievement[] {Achievements.achievementStartChocolate, 
			            		Achievements.achievementChocolatePowder,
			            		Achievements.achievementChocolateMilk,
			            		Achievements.achievementChocolateBar,
			            		Achievements.achievementChocolateBall,
			            		Achievements.achievementCookieBar,
			            		Achievements.achievementGoldChocolateBar,
			            		Achievements.achievementChocolateBlock,
			            		Achievements.achievementAdditions,
			            		Achievements.achievementCookieWorld,
			            		Achievements.achievementChocolateWorld,
			            		Achievements.achievementBuilding}));

	}
}
