package ua.ikonovalov;



/**
 * Created by Strong on 09.12.18.
 */
public class SimpleArray<T> {


    public Object[] objects;
    private int index = 0;

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
        if (index < this.objects.length) {
           this.objects[index] = null;
            System.arraycopy(objects, index + 1, objects, index, objects.length - 1 - index);
            this.index--;
        } else {
            throw new ArrayIndexOutOfBoundsException("Please correct index");
        }
    }





}

