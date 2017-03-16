package com.chocolatemod.init;

import com.chocolatemod.items.chocolateFood;
import com.chocolatemod.main.MainRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChocolateItems {

	public static Item chocolatebar;
	public static Item fruitbar;
	public static Item nutbar;
	public static Item mintbar;
	
	public static void init() {
		chocolatebar = new chocolateFood(4, 0.2F, false, true).setUnlocalizedName("chocolatebar");
		fruitbar = new chocolateFood(6, 0.4F, false, true).setUnlocalizedName("fruitbar");
		nutbar = new chocolateFood(6, 0.4F, false, true).setUnlocalizedName("nutbar");
		mintbar = new chocolateFood(6, 0.4F, false, true).setUnlocalizedName("mintbar");

	}
	
	public static void register() {
		GameRegistry.registerItem(chocolatebar, "chocolatebar");
		GameRegistry.registerItem(fruitbar, "fruitbar");
		GameRegistry.registerItem(nutbar, "nutbar");
		GameRegistry.registerItem(mintbar, "mintbar");

	}
	
	public static void registerRenders() {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolatebar, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatebar_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolatebar, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatebar_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolatebar, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatebar_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolatebar, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatebar_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolatebar, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatebar_raw", "inventory"));
		ModelBakery.addVariantName(chocolatebar, "kjd:chocolatebar_default", "kjd:chocolatebar_dark", "kjd:chocolatebar_light", "kjd:chocolatebar_white", "kjd:chocolatebar_raw");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitbar, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitbar_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitbar, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitbar_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitbar, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitbar_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitbar, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitbar_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitbar, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitbar_raw", "inventory"));
		ModelBakery.addVariantName(fruitbar, "kjd:fruitbar_default", "kjd:fruitbar_dark", "kjd:fruitbar_light", "kjd:fruitbar_white", "kjd:fruitbar_raw");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutbar, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutbar_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutbar, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutbar_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutbar, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutbar_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutbar, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutbar_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutbar, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutbar_raw", "inventory"));
		ModelBakery.addVariantName(nutbar, "kjd:nutbar_default", "kjd:nutbar_dark", "kjd:nutbar_light", "kjd:nutbar_white", "kjd:nutbar_raw");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintbar, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintbar_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintbar, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintbar_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintbar, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintbar_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintbar, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintbar_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintbar, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintbar_raw", "inventory"));
		ModelBakery.addVariantName(mintbar, "kjd:mintbar_default", "kjd:mintbar_dark", "kjd:mintbar_light", "kjd:mintbar_white", "kjd:mintbar_raw");

	}
}
