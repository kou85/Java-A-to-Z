package ua.ikonovalov;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Strong on 01.08.18.
 */
public class FactorialTest {

    @Test
    public void factorialToTen(){
        Factorial factorial = new Factorial();
        int result = factorial.calc(10);
        assertThat(result, is(3628800));
    }

    @Test
    public void factorialToZero(){
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }

    @Test
    public void factorialToOne(){
        Factorial factorial = new Factorial();
        int result = factorial.calc(1);
        assertThat(result, is(1));
    }
}
