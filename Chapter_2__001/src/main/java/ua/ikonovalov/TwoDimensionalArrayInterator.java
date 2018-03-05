package main.java.ua.ikonovalov;

import java.util.Iterator;
/**
 * Created by Strong on 21.02.18.
 */
public class TwoDimensionalArrayInterator implements Iterator{
    private int lineArray;
    private int columnArray;
    public int [][] array;


    public TwoDimensionalArrayInterator(int[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        boolean result = true;

        if (lineArray < 0 || columnArray < 0 || array.length <=  lineArray || array[0].length <= columnArray) {
           result = false;
        }
        return result;
    }

    @Override
    public Object next() {

        int result = array[lineArray][columnArray];
        if (columnArray == array[lineArray].length - 1) {
            lineArray += lineArray;
        }
        columnArray++;

        return result;
    }
}

