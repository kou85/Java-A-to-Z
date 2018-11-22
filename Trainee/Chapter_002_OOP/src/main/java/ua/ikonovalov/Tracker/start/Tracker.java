package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.*;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Created by Strong on 14.09.18.
 */
public class Tracker {
    private ArrayList<Item> items = new ArrayList<>();
    private static final Random RN = new Random();

    /**
     *
     */
    private int position = 0;

    /**
     *
     * @param item
     * @return
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
       // position++;
        return item;
    }

    /**
     *
     * @param itemNew
     */
    public void editItem(Item itemNew) {
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index) != null && items.get(index).getId().equals(itemNew.getId())) {
                this.items.set(index, itemNew);
                break;
            }
        }
    }


    /**
     *
     * @param id
     */
    public void delete(String id) {
        for (int index = 0; index < items.size(); index++) {
            if ((items.get(index) != null) && (items.get(index).getId().equals(id))) {
                this.items.remove(index);
                break;
            }
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Item>  findAll() {
        return this.items;
    }

    /**
     *
     * @param key
     * @return
     */
    public List<Item> findByName(String key) {
        List<Item> result = null;
        for (Item item : items) {
            if ((item != null) && (item.getName().equals(key)))    {
                result.add(item);

            }
        }
        return  result;
    }

    /**
     *
     * @param id
     * @return
     */
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

    /**
     *
     * @return
     */
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }

    /**
     *
     * @return
     */
    public ArrayList<Item> getAll() {
        return this.items;
    }

    /**
     *
     * @param id
     * @return
     */
   /*private int getPositionOfId(String id) {
        int result = -1;
        for (Item value : this.items) {
            if ((value != null) && (value.getId().equals(id))) {
                result = this.items.indexOf(value);
                break;
            }
        } return result;
    }*/

    /**
     *
     * @param index
     */
       /* private void removeIndex(int index) {
            if ((index >=0) && (index < items.size())) {
                items.remove(index);
                position --;
            }
        }*/
}
