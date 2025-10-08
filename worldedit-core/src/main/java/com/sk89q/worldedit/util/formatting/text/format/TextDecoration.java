package com.sk89q.worldedit.util.formatting.text.format;

/**
 * Text decoration for WorldEdit text formatting.
 */
public enum TextDecoration {

    BOLD(net.kyori.adventure.text.format.TextDecoration.BOLD),
    ITALIC(net.kyori.adventure.text.format.TextDecoration.ITALIC),
    UNDERLINED(net.kyori.adventure.text.format.TextDecoration.UNDERLINED),
    STRIKETHROUGH(net.kyori.adventure.text.format.TextDecoration.STRIKETHROUGH),
    OBFUSCATED(net.kyori.adventure.text.format.TextDecoration.OBFUSCATED);

    private final net.kyori.adventure.text.format.TextDecoration adventureDecoration;

    TextDecoration(net.kyori.adventure.text.format.TextDecoration adventureDecoration) {
        this.adventureDecoration = adventureDecoration;
    }

    /**
     * Get the underlying Adventure text decoration.
     *
     * @return the Adventure text decoration
     */
    public net.kyori.adventure.text.format.TextDecoration getAdventureDecoration() {
        return adventureDecoration;
    }
}
