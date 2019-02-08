package ua.ikonovalov.list;

import java.lang.reflect.Array;
import java.util.*;

/**class SimpleDynamicArrayList
 * @author ikonovalov
 * @since 08.02.19
 * @version 1.0
 * My ArrayList.
 */
public class SimpleDynamicArrayList<E> implements Iterable  {
    /**
     * fields
     */
    private Object[] container;
    private int index;
    private int modCount;
    public int size() {
        return this.index;
    }

    /**
     * Constructor
     * @param size
     */
    public SimpleDynamicArrayList(int size) {
        this.container = new Object[size];
        this.index = 0;
        this.modCount = 0;
    }

    /**
     * Add elements in Array
     * @param value
     */
    void add(E value) {
        checkCompacity();
        this.container[index++] = value;
        this.modCount++;
    }

    /**
     * Check or step up Array
     */
    private void checkCompacity() {
        int newSize = (container.length - 1) * 2;
        if (container.length - 1 == index) {
            this.container = Arrays.copyOf(this.container, newSize);

        }
    }

    /**
     * Get elements in Array
     * @param index
     * @return
     */
    public E get(int index) {
        outOfNumberOfElements(index);
        return  (E) this.container[index];
    }

    /**
     * Update elements in Array
     * @param index
     * @param value
     */
    public void set(int index, E value) {
        outOfNumberOfElements(index);
        this.container[index] = value;
        modCount++;
    }

    /**
     * Check for elements in Array
     * @param value
     * @throws IndexOutOfBoundsException
     */
    private void outOfNumberOfElements(int value) throws IndexOutOfBoundsException {
        if (value >= this.index) {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Iterator of SimpleDynamicArrayList
     * @return Iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    /**
     * Iterator class SimpleDynamicArrayList
     */
    private class Itr implements Iterator<E> {
        int expectModCount = modCount;
        int i = 0;

        /**
         * Method checks has next element in array
         * @return true if has next element, false if haven't next element
         */
        @Override
        public boolean hasNext() {
            if (expectModCount != modCount) {
                throw new ConcurrentModificationException();
            }
          return i < index;
        }

        /**
         * Method return next element in array
         * @return next element in array
         */
        @Override
        public E next() {
            try {
                i++;
                E next = get(i - 1);
                return next;
            } catch (IndexOutOfBoundsException er) {
                throw new NoSuchElementException("No more elements in list");
            }
        }
    }


}
