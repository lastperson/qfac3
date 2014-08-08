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
    translator.Tranlate();
    Assert.assertEquals(translator.getTword(), "коробка");
    }
    @Test
    public void isButon1(){
       Assert.assertTrue(translator.isButonAvbyxpath("//div[@id='gt-sl-sugg']/div[2]"));
    }
    @Test
    public void isButtonS2(){
        Assert.assertTrue(translator.isButonAvbyxpath("//div[@id='gt-sl-sugg']/div[1]"));
    }
    @Test
    public void isButtonS3(){
        Assert.assertTrue(translator.isButonAvbyxpath("//div[@id='gt-sl-sugg']/div[3]"));
    }
    @Test
    public void isButtonS4(){
        Assert.assertTrue(translator.isButonAvbyxpath("//div[@id='gt-sl-sugg']/div[5]"));
    }
    @Test
    public void isButonT1(){
        Assert.assertTrue(translator.isButonAvbyxpath("//div[@id='gt-tl-sugg']/div[1]"));
    }
    @Test
    public void isButtonT2(){
        Assert.assertTrue(translator.isButonAvbyxpath("//div[@id='gt-tl-sugg']/div[2]"));
    }
    @Test
    public void isButtonT3(){
        Assert.assertTrue(translator.isButonAvbyxpath("//div[@id='gt-tl-sugg']/div[3]"));
    }
    @Test
    public void isButtonTr(){
        Assert.assertTrue(translator.isButonAvbyid("gt-submit"));
    }
    public void isButtonCh(){
        Assert.assertTrue(translator.isButonAvbyid("gt-swap"));
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
    public void isSelected(){
        translator.isButActive("//div[@id='gt-sl-sugg']/div[1]");

    }




}
