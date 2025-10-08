package com.sk89q.worldedit.util.formatting.text.format;

/**
 * Click event for WorldEdit text formatting.
 */
public class ClickEvent {

    /**
     * Click event actions.
     */
    public enum Action {
        OPEN_URL(net.kyori.adventure.text.event.ClickEvent.Action.OPEN_URL),
        RUN_COMMAND(net.kyori.adventure.text.event.ClickEvent.Action.RUN_COMMAND),
        SUGGEST_COMMAND(net.kyori.adventure.text.event.ClickEvent.Action.SUGGEST_COMMAND),
        COPY_TO_CLIPBOARD(net.kyori.adventure.text.event.ClickEvent.Action.COPY_TO_CLIPBOARD);

        private final net.kyori.adventure.text.event.ClickEvent.Action adventureAction;

        Action(net.kyori.adventure.text.event.ClickEvent.Action adventureAction) {
            this.adventureAction = adventureAction;
        }

        /**
         * Get the underlying Adventure action.
         *
         * @return the Adventure action
         */
        public net.kyori.adventure.text.event.ClickEvent.Action getAdventureAction() {
            return adventureAction;
        }
    }

    private final net.kyori.adventure.text.event.ClickEvent adventureEvent;

    private ClickEvent(net.kyori.adventure.text.event.ClickEvent adventureEvent) {
        this.adventureEvent = adventureEvent;
    }

    /**
     * Create a click event that opens a URL.
     *
     * @param url the URL
     * @return a new click event
     */
    public static ClickEvent openUrl(String url) {
        return new ClickEvent(net.kyori.adventure.text.event.ClickEvent.clickEvent(
            net.kyori.adventure.text.event.ClickEvent.Action.OPEN_URL, url));
    }

    /**
     * Create a click event that runs a command.
     *
     * @param command the command
     * @return a new click event
     */
    public static ClickEvent runCommand(String command) {
        return new ClickEvent(net.kyori.adventure.text.event.ClickEvent.clickEvent(
            net.kyori.adventure.text.event.ClickEvent.Action.RUN_COMMAND, command));
    }

    /**
     * Create a click event that suggests a command.
     *
     * @param command the command to suggest
     * @return a new click event
     */
    public static ClickEvent suggestCommand(String command) {
        return new ClickEvent(net.kyori.adventure.text.event.ClickEvent.clickEvent(
            net.kyori.adventure.text.event.ClickEvent.Action.SUGGEST_COMMAND, command));
    }

    /**
     * Get the underlying Adventure click event.
     *
     * @return the Adventure click event
     */
    public net.kyori.adventure.text.event.ClickEvent getAdventureEvent() {
        return adventureEvent;
    }
}
