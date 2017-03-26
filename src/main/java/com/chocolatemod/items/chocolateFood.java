package com.chocolatemod.items;

import java.util.List;

import com.chocolatemod.main.MainRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class chocolateFood extends ItemFood {

	public chocolateFood(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(MainRegistry.tabChocolateFood);
	}
}
