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
    public boolean hashCode() {
        return super.hashCode();
    }

    @Override
    public Object next() {
        int result = numbers[lineArray++];
        if ((numbers[lineArray]%2==0)&&(numbers[lineArray] != 0)) {
            lineArray ++;
        }
        if (lineArray == numbers.length) {
            lineArray = 0;
        }

        return result;
    }


}
