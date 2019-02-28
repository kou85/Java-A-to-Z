package ua.ikonovalov.list;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ikonovalov
 * @since 26.02.19.
 */
public class SimpleStackTest {

    private SimpleStack stack;

    /**
     * Create MyQueue List.
     */
    @Before
    public void prepareMyQueueList() {
        this.stack = new SimpleStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

    }

    /**
     * Test for poll method.
     */

    @Test
    public void whenPollThenResultFirstElement() {
        assertThat(stack.poll(), is(3));

    }

}
