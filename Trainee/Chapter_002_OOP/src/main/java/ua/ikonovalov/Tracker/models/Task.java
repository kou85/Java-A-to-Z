package ua.ikonovalov.Tracker.models;

/**
 * Created by Strong on 20.09.18.
 */
public class Task extends Item {
    String name;
    String description;

    public Task(String name, String desc) {
        this.name = name;
        this.description = desc;

    }

    public String calculatePrice() {
        return "100%";
    }
}
