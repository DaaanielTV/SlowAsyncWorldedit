package com.sk89q.worldedit.util.formatting.text;

/**
 * A wrapper around Adventure API's Component.
 */
public class AdventureComponent implements Component {

    private final net.kyori.adventure.text.Component adventureComponent;

    public AdventureComponent(net.kyori.adventure.text.Component adventureComponent) {
        this.adventureComponent = adventureComponent;
    }

    @Override
    public net.kyori.adventure.text.Component getAdventureComponent() {
        return adventureComponent;
    }
}
