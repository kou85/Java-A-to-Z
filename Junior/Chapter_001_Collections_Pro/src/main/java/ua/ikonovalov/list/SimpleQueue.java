package ua.ikonovalov.list;

/**
 * Stack FIFO
 * @author ikonovalov
 * @version 1.0
 * @since  21.02.19.
 */
public class SimpleQueue<T> {

    SimpleStack value;
    SimpleStack<T> stack = new SimpleStack();

    /**
     * Add value
     * @param value added
     */
    public void push(T value) {
        stack.add(value);
    }

    /**
     * Get first element and after delete.
     * @return first element
     */
    public T poll() {
        T result = stack.get(0);
        stack.remove(0);
        return result;
    }
}
