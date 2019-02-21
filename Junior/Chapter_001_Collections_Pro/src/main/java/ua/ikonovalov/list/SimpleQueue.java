package ua.ikonovalov.list;

/**
 * Stack FIFO
 * @author ikonovalov
 * @version 1.0
 * @since  21.02.19.
 */
public class SimpleQueue<T> extends SimpleLinkedList<T> {

    /**
     * Add value
     * @param value added
     */
    public void push(T value) {
        add(value);
    }

    /**
     * Get first element and after delete.
     * @return first element
     */
    public T poll() {
        T result = this.get(0);
        remove(0);
        return result;
    }
}
