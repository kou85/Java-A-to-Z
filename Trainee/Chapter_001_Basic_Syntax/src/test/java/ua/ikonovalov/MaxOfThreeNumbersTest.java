package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Ivan on 01.08.18.
 */
public class MaxOfThreeNumbersTest {

    @Test
    public void returnMaxOfThreeNumbers() {
        MaxOfThreeNumbers max = new MaxOfThreeNumbers();
        int result = max.maxThreeNumbers(3, 7, 2);
        assertThat(result, is(7));
    }
}
