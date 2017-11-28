package ua.ikonovalov.bank.errors;

/**
 * Class NullUserException.
 *
 * @author ikonovalov.
 * @since 28.11.2017.
 * @version 1.0.
 */
public class NullUserException extends Exception {

    /**
     * Message with error when user not found.
     * @param message error message.
     */
    public NullUserException(String message) {
        super(message);
    }
}