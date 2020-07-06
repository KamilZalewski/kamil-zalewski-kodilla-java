package com.kodilla.spring.calculator;

public class Calculator {

    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double sum(double a, double b){
        display.displayValue(a + b);
        return a + b;
    }

    public double sub(double a, double b){
        display.displayValue(a - b);
        return a - b;
    }

    public double mul(double a, double b){
        display.displayValue(a * b);
        return a * b;
    }

    public double div(double a, double b){
        display.displayValue(a * b);
        return a / b;
    }


}
