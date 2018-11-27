package ua.ikonovalov;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * class UserSort
 * @author Konovalov
 * @version 1.0
 * @since 24.11.18
 */
    public class UserSort {
    /**
     * Method add users to ArrayList converts to Set and sorts Age
     */
    public Set<User> sort(List<User> o) {
             //второй вариант копирования из эррей в сет
           /* Set<User> user1 = new TreeSet<>();
            user1.addAll(o);*/
            return new TreeSet<User>(o);
    }
    /**
     * Method add users to ArrayList and sorts the length of the name
     */
    public List<User> sortNameLength(List<User> o) {
        o.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.getName().length() - o2.getName().length();
                    }
                }
               );
        return o;
    }
    /**
     * Method add users to ArrayList and sorts the name and after the Age
     */
    public List<User> sortByAllFields(List<User> o) {
        o.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        int result = o1.getName().compareTo(o2.getName());
                        if (result == 0) {
                            result = Integer.compare(o1.getAge(), o2.getAge());
                        }
                        return result;
                    }
                }
               );
        return o;
    }
}

