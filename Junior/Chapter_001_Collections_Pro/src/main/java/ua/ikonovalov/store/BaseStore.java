package ua.ikonovalov.store;

/**
 * class BaseStore
 * @author ikonovalov
 * @since 18.12.18.
 * @version 1.0
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
        int index = 0;
        for (T t : simple) {
            if (t != null && id.equals(t.getId())) {
                simple.set(index, model);
                value = true;
                break;
            }
            index++;
        }
        return value;
    }

    @Override
    public boolean delete(String id) {
        boolean value = false;
        int index = 0;
        for (T t: simple) {
            if (t != null && id.equals(t.getId())) {
                simple.delete(index);
                value = true;
                break;
            }
            index++;
        }
        return value;
    }

    @Override
    public T findById(String id) {
        int index = 0;
        T value = null;
        for (T t : simple) {
            if (t != null && id.equals(t.getId())) {
                value = simple.get(index);
                break;
            }
            index++;
        }
        return value;
    }
}
