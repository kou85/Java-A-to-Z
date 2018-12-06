package ua.ikonovalov.tempplace;

import java.util.Iterator;

/**
 * Created by Strong on 05.12.18.
 */
public class IteratorArray implements Iterator {

    private final int[] value;
    private int index = 0;

    public IteratorArray(final int[] value) {
        this.value = value;

    }

    @Override
    public boolean hasNext() {
        return value.length > index;
    }

    @Override
    public Object next() {
        return value[index++];
    }
}
