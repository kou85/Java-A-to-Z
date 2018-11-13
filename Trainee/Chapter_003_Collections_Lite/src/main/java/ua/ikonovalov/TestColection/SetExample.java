package ua.ikonovalov.TestColection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Strong on 13.11.18.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); //HashSet выводит данные упорядоченно

        //Set<Integer> set = new TreeSet<>(); //отсортирует, сама трисет как дерево структура
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(4);

        for (Integer value: set) {
            System.out.println(value);
        }


    }


}
