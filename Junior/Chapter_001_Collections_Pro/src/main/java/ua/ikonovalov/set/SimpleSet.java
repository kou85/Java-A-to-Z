package ua.ikonovalov.set;

import ua.ikonovalov.list.SimpleDynamicArrayList;

/**
 * Created by Strong on 28.02.19.
 */
public class SimpleSet<T> {

    private SimpleDynamicArrayList<T> list = new SimpleDynamicArrayList(10);

    public void add(T value) {
        if (list != null && checkDublicate(value)) {
            list.add(value);
        }
    }

    private boolean checkDublicate(T value) {
        boolean result = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == value) {
                result = false;
                break;
            }
        } return result;
    }

    private T get(int value) {
        return list.get(value);
    }



}
