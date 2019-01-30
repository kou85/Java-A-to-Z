package ua.ikonovalov.list;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Strong on 13.01.19.
 */
public class SimpleDynamicArrayList<E>  {

    private Object[] container;
    private int index;
    private int modCount;
    public int size() {
        return this.index;
    }

    public SimpleDynamicArrayList(int size) {
        this.container = new Object[size];
        this.index = 0;
        this.modCount = 0;
    }

    void add(E value) {
        checkCompacity();
        this.container[index++] = value;
    }

    private void checkCompacity() {
        int newSize = (container.length-1) * 2;
        if (container.length-1 == index) {
            this.container = Arrays.copyOf(this.container, newSize);
            this.modCount++;
        }
    }

    public E get(int index) {
        outOfNumberOfElements(index);
        return  (E)this.container[index];
    }

    public void set(int index, E value) {
        outOfNumberOfElements(index);
        this.container[index] = value;
        modCount++;
    }
    private void outOfNumberOfElements(int value) throws IndexOutOfBoundsException {
        if (value >= this.index) {
            throw new IndexOutOfBoundsException();
        }
    }


    private class Itr implements Iterator<E> {
        int expectModCount = modCount;


        @Override
        public boolean hasNext() {
            boolean valid = false;

            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }


}
