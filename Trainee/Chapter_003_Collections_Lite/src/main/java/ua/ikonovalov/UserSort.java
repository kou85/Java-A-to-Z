package ua.ikonovalov;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Strong on 22.11.18.
 */
public class UserSort {
    Set<User> sort(List<User> o) {
        Set<User> user = new TreeSet<>(o);
        //второй вариант копирования из эррей в сет
       /* Set<User> user1 = new TreeSet<>();
        user1.addAll(o);*/
        return user;
    }
}
