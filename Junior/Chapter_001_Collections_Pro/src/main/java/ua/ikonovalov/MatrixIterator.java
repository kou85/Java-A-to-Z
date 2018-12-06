package ua.ikonovalov;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Strong on 06.12.18.
 */
public class MatrixIterator implements Iterator<Integer> {

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
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int result = values[lineArray][columnArray++];
        if (columnArray == values[lineArray].length) {
            lineArray++;
            columnArray = 0;
        }

        return result;
    }
}
