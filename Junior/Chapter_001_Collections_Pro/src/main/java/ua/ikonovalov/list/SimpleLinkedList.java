package ua.ikonovalov.list;

/**
 * Created by Strong on 08.02.19.
 */
public class SimpleLinkedList<E> {
    int size = 0;
    private Node<E> first;
    private Node<E> last;

    public void add() {

    }
    public void set() {

    }
    public Node<E> get() {
        return null;
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

}
