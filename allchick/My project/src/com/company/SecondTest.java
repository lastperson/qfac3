package com.company;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by user on 7/30/14.
 */
@RunWith(JUnit4.class)
public class SecondTest {

    @Test
    public void pass123Name123(){
        String generatedPass = GeneratePass.GeneratePassword("123", "123");
        String expectedGeneratedPass = "7ttLiOwzmfYSH@1a";
        Assert.assertEquals(expectedGeneratedPass, generatedPass);
    }

    @Test
    public void passTestName321(){
        String generatedPass = GeneratePass.GeneratePassword("Test", "321");
        String expectedGeneratedPass = "lZ16Z2pV8mmzM@1a";
        Assert.assertEquals(expectedGeneratedPass, generatedPass);
    }

    @Test
    public void passTextNameText(){
        String generatedPass = GeneratePass.GeneratePassword("@ll4ik", "facebook.com");
        String expectedGeneratedPass = "QG3vPAG9fYIQO@1a";
        Assert.assertEquals(expectedGeneratedPass, generatedPass);
    }

    @Test
    public void passNoneNameText(){
        String generatedPass = GeneratePass.GeneratePassword("", "facebook.com");
        String expectedGeneratedPass = "lFAosQQIiXvAR@1a";
        Assert.assertEquals(expectedGeneratedPass, generatedPass);
    }

    @Test
    public void passTextNameNone(){
        String generatedPass = GeneratePass.GeneratePassword("facebook.com", "");
        String expectedGeneratedPass = "Xl4tHmP0qY15u@1a";
        Assert.assertEquals(expectedGeneratedPass, generatedPass);
    }

    @Test
    public void passNoneNameNone(){
        String generatedPass = GeneratePass.GeneratePassword("", "");
        String expectedGeneratedPass = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals(expectedGeneratedPass, generatedPass);
    }

    @Test
    public void passGenPass1NameGenPass2(){
        String generatedPass = GeneratePass.GeneratePassword("lFAosQQIiXvAR@1a", "7ttLiOwzmfYSH@1a");
        String expectedGeneratedPass = "d4bQR1f33pW1T@1a";
        Assert.assertEquals(expectedGeneratedPass, generatedPass);
    }

    @AfterClass
    public static void closeBrowser(){
        ChromeWebDriver.CloseWebDriver();
    }
}
