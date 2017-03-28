package ua.ikonovalov.tracker.start;

import org.junit.Before;
import org.junit.Test;
//import ua.ikonovalov.tracker.models.Comment;
import ua.ikonovalov.tracker.models.Item;
import ua.ikonovalov.tracker.models.Task;



import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * This class is used as a repository for items.
 * class have methods: add, edit, delete, get all items, addComments.
 *
 * @author Konovalov Ivan
 * @version 1.00
 * @since 18.03.2017
 */

public class StartUITest {

	/**
	 * The first item field.
	 */
	private Item testItemOne;

	/**
	 * The third item field.
	 */
	private Item testItemTwo;
	/**
	 * The test tracker field.
	 */
	private Item testItemThree;

	/**
	 * The test tracker field.
	 */
	private Tracker trackerTest;

	/**
	 * The test input field.
	 */
	private Input input;

	/**
	 * Information method to test.
	 */
	@Before
	public  void infoForTest() {
		testItemOne = new Task("nameOne", "descriptionOne", 150);
		testItemTwo = new Task("nameTwo", "descriptionTwo", 130);
		testItemThree = new Task("nameThree", "descriptionThree", 500);
		trackerTest = new Tracker();
	}

	/**
	 * Test AddItem class.
	 */
	@Test
	public void whenAddNewItemThenInTrackerIsSameItem() {
		input = new StubInput(new String[]{"0", "nameOne", "descriptionOne", "y"});
		new StartUI(input, trackerTest).init();
		assertThat(trackerTest.getAll()[0].getName(), is("nameOne"));
		assertThat(trackerTest.getAll()[0].getDescription(), is("descriptionOne"));

	}
	/**
	 * Test UpdateItem class.
	 */
	@Test
	public void whenUpdateItemThenNewItem() {
		trackerTest.addItem(testItemOne);
		String id = trackerTest.findByName("nameOne").getId();
		input = new StubInput(new String[]{"2", id, "nameTwo", "descriptionTwo", "y"});
		new StartUI(input, trackerTest).init();
		assertThat(trackerTest.getAll()[0].getName(), is("nameTwo"));
		assertThat(trackerTest.getAll()[0].getDescription(), is("descriptionTwo"));
	}

	/**
	 * Test DeleteItem class.
	 */
	@Test
	public void whenAddTwoItemAndDeleteFirstThenResultSecondItem() {
		trackerTest.addItem(testItemOne);
		trackerTest.addItem(testItemTwo);
		input = new StubInput(new String[]{"3", trackerTest.getAll()[0].getId(), "y", "y"});
		new StartUI(input, trackerTest).init();
		assertThat(trackerTest.getAll()[0].getName(), is("nameTwo"));
		assertThat(trackerTest.getAll()[0].getDescription(), is("descriptionTwo"));
	}

	/**
	 * Test FindItemByName class.
	 */
	@Test
	public void whenAddTwoItemAndFindByNameThenResultThatItemName() {
		trackerTest.addItem(testItemOne);
		trackerTest.addItem(testItemTwo);
		input = new StubInput(new String[]{"5", "nameTwo", "y"});
		new StartUI(input, trackerTest).init();
		assertThat(trackerTest.getAll()[1].getName(), is("nameTwo"));
		assertThat(trackerTest.getAll()[1].getDescription(), is("descriptionTwo"));
	}

	/**
	 * Test FindItemById class.
	 */
	@Test
	public void whenAddTwoItemAndFindByIdThenResultThatItemId() {
		trackerTest.addItem(testItemOne);
		trackerTest.addItem(testItemTwo);
		String id = trackerTest.findByName("nameOne").getId();
		input = new StubInput(new String[]{"6", id, "y"});
		new StartUI(input, trackerTest).init();
		assertThat(trackerTest.getAll()[0].getName(), is("nameOne"));
		assertThat(trackerTest.getAll()[0].getDescription(), is("descriptionOne"));
	}

	/**
	 * Test Comment.
	 */
	@Test
	public void whenAddCommentThenResultItemWithThatComment() {
		trackerTest.addItem(testItemOne);
		String id = trackerTest.getAll()[0].getId();
		input = new StubInput(new String[]{"7", id, "testComments", "y"});
		new StartUI(input, trackerTest).init();
		assertThat(trackerTest.getAll()[0].getComments(), is("testComments"));
	}
}