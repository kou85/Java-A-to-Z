package ua.ikonovalov;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест вывода в консоль "Hello World".
 * @author Konovalov.
 * @since 14.11.16.
 * @version 1.0.
*/
public class CalculateTest {
	/**
	 * Test add.
	*/
	@Test
	public void whenAddOneToOneThenTo() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(out.toString(), is("Hello World\r\n"));
	}


}