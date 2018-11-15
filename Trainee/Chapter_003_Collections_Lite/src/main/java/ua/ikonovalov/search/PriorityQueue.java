package ua.ikonovalov.search;

import java.util.LinkedList;

/**
 * Created by Strong on 15.11.18.
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        //TODO добавить вставку в связанный список.
    }

    public Task take() {
        return this.tasks.poll();
    }
}
