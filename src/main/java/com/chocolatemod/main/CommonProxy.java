package com.chocolatemod.main;

import com.chocolatemod.init.ChocolateBlocks;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public abstract class CommonProxy {

	public void registerRenders() {
		
	}
	
	public abstract void registerInventoryModel(
	        final Item item,
	        final String id,
	        final int metadata);

	    /**
	     * Helper to add a model variant in the ModelBakery.
	     * @param item the main item.
	     * @param variantName the variant name.
	     */
	    public abstract void addModelBakeryVariant(
	        final Item item,
	        final String variantName);
}