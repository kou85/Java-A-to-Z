package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Ivan on 03.08.18.
 */
public class SquareTest {
    @Test
    public void whenBound4Then14916(){
        int bound = 4;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16};
        assertThat(rst, is(expect));

    }
}
