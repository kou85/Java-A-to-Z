package ua.ikonovalov.tracker.proba;

import java.util.Random;

public class Tracker {
    Item item[] = new Item[100];
    int pos = 0;
    private  static final Random random = new Random();


    public Item add(Item item) {
        item.setId(generateId());
        return  this.item[pos++] = item;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + random.nextInt());
    }

    public Item getforID(String id) {

            Item result = null;
        for ( Item value: this.item) {
            if (value != null && value.getId().equals(id)) {
                result = value;
                break;

            }
        }return result;
    }
    public Item[] findAll() {
        Item[] result = new Item[this.pos];
        for (int i = 0; i != this.pos; i++) {
            if (this.item[i] != null) {
                result[i] = this.item[i];
            }
        }
        return result;
    }
}
