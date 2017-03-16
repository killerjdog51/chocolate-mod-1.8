package com.chocolatemod.main;


/**
 * Common Definitions and helpers for color.
 * @author jrowlett
 *
 */
public final class TypeUtility {

    /**
     * Common color names (unlocalized) indexed by item damage.
     */
    public static final String[] COLOR_NAMES = new String[] {
        "default",
        "dark",
        "light",
        "white",
        "raw"
    };

    /**
     * Count of total colors.
     */
    public static final int COLOR_COUNT = 5;

    /**
     * Common color tags used for icon name lookup indexed by item damage.
     */
    public static final String[] COLOR_IDS = new String[] {
        "default",
        "dark",
        "light",
        "white",
        "raw"
    };

    /**
     * Prevent instantiation of the ColorUtility class.
     */
    private TypeUtility() {
    }
}