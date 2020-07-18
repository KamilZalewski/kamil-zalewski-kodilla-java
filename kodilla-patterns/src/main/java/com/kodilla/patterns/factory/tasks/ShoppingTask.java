package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("I am realizing shopping task.");
    }

    public String getTaskName() {
        return taskName;
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

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}