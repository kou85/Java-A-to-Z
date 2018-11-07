package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Ivan on 01.08.18.
 */
public class MaxOfTwoNumbersTest {
    /**
     *
     */
    @Test
    public void returnMaxOfTwoNumbers() {
        MaxOfTwoNumbers max = new MaxOfTwoNumbers();
        int result = max.maxOfTwoNumbers(2, 7);
        assertThat(result, is(7));
        }

    /**
     *
     */
    @Test
    public void returnMaxOfTwoNumbersFirstNegative() {
        MaxOfTwoNumbers max = new MaxOfTwoNumbers();
        int result = max.maxOfTwoNumbers(2, -9);
        assertThat(result, is(2));
    }
}
