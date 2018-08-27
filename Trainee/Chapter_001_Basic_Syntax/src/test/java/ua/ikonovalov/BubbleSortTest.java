package ua.ikonovalov;

import org.junit.Test;

 import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Strong on 28.08.18.
 */
public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int [] input = new int[] {5, 7, 6, 3, 4, 2, 1, 12, 9, 8};
        int [] result = bubbleSort.sort(input);
        int [] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 12};
        assertThat(result, is(expect));
    }

}
