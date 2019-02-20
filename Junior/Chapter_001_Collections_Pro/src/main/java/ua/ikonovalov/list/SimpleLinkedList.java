package ua.ikonovalov.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/** Class SimpleLinkedList.
 * @author ikonovalov.
 * @since  08.02.19.
 * @version 1.0.
 */
public class SimpleLinkedList<E> {
    int size = 0;
    private Node<E> first;
    private Node<E> last;
    private int modCount;

    /**
     * It add new date in last position
     * @param date is being added
     */
    public void add(E date) {
        Node<E> prev = last;
        Node<E> newlink = new Node<>(prev, date, null);
        this.last = newlink;
        if (first == null) {
            this.first = newlink;
        } else {
            prev.next = newlink;
        }
        this.size++;
        this.modCount++;
    }

    /**
     * Method remove element
     * @param index element to remove
     */
    public void remove(int index) {
        outBounds(index);
        Node<E> result = getNode(index);
        if (result.prev != null) {
            result.prev.next = result.next;
        }
        if (result.next != null) {
            result.next.prev = result.prev;
        }
        size--;
        modCount++;

    }

    /**
     * It gets size.
     * @return size.
     */
    public int size() {
        return this.size();
    }

    /**
     * It gets the date in node by index.
     * @param index value.
     * @return date by index.
     */
    public E get(int index) {
        outBounds(index);
        return getNode(index).date;
    }

    /**
     * It gets the node by index
     * @param index value.
     * @return Node by index
     */
    public Node<E> getNode(int index) {
        Node<E> result = null;
        Node<E> temp = first;
        for (int i = 0; i < size; i++) {
            if (index == i) {
                result = temp;
                break;
            }
            temp = temp.next;
        } return result;
    }

    /**
     * Check the index availability.
     * @param index to check.
     * @throws IndexOutOfBoundsException
     */
    private void outBounds(int index) throws IndexOutOfBoundsException {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Return an iterator items.
     * @return an iterator.
     */
    public Iterator<E> iterator() {
        return new SimpleLinkedList.Itr();
    }

    /**
     * Iterator class SimpleLinkedList
     */
    private class Itr implements Iterator<E> {
        int expectModCount = modCount;
        int cursor = 0;

        /**
         * Method checks has next element in container
         * @return true if has next element, false if haven't next element
         */
        @Override
        public boolean hasNext() {
            if (expectModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return cursor < size;
        }

        /**
         * Method return next element in container
         * @return next element in container
         */
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in linkedList");
            }
            Node<E> temp = first;
            E res = temp.date;
            temp = temp.next;

            return res;
        }
    }

    /**
     * Class container linkedList
     * @param <E> generic.
     */
    private class Node<E> {
        private E date;
        private Node<E> next;
        private Node<E> prev;
        Node(Node<E> next, E date, Node<E> prev) {
            this.date = date;
            this.next = next;
            this.prev = prev;

        }

    }

}
