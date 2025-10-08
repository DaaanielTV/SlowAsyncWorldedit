package com.sk89q.worldedit.util.formatting.text;

/**
 * Renders translatable components. This is a simple wrapper around Adventure API's TranslatableComponentRenderer.
 */
public class TranslatableComponentRenderer {

    private final net.kyori.adventure.text.renderer.TranslatableComponentRenderer adventureRenderer;

    public TranslatableComponentRenderer(net.kyori.adventure.text.renderer.TranslatableComponentRenderer adventureRenderer) {
        this.adventureRenderer = adventureRenderer;
    }

    /**
     * Render a component.
     *
     * @param component the component to render
     * @return the rendered component
     */
    public Component render(Component component) {
        net.kyori.adventure.text.Component rendered = adventureRenderer.render(component.getAdventureComponent());
        return new AdventureComponent(rendered);
    }
}
