package ua.ikonovalov.list;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

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
        int newSize = (container.length - 1) * 2;
        if (container.length - 1 == index) {
            this.container = Arrays.copyOf(this.container, newSize);
            this.modCount++;
        }
    }

    public E get(int index) {
        outOfNumberOfElements(index);
        return  (E) this.container[index];
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

    /**
     * Iterator class SimpleDynamicArrayList
     */
    private class Itr implements Iterator<E> {
        int expectModCount = 0;

        /**
         * Method checks has next element in array
         * @return true if has next element, false if haven't next element
         */
        @Override
        public boolean hasNext() {
          return expectModCount < modCount;
        }

        /**
         * Method return next element in array
         * @return next element in array
         */
        @Override
        public E next() {
            try {
                expectModCount++;
                E next = get(expectModCount - 1);
                return next;
            } catch (IndexOutOfBoundsException er) {
                throw new NoSuchElementException("No ");
            }
        }
    }


}
