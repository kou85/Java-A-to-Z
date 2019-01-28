package ua.ikonovalov.list;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * Created by Strong on 13.01.19.
 */
public class SimpleDynamicArrayList<E>  {


    private Object[] container;
    private int compacity;
    private int index;
    private int modCount;

    public int size() {
        return this.index;
    }

    public SimpleDynamicArrayList(int size) {
        this.container = new Object[size];
        this.compacity = size;
        this.index = 0;
        this.modCount = 0;
    }


    void add(E value) {
        checkCompacity();
        this.container[index++] = value;
    }


    private void checkCompacity() {
        int newSize = compacity * 2;
        if (compacity == index) {
            this.container = Arrays.copyOf(this.container, newSize);
            this.compacity = newSize;
            this.modCount++;

        }
    }



    public E get(int index) {
        return  (E)this.container[index];
    }

    public void set(int index, E value) {
        this.container[index] = value;
        modCount++;
    }


}
