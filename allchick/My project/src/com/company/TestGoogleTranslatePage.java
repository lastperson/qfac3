package com.company;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


/**
 * Created by user on 8/4/14.
 */
@RunWith(JUnit4.class)
public class TestGoogleTranslatePage {

    @Before
    public void SetLanguagesForTranslate() {
        GoogleTranslatePage.ExecuteSetLanguagesForTranslate("English", "Ukrainian");
    }

    @Test
    public void SwapLanguages() {
        GoogleTranslatePage.CheckUrlBeforeTranslation("English", "Ukrainian");
        GoogleTranslatePage.SwapLanguage();
        GoogleTranslatePage.CheckUrlBeforeTranslation("Ukrainian", "English");
    }

    @Test
    public void Translate1() {
        GoogleTranslatePage.ExecuteTranslationText("picture");
        GoogleTranslatePage.checkTranslatedText("фото");
    }

    @Test
    public void Translate2() {
        GoogleTranslatePage.ExecuteTranslationText("I am a doctor");
        GoogleTranslatePage.checkTranslatedText("Я лікар");
    }

    @Test
    public void Translate3() {
        GoogleTranslatePage.ExecuteTranslationText("cat\n" + "dog");
        GoogleTranslatePage.checkTranslatedText("кіт \n" + "собака");
    }

    @Test
    public void Translate4() {
        GoogleTranslatePage.ExecuteTranslationText("about box");
        GoogleTranslatePage.checkTranslatedText("про поле");
    }

    @Test
    public void Translate5() {
        GoogleTranslatePage.ExecuteTranslationText("new test\n" + "new text");
        GoogleTranslatePage.checkTranslatedText("новий тест \n" + "новий текст");
    }

    @Test
    public void Translate6() {
        GoogleTranslatePage.ExecuteTranslationText("NATO");
        GoogleTranslatePage.checkTranslatedText("НАТО");
    }

    @Test
    public void Translate7() {
        GoogleTranslatePage.ExecuteTranslationText("ne zrozumila mova");
        GoogleTranslatePage.checkTranslatedText("пе zrozumila мова");
    }

    @AfterClass
    public static void closeBrowser(){
        ChromeWebDriver.CloseWebDriver();
    }




}
