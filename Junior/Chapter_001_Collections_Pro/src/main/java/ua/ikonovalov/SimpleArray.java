package ua.ikonovalov;

/**
 * Created by Strong on 09.12.18.
 */


/**
 * Created by Strong on 09.12.18.
 */
public class SimpleArray<T> {


    Object[] objects;
    int index = 0;

    public SimpleArray(int size) {
        this.objects = new Object[size];
    }

    public void add(T model) {
        this.objects[index++] = model;
    }

    public T get(int position) {

        return (T) this.objects[position];
    }


    public void set(int index, T model) {
        this.objects[index] = model;
    }

    public void delete(int index) {
        Object[] object2 = new Object[objects.length-1];
        if (index < this.objects.length) {
           this.objects[index] = null;
        } else {
            throw new ArrayIndexOutOfBoundsException("Please correct index");
        }
    }





}

