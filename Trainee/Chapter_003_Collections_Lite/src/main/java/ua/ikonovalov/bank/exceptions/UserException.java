package ua.ikonovalov.bank.exceptions;

/**
 * class UserException
 * @author ikonovalov
 * @since 27.11.18.
 * @version 1.0
 */
public class UserException extends RuntimeException {

    public UserException(String message) {
        super(message);
    }
}
