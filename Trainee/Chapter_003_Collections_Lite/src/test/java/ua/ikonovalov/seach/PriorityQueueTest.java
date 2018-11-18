package ua.ikonovalov.seach;

import org.junit.Test;
import ua.ikonovalov.search.PriorityQueue;
import ua.ikonovalov.search.Task;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Strong on 15.11.18.
 */
public class PriorityQueueTest {

        @Test
        public void whenHigherPriority() {
            PriorityQueue queue = new PriorityQueue();
            queue.put(new Task("low", 5));
            queue.put(new Task("urgent", 1));
            queue.put(new Task("urgent1", 1));
            queue.put(new Task("middle", 3));
            Task result = queue.take();
            assertThat(result.getDesc(), is("urgent"));
        }
}
