package ua.ikonovalov.store;

/**
 * Created by Strong on 09.12.18.
 */
public abstract class Base {

    private final String id;

    protected Base(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
