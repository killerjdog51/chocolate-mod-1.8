package com.chocolatemod.main;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public final class GameUtility {

    public static Item getItemFromBlock(final String name) {
        return GameRegistry.findItem("kjd", name);
    }

    private GameUtility() {
    }
}