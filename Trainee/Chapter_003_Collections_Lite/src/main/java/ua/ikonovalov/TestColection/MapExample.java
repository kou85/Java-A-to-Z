package ua.ikonovalov.TestColection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Strong on 13.11.18.
 */
public class MapExample {
    public static void main(String[] args) {


    Map<String, Integer> map = new HashMap<>();
        map.put("Petr aaa", 3);
        map.put("ivan", 5);

        System.out.println(map.get("ivan"));
        for (String value: map.keySet()) {
            System.out.println(map+" "+ map.get(value));

        }
    }

}
