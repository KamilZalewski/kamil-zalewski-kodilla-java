package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.ShoppingTask);
        //Then
        Assert.assertEquals("Birthday shopping", shoppingTask.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PaintingTask);
        //Then
        Assert.assertEquals("Bedroom Renovation", paintingTask.getTaskName());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.ShoppingTask);
        //Then
        Assert.assertEquals("Birthday shopping", shoppingTask.getTaskName());
    }
}
