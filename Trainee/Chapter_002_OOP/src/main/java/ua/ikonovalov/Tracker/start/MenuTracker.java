package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.*;

//import javax.xml.bind.SchemaOutputResolver;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * class MenuTracker.
 * @author Konovalov.
 * @since 29.10.2018.
 * @version 1.0.
 */
public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction [] actions = new UserAction[6];



    /**
     *
     * @param input
     * @param tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = new MenuTracker.AddItem();
        this.actions[1] = new MenuTracker.ShowAllItems();
        this.actions[2] = new MenuTracker.UpdateItem();
        this.actions[3] = new MenuTracker.DeleteItem();
        this.actions[4] = new MenuTracker.FindByIdItem();
        this.actions[5] = new MenuTracker.FindByName();
    }
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private static class AddItem implements UserAction {

        public int key() {
            return 0;
        }

        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- Add new item --------------");
            String name = input.ask("Please enter name item : ");
            String desc = input.ask("Please enter description item" );
            //Date created Item
            Date date = new Date();
            //Date change format dd.MM.yyyy
            SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM.yyyy");
            String createDate = formatForDate.format(date);
            Item item = new Item(name, desc, createDate);
            tracker.add(item);
            System.out.println("---------------- New item info -----------------");
            System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
            System.out.println();
            System.out.format("%16s%16s%16s%16s", item.getName(), item.getDescription(), item.getId(), item.getCreateDate());
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Create Item");
        }
    }


    private static class ShowAllItems implements UserAction {

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- All Items ------------------");
            System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
            System.out.println();
            for (Item item : tracker.getAll()) {
                    System.out.format("%16s%16s%16s%16s", item.getName(), item.getDescription(), item.getId(), item.getCreateDate());
                    System.out.println();
                }
            }


        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all Items");
        }
    }

    private static class UpdateItem implements UserAction {

        public int key() {
            return 2;
        }
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- Menu Edit Item ------------------");
            String id = input.ask("Please enter ID item");
            Item itemEdit = tracker.findById(id);
            String name = input.ask("Please enter new name");
            String desc = input.ask("Please enter new description");
            itemEdit.setName(name);
            itemEdit.setDescription(desc);
            tracker.editItem(itemEdit);
            System.out.println();

        }
        public String info() {
            return String.format("%s. %s", this.key(), "Edit Item");
        }

    }
    private static class DeleteItem implements UserAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- Menu Delete Item  ------------------");
            String id = input.ask("Please enter Id");
            tracker.delete(id);
            System.out.println("Item id = " + id + " deleted");
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete Item");
        }
    }

    private static class FindByIdItem implements UserAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- Menu Find by Id  ------------------");
            String id = input.ask("Please enter ID item");
            Item itemFind = tracker.findById(id);
            System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
            System.out.println();
            System.out.format("%16s%16s%16s%16s", itemFind.getName(), itemFind.getDescription(), itemFind.getId(), itemFind.getCreateDate());
            System.out.println();
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find Item by ID");
        }
    }
    private static class FindByName implements UserAction {

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- Menu Find by Name  ------------------");
            String name = input.ask("Please enter name");
            Item itemFindName = tracker.findByName(name);
            System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
            System.out.println();
            System.out.format("%16s%16s%16s%16s", itemFindName.getName(), itemFindName.getDescription(), itemFindName.getId(), itemFindName.getCreateDate());
            System.out.println();
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find Item by Name");
        }
    }

}
