package ua.ikonovalov.tree;

import java.util.*;

/**
 * class SimpleTree
 * @author ikonovalov
 * @since  17.03.19.
 */
public class SimpleTree<E extends Comparable<E>> {

    private Node<E> root;

    private int modCount = 0;

    /**
     * Constructor
     * @param root
     */
    public SimpleTree(Node<E> root) {
        this.root = root;
    }

    /**
     * Method add new value in tree
     * @param parent
     * @param child
     * @return true or false
     */
    boolean add(E parent, E child) {
        boolean valid = false;
        if (!findBy(child).isPresent()) {
            Optional<Node<E>> result = findBy(parent);
            valid = result.isPresent();
            if (valid) {
                result.get().add(new Node<>(child));
                modCount++;
            }
        }
        return valid;
    }

    /**
     * Method find
     * @param value
     * @return
     */
    public Optional<Node<E>> findBy(E value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.eqValue(value)) {
                rsl = Optional.of(el);
                break;
            }
            for (Node<E> child : el.leaves()) {
                data.offer(child);
            }
        }
        return rsl;
    }

    /**
     * Iterator
     * @return iterator
     */
    public Iterator<E> iterator() {
        return new SimpleTree.Itr();
    }

    /**
     * Method check amount leaves
     * @return true or false
     */
    public boolean isBinary() {
        boolean result = true;
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            List<Node<E>> children = el.leaves();
            if (children.size() > 2) {
                result = false;
                break;
            }
            for (Node<E> child : children) {
                data.offer(child);
            }
        }
        return result;
    }

    /**
     * class Iterator
     */
    private class Itr implements Iterator<E> {
        /**
         * Counter changes in container.
         */
        private int expectedModCount = modCount;
        /**
         * Container's tree
         */
        private Queue<Node<E>> data = new LinkedList<>();

        private Itr() {
            data.offer(root);
        }


        @Override
        public boolean hasNext() {
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return !data.isEmpty();
        }

        @Override
        public E next() {
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            Node<E> el;
            if (!hasNext()) {
                throw new IndexOutOfBoundsException();
            } else {
                el = data.poll();
                for (Node<E> child : el.leaves()) {
                    data.offer(child);
                }
            }
            return el.getValue();
        }

    }

}
