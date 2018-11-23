package ua.ikonovalov.tracker.models;

/**
 * Created by Strong on 18.09.18.
 */
public class Item {
    private String id;
    private String name;
    private String description;
    private String createDate;

    public Item() {

    }
    public Item(String name, String description, String createDate) {
        this.name = name;
        this.description = description;
        this.createDate = createDate;
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

    public void setCreateDate(String create) {
        this.createDate = createDate;
    }

    public String getCreateDate() {
        return this.createDate;
    }
}
