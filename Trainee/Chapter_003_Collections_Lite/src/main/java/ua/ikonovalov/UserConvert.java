package ua.ikonovalov;

import java.util.HashMap;
import java.util.List;


/**
 * class UserConvert
 * @author ikonovalov
 * @since 20.11.18.
 * @version 1.0
 */
public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
        for (User user: list) {
            map.put(user.getId(), new User(user.getName(), user.getCity()));
        }
        return map;
    }
}
