package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {

        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("X-com shopping", "Laptop", 1);
            case PAINTING:
                return new PaintingTask("Paint a living room", "Bahama Yellow", "Walls and chimney");
            case DRIVING:
                return new DrivingTask("Drive to grandma", "Kielce", "PKP");
            default:
                return null;
        }
    }
}