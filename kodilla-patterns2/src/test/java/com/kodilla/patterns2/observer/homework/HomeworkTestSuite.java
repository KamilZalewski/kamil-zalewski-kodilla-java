package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        StudentsHomework studentOne = new StudentsHomework("Student One");
        StudentsHomework studentTwo = new StudentsHomework("Student Two");
        KodillaMentor kodillaMentorOne = new KodillaMentor("Andrzej Jaromin");
        KodillaMentor kodillaMentorTwo = new KodillaMentor("Adrian Pażucha");
        studentOne.registerObserver(kodillaMentorOne);
        studentTwo.registerObserver(kodillaMentorTwo);
        //When
        studentOne.addTask("task1");
        studentOne.addTask("task2");
        studentOne.addTask("task3");
        studentTwo.addTask("task4");
        studentTwo.addTask("task5");
        studentTwo.addTask("task6");
        studentTwo.addTask("task7");
        //Then
        assertEquals(3, kodillaMentorOne.getUpdateCount());
        assertEquals(4, kodillaMentorTwo.getUpdateCount());
    }
}
