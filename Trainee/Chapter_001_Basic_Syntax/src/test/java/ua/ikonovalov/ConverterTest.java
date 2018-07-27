package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Ivan on 27.07.18.
 */
public class ConverterTest {


    @Test
    public void when60RublesToDollarsThen1() {
        Converter converter = new Converter();
        int result = converter.rublesToDollars(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RublesToEurosThen1() {
        Converter converter = new Converter();
        int result = converter.rublesToEuros(70);
        assertThat(result, is(1));
    }

    @Test
    public void when2DollarsToRubles120() {
        Converter converter = new Converter();
        int result = converter.dollarsToRubles(2);
        assertThat(result, is(120));
    }

    @Test
    public void when3EuroToRubles210() {
        Converter converter = new Converter();
        int result = converter.eurosToRubles(3);
        assertThat(result, is(210));

    }

}
