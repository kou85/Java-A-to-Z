package ua.ikonovalov.Tracker.start;

import org.junit.Test;
import ua.ikonovalov.Tracker.models.Item;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("test name"));
        assertThat(tracker.getAll()[0].getDescription(), is("desc"));
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
    public void whenUserFindByIDItemThenTracker() {

    }

    @Test
    public void whenUserFindByNameItemThenTracker() {

    }

    public static void main(String[] args) {
       Input input = new StubInput(new String [] {"Create stub task"});
         //new StartUI(input).init();
    }
}
