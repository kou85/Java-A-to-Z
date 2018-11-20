package ua.ikonovalov;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class ConvertList2ArrayTest
 * @author ikonovalov
 * @since 19.11.18.
 */
public class ConvertList2ArrayTest {

    ConvertList2Array list = new ConvertList2Array();


    @Test
    public void when7ElementsThen9Row3() {
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0 ,0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when7ElementsThen9Row2() {
        int[][] result = list.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 2);
        int[][] expect = {
                {1, 2, 3, 4},
                {5, 6, 7, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when8ElementsThen8Test() {
        int[][] result = list.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), 4);
        int[][] expect = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when2ArrayInListThenOneArrayList() {
        List<int[]> listArray = new ArrayList<>();
        listArray.add(new int[]{1, 2});
        listArray.add(new int[]{3, 4, 5, 6});
        List<Integer> result = list.convert(listArray);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(result, is(expect));
    }
    @Test
    public void when3ArrayInListThenOneArrayList() {
        List<int[]> listArray = new ArrayList<>();
        listArray.add(new int[]{1, 2});
        listArray.add(new int[]{3, 4, 5, 6});
        listArray.add(new int[]{7, 8, 9, 10});
        List<Integer> result = list.convert(listArray);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertThat(result, is(expect));

    }
}
