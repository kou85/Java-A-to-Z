package ua.ikonovalov.Tracker.proba;


public class StartMain {
    private Input input;

    public StartMain(Input input) {
        this.input = input;
    }

    public void init() {

        String name = input.ask("Please enter name");
        String desk = input.ask("Please enter description");
        Tracker tracker = new Tracker();
        tracker.add(new Item( name, desk));
        for (Item value : tracker.findAll()) {
            System.out.println(value.getName());

        }
    }
    public static void main(String [] args) {
        Input input = new ConsoleInput();
        new StartMain(input).init();


    }


}
