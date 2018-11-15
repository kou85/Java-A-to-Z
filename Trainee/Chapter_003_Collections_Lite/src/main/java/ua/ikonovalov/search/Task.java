package ua.ikonovalov.search;

/**
 * Created by Strong on 15.11.18.
 */
public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return this.desc;
    }
    public int getPriority() {
        return this.priority;
    }
}
