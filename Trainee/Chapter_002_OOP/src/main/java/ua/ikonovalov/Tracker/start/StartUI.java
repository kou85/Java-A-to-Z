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
    //private final Tracker tracker;

    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FIND_BY_ID = "4";
    private static final String FIND_BY_NAME = "5";
    private static final String EXIT = "6";

    private int [] renges = new int[] {0, 1, 2, 3, 4, 5};
  /*  public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }*/
    public StartUI(Input input) {
        this.input = input;

    }

/*    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Please enter number menu : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FIND_BY_ID .equals(answer)) {
                this.findItemById();
            } else if (FIND_BY_NAME .equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }

    }*/

//new init new realise
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();

        do {
            menu.show();
           // int key = Integer.valueOf(input.ask("Please enter number menu"));
            //menu.select(key);
            menu.select(input.ask("Please enter number menu:", renges));
            System.out.println();
        } while (! "y".equals(this.input.ask("Exit program? y/n")));
    }


 /*   private void createItem() {

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
        System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
        System.out.println();
        System.out.format("%16s%16s%16s%16s", item.getName(), item.getDescription(), item.getId(), item.getCreateDate());
    }
    private void showAllItems() {
        System.out.println("---------------- All Items ------------------");
        System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
        System.out.println();
        for (Item item : this.tracker.getAll()){
        System.out.format("%16s%16s%16s%16s", item.getName(), item.getDescription(), item.getId(), item.getCreateDate());
        System.out.println();
        }
        }

    private void editItem() {
        System.out.println("---------------- Menu Edit Item ------------------");
        String id = this.input.ask("Please enter ID item");
        Item itemEdit = this.tracker.findById(id);
        String name = this.input.ask("Please enter new name");
        String desc = this.input.ask("Please enter new description");
        itemEdit.setName(name);
        itemEdit.setDescription(desc);
        this.tracker.editItem(itemEdit);
        System.out.println();

    }

    private void deleteItem() {
        System.out.println("---------------- Menu Delete Item  ------------------");
        String id = this.input.ask("Please enter Id");
        this.tracker.delete(id);
        System.out.println("Item id = " + id + " deleted");
    }
    private void findItemById() {
        System.out.println("---------------- Menu Find by Id  ------------------");
        String id = this.input.ask("Please enter ID item");
        Item itemFind = this.tracker.findById(id);
        System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
        System.out.println();
        System.out.format("%16s%16s%16s%16s", itemFind.getName(), itemFind.getDescription(), itemFind.getId(), itemFind.getCreateDate());
        System.out.println();
    }
    private void findItemByName() {
        System.out.println("---------------- Menu Find by Name  ------------------");
        String name = this.input.ask("Please enter name");
        Item itemFindName = this.tracker.findByName(name);
        System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
        System.out.println();
        System.out.format("%16s%16s%16s%16s", itemFindName.getName(), itemFindName.getDescription(), itemFindName.getId(), itemFindName.getCreateDate());
        System.out.println();
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

    }*/

    public static void main(String[] args) {

        Input input = new ValidateInput();
        new StartUI(input).init();
       // new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
