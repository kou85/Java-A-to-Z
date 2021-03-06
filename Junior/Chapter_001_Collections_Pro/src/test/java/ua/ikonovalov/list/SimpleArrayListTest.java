package ua.ikonovalov.list;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Strong on 03.01.19.
 */
public class SimpleArrayListTest {
    private SimpleArrayList<Integer> list;



    @Before

    public void beforeTest() {
        list = new SimpleArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


    }


    @Test

    public void whenAddThreeElementsThenUseGetOneResultTwo() {

        assertThat(list.get(1), is(2));
    }


    @Test

    public void whenAddThreeElementsThenUseGetSizeResultThree() {

        assertThat(list.getSize(), is(3));
    }

    @Test

    public void whenDeleteFirstElementThenUseGetZeroResultTwo() {
        list.delete();
        assertThat(list.get(0), is(2));
        assertThat(list.get(1), is(1));

    }
}
