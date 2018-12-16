package ua.ikonovalov;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Created by Strong on 09.12.18.
 */
public class SimpleArrayTest {
    @Test
    public void whenCreateContainerShouldReturnTheSameType() {
        SimpleArray<String> simple = new SimpleArray<>(4);
        simple.add("test");
        String result = simple.get(0);

        assertThat(result, is("test"));
    }

    @Test
    public void whenTypeIntShouldReturnInt() {
        SimpleArray<Integer> simple = new SimpleArray<>(4);
        simple.add(2);
        int result = simple.get(0);

        assertThat(result, is(2));
    }


    @Test(expected = NullPointerException.class)
    public void whenTypeIntShouldReturnException() {
        SimpleArray<Integer> simple = new SimpleArray<>(4);
        simple.add(2);
        int result = simple.get(1);

        assertThat(result, is(2));
    }
}
