package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test class RotationArray.
* @author Ivan Konovalov.
* @version 1.0.
* @since 13.12.2016.
*/
public class RotationArrayTest {
    /**
    * Testing method turn().
    */
    @Test
    public void whenAddNumbersRotationArray() {
        final RotationArray Arr = new RotationArray();
        final int[][] temp = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        final int[][] result = Arr.turn(temp);
        final int[][] expectResult = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
        assertThat(result, is(expectResult));
    }
 }