package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import javafx.concurrent.Task;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAddToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList taskList = (TaskList) context.getBean("toDoList");
        //When
        taskList.getTasks().add("Task to do.");
        //Then
        Assert.assertEquals("Task to do.", board.getToDoList().getTasks().get(0));
    }

    @Test
    public void testTaskAddInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList taskList = (TaskList) context.getBean("inProgressList");
        //When
        taskList.getTasks().add("Task in progress.");
        //Then
        Assert.assertEquals("Task in progress.", board.getInProgressList().getTasks().get(0));
    }
    @Test
    public void testTaskAddDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList taskList = (TaskList) context.getBean("doneList");
        //When
        taskList.getTasks().add("Task done.");
        //Then
        Assert.assertEquals("Task done.", board.getDoneList().getTasks().get(0));
    }

}
