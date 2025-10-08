package com.sk89q.worldedit.util.formatting.text;

/**
 * A text component. This is a simple wrapper around Adventure API's Component.
 */
public interface Component {

    /**
     * Create a new text component with the given text.
     *
     * @param text the text
     * @return a new text component
     */
    static Component text(String text) {
        return new AdventureComponent(net.kyori.adventure.text.Component.text(text));
    }

    /**
     * Create a new empty component.
     *
     * @return a new empty component
     */
    static Component empty() {
        return new AdventureComponent(net.kyori.adventure.text.Component.empty());
    }

    /**
     * Get the underlying Adventure component.
     *
     * @return the Adventure component
     */
    net.kyori.adventure.text.Component getAdventureComponent();
}
