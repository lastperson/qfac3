package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/30/14.
 */
public class GeneratePass {



    public static String GeneratePassword (String password, String site){

        ChromeWebDriver.OpenSite("http://angel.net/~nic/passwd.current.html");

        WebElement masterPasswordField = ChromeWebDriver.webDriver.findElement(By.xpath("//input[@type='password']"));
        masterPasswordField.sendKeys(password);
        WebElement siteField = ChromeWebDriver.webDriver.findElement(By.xpath("//input[@autocorrect='off']"));
        siteField.sendKeys(site);
        WebElement generateKey = ChromeWebDriver.webDriver.findElement(By.xpath("//input[@type='submit']"));
        generateKey.click();
        WebElement passwordField = ChromeWebDriver.webDriver.findElement(By.xpath("//input[@name='password']"));
        String generatedPassword = passwordField.getAttribute("value");

        return  generatedPassword;
    }
}
