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
public class CounterTest {
	/**
	 * Test метода add.
	*/
	@Test
	public void whenSummTwoEvenNumber() {
		Counter count = new Counter();
		final int result = count.add(0, 20);
		final int resultTrue = 110;
		assertThat(result, is(resultTrue));
	}
}