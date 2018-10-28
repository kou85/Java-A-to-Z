package ua.ikonovalov.Tracker.start;

import org.junit.Test;
import ua.ikonovalov.Tracker.models.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {


    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("NameTest", "Desc", "22.05.18"));
        Item item2 = tracker.add(new Item("NameTest2", "Desc2", "22.05.18"));
        Item item3 = tracker.add(new Item("NameTest3", "Desc3", "22.05.18"));
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[3].getName(), is("test name"));
        assertThat(tracker.getAll()[3].getDescription(), is("desc"));
    }

    @Test
    public void whenUserEditItemThenTracker() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("NameTest", "Desc", "22.05.18"));
        Input input = new StubInput(new String[]{"2", item.getId(), "name", "test", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("name"));

    }

    @Test
    public void whenUserDeleteItemThenTracker() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("NameTest", "Desc", "22.05.18"));
        Item item2 = tracker.add(new Item("NameTest2", "Desc2", "22.05.18"));
        Item item3 = tracker.add(new Item("NameTest3", "Desc3", "22.05.18"));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("NameTest2"));


    }

    @Test
    public void whenUserShowAllItemsInTracker() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("NameTest", "Desc", "22.05.18"));
        Item item2 = tracker.add(new Item("NameTest2", "Desc2", "22.05.18"));
        Item item3 = tracker.add(new Item("NameTest3", "Desc3", "22.05.18"));
        Input input = new StubInput(new String[]{"1", "6"});
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is( new StringBuilder()
                .append("---------------- Menu ------------").append(System.lineSeparator())
                .append("0 - Create Item").append(System.lineSeparator())
                .append("1 - Show all Items").append(System.lineSeparator())
                .append("2 - Edit Item").append(System.lineSeparator())
                .append("3 - Delete Item").append(System.lineSeparator())
                .append("4 - Find Item by ID").append(System.lineSeparator())
                .append("5 - Find Item by Name").append(System.lineSeparator())
                .append("6 - Exit").append(System.lineSeparator())
                .append("---------------- All Items ------------------").append(System.lineSeparator())
                .append("            Name     Description              ID    Date created").append(System.lineSeparator())
                .append("        NameTest            Desc   "+ item.getId()+"        22.05.18").append(System.lineSeparator())
                .append("       NameTest2           Desc2   "+ item2.getId()+"        22.05.18").append(System.lineSeparator())
                .append("       NameTest3           Desc3   "+ item3.getId()+"        22.05.18").append(System.lineSeparator())
                .append("---------------- Menu ------------").append(System.lineSeparator())
                .append("0 - Create Item").append(System.lineSeparator())
                .append("1 - Show all Items").append(System.lineSeparator())
                .append("2 - Edit Item").append(System.lineSeparator())
                .append("3 - Delete Item").append(System.lineSeparator())
                .append("4 - Find Item by ID").append(System.lineSeparator())
                .append("5 - Find Item by Name").append(System.lineSeparator())
                .append("6 - Exit").append(System.lineSeparator()).toString()));
        System.setOut(stdout);

    }

    @Test
    public void whenUserFindByIDItemThenTracker() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("NameTest", "Desc", "22.05.18"));
        Item item2 = tracker.add(new Item("NameTest2", "Desc2", "22.05.18"));
        Item item3 = tracker.add(new Item("NameTest3", "Desc3", "22.05.18"));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is( new StringBuilder()
                .append("---------------- Menu ------------").append(System.lineSeparator())
                .append("0 - Create Item").append(System.lineSeparator())
                .append("1 - Show all Items").append(System.lineSeparator())
                .append("2 - Edit Item").append(System.lineSeparator())
                .append("3 - Delete Item").append(System.lineSeparator())
                .append("4 - Find Item by ID").append(System.lineSeparator())
                .append("5 - Find Item by Name").append(System.lineSeparator())
                .append("6 - Exit").append(System.lineSeparator())
                .append("---------------- Menu Find by Id  ------------------").append(System.lineSeparator())
                .append("            Name     Description              ID    Date created").append(System.lineSeparator())
                .append("        NameTest            Desc   "+ item.getId()+"        22.05.18").append(System.lineSeparator())
                .append("---------------- Menu ------------").append(System.lineSeparator())
                .append("0 - Create Item").append(System.lineSeparator())
                .append("1 - Show all Items").append(System.lineSeparator())
                .append("2 - Edit Item").append(System.lineSeparator())
                .append("3 - Delete Item").append(System.lineSeparator())
                .append("4 - Find Item by ID").append(System.lineSeparator())
                .append("5 - Find Item by Name").append(System.lineSeparator())
                .append("6 - Exit").append(System.lineSeparator()).toString()));
        System.setOut(stdout);

    }

    @Test
    public void whenUserFindByNameItemThenTracker() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("NameTest", "Desc", "22.05.18"));
        Item item2 = tracker.add(new Item("NameTest2", "Desc2", "22.05.18"));
        Item item3 = tracker.add(new Item("NameTest3", "Desc3", "22.05.18"));
        Input input = new StubInput(new String[]{"5", item2.getName(), "6"});
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is( new StringBuilder()
                .append("---------------- Menu ------------").append(System.lineSeparator())
                .append("0 - Create Item").append(System.lineSeparator())
                .append("1 - Show all Items").append(System.lineSeparator())
                .append("2 - Edit Item").append(System.lineSeparator())
                .append("3 - Delete Item").append(System.lineSeparator())
                .append("4 - Find Item by ID").append(System.lineSeparator())
                .append("5 - Find Item by Name").append(System.lineSeparator())
                .append("6 - Exit").append(System.lineSeparator())
                .append("---------------- Menu Find by Name  ------------------").append(System.lineSeparator())
                .append("            Name     Description              ID    Date created").append(System.lineSeparator())
                .append("       NameTest2           Desc2   "+ item2.getId()+"        22.05.18").append(System.lineSeparator())
                .append("---------------- Menu ------------").append(System.lineSeparator())
                .append("0 - Create Item").append(System.lineSeparator())
                .append("1 - Show all Items").append(System.lineSeparator())
                .append("2 - Edit Item").append(System.lineSeparator())
                .append("3 - Delete Item").append(System.lineSeparator())
                .append("4 - Find Item by ID").append(System.lineSeparator())
                .append("5 - Find Item by Name").append(System.lineSeparator())
                .append("6 - Exit").append(System.lineSeparator()).toString()));
        System.setOut(stdout);

    }

}
