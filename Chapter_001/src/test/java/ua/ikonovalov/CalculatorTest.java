package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест калькулятор.
 * @author Konovalov.
 * @since 18.11.16.
 * @version 1.0.
*/
public class CalculatorTest {
	/**
	* Тест add.
	*/
	@Test
	public void whenAddOneToSecondThenResultTwo() {
	Calculator calc = new Calculator();
	calc.add(1d, 1d);
	double result = calc.getResult();
	assertThat(result, is(2d));
	}
	/**
	* Тест вычитание.
	*/
	@Test
	public void whenSubstractOneFromSecondThenResultOne() {
	Calculator calc = new Calculator();
	calc.substract(2d, 1d);
	double result = calc.getResult();
	assertThat(result, is(1d));
    }
	/**
	* Тест div.
	*/
	@Test
	public void whenDivFirstToSecondThenResultTwo() {
	Calculator calc = new Calculator();
	calc.div(2d, 1d);
	double result = calc.getResult();
	assertThat(result, is(2d));
	}
	/**
	* Тест multiple.
	*/
	@Test
	public void whenMultipleFirstToSecondThenResultTwo() {
	Calculator calc = new Calculator();
	calc.multiple(2d, 1d);
	double result = calc.getResult();
	assertThat(result, is(2d));
	}
}