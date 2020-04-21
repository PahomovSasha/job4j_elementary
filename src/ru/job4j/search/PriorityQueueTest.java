package ru.job4j.search;

import org.junit.Test;


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
        Task result = queue.take();
        assertThat(result.getDesc(), is("Priority1"));
    }
}
