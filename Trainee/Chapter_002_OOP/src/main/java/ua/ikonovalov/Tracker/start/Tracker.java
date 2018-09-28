package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.*;

import java.sql.SQLOutput;
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
    public void editItem(Item itemNew) {
            for (int index = 0; index!=items.length; ++index) {
                Item item = items [index];
                if (item != null && item.getId().equals(itemNew.getId())) {
                    items[index] = itemNew;
                    break;
                }
            }
    }

    public void delete(String id) {
         int index = getPositionOfId(id);
         if (index >= 0) {
             removeIndex(index);
         }
    }

    public Item[] findAll() {

    }

    public Item findByName(String key) {
        Item result = null;
        for (Item item : items) {
            if ((item != null) && (item.getName().equals(key)))    {
            result = item;
            break;
            }
        }
        return  result;
    }

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if ((item != null) && (item.getId().equals(id))) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item findById(String id) {

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

    private int getPositionOfId(String id) {
        int result = -1;
        for (int index = 0; index <= this.position; index ++) {
            if ((this.items[index] != null) && (this.items[index].getId().equals(id))) {
                result = index;
                break;
            }
        }
        return result;
    }
    private void removeIndex(int index) {
        if ((index >=0)&&(index < items.length)) {
            Item[] temp = new Item[items.length-1];
            System.arraycopy(items, 0, temp, 0, index);
            System.arraycopy(items, index + 1, temp, index, items.length - index - 1 );
            items = temp;
            position --;
        }
    }
}
