package ua.ikonovalov.tracker.start;

/**
 * Class for validating input, extends from ConsoleInput.
         *
         * @author Konovalov.
        * @since 27.02.2017.
        * @version 1.0.
 */
public class ValidateInput extends ConsoleInput {

    /**
     * Method for asking questions to users.
     * @param question question to print in console.
     * @param range range of actions.
     * @return user answer.
     */
    @Override
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu.");
            }
        } while (invalid);
        return value;
    }
}
