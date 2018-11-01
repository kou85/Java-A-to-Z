package ua.ikonovalov.Tracker.start;
/**
 *
 */

import org.junit.Test;
import ua.ikonovalov.Tracker.models.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    private final Tracker tracker = new Tracker();
    private final Item item = tracker.add(new Item("NameTest", "Desc", "22.05.18"));
    private final Item item2 = tracker.add(new Item("NameTest2", "Desc2", "22.05.18"));
    private final Item item3 = tracker.add(new Item("NameTest3", "Desc3", "22.05.18"));
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private String menu = new StringBuilder()
            .append("---------------- Menu ------------").append(System.lineSeparator())
            .append("0 - Create Item").append(System.lineSeparator())
            .append("1 - Show all Items").append(System.lineSeparator())
            .append("2 - Edit Item").append(System.lineSeparator())
            .append("3 - Delete Item").append(System.lineSeparator())
            .append("4 - Find Item by ID").append(System.lineSeparator())
            .append("5 - Find Item by Name").append(System.lineSeparator())
            .append("6 - Exit").append(System.lineSeparator()).toString();

 /*   @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[3].getName(), is("test name"));
        assertThat(tracker.getAll()[3].getDescription(), is("desc"));
    }

    @Test
    public void whenUserEditItemThenTracker() {
        Input input = new StubInput(new String[]{"2", item.getId(), "name", "test", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("name"));
    }

    @Test
    public void whenUserDeleteItemThenTracker() {
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("NameTest2"));
    }

    @Test
    public void whenUserShowAllItemsInTracker() {
        Input input = new StubInput(new String[]{"1", "6"});
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is( new StringBuilder()
                .append(menu)
                .append("---------------- All Items ------------------").append(System.lineSeparator())
                .append("            Name     Description              ID    Date created").append(System.lineSeparator())
                .append("        NameTest            Desc   "+ item.getId()+"        22.05.18").append(System.lineSeparator())
                .append("       NameTest2           Desc2   "+ item2.getId()+"        22.05.18").append(System.lineSeparator())
                .append("       NameTest3           Desc3   "+ item3.getId()+"        22.05.18").append(System.lineSeparator())
                .append(menu).toString()));
        System.setOut(stdout);
    }

    @Test
    public void whenUserFindByIDItemThenTracker() {
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is( new StringBuilder()
                .append(menu)
                .append("---------------- Menu Find by Id  ------------------").append(System.lineSeparator())
                .append("            Name     Description              ID    Date created").append(System.lineSeparator())
                .append("        NameTest            Desc   "+ item.getId()+"        22.05.18").append(System.lineSeparator())
                .append(menu).toString()));
        System.setOut(stdout);
    }

    @Test
    public void whenUserFindByNameItemThenTracker() {
        Input input = new StubInput(new String[]{"5", item2.getName(), "6"});
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is( new StringBuilder()
                .append(menu)
                .append("---------------- Menu Find by Name  ------------------").append(System.lineSeparator())
                .append("            Name     Description              ID    Date created").append(System.lineSeparator())
                .append("       NameTest2           Desc2   "+ item2.getId()+"        22.05.18").append(System.lineSeparator())
                .append(menu).toString()));
        System.setOut(stdout);
    }*/
}
