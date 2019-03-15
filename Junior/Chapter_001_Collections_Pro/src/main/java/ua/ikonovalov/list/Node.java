package ua.ikonovalov.list;

import java.util.ArrayList;

/**
 * class Node - found loop
 * @author ikonovalov
 * @since 26.02.19.
 */
public class Node<T> {


    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * class Cycle
     * @param <T>
     */
    public static class Cycle<T> {

        public boolean hasCycle(Node first) {
            ArrayList<Node> list = new ArrayList<>();
            Node<T> value = first;
            boolean found = false;
            while (true) {
                if (value.next == null) {
                    break;
                }
                value = value.next;
                if (list.contains(value)) {
                    found = true;
                    break;
                } else {
                    list.add(value);
                }
            }
            return found;
        }

        /**
         * Algorithm tort and rabbit(Floyd)
         * @param first
         * @return true or false
         */
        public boolean hasCycleFloyd(Node<T> first) {
            Node<T> tort = first;
            Node<T> rabbit = first.next;
            boolean found = false;
            while (true) {
                if (rabbit == null || tort == null) {
                    break;
                }
                if (tort.equals(rabbit)) {
                    found = true;
                    break;
                } else {
                    tort = tort.next;
                    rabbit = rabbit.next.next;
                }
            }
            return found;
        }
    }
}
