package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.*;

import javax.xml.bind.SchemaOutputResolver;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Strong on 14.09.18.
 */
public class StartUI {
    private final Input input;
    private final Tracker tracker;

    private int [] renges = new int[] {0, 1, 2, 3, 4, 5};

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;

    }

//new init new realise
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        UserAction deleteAction = new UserAction() {
            public int key() {
                return 0;
            }

            public void execute(Input input, Tracker tracker) {

            }

            public String info() {
                return null;
            }
        };
        menu.addAction(deleteAction);
        do {
            menu.show();
            menu.select(input.ask("Please enter number menu:", renges));
            System.out.println();
        } while (! "y".equals(this.input.ask("Exit program? y/n")));
    }

    public static void main(String[] args) {
        new StartUI(
                new ValidateInput(
                        new ConsoleInput()
                ),
                new Tracker()
        ).init();

    }

}
