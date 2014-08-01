package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FirstTest {

    @Test
    public void test5Plus3() {
        int result = Calculator.add(5, 3);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult, result);
    }
}
