package ua.ikonovalov.tracker.templates;

import ua.ikonovalov.tracker.start.Input;
import ua.ikonovalov.tracker.start.Tracker;
import ua.ikonovalov.tracker.start.UserAction;

/**
 * Abstract class BaseAction implement UserAction..
 *
 * @author Konovalov.
 * @since 26.03.2017.
 * @version 1.0.
 */
public abstract class BaseAction implements UserAction {

    /**
     * The nameAction field.
     */
    private String nameAction;

    /**
     * The keyAction field.
     */
    private int keyAction;

    /**
     *Constructor of BaseAction.
     * @param nameAction name action for menu.
     * @param keyAction key action for menu.
     */
    public BaseAction(int keyAction, String nameAction) {
        this.nameAction = nameAction;
        this.keyAction = keyAction;
    }

    /**
     * Method execute.
     * @param input Input input.
     * @param tracker Tracker tracker.
     */

    public abstract void execute(Input input, Tracker tracker);

    /**
     * Method info.
     * @return formatted string
     */

    public String info() {
        return String.format("%s. %s", this.keyAction, this.nameAction);
    }
}