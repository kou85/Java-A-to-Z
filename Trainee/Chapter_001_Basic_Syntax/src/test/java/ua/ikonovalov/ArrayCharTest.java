package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Ivan on 07.08.18.
 */
public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar arrayChar = new ArrayChar("Хаюшки");
        boolean result = arrayChar.startWith("Хаю");
        assertThat(result, is(true));
    }

    @Test
    public void whenStartWithPrefixThenFalse() {
        ArrayChar arrayChar = new ArrayChar("Хаюшки");
        boolean result = arrayChar.startWith("Хоюш");
        assertThat(result, is(false));
    }

}
