package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int result2 = 40 + 50;

        if(result2 == calculator.add(40,50)){
            System.out.println("test Ok");
        }else {
            System.out.println("Error!");
        }
        int result3 = 40 -50;
        if (result3 == calculator.subtract(40,50)){
            System.out.println("test Ok");
        }else {
            System.out.println("Error!");
        }
    }
}

