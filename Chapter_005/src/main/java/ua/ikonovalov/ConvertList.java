package ua.ikonovalov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @autor Konovalov
 * @since 25.05.17
 * @version 1.0
 */
public class ConvertList {
    public List<Integer> toList (int[][] array) {
        List <Integer> arrayList = new ArrayList<>();
        for(int[] index : array) {
            for (int value : index) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }
    public int[][] toArray (List<Integer> list, int rows) {
        int length = list.size() / rows;
        if (list.size() % rows != 0) {
            length += 1;
        }
        int[][] listArray = new int[rows][length];
        Iterator<Integer> iterator = list.iterator();
        for (int row = 0; row != rows; row++) {
            for (int column = 0; column != length; column++) {
                if (iterator.hasNext()) {
                    listArray[row][column] = iterator.next();
                } else {
                    break;
                }
            }
        }
        return listArray;

    }

    /**
     * Method converts the sheet arrays in a single Integer worksheet.
     * @param list collection.
     * @return collection.
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> addArray = new ArrayList<>();
        for (int[] index : list) {
            for (int value : index) {
                addArray.add(value);
            }
        }
        return addArray;
    }
}
