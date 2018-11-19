package ua.ikonovalov;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.List;

/**
 * Created by Strong on 19.11.18.
 */
public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double)list.size() / rows);
        int[][] array = new int[rows][cells];
       /*for (int index = 0; index == rows; index++) {
            if (list.size() < (cells*rows)){
                list.add(0);
            } break;
        }*/
        int indexCell = 0;
        int indexRow = 0;
        for (int value : list) {
             if (indexCell < cells) {
                 array[indexRow][indexCell] = value;
                 indexCell++;
            } indexRow++;

        }
        return array;
    }
}
