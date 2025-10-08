package com.sk89q.worldedit.util.formatting.text;

/**
 * A translatable text component. This is a simple wrapper around Adventure API's TranslatableComponent.
 */
public class TranslatableComponent implements Component {

    private final net.kyori.adventure.text.TranslatableComponent adventureComponent;

    private TranslatableComponent(net.kyori.adventure.text.TranslatableComponent adventureComponent) {
        this.adventureComponent = adventureComponent;
    }

    /**
     * Create a new translatable component with the given key.
     *
     * @param key the translation key
     * @return a new translatable component
     */
    public static TranslatableComponent of(String key) {
        return new TranslatableComponent(net.kyori.adventure.text.Component.translatable(key));
    }

    /**
     * Create a new translatable component with the given key and arguments.
     *
     * @param key the translation key
     * @param args the arguments
     * @return a new translatable component
     */
    public static TranslatableComponent of(String key, Object... args) {
        return new TranslatableComponent(net.kyori.adventure.text.Component.translatable(key, args));
    }

    @Override
    public net.kyori.adventure.text.Component getAdventureComponent() {
        return adventureComponent;
    }
}
