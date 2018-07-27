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
        boolean result = false;
        for (int i = lineArray; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                result = true;
                break;
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
      //  lineArray ++;


        return this.numbers[lineArray++];

    }




}
