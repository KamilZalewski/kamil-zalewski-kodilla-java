package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList task = new TaskList("Learn Java", "I must learn how much I can");

        //When
        taskListDao.save(task);

        //Then
        String listName = task.getListName();
        List<TaskList> readTask = taskListDao.findByListName(listName);
        Assert.assertEquals("Learn Java", task.getListName());

        //CleanUp
        taskListDao.delete(task);
    }
}
