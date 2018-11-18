package ua.ikonovalov.search;

//import java.util.Comparator;
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
        //Вариант использования компаратора
        //this.tasks.sort(Comparator.comparing(Task::getPriority));
        int index = 0;
        for (Task value: tasks) {
            if (task.getPriority() >= value.getPriority() ) {
                index++;
            }
        } this.tasks.add(index, task);

    }

    public Task take() {
        return this.tasks.poll();
    }
}
