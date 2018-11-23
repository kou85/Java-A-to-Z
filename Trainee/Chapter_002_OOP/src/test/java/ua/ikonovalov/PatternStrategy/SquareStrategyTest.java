package ua.ikonovalov.patternStrategy;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class SquareStrategyTest.
 * @author Konovalov.
 * @since 23.10.2018.
 * @version 1.0.
 */
public class SquareStrategyTest {

    @Test
    public void whenDrawSquare() {
        SquareStrategy square = new SquareStrategy();
        assertThat(square.draw(square), is(new StringBuilder()
                .append("+++++")
                .append("+   +")
                .append("+   +")
                .append("+   +")
                .append("+++++")
                .toString()));
    }

}
