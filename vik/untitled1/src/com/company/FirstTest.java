package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by user on 7/30/14.
 */
@RunWith(JUnit4.class)
public class FirstTest {
    @Test
    public void test5Plus3(){
        double result=Calc.add(5.2,3.33);
        double expectedResult=8.53;
        Assert.assertEquals(expectedResult,result,0.0000000000001);
    }
    @Test
    public void test5Plusodd3(){
        double result=Calc.add(5,-3);
        double expectedResult=2;
        Assert.assertEquals(expectedResult,result,0);
    }
    @Test
    public void test5PlusNull(){
        double result=Calc.add(5,0);
        double expectedResult=5;
        Assert.assertEquals(expectedResult,result,0);
    }
    @Test
    public void testodd5Plus3(){
        double result=Calc.add(-5,3);
        double expectedResult=-2;
        Assert.assertEquals(expectedResult,result,0);
    }
    @Test
    public void testodd5Plusodd3(){
        double result=Calc.add(-5,-3);
        double expectedResult=-8;
        Assert.assertEquals(expectedResult,result,0);
    }
    @Test
    public void test5mult3() {
        double result = Calc.mult(5, 3);
        double expectedResult = 15;
        Assert.assertEquals(expectedResult, result,0);
    }
    @Test
    public void test5multNull() {
        double result = Calc.mult(5, 0);
        double expectedResult = 0;
        Assert.assertEquals(expectedResult, result,0);
    }
    @Test
    public void test5multodd3() {
        double result = Calc.mult(5, -3);
        double expectedResult = -15;
        Assert.assertEquals(expectedResult, result,0);
    }
    @Test
    public void testodd5multodd3() {
        double result = Calc.mult(-5, -3);
        double expectedResult = 15;
        Assert.assertEquals(expectedResult, result,0);
    }
    @Test
    public void testodd5mult3() {
        double result = Calc.mult(-5, 3);
        double expectedResult = -15;
        Assert.assertEquals(expectedResult, result,0);
    }
    @Test
    public void testNullmult3() {
        double result = Calc.mult(0, 3);
        double expectedResult = 0;
        Assert.assertEquals(expectedResult, result,0);
    }
}
