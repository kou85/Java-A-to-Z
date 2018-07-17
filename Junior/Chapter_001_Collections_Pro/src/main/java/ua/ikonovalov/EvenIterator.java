package ua.ikonovalov;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Ivan on 17.07.18.
 */
public class EvenIterator implements Iterator {

    public int lineArray = 0;
    public int[] numbers;


    public EvenIterator(final int[] numbers) {
        this.numbers = numbers;

    }

    @Override
    public boolean hasNext() {
        boolean result = true;
        for (int i = lineArray; i < numbers.length; i++) {
            if ((numbers[lineArray] % 2) != 0) {
                return false;
            }

        }
        return result;
    }

    @Override
    public Object next() {
        if (this.lineArray >= this.numbers.length) {
            throw new NoSuchElementException();
        }
        hasNext();

        return this.numbers[lineArray];
    }

}
