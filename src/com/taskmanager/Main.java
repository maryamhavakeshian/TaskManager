package com.taskmanager;

import com.taskmanager.task.Task;

import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // the implementation of mutual exclusion is provided by the PriorityBlockingQueue
        // to manage queues of tasks: create a queue of task with priority of execution// the priorities are the priority of tasks
        PriorityBlockingQueue<Task> tasks = new PriorityBlockingQueue<Task>(100,Comparator.comparing(Task::getPriority));

        // the explicit creation and management of threads are done with the instantiation of executor service
        // create a thread pool for execute of task based on initial size of pool equal to 5-factory methods of the executor service
         ExecutorService executor = Executors.newFixedThreadPool(5);

        // add 10 task for execute ( lower priority number is most important)
        tasks.add(new Task("Task 1", 1));
        tasks.add(new Task("Task 2", 2));
        tasks.add(new Task("Task 3", 3));
        tasks.add(new Task("Task 4", 4));
        tasks.add(new Task("Task 5", 5));
        tasks.add(new Task("Task 6", 6));
        tasks.add(new Task("Task 7", 7));
        tasks.add(new Task("Task 8", 8));
        tasks.add(new Task("Task 9", 9));
        tasks.add(new Task("Task 10", 10));


        //invokeAll() method executes the given list of Callable tasks
            executor.invokeAll((tasks));
        //The ExecutorService should be shut down explicitly, since is not automatically destroyed when there are no tasks waiting to be executed
        executor.shutdown();
    }
}
