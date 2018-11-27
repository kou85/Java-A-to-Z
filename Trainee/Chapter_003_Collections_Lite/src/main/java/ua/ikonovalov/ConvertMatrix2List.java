package ua.ikonovalov;

import java.util.ArrayList;
import java.util.List;

/**
 * class ConvertMatrix2List
 * @author ikonovalov
 * @since 20.11.18.
 * @version 1.0
 */
public class ConvertMatrix2List {
    /**
     *
     * @param array input array
     * @return ArrayList
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] array1 : array) {
            for (int value : array1) {
                list.add(value);
            }
        } return list;
     }
}
