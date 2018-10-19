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

    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINE_BY_ID = "4";
    private static final String FINE_BY_NAME = "5";
    private static final String EXIT = "6";

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
    boolean exit = false;
    while (!exit) {
        this.showMenu();
        String answer = this.input.ask("Please enter number menu : ");
        if (ADD.equals(answer)) {
            this.createItem();
        } else if (SHOW.equals(answer)) {
            this.showAllItems();
        }else if (EXIT.equals(answer)) {
            exit = true;
        }
    }
        //String name = input.ask("Please enter task-name:");

        Tracker tracker1 = new Tracker();
        tracker1.add(new Task("first task", "first desc"));
        for (Item item : tracker1.getAll()) {
            System.out.println(item.getName());
        }
    }
    private void createItem() {
        System.out.println("---------------- Add new item --------------");
        String name = this.input.ask("Please enter name item : ");
        String desc = this.input.ask("Please enter description item" );
        //Date created Item
        Date date = new Date();
        //Date change format dd.MM.yyyy
        SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM.yyyy");
        String createDate = formatForDate.format(date);
        Item item = new Item(name, desc, createDate);
        this.tracker.add(item);
        System.out.println("---------------- New item info -----------------");
        System.out.println(" Name / Description / Created Date / ID ");
        System.out.println("  " + item.getName()+" /  "+ item.getDescription()+ " / "+ item.getCreateDate() +" / "+ item.getId() +"  ");
    }
    private void showAllItems() {
        System.out.println("---------------- All Items ------------------");
        System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
        System.out.println();
        for (Item item : this.tracker.getAll()){
       // System.out.println(Arrays.asList(this.tracker.getAll()));

        System.out.format("%16s%16s%16s%16s", item.getName(), item.getDescription(), item.getId(), item.getCreateDate());
            System.out.println();}

        }

    private void showMenu() {
        System.out.println("---------------- Menu ------------");
        System.out.println("0 - Create Item");
        System.out.println("1 - Show all Items");
        System.out.println("2 - Edit Item");
        System.out.println("3 - Delete Item");
        System.out.println("4 - Find Item by ID");
        System.out.println("5 - Find Item by Name");
        System.out.println("6 - Exit");

    }

    public static void main(String[] args) {
        //Input input = new StubInput(new String [] {"Create stub task"});

        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
