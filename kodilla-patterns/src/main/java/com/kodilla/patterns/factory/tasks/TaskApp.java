package com.kodilla.patterns.factory.tasks;

public class TaskApp {
    public static void main(String[] args) {
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.makeTask(TaskFactory.ShoppingTask);
        shoppingTask.isTaskExecuted();

    }
}
