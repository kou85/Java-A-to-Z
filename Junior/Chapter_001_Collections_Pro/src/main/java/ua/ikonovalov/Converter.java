package ua.ikonovalov;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Strong on 07.12.18.
 */
public class Converter implements Iterator<Integer> {
    /**
     * Iterator of iterators
     */
    private Iterator<Iterator<Integer>> iterators;
    /**
     * instant selected iterator
     */
    private Iterator<Integer> instantIterator = null;



    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
       this.iterators = it;
        if (it.hasNext()) {
            this.instantIterator = it.next();
        }
        return this;
    }

    @Override
    public boolean hasNext() {

        return instantIterator.hasNext() || iterators.hasNext();
    }

    @Override
    public Integer next() {
        Integer result;
        if (instantIterator.hasNext()) {
            result = instantIterator.next();
        } else if (iterators.hasNext()) {
            instantIterator = iterators.next();
            result = instantIterator.next();
        } else {
            throw new NoSuchElementException("No iterators");
        }
        return result;
    }
}
