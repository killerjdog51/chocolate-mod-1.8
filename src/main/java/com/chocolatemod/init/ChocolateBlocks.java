package com.chocolatemod.init;

import com.chocolatemod.blocks.BlockDoubleSlab;
import com.chocolatemod.blocks.BlockHalfSlab;
import com.chocolatemod.blocks.BlockProperties;
import com.chocolatemod.blocks.BlockStair;
import com.chocolatemod.blocks.Blockslab;
import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChocolateBlocks {

	public static Block chocolateBlock;
	public static Block fruitBlock;
	public static Block nutBlock;
	public static Block mintBlock;
	public static Block hardChocolate;
	public static Block etched;
	public static Block brick;
	public static Block roundBrick;
	public static Block smallBrick;
	public static Block fancyBrick;
	public static Block chiseled;
	
	public static Block chocolateStair_default;
	public static Block chocolateStair_dark;
	public static Block chocolateStair_light;
	public static Block chocolateStair_white;
	public static Block chocolateStair_raw;
	public static Block brickStair_default;
	public static Block brickStair_dark;
	public static Block brickStair_light;
	public static Block brickStair_white;
	public static Block brickStair_raw;
	public static Block smallBrickStair_default;
	public static Block smallBrickStair_dark;
	public static Block smallBrickStair_light;
	public static Block smallBrickStair_white;
	public static Block smallBrickStair_raw;
	
	public static Block chocolateSlab;
	public static Block chocolateDoubleSlab;
	public static Block darkchocolateSlab;
	public static Block darkchocolateDoubleSlab;
	public static Block lightchocolateSlab;
	public static Block lightchocolateDoubleSlab;
	public static Block whitechocolateSlab;
	public static Block whitechocolateDoubleSlab;
	public static Block rawchocolateSlab;
	public static Block rawchocolateDoubleSlab;
	
	public static Block brickSlab;
	public static Block brickDoubleSlab;
	public static Block darkbrickSlab;
	public static Block darkbrickDoubleSlab;
	public static Block lightbrickSlab;
	public static Block lightbrickDoubleSlab;
	public static Block whitebrickSlab;
	public static Block whitebrickDoubleSlab;
	public static Block rawbrickSlab;
	public static Block rawbrickDoubleSlab;

	public static Block smallbrickSlab;
	public static Block smallbrickDoubleSlab;
	public static Block smalldarkbrickSlab;
	public static Block smalldarkbrickDoubleSlab;
	public static Block smalllightbrickSlab;
	public static Block smalllightbrickDoubleSlab;
	public static Block smallwhitebrickSlab;
	public static Block smallwhitebrickDoubleSlab;
	public static Block smallrawbrickSlab;
	public static Block smallrawbrickDoubleSlab;

	public static void init() {
		
		chocolateBlock = new BlockProperties("chocolateblock", Material.rock, 3, 5);
		fruitBlock = new BlockProperties("fruitblock", Material.rock, 3, 5);
		nutBlock = new BlockProperties("nutblock", Material.rock, 3, 5);
		mintBlock = new BlockProperties("mintblock", Material.rock, 3, 5);
		hardChocolate = new BlockProperties("hard", Material.rock, 3, 5);
		etched = new BlockProperties("etched", Material.rock, 3, 5);
		brick = new BlockProperties("brick", Material.rock, 3, 5);
		roundBrick = new BlockProperties("roundbrick", Material.rock, 3, 5);
		smallBrick = new BlockProperties("smallbrick", Material.rock, 3, 5);
		fancyBrick = new BlockProperties("fancybrick", Material.rock, 3, 5);
		chiseled = new BlockProperties("chiseled", Material.rock, 3, 5);

		chocolateStair_default = new BlockStair(chocolateBlock, 0).setUnlocalizedName("chocolatestair_default");
		chocolateStair_dark = new BlockStair(chocolateBlock, 0).setUnlocalizedName("chocolatestair_dark");
		chocolateStair_light = new BlockStair(chocolateBlock, 0).setUnlocalizedName("chocolatestair_light");
		chocolateStair_white = new BlockStair(chocolateBlock, 0).setUnlocalizedName("chocolatestair_white");
		chocolateStair_raw = new BlockStair(chocolateBlock, 0).setUnlocalizedName("chocolatestair_raw");
		brickStair_default = new BlockStair(brick, 0).setUnlocalizedName("brickstair_default");
		brickStair_dark = new BlockStair(brick, 0).setUnlocalizedName("brickstair_dark");
		brickStair_light = new BlockStair(brick, 0).setUnlocalizedName("brickstair_light");
		brickStair_white = new BlockStair(brick, 0).setUnlocalizedName("brickstair_white");
		brickStair_raw = new BlockStair(brick, 0).setUnlocalizedName("brickstair_raw");
		smallBrickStair_default = new BlockStair(smallBrick, 0).setUnlocalizedName("smallbrickstair_default");
		smallBrickStair_dark = new BlockStair(smallBrick, 0).setUnlocalizedName("smallbrickstair_dark");
		smallBrickStair_light = new BlockStair(smallBrick, 0).setUnlocalizedName("smallbrickstair_light");
		smallBrickStair_white = new BlockStair(smallBrick, 0).setUnlocalizedName("smallbrickstair_white");
		smallBrickStair_raw = new BlockStair(smallBrick, 0).setUnlocalizedName("smallbrickstair_raw");
		
		chocolateSlab = new BlockHalfSlab(0, 0).setUnlocalizedName("chocolateslab_default");
		chocolateDoubleSlab = new BlockDoubleSlab(0, 0).setUnlocalizedName("chocolateslab_default_double");
		darkchocolateSlab = new BlockHalfSlab(1, 0).setUnlocalizedName("chocolateslab_dark");
		darkchocolateDoubleSlab = new BlockDoubleSlab(1, 0).setUnlocalizedName("chocolateslab_dark_double");
		lightchocolateSlab = new BlockHalfSlab(2, 0).setUnlocalizedName("chocolateslab_light");
		lightchocolateDoubleSlab = new BlockDoubleSlab(2, 0).setUnlocalizedName("chocolateslab_light_double");
		whitechocolateSlab = new BlockHalfSlab(3, 0).setUnlocalizedName("chocolateslab_white");
		whitechocolateDoubleSlab = new BlockDoubleSlab(3, 0).setUnlocalizedName("chocolateslab_white_double");
		rawchocolateSlab = new BlockHalfSlab(4, 0).setUnlocalizedName("chocolateslab_raw");
		rawchocolateDoubleSlab = new BlockDoubleSlab(4, 0).setUnlocalizedName("chocolateslab_raw_double");

		brickSlab = new BlockHalfSlab(0, 1).setUnlocalizedName("brickslab_default");
		brickDoubleSlab = new BlockDoubleSlab(0, 1).setUnlocalizedName("brickslab_default_double");
		darkbrickSlab = new BlockHalfSlab(1, 1).setUnlocalizedName("brickslab_dark");
		darkbrickDoubleSlab = new BlockDoubleSlab(1, 1).setUnlocalizedName("brickslab_dark_double");
		lightbrickSlab = new BlockHalfSlab(2, 1).setUnlocalizedName("brickslab_light");
		lightbrickDoubleSlab = new BlockDoubleSlab(2, 1).setUnlocalizedName("brickslab_light_double");
		whitebrickSlab = new BlockHalfSlab(3, 1).setUnlocalizedName("brickslab_white");
		whitebrickDoubleSlab = new BlockDoubleSlab(3, 1).setUnlocalizedName("brickslab_white_double");
		rawbrickSlab = new BlockHalfSlab(4, 1).setUnlocalizedName("brickslab_raw");
		rawbrickDoubleSlab = new BlockDoubleSlab(4, 1).setUnlocalizedName("brickslab_raw_double");

		smallbrickSlab = new BlockHalfSlab(0, 2).setUnlocalizedName("smallslab_default");
		smallbrickDoubleSlab = new BlockDoubleSlab(0, 2).setUnlocalizedName("smallslab_default_double");
		smalldarkbrickSlab = new BlockHalfSlab(1, 2).setUnlocalizedName("smallslab_dark");
		smalldarkbrickDoubleSlab = new BlockDoubleSlab(1, 2).setUnlocalizedName("smallslab_dark_double");
		smalllightbrickSlab = new BlockHalfSlab(2, 2).setUnlocalizedName("smallslab_light");
		smalllightbrickDoubleSlab = new BlockDoubleSlab(2, 2).setUnlocalizedName("smallslab_light_double");
		smallwhitebrickSlab = new BlockHalfSlab(3, 2).setUnlocalizedName("smallslab_white");
		smallwhitebrickDoubleSlab = new BlockDoubleSlab(3, 2).setUnlocalizedName("smallslab_white_double");
		smallrawbrickSlab = new BlockHalfSlab(4, 2).setUnlocalizedName("smallslab_raw");
		smallrawbrickDoubleSlab = new BlockDoubleSlab(4, 2).setUnlocalizedName("smallslab_raw_double");

	}
	
	public static void register() {
		
		GameRegistry.registerBlock(chocolateBlock, itemBlockMeta.class ,"chocolateblock");
		GameRegistry.registerBlock(fruitBlock, itemBlockMeta.class, "fruitblock");
		GameRegistry.registerBlock(nutBlock, itemBlockMeta.class ,"nutblock");
		GameRegistry.registerBlock(mintBlock, itemBlockMeta.class ,"mintblock");
		GameRegistry.registerBlock(hardChocolate, itemBlockMeta.class, "hard");
		GameRegistry.registerBlock(etched, itemBlockMeta.class, "etched");

		GameRegistry.registerBlock(brick, itemBlockMeta.class, "brick");
		GameRegistry.registerBlock(roundBrick, itemBlockMeta.class, "roundbrick");
		GameRegistry.registerBlock(smallBrick, itemBlockMeta.class, "smallbrick");
		GameRegistry.registerBlock(fancyBrick, itemBlockMeta.class, "fancybrick");
		GameRegistry.registerBlock(chiseled, itemBlockMeta.class, "chiseled");

        GameRegistry.registerBlock(chocolateStair_default, "chocolatestair_default");
        GameRegistry.registerBlock(chocolateStair_dark, "chocolatestair_dark");
        GameRegistry.registerBlock(chocolateStair_light, "chocolatestair_light");
        GameRegistry.registerBlock(chocolateStair_white, "chocolatestair_white");
        GameRegistry.registerBlock(chocolateStair_raw, "chocolatestair_raw");
        GameRegistry.registerBlock(brickStair_default, "brickstair_default");
        GameRegistry.registerBlock(brickStair_dark, "brickstair_dark");
        GameRegistry.registerBlock(brickStair_light, "brickstair_light");
        GameRegistry.registerBlock(brickStair_white, "brickstair_white");
        GameRegistry.registerBlock(brickStair_raw, "brickstair_raw");
        GameRegistry.registerBlock(smallBrickStair_default, "smallbrickstair_default");
        GameRegistry.registerBlock(smallBrickStair_dark, "smallbrickstair_dark");
        GameRegistry.registerBlock(smallBrickStair_light, "smallbrickstair_light");
        GameRegistry.registerBlock(smallBrickStair_white, "smallbrickstair_white");
        GameRegistry.registerBlock(smallBrickStair_raw, "smallbrickstair_raw");
        
        GameRegistry.registerBlock(chocolateSlab, ItemBlockSlab.class, "chocolateslab_default", chocolateSlab, chocolateDoubleSlab, false);
        GameRegistry.registerBlock(chocolateDoubleSlab, ItemBlockSlab.class, "chocolateslab_default_double", chocolateSlab, chocolateDoubleSlab, true);
        GameRegistry.registerBlock(darkchocolateSlab, ItemBlockSlab.class, "chocolateslab_dark", darkchocolateSlab, darkchocolateDoubleSlab, false);
        GameRegistry.registerBlock(darkchocolateDoubleSlab, ItemBlockSlab.class, "chocolateslab_dark_double", darkchocolateSlab, darkchocolateDoubleSlab, true);
        GameRegistry.registerBlock(lightchocolateSlab, ItemBlockSlab.class, "chocolateslab_light", lightchocolateSlab, lightchocolateDoubleSlab, false);
        GameRegistry.registerBlock(lightchocolateDoubleSlab, ItemBlockSlab.class, "chocolateslab_light_double", lightchocolateSlab, lightchocolateDoubleSlab, true);
        GameRegistry.registerBlock(whitechocolateSlab, ItemBlockSlab.class, "chocolateslab_white", whitechocolateSlab, whitechocolateDoubleSlab, false);
        GameRegistry.registerBlock(whitechocolateDoubleSlab, ItemBlockSlab.class, "chocolateslab_white_double", whitechocolateSlab, whitechocolateDoubleSlab, true);
        GameRegistry.registerBlock(rawchocolateSlab, ItemBlockSlab.class, "chocolateslab_raw", rawchocolateSlab, rawchocolateDoubleSlab, false);
        GameRegistry.registerBlock(rawchocolateDoubleSlab, ItemBlockSlab.class, "chocolateslab_raw_double", rawchocolateSlab, rawchocolateDoubleSlab, true);

        GameRegistry.registerBlock(brickSlab, ItemBlockSlab.class, "brickslab_default", brickSlab, brickDoubleSlab, false);
        GameRegistry.registerBlock(brickDoubleSlab, ItemBlockSlab.class, "brickslab_default_double", brickSlab, brickDoubleSlab, true);
        GameRegistry.registerBlock(darkbrickSlab, ItemBlockSlab.class, "brickslab_dark", darkbrickSlab, darkbrickDoubleSlab, false);
        GameRegistry.registerBlock(darkbrickDoubleSlab, ItemBlockSlab.class, "brickslab_dark_double", darkbrickSlab, darkbrickDoubleSlab, true);
        GameRegistry.registerBlock(lightbrickSlab, ItemBlockSlab.class, "brickslab_light", lightbrickSlab, lightbrickDoubleSlab, false);
        GameRegistry.registerBlock(lightbrickDoubleSlab, ItemBlockSlab.class, "brickslab_light_double", lightbrickSlab, lightbrickDoubleSlab, true);
        GameRegistry.registerBlock(whitebrickSlab, ItemBlockSlab.class, "brickslab_white", whitebrickSlab, whitebrickDoubleSlab, false);
        GameRegistry.registerBlock(whitebrickDoubleSlab, ItemBlockSlab.class, "brickslab_white_double", whitebrickSlab, whitebrickDoubleSlab, true);
        GameRegistry.registerBlock(rawbrickSlab, ItemBlockSlab.class, "brickslab_raw", rawbrickSlab, rawbrickDoubleSlab, false);
        GameRegistry.registerBlock(rawbrickDoubleSlab, ItemBlockSlab.class, "brickslab_raw_double", rawbrickSlab, rawbrickDoubleSlab, true);

        GameRegistry.registerBlock(smallbrickSlab, ItemBlockSlab.class, "smallslab_default", smallbrickSlab, smallbrickDoubleSlab, false);
        GameRegistry.registerBlock(smallbrickDoubleSlab, ItemBlockSlab.class, "smallslab_default_double", smallbrickSlab, smallbrickDoubleSlab, true);
        GameRegistry.registerBlock(smalldarkbrickSlab, ItemBlockSlab.class, "smallslab_dark", smalldarkbrickSlab, smalldarkbrickDoubleSlab, false);
        GameRegistry.registerBlock(smalldarkbrickDoubleSlab, ItemBlockSlab.class, "smallslab_dark_double", smalldarkbrickSlab, smalldarkbrickDoubleSlab, true);
        GameRegistry.registerBlock(smalllightbrickSlab, ItemBlockSlab.class, "smallslab_light", smalllightbrickSlab, smalllightbrickDoubleSlab, false);
        GameRegistry.registerBlock(smalllightbrickDoubleSlab, ItemBlockSlab.class, "smallslab_light_double", smalllightbrickSlab, smalllightbrickDoubleSlab, true);
        GameRegistry.registerBlock(smallwhitebrickSlab, ItemBlockSlab.class, "smallslab_white", smallwhitebrickSlab, smallwhitebrickDoubleSlab, false);
        GameRegistry.registerBlock(smallwhitebrickDoubleSlab, ItemBlockSlab.class, "smallslab_white_double", smallwhitebrickSlab, smallwhitebrickDoubleSlab, true);
        GameRegistry.registerBlock(smallrawbrickSlab, ItemBlockSlab.class, "smallslab_raw", smallrawbrickSlab, smallrawbrickDoubleSlab, false);
        GameRegistry.registerBlock(smallrawbrickDoubleSlab, ItemBlockSlab.class, "smallslab_raw_double", smallrawbrickSlab, smallrawbrickDoubleSlab, true);

	}
	
	public static void registerRenders() {
		
		Item itemChocolateBlock = Item.getItemFromBlock(chocolateBlock);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChocolateBlock, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolate_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChocolateBlock, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolate_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChocolateBlock, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolate_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChocolateBlock, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolate_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChocolateBlock, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolate_raw", "inventory"));
		ModelBakery.addVariantName(itemChocolateBlock, new String[]{"kjd:chocolate_default", "kjd:chocolate_dark", "kjd:chocolate_light", "kjd:chocolate_white", "kjd:chocolate_raw"});

		Item itemFruitBlock = Item.getItemFromBlock(fruitBlock);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFruitBlock, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruit_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFruitBlock, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruit_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFruitBlock, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruit_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFruitBlock, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruit_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFruitBlock, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "fruit_raw", "inventory"));
		ModelBakery.addVariantName(itemFruitBlock, new String[]{"kjd:fruit_default", "kjd:fruit_dark", "kjd:fruit_light", "kjd:fruit_white", "kjd:fruit_raw"});

		Item itemNutBlock = Item.getItemFromBlock(nutBlock);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemNutBlock, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "nut_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemNutBlock, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "nut_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemNutBlock, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "nut_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemNutBlock, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "nut_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemNutBlock, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "nut_raw", "inventory"));
		ModelBakery.addVariantName(itemNutBlock, new String[]{"kjd:nut_default", "kjd:nut_dark", "kjd:nut_light", "kjd:nut_white", "kjd:nut_raw"});

		Item itemMintBlock = Item.getItemFromBlock(mintBlock);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemMintBlock, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "mint_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemMintBlock, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "mint_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemMintBlock, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "mint_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemMintBlock, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "mint_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemMintBlock, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "mint_raw", "inventory"));
		ModelBakery.addVariantName(itemMintBlock, new String[]{"kjd:mint_default", "kjd:mint_dark", "kjd:mint_light", "kjd:mint_white", "kjd:mint_raw"});

		Item itemHard = Item.getItemFromBlock(hardChocolate);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemHard, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "hard_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemHard, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "hard_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemHard, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "hard_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemHard, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "hard_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemHard, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "hard_raw", "inventory"));
		ModelBakery.addVariantName(itemHard, new String[]{"kjd:hard_default", "kjd:hard_dark", "kjd:hard_light", "kjd:hard_white", "kjd:hard_raw"});

		Item itemEtched = Item.getItemFromBlock(etched);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemEtched, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "etched_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemEtched, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "etched_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemEtched, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "etched_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemEtched, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "etched_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemEtched, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "etched_raw", "inventory"));
		ModelBakery.addVariantName(itemEtched, new String[]{"kjd:etched_default", "kjd:etched_dark", "kjd:etched_light", "kjd:etched_white", "kjd:etched_raw"});

		Item itemChiseled = Item.getItemFromBlock(chiseled);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChiseled, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chiseled_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChiseled, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "chiseled_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChiseled, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "chiseled_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChiseled, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "chiseled_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChiseled, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "chiseled_raw", "inventory"));
		ModelBakery.addVariantName(itemChiseled, new String[]{"kjd:chiseled_default", "kjd:chiseled_dark", "kjd:chiseled_light", "kjd:chiseled_white", "kjd:chiseled_raw"});

		Item itemBrick = Item.getItemFromBlock(brick);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBrick, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brick_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBrick, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "brick_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBrick, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "brick_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBrick, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "brick_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBrick, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "brick_raw", "inventory"));
		ModelBakery.addVariantName(itemBrick, new String[]{"kjd:brick_default", "kjd:brick_dark", "kjd:brick_light", "kjd:brick_white", "kjd:brick_raw"});

		Item itemRoundBrick = Item.getItemFromBlock(roundBrick);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRoundBrick, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "Rbrick_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRoundBrick, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "Rbrick_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRoundBrick, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "Rbrick_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRoundBrick, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "Rbrick_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRoundBrick, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "Rbrick_raw", "inventory"));
		ModelBakery.addVariantName(itemRoundBrick, new String[]{"kjd:Rbrick_default", "kjd:Rbrick_dark", "kjd:Rbrick_light", "kjd:Rbrick_white", "kjd:Rbrick_raw"});

		Item itemSmallBrick = Item.getItemFromBlock(smallBrick);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallBrick, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "Sbrick_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallBrick, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "Sbrick_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallBrick, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "Sbrick_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallBrick, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "Sbrick_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallBrick, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "Sbrick_raw", "inventory"));
		ModelBakery.addVariantName(itemSmallBrick, new String[]{"kjd:Sbrick_default", "kjd:Sbrick_dark", "kjd:Sbrick_light", "kjd:Sbrick_white", "kjd:Sbrick_raw"});

		Item itemFancyBrick = Item.getItemFromBlock(fancyBrick);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFancyBrick, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "Fbrick_default", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFancyBrick, 1, new ModelResourceLocation(MainRegistry.MODID + ":" + "Fbrick_dark", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFancyBrick, 2, new ModelResourceLocation(MainRegistry.MODID + ":" + "Fbrick_light", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFancyBrick, 3, new ModelResourceLocation(MainRegistry.MODID + ":" + "Fbrick_white", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemFancyBrick, 4, new ModelResourceLocation(MainRegistry.MODID + ":" + "Fbrick_raw", "inventory"));
		ModelBakery.addVariantName(itemFancyBrick, new String[]{"kjd:Fbrick_default", "kjd:Fbrick_dark", "kjd:Fbrick_light", "kjd:Fbrick_white", "kjd:Fbrick_raw"});

		
		Item itemChocolateStair = Item.getItemFromBlock(chocolateStair_default);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChocolateStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatestair_default", "inventory"));
		Item itemDarkChocolateStair = Item.getItemFromBlock(chocolateStair_dark);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemDarkChocolateStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatestair_dark", "inventory"));
		Item itemLightChocolateStair = Item.getItemFromBlock(chocolateStair_light);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemLightChocolateStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatestair_light", "inventory"));
		Item itemWhiteChocolateStair = Item.getItemFromBlock(chocolateStair_white);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemWhiteChocolateStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatestair_white", "inventory"));
		Item itemRawChocolateStair = Item.getItemFromBlock(chocolateStair_raw);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRawChocolateStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolatestair_raw", "inventory"));
		
		Item itemBrickStair = Item.getItemFromBlock(brickStair_default);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickstair_default", "inventory"));
		Item itemDarkBrickStair = Item.getItemFromBlock(brickStair_dark);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemDarkBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickstair_dark", "inventory"));
		Item itemLightBrickStair = Item.getItemFromBlock(brickStair_light);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemLightBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickstair_light", "inventory"));
		Item itemWhiteBrickStair = Item.getItemFromBlock(brickStair_white);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemWhiteBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickstair_white", "inventory"));
		Item itemRawBrickStair = Item.getItemFromBlock(brickStair_raw);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRawBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickstair_raw", "inventory"));
		
		Item itemSmallBrickStair = Item.getItemFromBlock(smallBrickStair_default);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallbrickstair_default", "inventory"));
		Item itemSmallDarkBrickStair = Item.getItemFromBlock(smallBrickStair_dark);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallDarkBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallbrickstair_dark", "inventory"));
		Item itemSmallLightBrickStair = Item.getItemFromBlock(smallBrickStair_light);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallLightBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallbrickstair_light", "inventory"));
		Item itemSmallWhiteBrickStair = Item.getItemFromBlock(smallBrickStair_white);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallWhiteBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallbrickstair_white", "inventory"));
		Item itemSmallRawBrickStair = Item.getItemFromBlock(smallBrickStair_raw);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallRawBrickStair, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallbrickstair_raw", "inventory"));
		
		
		Item itemChocolateSlab = Item.getItemFromBlock(chocolateSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemChocolateSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateslab_default", "inventory"));
		Item itemDarkChocolateSlab = Item.getItemFromBlock(darkchocolateSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemDarkChocolateSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateslab_dark", "inventory"));
		Item itemLightChocolateSlab = Item.getItemFromBlock(lightchocolateSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemLightChocolateSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateslab_light", "inventory"));
		Item itemWhiteChocolateSlab = Item.getItemFromBlock(whitechocolateSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemWhiteChocolateSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateslab_white", "inventory"));
		Item itemRawChocolateSlab = Item.getItemFromBlock(rawchocolateSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRawChocolateSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "chocolateslab_raw", "inventory"));
		
		Item itemBrickSlab = Item.getItemFromBlock(brickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickslab_default", "inventory"));
		Item itemDarkBrickSlab = Item.getItemFromBlock(darkbrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemDarkBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickslab_dark", "inventory"));
		Item itemLightBrickSlab = Item.getItemFromBlock(lightbrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemLightBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickslab_light", "inventory"));
		Item itemWhiteBrickSlab = Item.getItemFromBlock(whitebrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemWhiteBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickslab_white", "inventory"));
		Item itemRawBrickSlab = Item.getItemFromBlock(rawbrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRawBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "brickslab_raw", "inventory"));
		
		Item itemSmallBrickSlab = Item.getItemFromBlock(smallbrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSmallBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallslab_default", "inventory"));
		Item itemDarkSmallBrickSlab = Item.getItemFromBlock(smalldarkbrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemDarkSmallBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallslab_dark", "inventory"));
		Item itemLightSmallBrickSlab = Item.getItemFromBlock(smalllightbrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemLightSmallBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallslab_light", "inventory"));
		Item itemWhiteSmallBrickSlab = Item.getItemFromBlock(smallwhitebrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemWhiteSmallBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallslab_white", "inventory"));
		Item itemRawSmallBrickSlab = Item.getItemFromBlock(smallrawbrickSlab);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemRawSmallBrickSlab, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "smallslab_raw", "inventory"));
		
	}
}
