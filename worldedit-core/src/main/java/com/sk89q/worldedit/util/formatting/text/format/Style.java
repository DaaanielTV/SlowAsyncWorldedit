package com.sk89q.worldedit.util.formatting.text.format;

/**
 * Text style for WorldEdit text formatting.
 */
public class Style {

    private final net.kyori.adventure.text.format.Style adventureStyle;

    private Style(net.kyori.adventure.text.format.Style adventureStyle) {
        this.adventureStyle = adventureStyle;
    }

    /**
     * Create a new style builder.
     *
     * @return a new style builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Create an empty style.
     *
     * @return a new empty style
     */
    public static Style empty() {
        return new Style(net.kyori.adventure.text.format.Style.empty());
    }

    /**
     * Get the underlying Adventure style.
     *
     * @return the Adventure style
     */
    public net.kyori.adventure.text.format.Style getAdventureStyle() {
        return adventureStyle;
    }

    /**
     * Builder for creating styles.
     */
    public static class Builder {

        private net.kyori.adventure.text.format.Style.Builder adventureBuilder =
            net.kyori.adventure.text.format.Style.style();

        /**
         * Set the color.
         *
         * @param color the color
         * @return this builder
         */
        public Builder color(TextColor color) {
            adventureBuilder = adventureBuilder.color(color.getAdventureColor());
            return this;
        }

        /**
         * Add a decoration.
         *
         * @param decoration the decoration
         * @return this builder
         */
        public Builder decorate(TextDecoration decoration) {
            adventureBuilder = adventureBuilder.decoration(decoration.getAdventureDecoration(), true);
            return this;
        }

        /**
         * Build the style.
         *
         * @return the built style
         */
        public Style build() {
            return new Style(adventureBuilder.build());
        }
    }
}
