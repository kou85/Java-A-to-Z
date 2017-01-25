package ua.ikonovalov.start;

import ua.ikonovalov.models.*;
import java.utils.*;

public class Tracker {
	//arhiv aplication
	private Item[] items = new Item[10];
	private int  = position = 0;
	//генерирует случайніе числа
	private static final Random RN = new Randov();

	public Item add(Item item) {
		item.setId(String.valueOf(RN.next()));
		this.items[position++] = item;
		return item;
	}
	protected Item findById(String id) {
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Tracker tracker = new Tracker();
		tracker.items[0] = new Item( "name", "desk", 01);
		tracker.items[1] = new Task( "name", "desk");
		tracker.items[2] = new Bug();

		for (Item item : tracker.items) {
		if (item instanceof Task){
			
		
		System.out.ptintln(((Task)item).calculatePrice());	
		}	
		System.out.println(item.getName() + " " + item.getDescription());
		}
	}
	
}