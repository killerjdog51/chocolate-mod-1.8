package com.chocolatemod.items;

import java.util.List;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class chocolateFood extends ItemFood {

	public chocolateFood(int amount, float saturation, boolean isWolfFood, boolean isSubType) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(MainRegistry.tabChocolateFood);
		this.setHasSubtypes(isSubType);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
    {
        int i = stack.getMetadata();
        return super.getUnlocalizedName() + "." + (stack.getItemDamage() == 0 ? "default" : stack.getItemDamage() == 1 ? "dark" : stack.getItemDamage() == 2 ? "light" : stack.getItemDamage() == 3 ? "white" : "raw");
    }

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
	    subItems.add(new ItemStack(itemIn, 1, 0));
	    subItems.add(new ItemStack(itemIn, 1, 1));
	    subItems.add(new ItemStack(itemIn, 1, 2));
	    subItems.add(new ItemStack(itemIn, 1, 3));
	    subItems.add(new ItemStack(itemIn, 1, 4));

	}
}
