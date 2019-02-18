package ua.ikonovalov.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Strong on 08.02.19.
 */
public class SimpleLinkedList<E> {
    int size = 0;
    private Node<E> first;
    private Node<E> last;
    private int modCount;

    public void add(E date) {
        Node<E> newlink = new Node<>(date);
        newlink.next = first;
        first = newlink;
        this.size++;
        this.modCount++;
    }

    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index ; i++) {
            result = result.next;
        }
        return result.date;
    }

    public int size() {
        return this.size();
    }




    private class Node<E> {
        E date;
        Node<E> next;
        Node<E> previous;
        Node(E date) {
          this.date = date;
        }

    }
    /**
     * Iterator class SimpleDynamicArrayList
     */
    private class Itr implements Iterator<E> {
        int expectModCount = modCount;
        int i = 0;

        /**
         * Method checks has next element in array
         * @return true if has next element, false if haven't next element
         */
        @Override
        public boolean hasNext() {
            if (expectModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return i < index;
        }

        /**
         * Method return next element in array
         * @return next element in array
         */
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in list");
            }
            return (E) container[i++];
        }

    }

}
