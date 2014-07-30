package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by user on 7/30/14.
 */

@RunWith(JUnit4.class)
public class FirstTest {

    @Test
    public void test5Plus3(){
        double result = Calculator.Sum(3, 5);
        double expectedResult = 8;
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void test0125Plus0125(){
        double result = Calculator.Sum(0.125, -01.25);
        double expectedResult = -1.125;
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void test0Plus125(){
        double result = Calculator.Sum(0, 12.5);
        double expectedResult = -1.125;
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void test0Multiple125(){
        double result = Calculator.Multiple(0, 1.25);
        double expectedResult = 0;
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void test25Multiple25(){
        double result = Calculator.Multiple(25, -25);
        double expectedResult = 625;
        Assert.assertEquals(expectedResult, result, 0);
    }
}
