package ru.job4j.search;


import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод вставляет в нужную позицию элемент.
     *
     * @param task задача
     */
    public void put(Task task) {
        for (var i = 0; i < tasks.size(); i++) {
            if (task.getPriority() < this.tasks.get(i).getPriority()) {
                this.tasks.add(i, task);
                return;
            }
        }
        this.tasks.add(task);
    }

    public Task take() {
        return tasks.poll();
    }
}
