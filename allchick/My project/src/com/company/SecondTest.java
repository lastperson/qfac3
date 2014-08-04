package com.company;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by user on 7/30/14.
 */
@RunWith(JUnit4.class)
public class SecondTest {

    @Before
    public void openGeneratePassPage(){
        GeneratePass.OpenGeneratePasswordPage();
    }

    @Test
    public void pass123Name123(){
        GeneratePass.EnterMasterPassword("123");
        GeneratePass.EnterSiteName("123");
        GeneratePass.ClickGenerateButton();
        String actualMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals("123", actualMasterPassword);
        String actualSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals("123", actualSiteName);
        String actualGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals("7ttLiOwzmfYSH@1a", actualGeneratedPassword);
    }

    @Test
    public void passTestName321(){
        GeneratePass.EnterMasterPassword("Test");
        GeneratePass.EnterSiteName("321");
        GeneratePass.ClickGenerateButton();
        String actualMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals("Test", actualMasterPassword);
        String actualSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals("321", actualSiteName);
        String actualGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals("lZ16Z2pV8mmzM@1a", actualGeneratedPassword);
    }

    @Test
    public void passTextNameText(){
        GeneratePass.EnterMasterPassword("@ll4ik");
        GeneratePass.EnterSiteName("facebook.com");
        GeneratePass.ClickGenerateButton();
        String actualMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals("@ll4ik", actualMasterPassword);
        String actualSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals("facebook.com", actualSiteName);
        String actualGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals("QG3vPAG9fYIQO@1a", actualGeneratedPassword);
    }

    @Test
    public void passNoneNameText(){
        GeneratePass.EnterMasterPassword("");
        GeneratePass.EnterSiteName("facebook.com");
        GeneratePass.ClickGenerateButton();
        String actualMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals("", actualMasterPassword);
        String actualSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals("facebook.com", actualSiteName);
        String actualGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals("lFAosQQIiXvAR@1a", actualGeneratedPassword);
    }

    @Test
    public void passTextNameNone(){
        GeneratePass.EnterMasterPassword("facebook.com");
        GeneratePass.EnterSiteName("");
        GeneratePass.ClickGenerateButton();
        String actualMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals("facebook.com", actualMasterPassword);
        String actualSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals("", actualSiteName);
        String actualGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals("Xl4tHmP0qY15u@1a", actualGeneratedPassword);
    }

    @Test
    public void passNoneNameNone(){
        GeneratePass.EnterMasterPassword("");
        GeneratePass.EnterSiteName("");
        GeneratePass.ClickGenerateButton();
        String actualMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals("", actualMasterPassword);
        String actualSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals("", actualSiteName);
        String actualGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", actualGeneratedPassword);
    }

    @Test
    public void passGenPass1NameGenPass2(){
        GeneratePass.EnterMasterPassword("lFAosQQIiXvAR@1a");
        GeneratePass.EnterSiteName("7ttLiOwzmfYSH@1a");
        GeneratePass.ClickGenerateButton();
        String actualMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals("lFAosQQIiXvAR@1a", actualMasterPassword);
        String actualSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals("7ttLiOwzmfYSH@1a", actualSiteName);
        String actualGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals("d4bQR1f33pW1T@1a", actualGeneratedPassword);
    }

    @Test
    public void smokeTest(){
        GeneratePass.ControlsAreExist();
        GeneratePass.ControlsAreEnabled();
        GeneratePass.ControlTextIsCorrect();
    }

    @AfterClass
    public static void closeBrowser(){
        ChromeWebDriver.CloseWebDriver();
    }
}
