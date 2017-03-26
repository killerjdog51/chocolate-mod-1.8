package com.chocolatemod.blocks;

import java.util.List;

import com.chocolatemod.init.IMetaBlockName;
import com.chocolatemod.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockProperties extends Block implements IMetaBlockName {

    public BlockProperties(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(MainRegistry.tabChocolateBlocks);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }
    @Override
    public String getSpecialName(ItemStack stack) {
    	
    		return super.getUnlocalizedName();
    	
    }
   
   
}