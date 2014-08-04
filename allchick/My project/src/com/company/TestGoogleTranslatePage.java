package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


/**
 * Created by user on 8/4/14.
 */
@RunWith(JUnit4.class)
public class TestGoogleTranslatePage {

    @Test
    public void NewTest() {
       GoogleTranslatePage.OpenGoogleTranslatePage();
       GoogleTranslatePage.ChooseLanguageForTranslation("English");
        GoogleTranslatePage.ChooseYourNativeLanguage("Ukrainian");
    }
}
