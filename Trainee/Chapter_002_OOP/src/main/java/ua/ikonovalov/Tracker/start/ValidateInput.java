package ua.ikonovalov.Tracker.start;

/**
 * Class ValidateInput
 * @autor Konovalov
 * @since 04.11.18
 * @version 1.0
 */
public class ValidateInput extends ConsoleInput{
    @Override
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;

        do {
            try {
                return super.ask(question, range);
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu");

            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate number again");
            }
        } while (invalid);
            return value;
    }
}
