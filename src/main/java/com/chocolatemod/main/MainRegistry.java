package com.chocolatemod.main;

import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.init.ChocolateItems;
import com.chocolatemod.init.SpecialBlocks;
import com.chocolatemod.recipes.BlockRecipes;
import com.chocolatemod.recipes.ItemRecipes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MainRegistry.MODID, name = MainRegistry.NAME, version = MainRegistry.VERSION)

public class MainRegistry {

	public static final String MODID = "kjd";
	public static final String NAME = "Chocolate Mod";
    public static final String VERSION = "Alpha 2";
    
    @SidedProxy(clientSide = "com.chocolatemod.main.ClientProxy", serverSide = "com.chocolatemod.main.CommonProxy")
	public static CommonProxy proxy;

	@Instance(MainRegistry.MODID)
	public static MainRegistry modInstance;
	
	//Creative Tabs
	
	public static CreativeTabs tabChocolateBlocks = new CreativeTabs("tabChocolateBlocks") {
		public ItemStack getIconItemStack() {
			return new ItemStack(ChocolateBlocks.chocolateBlock, 1, 0);
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	public static CreativeTabs tabChocolateFood = new CreativeTabs("tabChocolateFood") {
		public ItemStack getIconItemStack() {
			return new ItemStack(ChocolateItems.chocolatebar, 1, 0);
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	public static CreativeTabs tabChocolateMisc = new CreativeTabs("tabChocolateMisc") {
		public ItemStack getIconItemStack() {
			return new ItemStack(ChocolateItems.cocoaPowder, 1, 0);
		}

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	
    	ChocolateBlocks.init();
    	ChocolateBlocks.register();
    	ChocolateItems.init();
    	ChocolateItems.register();
    	SpecialBlocks.init();
    	SpecialBlocks.register();
       	BlockRecipes.Recipes();
    	ItemRecipes.Recipes();
    	Achievements.Register();
    	
    	MinecraftForge.EVENT_BUS.register( new CheckAchievements());
    	FMLCommonHandler.instance().bus().register( new CheckAchievements());

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	

    	proxy.registerRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	

    }
}
