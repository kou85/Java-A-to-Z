package ua.ikonovalov.patternstrategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class PaintStrategyTest.
 * @author Konovalov.
 * @since 23.10.2018.
 * @version 1.0.
 */
public class PaintStrategyTest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }


    @Test
    public void whenDrawTriangle() {
      //  loadOutput();
        new PaintStrategy(new TriangleStrategy()).draw(new TriangleStrategy());
        assertThat(new String(this.out.toByteArray()), is(new StringBuilder()
        .append("   +   ")
        .append("  +++  ")
        .append(" +++++ ")
        .append("+++++++")
        .append(System.lineSeparator())
        .toString()));
     //   backOutput();
    }

    @Test
    public void whenDrawSquare() {
       // loadOutput();
         new PaintStrategy(new SquareStrategy()).draw(new SquareStrategy());
        assertThat(new String(this.out.toByteArray()), is(new StringBuilder()
                .append("+++++")
                .append("+   +")
                .append("+   +")
                .append("+   +")
                .append("+++++")
                .append(System.lineSeparator())
                .toString()));
     //   backOutput();
     }



}
