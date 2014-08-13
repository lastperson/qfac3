package com.company;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


/**
 * Created by user on 8/4/14.
 */
@RunWith(JUnit4.class)
public class TestGoogleTranslatePage {

    @BeforeClass
    public static void SetLanguagesForTranslate() {
        GoogleTranslatePage.ExecuteSetLanguagesForTranslate("English", "Ukrainian");
    }

    @Test
    public void SwapLanguages() {
        GoogleTranslatePage.SwapLanguage();
        GoogleTranslatePage.CheckUrlBeforeTranslation("Ukrainian", "English");
        GoogleTranslatePage.SwapLanguage();
        GoogleTranslatePage.CheckUrlBeforeTranslation("English", "Ukrainian");
    }

    @Test
    public void Translate1() throws InterruptedException {
        GoogleTranslatePage.ExecuteTranslationText("picture");
        GoogleTranslatePage.checkTranslatedText("фото");

    }

    @Test
    public void Translate2() throws InterruptedException {
        GoogleTranslatePage.ExecuteTranslationText("I am a doctor");
        GoogleTranslatePage.checkTranslatedText("Я лікар");
    }

    @Test
    public void Translate3() throws InterruptedException {
        GoogleTranslatePage.ExecuteTranslationText("cat\n" + "dog");
        GoogleTranslatePage.checkTranslatedText("кіт \n" + "собака");
    }

    @Test
    public void Translate4() throws InterruptedException {
        GoogleTranslatePage.ExecuteTranslationText("\n" + "about\n" + "\n" + "\n" + "box\n" + "\n" + "cool\n");
        GoogleTranslatePage.checkTranslatedText("про це \n" + "\n" +  "\n" + "коробка \n" + "\n" + "круто");
    }

    @Test
    public void Translate5() throws InterruptedException {
        GoogleTranslatePage.ExecuteTranslationText("new test\n" + "new text");
        GoogleTranslatePage.checkTranslatedText("новий тест \n" + "новий текст");
    }

    @Test
    public void Translate6() throws InterruptedException {
        GoogleTranslatePage.ExecuteTranslationText("NATO");
        GoogleTranslatePage.checkTranslatedText("НАТО");
    }

    @Test
    public void Translate7() throws InterruptedException {
        GoogleTranslatePage.ExecuteTranslationText("ne zrozumila mova");
        GoogleTranslatePage.checkTranslatedText("пе zrozumila мова");
    }

    @AfterClass
    public static void closeBrowser(){
        ChromeWebDriver.CloseWebDriver();
    }




}
