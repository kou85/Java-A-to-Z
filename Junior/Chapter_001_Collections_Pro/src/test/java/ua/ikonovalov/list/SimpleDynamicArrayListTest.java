package ua.ikonovalov.list;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class test for SimpleDynamicArrayList
 * @author ikonovalov
 * @since 08.02.19
 * @version 1.0
 */
public class SimpleDynamicArrayListTest {

    @Test
    public void whenAddThreeElementsThenFirstElementIsOne() {
        SimpleDynamicArrayList list = new SimpleDynamicArrayList(10);
        list.add(0);
        list.add(1);
        list.add(2);
        assertThat(list.get(1), is(1));

    }
    @Test
    public void whenCreatedArrayWhithSizeAndAddElementsThenSizeThree() {
        SimpleDynamicArrayList list = new SimpleDynamicArrayList(3);
        int expectedListLength = 3;
        list.add(0);
        list.add(1);
        list.add(2);
        assertThat(list.size(), is(expectedListLength));

    }
    @Ignore
    @Test
    public void whenCreatedArrayWhithSizeAndAddElementsMoreThenSize6() {
        SimpleDynamicArrayList list = new SimpleDynamicArrayList(3);
        int expectedListLength = 6;
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        assertThat(list.size(), is(expectedListLength));
    }

    @Test
    public void whenHasNextInEmptyArrayListThenResultFalse() {
        SimpleDynamicArrayList list = new SimpleDynamicArrayList(2);
        Iterator itr = list.iterator();
        assertThat(itr.hasNext(), is(false));
    }

    @Test
    public void whenHasNextThenResultTrue() {
        SimpleDynamicArrayList list = new SimpleDynamicArrayList(3);
        list.add(0);
        Iterator itr = list.iterator();
        assertThat(itr.hasNext(), is(true));
    }

    @Test
    public void whenNextTwoTimesThenResultSecondElement() {
        SimpleDynamicArrayList list = new SimpleDynamicArrayList(2);
        list.add(1);
        list.add(2);
        Iterator itr = list.iterator();
        itr.next();
        assertThat(itr.next(), is(2));
    }
    @Test
    public void whenNextInEmptyListThenResultException() {
        SimpleDynamicArrayList list = new SimpleDynamicArrayList(2);
        Iterator itr = list.iterator();
        try {
            itr.next();
        } catch (NoSuchElementException noel) {
            assertThat(noel.getMessage(), is("No more elements in list"));
        }
    }
}
