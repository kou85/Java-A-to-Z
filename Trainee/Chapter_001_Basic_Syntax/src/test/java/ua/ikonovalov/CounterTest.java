package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Ivan on 01.08.18.
 */
public class CounterTest {
    @Test
    public void summEvenNumbers() {
        Counter summ = new Counter();
        int result = summ.add(2, 10);
                assertThat(result, is(30));
    }
}
