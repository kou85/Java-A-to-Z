package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.*;

/**
 * Created by Strong on 14.09.18.
 */
public class StartUI {
    private Input input;

    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINE_BY_ID = "4";
    private static final String FINE_BY_NAME = "5";
    private static final String EXIT = "6";

    public StartUI(Input input) {
        this.input = input;
    }

    public void init() {
        //test metod for ConsoleInput
        //ConsoleInput input = new ConsoleInput();
        String name = input.ask("Please enter task-name:");

        Tracker tracker = new Tracker();
        tracker.add(new Task("first task", "first desc"));
        for (Item item : tracker.getAll()) {
            System.out.println(item.getName());
        }
    }
    public static void main(String[] args) {
        //Input input = new StubInput(new String [] {"Create stub task"});
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }

}
