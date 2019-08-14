package com.kodilla.testing.forum.statistics;

import org.junit.*;
import static org.mockito.Mockito.mock;

public class CalculateStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test

    public void testCalculateStatisticsTestSuite(){
        Statistics statisticsMock = mock(Statistics.class);
    }
}
