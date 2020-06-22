import org.junit.Test;
import ru.job4j.search.PriorityQueue;
import ru.job4j.search.Task;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenDifferentPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("Priority10", 10));
        queue.put(new Task("Priority5", 5));
        queue.put(new Task("Priority25", 25));
        queue.put(new Task("Priority35", 35));
        queue.put(new Task("Priority1", 1));
        queue.put(new Task("Priority6", 6));
        queue.put(new Task("Priority6-2", 6));
        Task result = queue.take();
        assertThat(result.getDesc(), is("Priority1"));
    }

    @Test
    public void whenLowPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 1));
        queue.put(new Task("urgent", 5));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("low"));
    }

    @Test
    public void whenIdenticalPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 5));
        queue.put(new Task("middle", 5));
        Task result = queue.take();
        assertThat(result.getDesc(), is("low"));
    }
}
