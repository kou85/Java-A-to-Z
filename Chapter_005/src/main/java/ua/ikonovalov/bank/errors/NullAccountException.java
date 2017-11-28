package ua.ikonovalov.bank.errors;

/**
 * Class NullAccountException.
 *
 * @author ikonovalov.
 * @since 28.11.2017.
 * @version 1.0.
 */
public class NullAccountException extends Exception {

    /**
     * Message on error when not found user account.
     * @param massage error massage.
     */
    public NullAccountException(String massage) {
        super(massage);
    }
}
