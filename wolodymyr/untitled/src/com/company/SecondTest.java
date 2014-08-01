package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.testng.Assert;

/**
 * Created by user on 7/30/14.
 */
@RunWith(JUnit4.class)
public class SecondTest {
    @Test
    public void Compare(){
        String passgen =PassGenforTest.Pas1("123123p","http://shop.ck.ua/");
        String passexept="vek54llG6qYr3@1a";
        Assert.assertEquals(passgen, passexept);

    }
    @Test
    public void Compare2(){
        String passgen =PassGenforTest.Pas1("123123p");
        String passexept="7wpWN89j12w1z@1a";
        Assert.assertEquals(passgen, passexept);

    }
    @Test
    public void Compare3(){
        String passgen =PassGenforTest.Pas2("http://shop.lego.com/en-US/");
        String passexept="7DwT8EPVBfQ92@1a";
        Assert.assertEquals(passgen, passexept);

    }






}
