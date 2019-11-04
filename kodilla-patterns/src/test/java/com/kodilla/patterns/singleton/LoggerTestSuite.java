package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        String loggerTest = "Logger";
        Logger.getInstance().log(loggerTest);

        //When
        String result = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("Logger", result);
    }
}