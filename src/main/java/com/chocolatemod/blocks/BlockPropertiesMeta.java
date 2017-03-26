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

public class BlockPropertiesMeta extends Block implements IMetaBlockName {

	public static final PropertyEnum TYPE = PropertyEnum.create("type", BlockPropertiesMeta.EnumType.class);
    public BlockPropertiesMeta(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(MainRegistry.tabChocolateBlocks);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.DEFAULT));
    }
    
    public enum EnumType implements IStringSerializable {
        DEFAULT(0, "default"),
        DARK(1, "dark"),
        LIGHT(2, "light"),
        WHITE(3, "white"),
        RAW(4, "raw");

        private int ID;
        private String name;
        
        private EnumType(int ID, String name) {
            this.ID = ID;
            this.name = name;
        }
        
        @Override
        public String getName() {
            return name;
        }

        public int getID() {
            return ID;
        }
        
        @Override
        public String toString() {
            return getName();
        }
    }
    
    
    
    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[] { TYPE });
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(TYPE, meta == 0 ? EnumType.DEFAULT : meta == 1 ? EnumType.DARK : meta == 2 ? EnumType.LIGHT : meta == 3 ? EnumType.WHITE : EnumType.RAW);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumType type = (EnumType) state.getValue(TYPE);
        return type.getID();
    }
    
    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }
    
    @Override
    public String getSpecialName(ItemStack stack) {
        return stack.getItemDamage() == 0 ? "default" : stack.getItemDamage() == 1 ? "dark" : stack.getItemDamage() == 2 ? "light" : stack.getItemDamage() == 3 ? "white" : "raw";
    }
    
    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }
    
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, 0)); //Meta 0
        list.add(new ItemStack(itemIn, 1, 1)); //Meta 1
        list.add(new ItemStack(itemIn, 1, 2)); //Meta 2
        list.add(new ItemStack(itemIn, 1, 3)); //Meta 3
        list.add(new ItemStack(itemIn, 1, 4)); //Meta 4
        
    }
}