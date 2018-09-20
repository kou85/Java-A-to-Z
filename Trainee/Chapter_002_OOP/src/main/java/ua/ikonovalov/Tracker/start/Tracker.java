package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.Item;

import java.util.*;

/**
 * Created by Strong on 14.09.18.
 */
public class Tracker {
    private Item[] items = new Item[10];
    private static final Random RN = new Random();


    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }

    public Item[] getAll() {
        Item[] result = new Item[position];
        for (int i = 0; i!=position; i++) {
            result[i] = this.items[i];
        }
        return result;
    }
}
