package ua.ikonovalov;

import java.util.ArrayList;
import java.util.List;

/**
 * class ConvertListArray.
 * @author Konovalov.
 * @since 20.11.2018.
 * @version 1.0.
 */
public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                if (index >= list.size()) {
                   break;
                }
                array[i][j] = list.get(index++);
            }
        } return array;
    }

    /**
     * Metod convert List arrays to List one array
     * @param list
     * @return
     */
    public List<Integer> convert (List<int[]> list) {
        List<Integer> newList = new ArrayList<>();
        for (int [] array : list) {
            for (int value : array) {
                newList.add(value);
            }
        } return newList;
    }
}
