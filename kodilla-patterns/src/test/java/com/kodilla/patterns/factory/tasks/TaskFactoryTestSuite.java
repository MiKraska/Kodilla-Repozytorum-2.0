package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        TaskFactory taskFactory = new TaskFactory();

        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);

        assert shoppingTask != null;
        shoppingTask.executeTask();

        Assert.assertEquals("X-com shopping", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {

        TaskFactory taskFactory = new TaskFactory();

        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        assert paintingTask != null;
        paintingTask.executeTask();

        Assert.assertEquals("Paint a living room", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {

        TaskFactory taskFactory = new TaskFactory();

        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        assert drivingTask != null;
        drivingTask.executeTask();

        Assert.assertEquals("Drive to grandma", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}