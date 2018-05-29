package ua.ikonovalov;
import java.util.Iterator;

/**
 * Class ${CLASS_NAME}.
 *
 * @author Ivan Konovalov.
 *         version 1.0.
 * @since 27.04.18.
 */

public class EvenInterator implements Iterator {

    public int lineArray;
    public int [] numbers;


    public EvenInterator(final int[] numbers) {

    }


    @Override
    public boolean hasNext() {
        boolean result = true;


        return false;
        //  return array < data.size();
    }

    @Override
    public Object next() {


        return numbers;
    }


}
