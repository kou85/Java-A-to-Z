package ua.ikonovalov.tracker.start;

/**
 * Interface UserAction.
 *
 * @author Konovalov.
 * @since 20.03.2017.
 * @version 1.0.
 */
public interface UserAction {
    /**
     * Method execute.
     * @param input Input input.
     * @param tracker Tracker tracker.
     */
    void execute(Input input, Tracker tracker);

    /**
     * Method info.
     * @return information.
     */
    String info();
}
