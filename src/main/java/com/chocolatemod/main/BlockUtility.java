package com.chocolatemod.main;


/**
 * Common Definitions and helpers for color.
 * @author jrowlett
 *
 */
public final class BlockUtility {

    /**
     * Common color names (unlocalized) indexed by item damage.
     */
    public static final String[] COLOR_NAMES = new String[] {
        "chocolate",
        "brick",
        "small"
    };

    /**
     * Count of total colors.
     */
    public static final int COLOR_COUNT = 3;

    /**
     * Common color tags used for icon name lookup indexed by item damage.
     */
    public static final String[] COLOR_IDS = new String[] {
        "chocolate",
        "brick",
        "small"
    };

    /**
     * Prevent instantiation of the ColorUtility class.
     */
    private BlockUtility() {
    }
}