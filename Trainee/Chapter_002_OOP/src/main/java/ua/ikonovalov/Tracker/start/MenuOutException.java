package ua.ikonovalov.Tracker.start;

/**
 * Class MenuOutException.
 * @author Konovalov.
 * @since 04.11.2018.
 * @version 1.0.
 */
 public class MenuOutException extends RuntimeException {
    /**
     * Constructor of MenuOutException.
     * @param msg msg message exception.
     */
     public MenuOutException(String msg) {
         super (msg);
     }
}
