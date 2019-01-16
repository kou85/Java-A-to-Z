package ua.ikonovalov.list;

/**
 * Created by Strong on 13.01.19.
 */
public interface SimpleContainer<E> extends Iterable<E>{
    void add(E e);
    E get(int index);
}
