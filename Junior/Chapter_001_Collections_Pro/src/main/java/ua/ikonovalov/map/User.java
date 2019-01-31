package ua.ikonovalov.map;

import java.util.Calendar;

/**
 * Created by Strong on 30.01.19.
 */
public class User {

    private String name;
    private int children;
    private Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }
}
