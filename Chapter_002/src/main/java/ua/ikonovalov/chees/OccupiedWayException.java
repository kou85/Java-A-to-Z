package ua.ikonovalov.chees;

/**
 * Class OccupiedWayException.
 *
 * @author Konovalov.
 * @since 10.04.2017.
 * @version 1.0.
 */
public class OccupiedWayException extends Exception {

    /**
     * The exception is when the path is a different figure.
     * @param msg error message.
     */
    public OccupiedWayException(String msg) {
        super(msg);
    }
}
