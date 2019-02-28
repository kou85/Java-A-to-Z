package ua.ikonovalov.list;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ikonovalov
 * @since  28.02.19.
 */

public class NodeTest {

    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node four = new Node(4);
    Node five = new Node(5);
    Node.Cycle cycle = new Node.Cycle();
    boolean result = cycle.hasCycle(first);


    @Test
    public void  whenLastLoopOnFirstThenTrue() {

        first.setNext(second);
        second.setNext(third);
        third.setNext(four);
        four.setNext(five);
        five.setNext(first);
        boolean result = cycle.hasCycle(first);
        assertThat(result, is(true));
    }

    @Test
    public void  whenThirdLoopOnSecondThenTrue() {
        first.setNext(second);
        second.setNext(third);
        third.setNext(third);
        boolean result = cycle.hasCycle(first);
        assertThat(result, is(true));
    }

    @Test
    public void whenNoLoopThenFalse() {
        first.setNext(second);
        second.setNext(third);
        third.setNext(four);
        four.setNext(five);
        boolean result =  cycle.hasCycle(first);
        assertThat(result, is(false));
    }


}
