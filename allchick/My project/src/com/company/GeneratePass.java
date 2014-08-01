package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/30/14.
 */
public class GeneratePass {

    public static void OpenGeneratePasswordPage(){
        ChromeWebDriver.OpenSite("http://angel.net/~nic/passwd.current.html");
        while (ChromeWebDriver.webDriver.findElements(By.className("callout")).size() == 0);
    }

    public static WebElement MasterPasswordField(){
        WebElement masterPasswordField = ChromeWebDriver.webDriver.findElement(By.xpath("//input[@type='password']"));
        return masterPasswordField;
    }

    public static WebElement SiteName(){
        WebElement siteName = ChromeWebDriver.webDriver.findElement(By.xpath("//input[@autocorrect='off']"));
        return siteName;
    }

    public static WebElement GenerateButton(){
        WebElement generateButton = ChromeWebDriver.webDriver.findElement(By.xpath("//input[@type='submit']"));
        return generateButton;
    }

    public static WebElement GeneratedPassword(){
        WebElement generatedPassword = ChromeWebDriver.webDriver.findElement(By.xpath("//input[@name='password']"));
        return generatedPassword;
    }

    public static void EnterMasterPassword(String pass){
        GeneratePass.MasterPasswordField().sendKeys(pass);
    }

    public static String GetMasterPassword(){
        String masterPassword = GeneratePass.MasterPasswordField().getAttribute("value");
        return masterPassword;
    }

    public static void EnterSiteName(String site){
        GeneratePass.SiteName().sendKeys(site);
    }

    public static String GetSiteName(){
        String siteName = GeneratePass.SiteName().getAttribute("value");
        return siteName;
    }

    public static void ClickGenerateButton(){
        GeneratePass.GenerateButton().click();
    }

    public static String GetGeneratedPassword(){
        String generatedPassword = GeneratePass.GeneratedPassword().getAttribute("value");
        return  generatedPassword;
    }

    public static void ControlsAreExist(){
        Assert.assertTrue(GeneratePass.MasterPasswordField().isDisplayed());
        Assert.assertTrue(GeneratePass.SiteName().isDisplayed());
        Assert.assertTrue(GeneratePass.GenerateButton().isDisplayed());
        Assert.assertTrue(GeneratePass.GeneratedPassword().isDisplayed());
    }

    public static void ControlsAreEnabled(){
        Assert.assertTrue(GeneratePass.MasterPasswordField().isEnabled());
        Assert.assertTrue(GeneratePass.SiteName().isEnabled());
        Assert.assertTrue(GeneratePass.GenerateButton().isEnabled());
        Assert.assertTrue(GeneratePass.GeneratedPassword().isEnabled());
    }

    public static void ControlTextIsCorrect(){
        String getMasterPasswordText = GeneratePass.MasterPasswordField().findElement(By.xpath("./../../td[1]")).getText();
        Assert.assertEquals(getMasterPasswordText, "Your master password");

        String getSiteNameText = GeneratePass.SiteName().findElement(By.xpath("./../../td[1]")).getText();
        Assert.assertEquals(getSiteNameText, "Site name");

        String getGenerateButtonText = GeneratePass.GenerateButton().getAttribute("value");
        Assert.assertEquals(getGenerateButtonText, "Generate");

        String getGeneratedPassText = GeneratePass.GeneratedPassword().findElement(By.xpath("./../../td[1]")).getText();
        Assert.assertEquals(getGeneratedPassText, "Generated password");
    }
}
