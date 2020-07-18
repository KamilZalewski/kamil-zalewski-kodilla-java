package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("I am realizing painting task.");
    }

    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        int diceRoll = (int) (Math.random() * 6 + 1);
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

}
