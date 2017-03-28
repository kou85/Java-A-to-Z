package ua.ikonovalov.tracker.start;
import ua.ikonovalov.tracker.templates.BaseAction;
/**
 * Class StartUI.
 *
 * @author Konovalov.
 * @since 12.03.2017.
 * @version 1.0.
 */
public class StartUI {
	/**
	 * The item field.
	 */
	private Input input;
	/**
	 * The item field.
	 */
	private Tracker tracker = new Tracker();
	/**
	 * Constructor of StartUI class.
	 * @param input Input input.
	 * @param tracker Tracker tracker.
	 */
	public StartUI(Input input,  Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	/**
	 * Initialization method of program.
	 */
	public void init() {
		MenuTracker menu = new MenuTracker(this.input, tracker);

		int[] ranges = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};

		menu.fillAction();

		int exitActionKey = 8;

		UserAction exitAction = new BaseAction(exitActionKey, "Exit program") {

			private boolean exit = false;

			@Override
			public void execute(Input input, Tracker tracker) {
			}
		};

		menu.addAction(exitAction);

		do {
			menu.show();
			menu.select(input.ask("Select: ", ranges));

		} while (!"y".equals(this.input.ask("Exit? (y/n): ")));

	}
	/**
	 * The entry point of the program.
	 * @param args arguments from command line.
	 */

	public static void main(String[] args) {
		Input input = new ValidateInput();
		Tracker tracker = new Tracker();
		new StartUI(input, tracker).init();
	}	
	
}