package ua.ikonovalov.list;

/**
 * Created by Strong on 03.01.19.
 */
public class SimpleArrayList<E> {

    private int size;
    private Node<E> first;

    public void add(E date) {
        Node<E> newLink = new Node<>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }
 /**
 * Реализовать метод удаления первого элемент в списке.
 */
    public E delete() {
        E result = null;
        if (size > 0) {
            Node<E> temp = this.first;
            result = temp.date;
            this.first = temp.next;
                 }
        return result;
    }

/**
 * Метод получения элемента по индексу.
 */

    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
          result = result.next;
        }
        return result.date;
    }

/**
 * Метод получения размера коллекции.
 */

    public int getSize() {
        return this.size;

    }

/**
 * Класс предназначен для хранения данных.
 */

    private static class Node<E> {
        E date;
        Node<E> next;
        Node(E date) {
            this.date = date;
        }

    }
}

