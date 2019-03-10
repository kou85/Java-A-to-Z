package ua.ikonovalov.list;

/**
 * Stack LIFO
 * @author ikonovalov
 * @version 1.0
 * @since  19.02.19.
 */
public class SimpleStack<T> extends SimpleLinkedList<T> {

    /**
     * Add value
     * @param value added
     */
    public void push(T value) {
        add(value);
    }
    public int size() {
        return size();
    }

    /**
     * Get last element and after delete.
     * @return last element
     */
    public T poll() {
        T result = get(size() - 1);
        remove(size() - 1);
        return result;

    }
}
