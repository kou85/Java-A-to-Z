package ua.ikonovalov.tracker.start;
/**
 * Interface Input.
 *
 * @author Konovalov.
 * @since 16.02.2017.
 * @version 1.0.
 */

public interface Input {

	/**
	 * Method ask.
	 * @param question String question.
	 * @return ask.
	 */
	String ask(String question);

	/**
	 * Overload method ask.
	 * @param question String users question.
	 * @param range int range key.
	 * @return user answer.
	 */
	int ask(String question, int[] range);
}