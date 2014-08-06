package com.google;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 8/6/14.
 */
@RunWith(JUnit4.class)
public class test {
    @BeforeClass
    public static void Start() {
       translator.Start();
    }
//    @AfterClass
//    public static void eNd(){
//        translator.Driwer.quit();
//
//    }
    @Test
    public void tranlation() {
        translator.selectLanguageS("gt-sl-gms", "//div[text()='іврит']");
        translator.selectLanguageS( "gt-ll-gms", "//div[text()='каннада']");

    }

}
