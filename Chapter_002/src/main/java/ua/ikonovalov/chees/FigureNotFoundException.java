package ua.ikonovalov.chees;

/**
 * Class FigureNotFoundException.
 *
 * @author Konovalov.
 * @since 10.04.2017.
 * @version 1.0.
 */
public class FigureNotFoundException extends Exception {

    /**
     * The exception is when the figure is not found.
     * @param msg error massage.
     */
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}