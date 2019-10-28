package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        double adding = calculator.add(5,5);
        double subtracting = calculator.sub(10,5);
        double multiplying = calculator.mul(2,5);
        double dividing = calculator.div(10,2);

        Assert.assertEquals(10,adding,0);
        Assert.assertEquals(5,subtracting,0);
        Assert.assertEquals(10,multiplying,0);
        Assert.assertEquals(5,dividing,0);

    }

}