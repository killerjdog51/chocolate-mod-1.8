package com.chocolatemod.init;

import com.chocolatemod.items.ChocolateItem;
import com.chocolatemod.items.ChocolateItemMeta;
import com.chocolatemod.items.chocolateFood;
import com.chocolatemod.items.chocolateFoodMeta;
import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.specialitems.BowlChocolateMilk;
import com.chocolatemod.specialitems.BowlDarkChocolateMilk;
import com.chocolatemod.specialitems.BowlLightChocolateMilk;
import com.chocolatemod.specialitems.BowlRawChocolateMilk;
import com.chocolatemod.specialitems.BowlWarmChocolateMilk;
import com.chocolatemod.specialitems.BowlWarmDarkMilk;
import com.chocolatemod.specialitems.BowlWarmLightMilk;
import com.chocolatemod.specialitems.BowlWarmRawMilk;
import com.chocolatemod.specialitems.BowlWarmWhiteMilk;
import com.chocolatemod.specialitems.BowlWhiteChocolateMilk;
import com.chocolatemod.specialitems.bowlMilk;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChocolateItems {

	public static Item chocolatebar;
	public static Item fruitbar;
	public static Item nutbar;
	public static Item mintbar;
	public static Item chocolateball;
	public static Item fruitball;
	public static Item nutball;
	public static Item mintball;
	public static Item cookiesCream;
	public static Item goldChocolate;
	
	public static Item cocoaPowder;
	public static Item fruitBits;

	public static Item bowlMilk;
	public static Item bowlLightChocolateMilk;
	public static Item bowlWhiteChocolateMilk;
	public static Item bowlChocolateMilk;
	public static Item bowlDarkChocolateMilk;
	public static Item bowlRawChocolateMilk;
	public static Item bowlWarmChocolateMilk;
	public static Item bowlWarmLightMilk;
	public static Item bowlWarmDarkMilk;
	public static Item bowlWarmWhiteMilk;
	public static Item bowlWarmRawMilk;
	
	public static void init() {
		chocolatebar = new chocolateFoodMeta(4, 0.2F, false).setUnlocalizedName("chocolatebar");
		fruitbar = new chocolateFoodMeta(6, 0.4F, false).setUnlocalizedName("fruitbar");
		nutbar = new chocolateFoodMeta(6, 0.4F, false).setUnlocalizedName("nutbar");
		mintbar = new chocolateFoodMeta(6, 0.4F, false).setUnlocalizedName("mintbar");
		
		chocolateball = new chocolateFoodMeta(2, 0.3F, false).setUnlocalizedName("chocolateball");
		fruitball = new chocolateFoodMeta(4, 0.5F, false).setUnlocalizedName("fruitball");
		nutball = new chocolateFoodMeta(4, 0.5F, false).setUnlocalizedName("nutball");
		mintball = new chocolateFoodMeta(4, 0.5F, false).setUnlocalizedName("mintball");
		
		cookiesCream = new chocolateFood(6, 0.3F, false).setUnlocalizedName("cookiesCream");
		goldChocolate = new chocolateFood(8, 1.5F, false).setUnlocalizedName("goldchocolate");
		
		cocoaPowder = new ChocolateItem().setUnlocalizedName("cocoapowder");
		fruitBits = new ChocolateItem().setUnlocalizedName("fruitbits");

		bowlMilk = new bowlMilk(2, 0.4F, false).setUnlocalizedName("bowlmilk").setContainerItem(Items.bowl);
		bowlLightChocolateMilk = new BowlLightChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowllightmilk").setContainerItem(Items.bowl);
		bowlWhiteChocolateMilk = new BowlWhiteChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowlwhitemilk").setContainerItem(Items.bowl);
		bowlChocolateMilk = new BowlChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowlchocolatemilk").setContainerItem(Items.bowl);
		bowlDarkChocolateMilk = new BowlDarkChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowldarkmilk").setContainerItem(Items.bowl);
		bowlRawChocolateMilk = new BowlRawChocolateMilk(2, 0.4F, false).setUnlocalizedName("bowlrawmilk").setContainerItem(Items.bowl);

		bowlWarmChocolateMilk = new BowlWarmChocolateMilk(3, 0.5F, false).setUnlocalizedName("bowlwarmchocolatemilk").setContainerItem(Items.bowl);
		bowlWarmDarkMilk = new BowlWarmDarkMilk(3, 0.5F, false).setUnlocalizedName("bowlwarmdarkmilk").setContainerItem(Items.bowl);
		bowlWarmLightMilk = new BowlWarmLightMilk(3, 0.5F, false).setUnlocalizedName("bowlwarmlightmilk").setContainerItem(Items.bowl);
		bowlWarmWhiteMilk = new BowlWarmWhiteMilk(3, 0.5F, false).setUnlocalizedName("bowlwarmwhitemilk").setContainerItem(Items.bowl);
		bowlWarmRawMilk = new BowlWarmRawMilk(3, 0.5F, false).setUnlocalizedName("bowlwarmrawmilk").setContainerItem(Items.bowl);

	}
	
	public static void register() {
		GameRegistry.registerItem(chocolatebar, "chocolatebar");
		GameRegistry.registerItem(fruitbar, "fruitbar");
		GameRegistry.registerItem(nutbar, "nutbar");
		GameRegistry.registerItem(mintbar, "mintbar");
		
		GameRegistry.registerItem(chocolateball, "chocolateball");
		GameRegistry.registerItem(fruitball, "fruitball");
		GameRegistry.registerItem(nutball, "nutball");
		GameRegistry.registerItem(mintball, "mintball");
		
		GameRegistry.registerItem(cookiesCream, "cookiescream");
		GameRegistry.registerItem(goldChocolate, "goldchocolatebar");
		
		GameRegistry.registerItem(cocoaPowder, "cocoapowder");
		GameRegistry.registerItem(fruitBits, "fruitbits");

		GameRegistry.registerItem(bowlMilk, "bowlmilk");
		GameRegistry.registerItem(bowlWhiteChocolateMilk, "bowlwhitemilk");
		GameRegistry.registerItem(bowlLightChocolateMilk, "bowllightmilk");
		GameRegistry.registerItem(bowlChocolateMilk, "bowlchocolatemilk");
		GameRegistry.registerItem(bowlDarkChocolateMilk, "bowldarkmilk");
		GameRegistry.registerItem(bowlRawChocolateMilk, "bowlrawmilk");
		
		GameRegistry.registerItem(bowlWarmWhiteMilk, "bowlwarmwhitemilk");
		GameRegistry.registerItem(bowlWarmLightMilk, "bowlwarmlightmilk");
		GameRegistry.registerItem(bowlWarmChocolateMilk, "bowlwarmchocolatemilk");
		GameRegistry.registerItem(bowlWarmDarkMilk, "bowlwarmdarkmilk");
		GameRegistry.registerItem(bowlWarmRawMilk, "bowlwarmrawmilk");

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

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolateball, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateball_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolateball, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateball_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolateball, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateball_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolateball, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateball_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chocolateball, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateball_raw", "inventory"));
		ModelBakery.addVariantName(chocolatebar, "kjd:chocolateball_default", "kjd:chocolateball_dark", "kjd:chocolateball_light", "kjd:chocolateball_white", "kjd:chocolateball_raw");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitball, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitball_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitball, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitball_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitball, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitball_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitball, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitball_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitball, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitball_raw", "inventory"));
		ModelBakery.addVariantName(fruitbar, "kjd:fruitball_default", "kjd:fruitball_dark", "kjd:fruitball_light", "kjd:fruitball_white", "kjd:fruitball_raw");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutball, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutball_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutball, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutball_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutball, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutball_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutball, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutball_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(nutball, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "nutball_raw", "inventory"));
		ModelBakery.addVariantName(nutbar, "kjd:nutball_default", "kjd:nutball_dark", "kjd:nutball_light", "kjd:nutball_white", "kjd:nutball_raw");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintball, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintball_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintball, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintball_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintball, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintball_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintball, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintball_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mintball, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "mintball_raw", "inventory"));
		ModelBakery.addVariantName(mintbar, "kjd:mintball_default", "kjd:mintball_dark", "kjd:mintball_light", "kjd:mintball_white", "kjd:mintball_raw");

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(cookiesCream, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "cookiescream", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(goldChocolate, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "goldchocolatebar", "inventory"));

		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(cocoaPowder, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "cocoapowder", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fruitBits, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruitbits", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlmilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlLightChocolateMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowllightmilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlWhiteChocolateMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlwhitemilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlChocolateMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlchocolatemilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlDarkChocolateMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowldarkmilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlRawChocolateMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlrawmilk", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlWarmChocolateMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlwarmchocolatemilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlWarmDarkMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlwarmdarkmilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlWarmLightMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlwarmlightmilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlWarmWhiteMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlwarmwhitemilk", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowlWarmRawMilk, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "bowlwarmrawmilk", "inventory"));

	}
}
