package ua.ikonovalov;

import java.util.Iterator;

/**
 * Created by Strong on 06.12.18.
 */
public class MatrixIterator implements Iterator {

    public int[][] values;
    private int lineArray;
    private int columnArray;

    public MatrixIterator(int[][] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {

        return this.lineArray < values.length;
    }

    @Override
    public Object next() {
        int result = values[lineArray][columnArray++];
        if (columnArray == values[lineArray].length) {
            lineArray++;
            columnArray =0;
        }
        if (lineArray == values.length) {
            columnArray = 0;
            lineArray = 0;
        }
        return result;
    }
}
