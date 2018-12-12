package ua.ikonovalov;

/**
 * Created by Strong on 09.12.18.
 */
public interface Store<T extends Base> {
    /**
     *
     * @param model
     */
    void add(T model);

    /**
     *
     * @param id
     * @param model
     * @return
     */
    boolean replace(String id, T model);

    /**
     *
     * @param id
     * @return
     */
    boolean delete(String id);

    /**
     *
     * @param id
     * @return
     */
    T findById(String id);
}
