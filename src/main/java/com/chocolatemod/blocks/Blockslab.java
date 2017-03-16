package com.chocolatemod.blocks;

import com.chocolatemod.main.GameUtility;
import com.chocolatemod.main.MainRegistry;
import com.chocolatemod.main.TypeUtility;
import com.chocolatemod.init.ChocolateBlocks;
import com.chocolatemod.main.BlockUtility;
import com.chocolatemod.main.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public abstract class Blockslab extends BlockSlab {

	
    private static final int HALF_META_BIT = 8;
    
    private final String ID = "slab";
    
    private int block;
    private int type;
    
    private static final PropertyBool VARIANT_PROPERTY =
        PropertyBool.create("variant");
    
	public Blockslab(final int block, final int blockType) {
		super(Material.rock);
		this.block = block;
		this.type = blockType;
		this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypePiston);	
        if (!this.isDouble()) {
            setCreativeTab(MainRegistry.tabChocolateBlocks);
        }
        this.useNeighborBrightness = !this.isDouble();
	
   
    IBlockState blockState = this.blockState.getBaseState();
    blockState = blockState.withProperty(VARIANT_PROPERTY, false);
    if (!this.isDouble()) {
        blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
    }

    setDefaultState(blockState);
    
    }
    
    public final String getId() {
        return this.innerGetId(this.isDouble());
    }
    
    @Override
    public final String getUnlocalizedName(final int metadata) {
        return this.getUnlocalizedName();
    }

    
    @Override
    public final Object getVariant(final ItemStack itemStack) {
        return false;
    }

   
    @Override
    public final IProperty getVariantProperty() {
        return VARIANT_PROPERTY;
    }

    
    @Override
    public final IBlockState getStateFromMeta(final int meta) {
        IBlockState blockState = this.getDefaultState();
        blockState = blockState.withProperty(VARIANT_PROPERTY, false);
        if (!this.isDouble()) {
            EnumBlockHalf value = EnumBlockHalf.BOTTOM;
            if ((meta & HALF_META_BIT) != 0) {
                value = EnumBlockHalf.TOP;
            }

            blockState = blockState.withProperty(HALF, value);
        }

        return blockState;
    }

    
    @Override
    public final int getMetaFromState(final IBlockState state) {
        if (this.isDouble()) {
           return 0;
        }

        if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) {
            return HALF_META_BIT;
        } else {
            return 0;
        }
    }

    
    @Override
    public final int damageDropped(final IBlockState state) {
        return 0;
    }

    
    @Override
    public final Item getItemDropped(
        final IBlockState blockState,
        final java.util.Random random,
        final int unused) {
        String blockId = this.innerGetId(false);
        return GameUtility.getItemFromBlock(blockId);
    }

    
    @SideOnly(Side.CLIENT)
    @Override
    public final net.minecraft.item.Item getItem(
        final net.minecraft.world.World world,
        final net.minecraft.util.BlockPos blockPos) {
        String blockId = this.innerGetId(false);
        return GameUtility.getItemFromBlock(blockId);
    }

    public final void registerModels(final CommonProxy proxy) {
        Item itemBlock = GameUtility.getItemFromBlock(
            this.getId());
        proxy.addModelBakeryVariant(
            itemBlock,
            "kjd:" + this.getId());
        proxy.registerInventoryModel(
            itemBlock,
            this.getId(),
            0);
    }
    
    @Override
    protected final BlockState createBlockState() {
        if (this.isDouble()) {
            return new BlockState(this, new IProperty[] {VARIANT_PROPERTY});
        } else {
            return new BlockState(
                this,
                new IProperty[] {VARIANT_PROPERTY, HALF});
        }
    }
    
   
    public static void registerInventoryModel(
        final Item item,
        final String id,
        final int metadata) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item,
                metadata,
                new ModelResourceLocation(
                    MainRegistry.MODID + id,
                    "inventory"));
    }
    
    private String innerGetId(final boolean isDoubleStacked) {
        
        return BlockUtility.COLOR_IDS[this.block] + ID + "_" + TypeUtility.COLOR_IDS[this.type];
    }
}