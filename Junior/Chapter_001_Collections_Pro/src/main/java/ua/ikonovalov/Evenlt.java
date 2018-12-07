package ua.ikonovalov;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * class Evenlt
 * @author ikonovalov
 * @since 07.12.18.
 * @version 1.0
 */
public class Evenlt implements Iterator<Integer> {

    public int[] values;
    public int index = 0;

    /**
     *
     * @param values
     */
    public Evenlt(int[] values) {
        this.values = values;
    }

    /**
     *
     * @return true if even number
     */
    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = index; i < values.length; i++) {
            if ((values[i] % 2) == 0) {
                result = true;
                index = i;
                break;
            }
        }
        return result;
    }

    /**
     *
     * @return even number
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
         return this.values[index++];
    }
}
