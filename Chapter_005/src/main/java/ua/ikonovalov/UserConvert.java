package ua.ikonovalov;

import java.util.*;

/**
 * @autor Konovalov.
 * @since 30.05.17.
 * @version 1.0/
 */
public class UserConvert {
    /**
     *
     * @param list
     * @return
     */
    public HashMap<Integer, User>process(List<User> list){
        HashMap<Integer, User> userMap= new HashMap<>();
            for(User user : list) {
                userMap.put(user.getId(), user);
            }

        return userMap;

    }
}
