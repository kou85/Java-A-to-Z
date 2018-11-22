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
   // private UserAction [] actions = new UserAction[7];
    private ArrayList<UserAction> actions = new ArrayList<>();
    private int position = 0;

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
        this.actions.add(new MenuTracker.AddItem(0, "Create Item"));
        this.actions.add(new MenuTracker.ShowAllItems(1, "Show all Items"));
        this.actions.add(new MenuTracker.UpdateItem(2, "Edit Item"));
        this.actions.add(new MenuTracker.DeleteItem(3, "Delete Item"));
        this.actions.add(new MenuTracker.FindByIdItem(4, "Find Item by ID"));
        this.actions.add(new MenuTracker.FindByName(5, "Find Item by Name"));
    }

    public void addAction(UserAction action) {
        this.actions.add(action);
    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private static class AddItem extends BaseAction {

        protected AddItem(int key, String name) {
            super(key, name);
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

    }

    private static class ShowAllItems extends BaseAction {

        protected ShowAllItems(int key, String name) {
            super(key, name);
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
    }

    private static class UpdateItem extends BaseAction {

        protected UpdateItem(int key, String name) {
            super(key, name);
        }

        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- Menu Edit Item ------------------");
            String id = input.ask("Please enter ID item");
            try {
                Item itemEdit = tracker.findById(id);
                String name = input.ask("Please enter new name");
                String desc = input.ask("Please enter new description");
                itemEdit.setName(name);
                itemEdit.setDescription(desc);
                tracker.editItem(itemEdit);
                System.out.println();

            } catch (NullPointerException oe) {
                System.out.println("Please correct enter number ID");
            }
        }

    }

    private static class DeleteItem extends BaseAction {
        protected DeleteItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String statusDelete = " Not found. Please correct enter number ID";
            System.out.println("---------------- Menu Delete Item  ------------------");
            String id = input.ask("Please enter Id");
            for (Item value : tracker.getAll()) {
                if (value.getId() != null && value.getId().equals(id)) {
                    statusDelete = " deleted" ;
                    break;
                }
            }
            tracker.delete(id);
            System.out.println("Item id = " + id + statusDelete);
        }
    }

    private static class FindByIdItem extends BaseAction {
        protected FindByIdItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- Menu Find by Id  ------------------");
            String id = input.ask("Please enter ID item");
            try {
                Item itemFind = tracker.findById(id);
                System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
                System.out.println();
                System.out.format("%16s%16s%16s%16s", itemFind.getName(), itemFind.getDescription(), itemFind.getId(), itemFind.getCreateDate());
                System.out.println();
            }  catch (NullPointerException oe) {
            System.out.println("Please correct enter number ID");
            }
        }
    }

    private static class FindByName extends BaseAction {
        protected FindByName(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("---------------- Menu Find by Name  ------------------");
            String name = input.ask("Please enter name");
            try {
             List<Item> itemFindName = tracker.findByName(name);
            //Item itemFindName = tracker.findByName(name);
            System.out.format("%16s%16s%16s%16s", "Name", "Description", "ID", "Date created");
            System.out.println();
                for (Item item: itemFindName) {
                    System.out.format("%16s%16s%16s%16s", item.getName(), item.getDescription(), item.getId(), item.getCreateDate());
                }
            System.out.println();
            } catch (NullPointerException oe) {
                System.out.println("Please correct enter name");
            }
        }
    }
}
