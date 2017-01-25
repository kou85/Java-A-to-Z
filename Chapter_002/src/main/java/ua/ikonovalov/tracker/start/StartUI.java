package ua.ikonovalov.start;

public class StartUI{

	public static void main(String[] args){
		Tracker tracker = new Tracker();
		tracker.items[0] = new Item( "name", "desk", 01);
		tracker.items[1] = new Task( "name", "desk");
		tracker.items[2] = new Bug();

		
		System.out.ptintln(((Task)item).calculatePrice());	
		}	
		System.out.println(item.getName() + " " + item.getDescription());
		}
	}
	
}