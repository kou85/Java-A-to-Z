package ua.ikonovalov.chees;

/**
 * Class ImpossibleMoveException.
 *
 * @author Konovalov.
 * @since 09.04.2017.
 * @version 1.0.
 */
public class ImpossibleMoveException extends Exception {
    /**
     * Exception when the wrong color of the figure or of the impossibility of motion.
     * @param msg error message.
     */
    public ImpossibleMoveException(String msg) {
        super(msg);
    }
}
