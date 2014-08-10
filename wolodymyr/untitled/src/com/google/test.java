package com.google;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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
public void tranlation() throws InterruptedException {

    translator.selectLanguageS("gt-sl-gms", "//div[@id='gt-sl-gms-menu']//div[contains(text(), 'англ')]");
    translator.selectLanguageS("gt-tl-gms", "//div[@id='gt-tl-gms-menu']//div[contains(text(), 'рос')]");
    translator.enterWord("box");
    translator.ClickButtonbyID(translator.butSubmit);
    Assert.assertEquals(translator.getTword(), "коробка");
    }
    @Test
    public void isButtonS1(){
       Assert.assertTrue(translator.isButonAvbyxpath(translator.butS1));
    }
    @Test
    public void isButtonS2(){
        Assert.assertTrue(translator.isButonAvbyxpath(translator.butS2));
    }
    @Test
    public void isButtonS3(){
        Assert.assertTrue(translator.isButonAvbyxpath(translator.butS3));
    }
    @Test
    public void isInspectL(){
        Assert.assertTrue(translator.isButonAvbyxpath(translator.butInspectL));
    }
    @Test
    public void isButtonT1(){
        Assert.assertTrue(translator.isButonAvbyxpath(translator.butT1));
    }
    @Test
    public void isButtonT2(){
        Assert.assertTrue(translator.isButonAvbyxpath(translator.butT2));
    }
    @Test
    public void isButtonT3(){
        Assert.assertTrue(translator.isButonAvbyxpath(translator.butT3));
    }
    @Test
    public void isButtonTr(){
        Assert.assertTrue(translator.isButonAvbyid(translator.butSubmit));
    }
    @Test
    public void isButtonCh(){
        Assert.assertTrue(translator.isButonAvbyid(translator.butChangeId));
    }
    @Test
    public void orSelectBS1(){
        Assert.assertEquals(translator.isSelectedClickedButton(translator.butS1), "true");
    }
    @Test
    public void orSelectBS2(){
        Assert.assertEquals(translator.isSelectedClickedButton(translator.butS2), "true");
    }
    @Test
    public void orSelectBS3(){
        Assert.assertEquals(translator.isSelectedClickedButton(translator.butS3), "true");
    }
    @Test
    public void orSelectBIspect(){
        Assert.assertEquals(translator.isSelectedClickedButton(translator.butInspectL), "true");
    }
    @Test
    public void orSelectT1(){
        Assert.assertEquals(translator.isSelectedClickedButton(translator.butT1), "true");
    }
    @Test
    public void orSelectT2(){
        Assert.assertEquals(translator.isSelectedClickedButton(translator.butT2), "true");
    }
    @Test
    public void orSelectBT3(){
        Assert.assertEquals(translator.isSelectedClickedButton(translator.butT3), "true");
    }
    @Test
    public void isMenuS(){
        Assert.assertTrue(translator.isButonAvbyid("gt-sl-gms"));
    }
    @Test
    public void isMenuT(){
        Assert.assertTrue(translator.isButonAvbyid("gt-tl-gms"));
    }
    @Test
    public void isTextS(){
        Assert.assertTrue(translator.isButonAvbyid("source"));
    }
    @Test
    public void changeLanguage(){
        String activeSourse = translator.getActiveL(translator.butS1, translator.butS2, translator.butS3);
        String activeTransl=translator.getActiveL(translator.butT1, translator.butT2, translator.butT3);
        translator.ClickButtonbyID(translator.butChangeId);
        Assert.assertEquals(translator.getActiveL(translator.butS1, translator.butS2, translator.butS3), activeTransl);
        Assert.assertEquals(translator.getActiveL(translator.butT1, translator.butT2, translator.butT3), activeSourse);

    }
    @Test
    public void inspedtLanguage() throws InterruptedException {
        String expected="визначено мову: данська";
        String text="I dag er godt vejr";
        translator.enterWord(text);
        translator.ClickButtonbyXpath(translator.butInspectL);
        Thread.sleep(500L);
        Assert.assertEquals(translator.getInspectLang(), expected);
    }
}
