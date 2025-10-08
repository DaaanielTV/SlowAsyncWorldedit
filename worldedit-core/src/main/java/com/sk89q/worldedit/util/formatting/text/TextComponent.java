package com.sk89q.worldedit.util.formatting.text;

/**
 * A text component containing plain text. This is a simple wrapper around Adventure API's TextComponent.
 */
public class TextComponent implements Component {

    private final net.kyori.adventure.text.TextComponent adventureComponent;

    private TextComponent(net.kyori.adventure.text.TextComponent adventureComponent) {
        this.adventureComponent = adventureComponent;
    }

    /**
     * Create a new text component with the given text.
     *
     * @param text the text
     * @return a new text component
     */
    public static TextComponent of(String text) {
        return new TextComponent(net.kyori.adventure.text.Component.text(text));
    }

    /**
     * Create a new text component with the given text and color.
     *
     * @param text the text
     * @param color the color
     * @return a new text component
     */
    public static TextComponent of(String text, net.kyori.adventure.text.format.TextColor color) {
        return new TextComponent(net.kyori.adventure.text.Component.text(text, color));
    }

    @Override
    public net.kyori.adventure.text.Component getAdventureComponent() {
        return adventureComponent;
    }
}
