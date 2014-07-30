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
    public void test5(){
        int result = Calculator.add(4,5);
        int exeptedResult = 9;
        Assert.assertEquals(exeptedResult, result);

    }
    @Test
    public void testMult(){
        int result = Calculator.multi(4,5);
        int exeptedResult = 20;
        Assert.assertEquals(exeptedResult, result);

    }
    @Test
    public void test1(){
        int result = Calculator.add(143,87);
        int exeptedResult = 230;
        Assert.assertEquals(exeptedResult, result);

    } @Test
      public void test2(){
        int result = Calculator.add(32,17);
        int exeptedResult = 49;
        Assert.assertEquals(exeptedResult, result);

    } @Test
      public void test3(){
        int result = Calculator.add(8,11);
        int exeptedResult = 19;
        Assert.assertEquals(exeptedResult, result);

    } @Test
      public void test4(){
        int result = Calculator.add(34,1);
        int exeptedResult = 35;
        Assert.assertEquals(exeptedResult, result);

    } @Test
      public void test7(){
        int result = Calculator.add(14,54);
        int exeptedResult = 68;
        Assert.assertEquals(exeptedResult, result);

    }
     @Test
    public void testMult1(){
        int result = Calculator.multi(8,9);
        int exeptedResult = 72;
        Assert.assertEquals(exeptedResult, result);

    }
    @Test
    public void testMult2(){
        int result = Calculator.multi(11,3);
        int exeptedResult = 33;
        Assert.assertEquals(exeptedResult, result);

    }
    @Test
    public void testMin(){
        int result = Calculator.minus(11,3);
        int exeptedResult = 8;
        Assert.assertEquals(exeptedResult, result);

    }




}

