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
public class TurnTest {

     /**
    * Testing method.
    */
    @Test
    public void whenArrayInvert() {
        final Turn testArr = new Turn();
        final int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] result = testArr.back(temp);
        final int[] expectResult = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expectResult));
    }
 }