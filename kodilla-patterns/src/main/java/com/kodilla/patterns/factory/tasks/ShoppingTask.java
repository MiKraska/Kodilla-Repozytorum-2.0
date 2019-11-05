package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    final String taskName;
    final String whatToBay;
    final double quantity;
    boolean isTaskExecuted = false;

    ShoppingTask(final String taskName, final String whatToBay, final double quantity) {
        this.taskName = taskName;
        this.whatToBay = whatToBay;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        isTaskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

}
