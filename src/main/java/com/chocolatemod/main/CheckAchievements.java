package com.chocolatemod.main;

import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.init.ChocolateItems;
import com.chocolatemod.init.SpecialBlocks;
import com.google.common.eventbus.Subscribe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class CheckAchievements {

	 @SubscribeEvent
	    public void pickupItem(EntityItemPickupEvent event) {
		 
		 if (event.entity instanceof EntityPlayer) {
			 
			   if (event.item.getEntityItem().getItem() == Items.dye && event.item.getEntityItem().getItemDamage() == 3) {
			    event.entityPlayer.addStat(Achievements.achievementStartChocolate, 1);
			   }
			   
			   if (event.item.getEntityItem().getItem() == ChocolateItems.bowlChocolateMilk) {
				    event.entityPlayer.addStat(Achievements.achievementChocolateMilk, 1);
			   } else if (event.item.getEntityItem().getItem() == ChocolateItems.bowlDarkChocolateMilk) {
				    event.entityPlayer.addStat(Achievements.achievementChocolateMilk, 1);
			   } else if (event.item.getEntityItem().getItem() == ChocolateItems.bowlLightChocolateMilk) {
				    event.entityPlayer.addStat(Achievements.achievementChocolateMilk, 1);
			   } else if (event.item.getEntityItem().getItem() == ChocolateItems.bowlWhiteChocolateMilk) {
				    event.entityPlayer.addStat(Achievements.achievementChocolateMilk, 1);
			   } else if (event.item.getEntityItem().getItem() == ChocolateItems.bowlRawChocolateMilk) {
				    event.entityPlayer.addStat(Achievements.achievementChocolateMilk, 1);
			   }
			   
			   if (event.item.getEntityItem().getItem() == ChocolateItems.chocolatebar) {
				    event.entityPlayer.addStat(Achievements.achievementChocolateBar, 1);
			   }
			   
			   if (event.item.getEntityItem().getItem() == ChocolateItems.chocolateball) {
				    event.entityPlayer.addStat(Achievements.achievementChocolateBall, 1);
			   }
			   
		 	}
	    }
	 
	@SubscribeEvent
	public void Crafting(ItemCraftedEvent event) {
		
		if( event.crafting.getItem() == ChocolateItems.cocoaPowder)
		{
			event.player.addStat(Achievements.achievementChocolatePowder, 1);
		}
		
		
		if( event.crafting.getItem() == ChocolateItems.fruitbar)
		{
			event.player.addStat(Achievements.achievementAdditions, 1);
			
		} else if( event.crafting.getItem() == ChocolateItems.nutbar)
		{
			event.player.addStat(Achievements.achievementAdditions, 1);
			
		} else if( event.crafting.getItem() == ChocolateItems.mintbar)
		{
			event.player.addStat(Achievements.achievementAdditions, 1);
		}
		
		
		if( event.crafting.getItem() == ChocolateItems.cookiesCream)
		{
			event.player.addStat(Achievements.achievementCookieBar, 1);
		}
		if( event.crafting.getItem() == ChocolateItems.goldChocolate)
		{
			event.player.addStat(Achievements.achievementGoldChocolateBar, 1);
		}
		
		
		if( event.crafting.getItem() == Item.getItemFromBlock(ChocolateBlocks.chocolateBlock) )
		{
			event.player.addStat(Achievements.achievementChocolateBlock, 1);
		}
		if( event.crafting.getItem() == Item.getItemFromBlock(ChocolateBlocks.brick) )
		{
			event.player.addStat(Achievements.achievementBuilding, 1);
		}
		
	}
}
