package ua.ikonovalov;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Strong on 05.09.18.
 */
public class ArrayDeleteDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDeleteDuplicate arrayDeleteDuplicate = new ArrayDeleteDuplicate();
        String[] input = new String[] {"Петя", "Вася", "Петя", "Иван", "Петя"};
        String[] result = arrayDeleteDuplicate.removeDuplicate(input);
        String[] expect = new String[] {"Петя", "Вася", "Иван"};
        assertThat(result, is(expect));
    }
}