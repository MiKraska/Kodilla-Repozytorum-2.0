package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    @Before
    public void before() {
        System.out.println("Testing:");
    }

    @After
    public void after() {
        System.out.println("Testing finished.\n");
    }

    @Test
    public void testCalculateAdvStatistics01() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for (int n = 0; n < 1000; n++) {
            testUserNames.add("Tytus");
        }

        when(statisticsMock.usersNames()).thenReturn(testUserNames);
        int testPostNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);
        int testCommentNumber = 400;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAvgStatistics(statisticsMock);
        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentPerUser = calculateStatistics.getAvgCommentPerUser();
        double commentPerPost = calculateStatistics.getAvgCommentPerPost();
        calculateStatistics.ShowStatistics();

        Assert.assertEquals(0.0, postPerUser, 0);
        Assert.assertEquals(0.4, commentPerUser, 0);
        Assert.assertEquals(0.0, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistics02() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for (int n = 0; n < 1000; n++) {
            testUserNames.add("Romek");
        }

        when(statisticsMock.usersNames()).thenReturn(testUserNames);
        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);
        int testCommentNumber = 400;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAvgStatistics(statisticsMock);
        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentPerUser = calculateStatistics.getAvgCommentPerUser();
        double commentPerPost = calculateStatistics.getAvgCommentPerPost();
        calculateStatistics.ShowStatistics();

        Assert.assertEquals(1.0, postPerUser, 0);
        Assert.assertEquals(0.4, commentPerUser, 0);
        Assert.assertEquals(0.4, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistics03() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for (int n = 0; n < 1000; n++) {
            testUserNames.add("Atomek");
        }

        when(statisticsMock.usersNames()).thenReturn(testUserNames);
        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);
        int testCommentNumber = 0;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAvgStatistics(statisticsMock);
        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentPerUser = calculateStatistics.getAvgCommentPerUser();
        double commentPerPost = calculateStatistics.getAvgCommentPerPost();
        calculateStatistics.ShowStatistics();

        Assert.assertEquals(1.0, postPerUser, 0);
        Assert.assertEquals(0.0, commentPerUser, 0);
        Assert.assertEquals(0.0, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistics04() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for (int n = 0; n < 1000; n++) {
            testUserNames.add("Bolek");
        }

        when(statisticsMock.usersNames()).thenReturn(testUserNames);
        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);
        int testCommentNumber = 200;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAvgStatistics(statisticsMock);
        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentPerUser = calculateStatistics.getAvgCommentPerUser();
        double commentPerPost = calculateStatistics.getAvgCommentPerPost();
        calculateStatistics.ShowStatistics();

        Assert.assertEquals(1.0, postPerUser, 0);
        Assert.assertEquals(0.2, commentPerUser, 0);
        Assert.assertEquals(0.2, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistics05() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for (int n = 0; n < 1000; n++) {
            testUserNames.add("Lolek");
        }

        when(statisticsMock.usersNames()).thenReturn(testUserNames);
        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);
        int testCommentNumber = 2000;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAvgStatistics(statisticsMock);
        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentPerUser = calculateStatistics.getAvgCommentPerUser();
        double commentPerPost = calculateStatistics.getAvgCommentPerPost();
        calculateStatistics.ShowStatistics();

        Assert.assertEquals(1.0, postPerUser, 0);
        Assert.assertEquals(2.0, commentPerUser, 0);
        Assert.assertEquals(2.0, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistics06() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(testUserNames);
        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);
        int testCommentNumber = 2000;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAvgStatistics(statisticsMock);
        double postPerUser = calculateStatistics.getAvgPostPerUser();
        double commentPerUser = calculateStatistics.getAvgCommentPerUser();
        double commentPerPost = calculateStatistics.getAvgCommentPerPost();
        calculateStatistics.ShowStatistics();

        Assert.assertEquals(0.0, postPerUser, 0);
        Assert.assertEquals(0.0, commentPerUser, 0);
        Assert.assertEquals(2.0, commentPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatistics07() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUserNames = new ArrayList<String>();
        for (int n = 0; n < 100; n++) {
            testUserNames.add("Buka");
        }

        when(statisticsMock.usersNames()).thenReturn(testUserNames);
        int testPostNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPostNumber);
        int testCommentNumber = 2000;
        when(statisticsMock.commentsCount()).thenReturn(testCommentNumber);
        CalculateStatistics statisticCount = new CalculateStatistics(statisticsMock);

        statisticCount.calculateAvgStatistics(statisticsMock);
        double postPerUser = statisticCount.getAvgPostPerUser();
        double commentPerUser = statisticCount.getAvgCommentPerUser();
        double commentPerPost = statisticCount.getAvgCommentPerPost();
        statisticCount.ShowStatistics();

        Assert.assertEquals(10.0, postPerUser, 0);
        Assert.assertEquals(20.0, commentPerUser, 0);
        Assert.assertEquals(2.0, commentPerPost, 0);
    }
}