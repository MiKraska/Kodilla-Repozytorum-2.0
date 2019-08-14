package com.kodilla.testing.shape;
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
        Triangle triangle = new Triangle();

        shapeCollector.addFigure(triangle);

        Assert.assertEquals(1, shapeCollector.showFigures());
    }

    @Test

    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();

        shapeCollector.addFigure(triangle);
        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.showFigures());
    }

    @Test

    public void testRemovingFigureNotExisting(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();

        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertFalse(result);

    }

    @Test

    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();

        shapeCollector.addFigure(square);

        Assert.assertEquals(square,shapeCollector.getFigure(shapeCollector.list.size() -1));
    }
}
