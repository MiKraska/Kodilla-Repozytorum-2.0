package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {


    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().getTasks().add("Task");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getDoneList().getTasks().add("Finished task");

        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getDoneList().getTasks().size());

        System.out.println(board.getToDoList().getTasks());
        System.out.println(board.getInProgressList().getTasks());
        System.out.println(board.getDoneList().getTasks());
    }
}