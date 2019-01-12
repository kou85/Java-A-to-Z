package ua.ikonovalov.list;

/**
 * Created by Strong on 03.01.19.
 */
public class SimpleArrayList<e> {
    private int size;
    private Node<e> first;

    public void add(e date) {
        Node<e> newLink = new Node<>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }
 /**
 * Реализовать метод удаления первого элемент в списке.
 */
    public e delete() {
        Node<e> result = this.first;
        result = result.next;

        return result.date;
    }

/**
 * Метод получения элемента по индексу.
 */

    public e get(int index) {
        Node<e> result = this.first;
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

    private static class Node<e> {
        e date;
        Node<e> next;
        Node(e date) {
            this.date = date;
        }
    }
}

