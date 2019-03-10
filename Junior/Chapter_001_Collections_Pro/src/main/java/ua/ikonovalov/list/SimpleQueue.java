package ua.ikonovalov.list;

/**
 * Stack FIFO
 * @author ikonovalov
 * @version 1.0
 * @since  21.02.19.
 */
public class SimpleQueue<T> {

    SimpleStack<T> out = new SimpleStack();
    SimpleStack<T> in = new SimpleStack();

    /**
     * Add value
     * @param value added
     */
    public void push(T value) {
        in.add(value);
    }

    /**
     * Get first element and after delete.
     * @return first element
     */


    public T poll() {
        while (in.size() > 0) {
            out.add(in.poll());
        }
        T result = out.poll();
        while (out.size() > 0) {
            in.add(out.poll());
        }
        return result;
    }


}
