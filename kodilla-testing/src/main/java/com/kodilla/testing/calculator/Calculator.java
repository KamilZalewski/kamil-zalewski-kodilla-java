package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return ("Result of the equasion is: ");
    }

    public int sum() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }
}

class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(15, 89);
        int resultOfSum = calculator.sum();
        System.out.println("Sum result is: " + resultOfSum);
        int resultOfSubtraction = calculator.subtract();
        System.out.println("Subtraction result is: " + resultOfSubtraction);
    }
}

