package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Ivan on 07.08.18.
 */
public class CheckArrayTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        CheckArray checkArray = new CheckArray();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = checkArray.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByTrueThenFalse() {
        CheckArray checkArray = new CheckArray();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = checkArray.mono(input);
        assertThat(result, is(false));
    }
}
