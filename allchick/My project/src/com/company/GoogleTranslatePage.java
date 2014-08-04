package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 8/4/14.
 */
public class GoogleTranslatePage {

    public static void OpenGoogleTranslatePage(){
        ChromeWebDriver.OpenSite("https://translate.google.com/");
        while (ChromeWebDriver.webDriver.findElements(By.id("source")).size() == 0);
    }

    public static void SwapLanguage(){
        ChromeWebDriver.webDriver.findElement(By.id("gt-swap")).click();
    }

    public static void TranslateText(){
        ChromeWebDriver.webDriver.findElement(By.id("gt-lang-submit")).click();
    }

    public static void ChooseLanguageForTranslation(String language){
        ChromeWebDriver.webDriver.findElement(By.id("gt-sl-gms")).click();
        String xpathForObject = "//div[@id='gt-sl-gms-menu']//div[contains(text(), '" + language + "')]";
        ChromeWebDriver.webDriver.findElement(By.xpath(xpathForObject)).click();
        CheckLanguageForTranslation(language);
    }

    public static void CheckLanguageForTranslation(String language){
        String getActiveButtonText = ChromeWebDriver.webDriver.findElement(
                By.xpath("//div[@id = 'gt-sl-sugg']//div[contains(@class, 'jfk-button-checked')]")).getText();
        Assert.assertTrue(getActiveButtonText.contains(language));
    }

    public static void ChooseYourNativeLanguage(String language){
        ChromeWebDriver.webDriver.findElement(By.id("gt-tl-gms-menu")).click();
        String xpathForObject = "//div[@id='gt-tl-gms-menu']//div[contains(text(), '" + language + "')]";
        ChromeWebDriver.webDriver.findElement(By.xpath(xpathForObject)).click();
        CheckNativeLanguage(language);
    }

    public static void CheckNativeLanguage(String language){
        String getActiveButtonText = ChromeWebDriver.webDriver.findElement(
                By.xpath("//div[@id = 'gt-lang-tgt']//div[contains(@class, 'jfk-button-checked')]")).getText();
        Assert.assertTrue(getActiveButtonText.contains(language));
    }
}

