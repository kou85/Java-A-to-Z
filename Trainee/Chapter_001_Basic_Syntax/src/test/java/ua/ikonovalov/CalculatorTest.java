package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Ivan on 24.07.18.
 */
public class CalculatorTest {
    /**
     *
     */
    @Test
    public void whenAddOnePlustOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is (expected));
    }

    /**
     *
     */
    @Test
    public void whenTwoSubstactOneThenOne() {
        Calculator calc = new Calculator();
        calc.substact(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is (expected));
    }

    /**
     *
     */
    @Test
    public void whenTwoDivTwoThenOne() {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     *
     */
    @Test
    public void whenThreeMultipleTwoThenSix() {
        Calculator calc = new Calculator();
        calc.multiple(3D, 2D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
}
