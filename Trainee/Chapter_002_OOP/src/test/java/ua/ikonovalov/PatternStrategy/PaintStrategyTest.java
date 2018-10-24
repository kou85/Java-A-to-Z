package ua.ikonovalov.PatternStrategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * class PaintStrategyTest.
 * @author Konovalov.
 * @since 23.10.2018.
 * @version 1.0.
 */
public class PaintStrategyTest {

    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        TriangleStrategy triangle = new TriangleStrategy();
        new PaintStrategy(triangle).draw(triangle);
        assertThat(new String(out.toByteArray()), is( new StringBuilder()
        .append("   +   ")
        .append("  +++  ")
        .append(" +++++ ")
        .append("+++++++")
        .append(System.lineSeparator())
        .toString()));
        System.setOut(stdout);
    }

}
