package ua.ikonovalov;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * class Converter
 * @autor ikonovalov
 * @since 11.12.18
 */
public class Converter  {

    /**
     * @param it iterator
     * @return
     */

    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
/**
 * Anonymous class Iterator
 */
        return new Iterator<Integer>() {
            Iterator<Integer> instantIterator = it.next();

            @Override
            public boolean hasNext() {
                while (!instantIterator.hasNext() && it.hasNext()) {
                    instantIterator = it.next();
                }
                return instantIterator.hasNext();
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return instantIterator.next();
            }
        };
    }
}
