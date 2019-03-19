package ua.ikonovalov.tree;

import java.util.*;


/**
 * class Node
 * @author ikonovalov
 * @since 19.03.19.
 */
public class Node<E extends Comparable<E>> {

    private final List<Node<E>> children = new ArrayList<>();
    private final E value;

    /**
     * Constructor
     * @param value
     */
    public Node(E value) {
        this.value = value;
    }

    /**
     *
     * @param child
     */
    public void add(Node<E> child) {
        this.children.add(child);
    }

    /**
     * Method leaves's tree
     * @return
     */
    public List<Node<E>> leaves() {
        return this.children;
    }

    /**
     * Method check duplicate
     * @param that
     * @return
     */
    public boolean eqValue(E that) {
        return this.value.compareTo(that) == 0;
    }

    /**
     * return value's Node
     * @return value
     */
    public E getValue() {
        return value;
    }
}
