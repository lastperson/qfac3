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
        GeneratePass.OpenGeneratePasswordPage();
        GeneratePass.EnterMasterPassword("123");
        GeneratePass.EnterSiteName("123");
        GeneratePass.ClickGenerateButton();
        String expectedMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals(expectedMasterPassword, "123");
        String expectedSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals(expectedSiteName, "123");
        String expectedGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals(expectedGeneratedPassword, "7ttLiOwzmfYSH@1a");
    }

    @Test
    public void passTestName321(){
        GeneratePass.OpenGeneratePasswordPage();
        GeneratePass.EnterMasterPassword("Test");
        GeneratePass.EnterSiteName("321");
        GeneratePass.ClickGenerateButton();
        String expectedMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals(expectedMasterPassword, "Test");
        String expectedSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals(expectedSiteName, "321");
        String expectedGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals(expectedGeneratedPassword, "lZ16Z2pV8mmzM@1a");
    }

    @Test
    public void passTextNameText(){
        GeneratePass.OpenGeneratePasswordPage();
        GeneratePass.EnterMasterPassword("@ll4ik");
        GeneratePass.EnterSiteName("facebook.com");
        GeneratePass.ClickGenerateButton();
        String expectedMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals(expectedMasterPassword, "@ll4ik");
        String expectedSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals(expectedSiteName, "facebook.com");
        String expectedGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals(expectedGeneratedPassword, "QG3vPAG9fYIQO@1a");
    }

    @Test
    public void passNoneNameText(){
        GeneratePass.OpenGeneratePasswordPage();
        GeneratePass.EnterMasterPassword("");
        GeneratePass.EnterSiteName("facebook.com");
        GeneratePass.ClickGenerateButton();
        String expectedMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals(expectedMasterPassword, "");
        String expectedSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals(expectedSiteName, "facebook.com");
        String expectedGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals(expectedGeneratedPassword, "lFAosQQIiXvAR@1a");
    }

    @Test
    public void passTextNameNone(){
        GeneratePass.OpenGeneratePasswordPage();
        GeneratePass.EnterMasterPassword("facebook.com");
        GeneratePass.EnterSiteName("");
        GeneratePass.ClickGenerateButton();
        String expectedMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals(expectedMasterPassword, "facebook.com");
        String expectedSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals(expectedSiteName, "");
        String expectedGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals(expectedGeneratedPassword, "Xl4tHmP0qY15u@1a");
    }

    @Test
    public void passNoneNameNone(){
        GeneratePass.OpenGeneratePasswordPage();
        GeneratePass.EnterMasterPassword("");
        GeneratePass.EnterSiteName("");
        GeneratePass.ClickGenerateButton();
        String expectedMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals(expectedMasterPassword, "");
        String expectedSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals(expectedSiteName, "");
        String expectedGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals(expectedGeneratedPassword, "BaefBs8/Z/cm2@1a");
    }

    @Test
    public void passGenPass1NameGenPass2(){
        GeneratePass.OpenGeneratePasswordPage();
        GeneratePass.EnterMasterPassword("lFAosQQIiXvAR@1a");
        GeneratePass.EnterSiteName("7ttLiOwzmfYSH@1a");
        GeneratePass.ClickGenerateButton();
        String expectedMasterPassword = GeneratePass.GetMasterPassword();
        Assert.assertEquals(expectedMasterPassword, "lFAosQQIiXvAR@1a");
        String expectedSiteName = GeneratePass.GetSiteName();
        Assert.assertEquals(expectedSiteName, "7ttLiOwzmfYSH@1a");
        String expectedGeneratedPassword = GeneratePass.GetGeneratedPassword();
        Assert.assertEquals(expectedGeneratedPassword, "d4bQR1f33pW1T@1a");
    }

    @Test
    public void smokeTest(){
        GeneratePass.OpenGeneratePasswordPage();
        GeneratePass.ControlsAreExist();
        GeneratePass.ControlsAreEnabled();
        GeneratePass.ControlTextIsCorrect();
    }

    @AfterClass
    public static void closeBrowser(){
        ChromeWebDriver.CloseWebDriver();
    }
}
