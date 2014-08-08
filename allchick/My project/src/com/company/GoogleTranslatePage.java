package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.security.auth.callback.LanguageCallback;
import java.awt.*;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 8/4/14.
 */
public class GoogleTranslatePage {

    public static Map<String, String> LanguageAbbreviation = new HashMap<String, String>();
    static {
        LanguageAbbreviation.put("English", "en");
        LanguageAbbreviation.put("Ukrainian", "uk");
    }

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
        ChromeWebDriver.webDriver.findElement(By.id("gt-tl-gms")).click();
        String xpathForObject = "//div[@id='gt-tl-gms-menu']//div[contains(text(), '" + language + "')]";
        ChromeWebDriver.webDriver.findElement(By.xpath(xpathForObject)).click();
        CheckNativeLanguage(language);
    }

    public static void CheckNativeLanguage(String language){
        String getActiveButtonText = ChromeWebDriver.webDriver.findElement(
                By.xpath("//div[@id = 'gt-lang-tgt']//div[contains(@class, 'jfk-button-checked')]")).getText();
        Assert.assertTrue(getActiveButtonText.contains(language));
    }

    public static void CheckUrlBeforeTranslation(String languageForTranslate, String languageNative){

        String languageForTranslateAbbr = LanguageAbbreviation.get(languageForTranslate);
        String languageNativeAbbr = LanguageAbbreviation.get(languageNative);
        String expectedUrl ="https://translate.google.com/#" + languageForTranslateAbbr + "/" + languageNativeAbbr + "/";
        Assert.assertTrue(ChromeWebDriver.webDriver.getCurrentUrl().contains(expectedUrl));
    }

    public static void enterTextForTranslation(String textForTranslation){
        ControlTextForTranslation().sendKeys(textForTranslation);
    }

    public static void checkTextForTranslation(String textForTranslation){
        Assert.assertEquals(textForTranslation, ControlTextForTranslation().getAttribute("value"));
    }

    public static void checkTranslatedText(String translatedText){
        Assert.assertEquals(translatedText, ControlTranslatedText().getText());
    }

    private static WebElement ControlTextForTranslation(){
        WebElement controlTextForTranslation = ChromeWebDriver.webDriver.
                findElement(By.xpath("//textarea[@id = 'source']"));
        return controlTextForTranslation;
    }

    private static WebElement ControlTranslatedText(){
        while (ChromeWebDriver.webDriver.findElements(By.xpath("//span[@id = 'result_box']/span")).size() == 0);
        WebElement controlTranslatedText = ChromeWebDriver.webDriver.
                findElement(By.xpath("//span[@id = 'result_box']/span"));
        return controlTranslatedText;
    }

    public static void ExecuteSetLanguagesForTranslate(String languageForTranslate, String languageNative){
        GoogleTranslatePage.OpenGoogleTranslatePage();
        GoogleTranslatePage.ChooseLanguageForTranslation(languageForTranslate);
        GoogleTranslatePage.CheckLanguageForTranslation(languageForTranslate);
        GoogleTranslatePage.ChooseYourNativeLanguage(languageNative);
        GoogleTranslatePage.CheckNativeLanguage(languageNative);
        GoogleTranslatePage.CheckUrlBeforeTranslation(languageForTranslate, languageNative);
    }

    public static void ExecuteTranslationText(String textForTranslate){
        GoogleTranslatePage.enterTextForTranslation(textForTranslate);
        GoogleTranslatePage.checkTextForTranslation(textForTranslate);
        GoogleTranslatePage.TranslateText();
    }
}

