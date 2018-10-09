package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.*;

/**
 * Created by Strong on 14.09.18.
 */
public class StartUI {
    private Input input;

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
