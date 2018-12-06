package ua.ikonovalov.tempplace;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Strong on 05.12.18.
 */
public class IteratorArrayTest {

    public static final class ForEachArray implements Iterable {

        private final int[] values;

        public ForEachArray(final int[] values) {
            this.values = values;
        }

        @Override
        public Iterator iterator() {
            return new IteratorArray(this.values);
        }
    }

    @Test
    public void whenGetNextCallShouldPointerForward() {
        IteratorArray it = new IteratorArray(new int[] {1, 3});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(3));
    }
    @Test
    public void whenCheckNextPositionShouldReturnConstantValue() {
        IteratorArray it = new IteratorArray(new int[] {1});

        it.next();
        it.hasNext();
        boolean result = it.hasNext();

        assertThat(result, is(false));
    }

    @Test
    public void foreach() {
        ForEachArray forEachArray = new ForEachArray(new int[] {1, 3, 5});

        for (Object value : forEachArray) {
            System.out.println(value);
        }
    }
}
