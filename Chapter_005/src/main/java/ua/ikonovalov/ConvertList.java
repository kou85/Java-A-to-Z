package ua.ikonovalov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Strong on 15.05.17.
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

    }
}
