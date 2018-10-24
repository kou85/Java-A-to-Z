package ua.ikonovalov.PatternStrategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* class TriangleStrategyTest.
* @author Konovalov.
* @since 23.10.2018.
* @version 1.0.
*/
public class TriangleStrategyTest {

    @Test
    public void whenDrawTriangle() {
        TriangleStrategy triangle = new TriangleStrategy();
        assertThat(triangle.draw(triangle), is(new StringBuilder()
        .append("   +   ")
        .append("  +++  ")
        .append(" +++++ ")
        .append("+++++++")
        .toString()));
    }
}
