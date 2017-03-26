package com.chocolatemod.main;

import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.init.ChocolateItems;
import com.chocolatemod.init.SpecialBlocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() {
		ChocolateBlocks.registerRenders();
		ChocolateItems.registerRenders();
		SpecialBlocks.registerRenders();
		
	}

	 @Override
	    public final void registerInventoryModel(
	        final Item item,
	        final String id,
	        final int metadata) {
	        FMLLog.fine(
	            "Registering inventory for item %s and metadata %d",
	            id,
	            metadata);
	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	                item,
	                metadata,
	                new ModelResourceLocation(
	                    "kjd:" + id,
	                    "inventory"));
	    }

	    /**
	     * Helper to add a model variant in the ModelBakery.
	     * @param item the main item.
	     * @param variantName the variant name.
	     */
	    @Override
	    public final void addModelBakeryVariant(
	        final Item item,
	        final String variantName) {
	        FMLLog.fine(
	                "Registering variant %s for item %s.",
	                variantName,
	                item.getUnlocalizedName());
	        ModelBakery.addVariantName(
	                item,
	                variantName);
	    }

}