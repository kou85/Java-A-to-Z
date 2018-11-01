package ua.ikonovalov.Tracker.start;

 /**
 * Interface SUserAction.
 * @author Konovalov.
 * @since 29.10.2018.
 * @version 1.0.
 */

public interface UserAction {
    /**
     * metod return key option
     * @return key
     */
    int key();

    /**
     * basic metod
     * @param input object Input
     * @param tracker object Tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Metod return info about enter menu user
     * @return String menu
     */
    String info();
}
