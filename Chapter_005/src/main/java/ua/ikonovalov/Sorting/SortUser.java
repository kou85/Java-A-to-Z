package ua.ikonovalov.Sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class SortUser.
 *
 * @author ru.sbulygin.
 * @since 25.04.2017.
 * @version 1.0.
 */
public class SortUser {

    /**
     * The method sorts the list of users by age and returns the TreeSet collection.
     *
     * @param userList the list of users.
     * @return TreeSet collection with users.
     */
    public Set<User> sort(List<User> userList) {
        Set<User> userSet = new TreeSet<>();
        for (User user : userList) {
            userSet.add(user);
        }
        return userSet;
    }




    /**
     * The method sorts the list of users by name length.
     * @param userList the list of users.
     * @return A list of users sorted by name length.
     */
    public List<User> sortLength(List<User> userList) {
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        return userList;
    }

    /**
     * The method sorts the list of users by hash code.
     * @param userList the list of users.
     * @return A list of users sorted by hash code.
     */
    public List<User> sortByAllFields (List<User> userList) {
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int i = o1.getName().compareTo(o2.getName());
                   return i != 0 ? i : Integer.compare(o1.getAge(), o2.getAge());

            }
        });
        return userList;
    }
}

