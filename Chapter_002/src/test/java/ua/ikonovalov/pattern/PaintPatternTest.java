package ua.ikonovalov.pattern;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class PaintPatternTest.
 *
 * @author Konovalov.
 * @since 19.03.2017.
 * @version 1.0.
 */
public class PaintPatternTest {

           /**
         * Method test class PaintPattern.
         */
        @Test
        public void whenShapeTriangleThenReturnTriangle() {
            Shape triangle = new TrianglePattern(3);
            PaintPattern test = new PaintPattern(triangle);
            OutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            test.drawPattern(triangle);
            final String result = out.toString();
            assertThat(result, is("   *   \r\n  * *  \r\n * * * \r\n"));
        }

        /**
         * Method test class PaintPattern.
         */
        @Test
        public void whenShapeSquareThenReturnSquare() {
            Shape square = new SquarePattern(3);
            PaintPattern test = new PaintPattern(square);
            OutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            test.drawPattern(square);
            final String result = out.toString();
            assertThat(result, is("* * *\r\n* * *\r\n* * *\r\n"));
        }

}
