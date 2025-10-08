package com.sk89q.worldedit.util.formatting.text.format;

/**
 * Text color for WorldEdit text formatting.
 */
public class TextColor {

    private final net.kyori.adventure.text.format.TextColor adventureColor;

    private TextColor(net.kyori.adventure.text.format.TextColor adventureColor) {
        this.adventureColor = adventureColor;
    }

    /**
     * Create a text color from RGB values.
     *
     * @param r red component (0-255)
     * @param g green component (0-255)
     * @param b blue component (0-255)
     * @return a new text color
     */
    public static TextColor of(int r, int g, int b) {
        return new TextColor(net.kyori.adventure.text.format.TextColor.of(r, g, b));
    }

    /**
     * Create a text color from a hex string.
     *
     * @param hex the hex color (e.g., "#FF0000")
     * @return a new text color
     */
    public static TextColor of(String hex) {
        return new TextColor(net.kyori.adventure.text.format.TextColor.fromHexString(hex));
    }

    /**
     * Get the underlying Adventure text color.
     *
     * @return the Adventure text color
     */
    public net.kyori.adventure.text.format.TextColor getAdventureColor() {
        return adventureColor;
    }
}
