package ua.ikonovalov.tracker.start;
import ua.ikonovalov.tracker.models.*;

public class StartUI {
	private final String menu =
			"\n Press number for action" +
					"\n 1. Add task" +
					"\n 2. Show all task" +
					"\n 3. Edit task" +
					"\n 4. Delete task by id" +
					"\n 5. Delete all task" +
					"\n 6. Find Item by name" +
					"\n 7. Find Item by id" +
					"\n 8. Add comment for Item" +
					"\n 10. Exit" +
					"\n Select: ";
	private Input input;
	private Tracker tracker = new Tracker();
	public StartUI(Input input,  Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	public void init() {
		boolean exit = false;
		while (!exit) {
			int numberMenu = Integer.parseInt(this.input.ask(this.menu));

			switch (numberMenu) {
				case 1:
					addItem();
					break;
				case 2:
					showItem();
					break;
				case 3:
					updateItem();
					break;
				case 4:
					deleteItem();
					break;
				case 5:
					deleteAllItem();
					break;
				case 6:
					findByName();
					break;
				case 7:
					findById();
					break;
				case 8:
					addComment();
					break;
				case 10:
					exit = true;
					break;
				default:
					System.out.println("Wrong namber action");
			}
		}
	}

	public void addItem() {
		String name = input.ask("Please, enter the task's name: ");
		String description = input.ask("Please, enter the description: ");
		tracker.addItem(new Task(name, description, System.currentTimeMillis()));
	}

	public void showItem() {
		Item[] allItem = tracker.getAll();
		if (allItem != null) {
			for (Item item : allItem) {
				System.out.println(String.format("%s. %s  %s", "ID: " + item.getId(), "Name: " + item.getName(), "Description: " + item.getDescription() + " Comment: " + item.getComments()));
			}
		}
	}

	public void updateItem() {
		String id = input.ask("Please, enter Id item: ");
		String name = input.ask("Please, enter the task's name: ");
		String description = input.ask("Please, enter the description: ");
		Task task = new Task(name, description, System.currentTimeMillis());
		task.setId(id);
		tracker.updateItem(task);




	}
	public void deleteItem (){
		String id = input.ask("Please, enter Id item: ");
		tracker.deleteItem(id);
	}
	public void deleteAllItem () {
		tracker.deleteAll();
	}
	public void findByName() {
		String name = input.ask("Please, enter the task's name: ");
		Item item = tracker.findByName(name);
		System.out.println(String.format("%s. %s  %s", "ID: " + item.getId(), "Name: " + item.getName(), "Description: " + item.getDescription()));
	}
	public void findById() {
		String id = input.ask("Please, enter the task's id: ");
		Item item = tracker.findById(id);
		System.out.println(String.format("%s. %s  %s", "ID: " + item.getId(), "Name: " + item.getName(), "Description: " + item.getDescription()));
	}
	public void addComment() {
		String id = input.ask("Please, enter Id item: ");
		String comment = input.ask("Please, enter comment item: ");
		tracker.addComment(id, comment);
	}



		/**
         * The start program - menu
         * @param args
         */

	public static void main(String[] args) {
		//Input input = new StubInput(new String[] {"create stub task"});
		Input input = new ConsoleInput ();
		Tracker tracker = new Tracker();
		//new StartUi(new StubInput(new String[] {"create stub task"})).init()
		new StartUI(input, tracker).init();
	}	
	
}