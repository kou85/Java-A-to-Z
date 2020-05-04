package ua.ikonovalov;

/**
 * @author Konovalov Ivan
 * @version 00
 * @since 23.02.2020
 */
public class Attachment {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
