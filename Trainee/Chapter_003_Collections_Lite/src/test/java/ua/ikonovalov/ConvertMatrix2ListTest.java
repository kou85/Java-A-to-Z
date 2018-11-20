package ua.ikonovalov;


import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class ConvertMatrix2ListTest
 * @author ikonovalov
 * @since 20.11.18.
 * @version 1.0
 */
public class ConvertMatrix2ListTest {
    ConvertMatrix2List list = new ConvertMatrix2List();
   @Test
    public void when2on2ArrayThenList4() {
         int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void when4on3ArrayThenList12() {
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}

        };
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
