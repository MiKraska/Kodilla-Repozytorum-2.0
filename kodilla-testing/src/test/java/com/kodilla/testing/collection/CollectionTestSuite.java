package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;


public class CollectionTestSuite {
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
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> test1 = new ArrayList<Integer>();

        oddNumbersExterminator.exterminate(test1);
        System.out.println("Testing empty list");
        Assert.assertEquals(oddNumbersExterminator.exterminate(test1),test1);
    }

    @Test
    public  void testOddNumberExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> test2 = new ArrayList<Integer>();
        test2.add(2); test2.add(4); test2.add(7); test2.add(3); test2.add(6); test2.add(12);

        ArrayList<Integer> test3 = new ArrayList<Integer>();
        test3.add(2); test3.add(4); test3.add(6); test3.add(12);

        oddNumbersExterminator.exterminate(test2);
        System.out.println("Testing normal list");
        Assert.assertEquals(oddNumbersExterminator.exterminate(test2),test3);

    }
}
