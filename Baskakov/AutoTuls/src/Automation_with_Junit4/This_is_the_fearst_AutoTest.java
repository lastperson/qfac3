package Automation_with_Junit4;

import Automation_with_Junit4.Calculation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by user on 7/30/14.
 */

@RunWith(JUnit4.class)
public class This_is_the_fearst_AutoTest {

    @Test
    public void test1plus2(){
        int result = Calculation.add(-100, 100);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result);
        System.out.println("expectedResult =  "+expectedResult+"  result = "+result);

    }
    @Test
    public  void test(){
        int result1 = Calculation.dub(1,0);
        int expectedResult1 = 0;
        Assert.assertEquals(expectedResult1, result1);

        System.out.println("expectedResult1 =  "+expectedResult1+"  result1 = "+result1);
    }

   @Test
    public void test2(){
       int result2 = Calculation.op(100,99);
       int expectedResult2 = 1;
       Assert.assertEquals(expectedResult2, result2);
       System.out.println("expectedResult1 =  "+expectedResult2+"  result1 = "+result2);

   }

    @Test
    public void test3(){
        int result3 = Calculation.tyr(100,2);
        int expectedResult3 = 50;
        Assert.assertEquals(expectedResult3, result3);
    }

    @Test
    public void test4(){
        int result4= Calculation.tor(2,50,20,10);
        int expectedResult4= 115;
        Assert.assertEquals(expectedResult4, result4);

    }

    }

