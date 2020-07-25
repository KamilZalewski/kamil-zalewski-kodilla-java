package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public interface Task {

    default boolean isTaskExecuted() {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;
        System.out.println(diceRoll);
        switch (diceRoll) {
            case 4:
            case 5:
            case 6:
                System.out.println(true);
                return true;

            default:
                System.out.println(false);
                return false;
        }
    }

    void executeTask();
    String getTaskName();
}
