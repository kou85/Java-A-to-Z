package ua.ikonovalov.pattern;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class TriangleTest.
 *
 * @author Konovalov.
 * @since 19.03.2017.
 * @version 1.0.
 */
public class TrianglePatternTest {
    /**
     * Method test class TrianglePattern.
     */
    @Test
    public void whenShapeTriangleThenReturnTriangle() {
        Shape triangle = new TrianglePattern(3);
        String result = triangle.picPattern(triangle);
        assertThat(result, is("   *   \r\n  * *  \r\n * * * \r\n"));
    }
}
