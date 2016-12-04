package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест.
 * @author Konovalov.
 * @since 3.12.16.
 * @version 1.0.
*/
public class PaintTest {
    /**
	 * Test метода piramid.
	*/
	@Test
    public void whenEnterHieghtthenReturnPiramidOfSymbols()  {

        Paint pyramid = new Paint();
        final String result = pyramid.piramid(2);
        assertThat(result, is(" ^\r\n ^ ^\r\n"));
    }
}