package com.kodilla.patterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("typowa6");
        //Then
        Assert.assertEquals("typowa6", Logger.getInstance().getLastLog());
    }
}
