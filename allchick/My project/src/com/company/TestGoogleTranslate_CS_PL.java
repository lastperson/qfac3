package com.company;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;

/**
 * Created by user on 8/13/14.
 */
@RunWith(JUnit4.class)
public class TestGoogleTranslate_CS_PL {

    @BeforeClass
    public static void SetLanguagesForTranslate(){
        GoogleTranslatePage.SetURLUsingLanguageForTranslation("Czech", "Polish");
    }

    @Test
    public void SwapLanguages() {
        GoogleTranslatePage.SwapLanguage();
        GoogleTranslatePage.CheckUrlBeforeTranslation("Polish", "Czech");
        GoogleTranslatePage.SwapLanguage();
        GoogleTranslatePage.CheckUrlBeforeTranslation("Czech", "Polish");
    }

    @Test
    public void Translate1() throws InterruptedException {
        GoogleTranslatePage.ExecuteTranslationText("do té doby");
        GoogleTranslatePage.checkTranslatedText("aż");
    }

    @Test
    public void Translate2() throws InterruptedException {
       String test = ChromeWebDriver.webDriver.findElements(By.xpath("//div[@class='goog-menuitem-checkbox']")).toString();
        System.out.print(test);
    }

}
