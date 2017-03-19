package ua.ikonovalov.pattern;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class SquareTest.
 *
 * @author Konovalov.
 * @since 19.03.2017.
 * @version 1.0.
 */
public class SquarePatternTest {
    /**
     * Method test class SquarePattern.
     */
    @Test
    public void whenShapeSquareThenReturnSquare() {
        Shape square = new SquarePattern(3);
        String result = square.picPattern(square);
        assertThat(result, is("* * *\r\n* * *\r\n* * *\r\n"));
    }
}
