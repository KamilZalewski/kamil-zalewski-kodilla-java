package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String PaintingTask = "PAINTING TASK";
    public static final String DrivingTask = "DRIVING TASK";
    public static final String ShoppingTask = "SHOPPING TASK";


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case PaintingTask:
                return new PaintingTask("Bedroom Renovation", "Blue", "Bedroom");
            case DrivingTask:
                return new DrivingTask("Airport lift", "Pyrzowice Airport", "Car");
            case ShoppingTask:
                return new ShoppingTask("Birthday shopping", "Wine", 4);
            default:
                return null;
        }
    }
}
