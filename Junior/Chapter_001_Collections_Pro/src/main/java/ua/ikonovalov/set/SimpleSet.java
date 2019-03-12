package ua.ikonovalov.set;

import ua.ikonovalov.list.SimpleDynamicArrayList;
import java.util.Iterator;

/**
 * Class SimpleSet using composition
 * @author ikonovalov
 * @since  28.02.19.
 */
public class SimpleSet<T> {
    /**
     * list type SimpleDynamicArrayList
     */
    private SimpleDynamicArrayList<T> list = new SimpleDynamicArrayList(10);

    /**
     * add value in list
     * @param value
     */
    public void add(T value) {
        if (list != null && checkDuplicate(value)) {
            list.add(value);
        }
    }

    /**
     * check duplicates in list
     * @param value
     * @return
     */
    private boolean checkDuplicate(T value) {
        boolean result = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(value)) {
                result = false;
                break;
            }
        } return result;
    }

    /**
     * method get
     * @param value
     * @return
     */
    private T get(int value) {
        return list.get(value);
    }

    /**
     * Iterator
     * @return iterator
     */
    public Iterator<T> iterator() {
        return list.iterator();
    }



}
