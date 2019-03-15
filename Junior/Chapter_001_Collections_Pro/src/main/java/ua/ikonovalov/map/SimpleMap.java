package ua.ikonovalov.map;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class SimpleMap
 * @author ikonovalov
 * @since 13.03.19.
 */
public class SimpleMap<T, V> {

    private int defaultSize = 16;

    private int position = 0;

    private Entry<T, V>[] table;

    private int checkSize = (int) (defaultSize * 0.75);

    /**
     * Constructor default
     */
    public SimpleMap() {
        this.table = new Entry[defaultSize];
    }

    /**
     * Constructor with new size
     * @param size
     */
    public SimpleMap(int size) {
        this.table = new Entry[size];
    }

    /**
     * Method add value
     * @param key
     * @param value
     * @return
     */
    boolean insert(T key, V value) {
        boolean result = false;
        if (checkSize == position) {
            increment(table);
        }
        int hashIndex = hashFunction(key);

        if (table[hashIndex] == null) {
            table[hashIndex] = new Entry(key, value);
            result = true;
            position++;
        } else {
            Entry<T, V> oldElement = table[hashIndex];
            if (oldElement.key.equals(key)) {
                oldElement.value = value;
                result = true;
            }
        }
        return result;
    }

    /**
     * Method increment table
     * @param entry
     */
    private void increment(Entry<T, V>[] entry) {
        int newSize = this.defaultSize * 2;
        Entry[] newTable = new Entry[newSize];
        for (int i = 0; i < entry.length; i++) {
            if (entry[i] != null) {
                Entry<T, V> value = entry[i];
                int newIndex = (value.hashCode() & newSize - 1);
                newTable[newIndex] = new Entry(value.key, value.value);
            }
        }
        this.defaultSize = newSize;
        this.table = newTable;
        this.checkSize = (int) (defaultSize * 0.75);

    }

    /**
     * Method Get value with key.
     * @param key
     * @return value
     */
    V get(T key) {
        int index = hashFunction(key);
        if (key != null && index != -1) {
            return table[index].getValue();
        } else {
            throw new NoSuchElementException("No such element");
        }
    }

    /**
     * Method delete
     * @param key
     * @return true or false
     */
    boolean deleted(T key) {
        boolean result = true;
        int index = hashFunction(key);
        if (key != null && index != -1) {
            table[index] = null;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * Method generate index HashFunction
     * @param key
     * @return index's hashTable
     */
    private int hashFunction(T key) {
        int hash = 17;
        hash = hash * 37 + key.hashCode();
        return hash % table.length;
    }

    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {
        private int cursor = 0;

        /**
         * method hasNext of iterator
         * @return true if has next element.
         */
        @Override
        public boolean hasNext() {
            boolean result = false;
            for (int i = cursor; i < table.length; i++) {
                if (table[i] != null) {
                    result = true;
                    break;
                }
            }
            return result;
        }

        /**
         * Method next for iterator.
         * @return next element.
         */
        @Override
        public Object next() {
            while (table[cursor] == null) {
                cursor++;
            }
            return table[cursor++];
        }
    }

    /**
     * Class container Entry
     * @param <T>
     * @param <V>
     */
    static class Entry<T, V> {

        private T key;
        private V value;

        public Entry(T key, V value) {

            this.key = key;
            this.value = value;
        }

        public T getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
