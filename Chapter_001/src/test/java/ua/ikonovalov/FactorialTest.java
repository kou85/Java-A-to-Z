package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест.
 * @author Konovalov.
 * @since 30.11.16.
 * @version 1.0.
*/
public class FactorialTest {
	/**
	 * Test метода resultFactorial со значением >0.
	*/
	@Test
	public void whenCorrectFactorial() {
		Factorial factorial = new Factorial();
		final int result = factorial.resultFactorial(5);
		final int resultTrue = 120;
		assertThat(result, is(resultTrue));
	}
	/**
	 * Test метода resultFactorial со значением =0.
	*/
	@Test
	public void whenDontCorrectFactorial() {
		Factorial factorial = new Factorial();
		final int result = factorial.resultFactorial(0);
		final int resultTrue = 1;
		assertThat(result, is(resultTrue));
	}
}