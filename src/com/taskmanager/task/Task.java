package com.taskmanager.task;

import java.util.concurrent.Callable;

public class Task implements Callable<Object> {

    //callable tasks are delivered to the invokeall methods of executorservice

    private final String taskName;
    private final int priority;

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    @Override
    public Object call() throws Exception {
        // you can create any task in this method for execute
        System.out.println("Task with name " + taskName + " started ");
        int i = 0;
        while (i < 10) {
            Thread.sleep(priority * 1000);
            System.out.println("Task with name " + taskName + " running... ");
            i++;
        }
        System.out.println("Task with name " + taskName + " end. ");
        return null;
    }

    public int getPriority() {
        return priority;
    }

}
