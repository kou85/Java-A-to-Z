package ua.ikonovalov;


import java.util.Iterator;
/**
 * class SimpleArray
 * @autor ikonovalov
 * @since 09.12.18.
 */

public class SimpleArray<T> implements Iterable<T> {


    public Object[] objects;
    private int index = 0;

    public SimpleArray(int size) {
        this.objects = new Object[size];
    }

    public void add(T model) {
        this.objects[index++] = model;
    }

    public T get(int position) throws NullPointerException {
        if (position > index) {
            throw new NullPointerException("No elements");
        }
        return (T) this.objects[position];
    }


    public void set(int index, T model) {
        this.objects[index] = model;
    }

    public void delete(int index) {
        if (index < this.index) {
           this.objects[index] = null;
            System.arraycopy(objects, index + 1, objects, index, objects.length - 1 - index);
            this.index--;
        } else {
            throw new ArrayIndexOutOfBoundsException("Please correct index");
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int pos = 0;
            @Override
            public boolean hasNext() {
                return pos < index;
            }

            @Override
            public T next() {
                return (T) objects[pos++];
            }
        };
    }
}

