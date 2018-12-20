package ua.ikonovalov.store;

/**
 * Created by Strong on 18.12.18.
 */
public abstract class BaseStore<T extends Base> implements Store<T> {

    SimpleArray<T> simple = new SimpleArray(20);


    @Override
    public void add(T model) {
        simple.add(model);
    }

    @Override
    public boolean update(String id, T model) {
        boolean value = false;

        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public T findById(String id) {
        return null;
    }
}
