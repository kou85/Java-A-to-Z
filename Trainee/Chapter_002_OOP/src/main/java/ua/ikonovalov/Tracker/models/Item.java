package ua.ikonovalov.Tracker.models;

/**
 * Created by Strong on 18.09.18.
 */
public class Item {
    private String id;
    private String name;
    private String description;
    private long create;

    public Item() {

    }
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description=description;
    }
    public String getDescription(){
        return this.description;
    }

    public void setCreate(long create) {
        this.create = create;
    }

    public long getCreate() {
        return this.create;
    }
}
