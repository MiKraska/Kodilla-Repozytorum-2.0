package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;

import java.util.*;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure();
    }
}
