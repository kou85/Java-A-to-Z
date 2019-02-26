package ua.ikonovalov.list;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author ikonovalov
 * @since  26.02.19.
 */
public class SimpleQueueTest {

        /**
         * MyQueue list for tests.
         */
        private SimpleQueue queue;

        /**
         * Create MyQueue List.
         */
        @Before
        public void prepareMyQueueList() {
            this.queue = new SimpleQueue();
            queue.push(1);
            queue.push(2);
            queue.push(3);
        }

         /**
         * Test for poll method.
         */
        @Test
        public void whenPollThenResultFirstElement() {
            assertThat(queue.poll(), is(1));

        }

}
