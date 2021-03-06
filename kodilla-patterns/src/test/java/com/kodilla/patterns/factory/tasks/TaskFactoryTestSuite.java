package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.DrivingTask);
        //Then
        System.out.println(shoppingTask.getTaskName());
        Assert.assertEquals("Airport lift", shoppingTask.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PaintingTask);
        //Then
        System.out.println(paintingTask.getTaskName());
        Assert.assertEquals("Bedroom Renovation", paintingTask.getTaskName());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.ShoppingTask);
        //Then
        System.out.println(shoppingTask.getTaskName());
        Assert.assertEquals("Birthday shopping", shoppingTask.getTaskName());
    }
}
