package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.Alert;
import org.testng.Assert;

/**
 * Created by user on 7/30/14.
 */
@RunWith(JUnit4.class)
public class SecondTest {
//    @Before
//    public void OpenDriver(){
//        PassGenforTest.Systt();
//
//    }

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
    @Test
    public void Compare4() {
        GeneretPassword.clearPass();
        GeneretPassword.clearSite();
        String passw ="0987poiu";
        String sitee ="http://shop.lego.com/en-US/";
        GeneretPassword.masterParol(passw);
        GeneretPassword.site(sitee);
        Assert.assertEquals(GeneretPassword.getPas(), passw);
        Assert.assertEquals(GeneretPassword.getSite(), sitee);

    }
    @Test
    public  void Smoke1(){
        String siteNam="Your master password";
        Assert.assertTrue(GeneretPassword.isPas());
        Assert.assertTrue(GeneretPassword.isSite());
        Assert.assertTrue(GeneretPassword.isGenPas());
        Assert.assertTrue(GeneretPassword.isBut());
        Assert.assertEquals(siteNam, GeneretPassword.isText1());


    }
//    @After
//    public void close() {
//        PassGenforTest.w.quit();
//    }








}
