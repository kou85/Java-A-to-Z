package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.Item;

/**
 * Created by Strong on 14.09.18.
 */
public class Tracker {
    private Item[] items = new Item[10];

    private int position = 0;
    public Item add(Item item) {
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

}
