package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
* @author Ivan Konovalov.
* @version 1.0.
* @since 07.12.2016.
*/
public class SortArrayTest {

    /**
    * Testing method Sort.
    */
    @Test
    public void whenSortedArray() {
        final SortArray testArr = new SortArray();
        final int[] temp = {9, 2, 7, 6, 5, 1};
        final int[] result = testArr.sort(temp);
        final int[] expectResult = {1, 2, 5, 6, 7, 9};
        assertThat(result, is(expectResult));
    }
 }