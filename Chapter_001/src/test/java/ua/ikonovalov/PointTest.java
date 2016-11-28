package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест.
 * @author Konovalov.
 * @since 14.11.16.
 * @version 1.0.
*/
public class PointTest {
	/**
	 * Test метода distanceTo.
	*/
	@Test
	public void whenCalculationDistanceOnePointToSecondThenResultTwo() {
		final Point a = new Point(10d, 7d);
		final Point b = new Point(12d, 7d);
		double result = a.distanceTo(b);
		assertThat(result, is(2d));
	}
}