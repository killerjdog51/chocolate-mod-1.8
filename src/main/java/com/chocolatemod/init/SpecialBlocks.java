package com.chocolatemod.init;

import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.specialblocks.BlockChocolateBall;
import com.chocolatemod.specialblocks.BlockChocolateBar;
import com.chocolatemod.specialblocks.BlockChocolateCaulron;
import com.chocolatemod.specialblocks.BlockDarkCauldron;
import com.chocolatemod.specialblocks.BlockDarkChocolateBall;
import com.chocolatemod.specialblocks.BlockDarkChocolateBar;
import com.chocolatemod.specialblocks.BlockLightCauldron;
import com.chocolatemod.specialblocks.BlockLightChocolateBall;
import com.chocolatemod.specialblocks.BlockLightChocolateBar;
import com.chocolatemod.specialblocks.BlockMilkCauldron;
import com.chocolatemod.specialblocks.BlockMold;
import com.chocolatemod.specialblocks.BlockRawCauldron;
import com.chocolatemod.specialblocks.BlockRawChocolateBall;
import com.chocolatemod.specialblocks.BlockRawChocolateBar;
import com.chocolatemod.specialblocks.BlockWhiteCauldron;
import com.chocolatemod.specialblocks.BlockWhiteChocolateBall;
import com.chocolatemod.specialblocks.BlockWhiteChocolateBar;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SpecialBlocks {
	

	public static Block Cauldron1; //Milk to Light Chocolate
	public static Block Cauldron2; //Light Chocolate to White/normal Chocolate
	public static Block Cauldron3; //Chocolate to Dark Chocolate
	public static Block Cauldron4; //Dark Chocolate to Raw Chocolate
	public static Block Cauldron5; //White Chocolate to Raw
	public static Block Cauldron6; //Raw Chocolate to White
	public static Block BarMold;
	public static Block BallMold;
	public static Block ChocolateBarMold;
	public static Block ChocolateBallMold;
	public static Block DarkChocolateBarMold;
	public static Block DarkChocolateBallMold;
	public static Block LightChocolateBarMold;
	public static Block LightChocolateBallMold;
	public static Block WhiteChocolateBarMold;
	public static Block WhiteChocolateBallMold;
	public static Block RawChocolateBarMold;
	public static Block RawChocolateBallMold;
	
	public static void init() {
	
		 Cauldron1 = (new BlockMilkCauldron());
		 Cauldron2 = (new BlockLightCauldron());
		 Cauldron3 = (new BlockChocolateCaulron());
		 Cauldron4 = (new BlockDarkCauldron());
		 Cauldron5 = (new BlockWhiteCauldron());
		 Cauldron6 = (new BlockRawCauldron());
		 
		 BarMold = (new BlockMold("barmold", 0));
		 BallMold = (new BlockMold("ballmold", 1));
		 
		 ChocolateBarMold = (new BlockChocolateBar());
		 ChocolateBallMold = (new BlockChocolateBall());
		 DarkChocolateBarMold = (new BlockDarkChocolateBar());
		 DarkChocolateBallMold = (new BlockDarkChocolateBall());
		 LightChocolateBarMold = (new BlockLightChocolateBar());
		 LightChocolateBallMold = (new BlockLightChocolateBall());
		 WhiteChocolateBarMold = (new BlockWhiteChocolateBar());
		 WhiteChocolateBallMold = (new BlockWhiteChocolateBall());
		 RawChocolateBarMold = (new BlockRawChocolateBar());
		 RawChocolateBallMold = (new BlockRawChocolateBall());

	}
	
	public static void register() {
		
		GameRegistry.registerBlock(Cauldron1, "milkcauldron");
		GameRegistry.registerBlock(Cauldron2, "lightcauldron");
		GameRegistry.registerBlock(Cauldron3, "chocolatecauldron");
		GameRegistry.registerBlock(Cauldron4, "darkcauldron");
		GameRegistry.registerBlock(Cauldron5, "whitecauldron");
		GameRegistry.registerBlock(Cauldron6, "rawcauldron");
		
		GameRegistry.registerBlock(BarMold, "barmold");
		GameRegistry.registerBlock(BallMold, "ballmold");
		GameRegistry.registerBlock(ChocolateBarMold, "chocolatebarmold");
		GameRegistry.registerBlock(ChocolateBallMold, "chocolateballmold");
		GameRegistry.registerBlock(DarkChocolateBarMold, "darkchocolatebarmold");
		GameRegistry.registerBlock(DarkChocolateBallMold, "darkchocolateballmold");
		GameRegistry.registerBlock(LightChocolateBarMold, "lightchocolatebarmold");
		GameRegistry.registerBlock(LightChocolateBallMold, "lightchocolateballmold");
		GameRegistry.registerBlock(WhiteChocolateBarMold, "whitechocolatebarmold");
		GameRegistry.registerBlock(WhiteChocolateBallMold, "whitechocolateballmold");
		GameRegistry.registerBlock(RawChocolateBarMold, "rawchocolatebarmold");
		GameRegistry.registerBlock(RawChocolateBallMold, "rawchocolateballmold");

	}
	
	public static void registerRenders() {
		
		Item itemBarMold = Item.getItemFromBlock(BarMold);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBarMold, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "barmold", "inventory"));
		Item itemBallMold = Item.getItemFromBlock(BallMold);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBallMold, 0, new ModelResourceLocation(MainRegistry.MODID + ":" + "ballmold", "inventory"));
		
	}

}
