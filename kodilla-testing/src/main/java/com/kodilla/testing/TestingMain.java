package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(15,89);

        int resultOfSum = calculator.sum();
        if(resultOfSum == (104)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        int resultOfSubtract = calculator.subtract();
        if(resultOfSubtract == (-74)) {
            System.out.println("test Ok");
        } else {
            System.out.println("Error!");
        }


    }
}