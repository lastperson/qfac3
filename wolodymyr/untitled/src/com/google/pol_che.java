package com.google;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.testng.Assert;

/**
 * Created by user on 8/11/14.
 */
@RunWith(JUnit4.class)
public class pol_che {
    @BeforeClass
    public static void Start() {
        translator.Start();
    }
    //    @AfterClass
//    public static void eNd(){
//        translator.Driwer.quit();
//
//    }

    public void polChe1() throws InterruptedException {
        translator.selectL_enterWord(translator.butLangSPol, translator.butLangTChe, "ściana");
        String actualWord = "zeď";
        String exceptedWord = translator.getTword2(actualWord, translator.transWord);
        Assert.assertEquals(exceptedWord, actualWord);
    }
    @Test
      public void polChe2() throws InterruptedException {
        translator.selectL_enterWord(translator.butLangSPol, translator.butLangTChe, "ulica");
        String actualWord = "ulice";
        String exceptedWord = translator.getTword2(actualWord, translator.transWord);
        Assert.assertEquals(exceptedWord, actualWord);
    }
    @Test
    public void polChe3() throws InterruptedException {
        translator.selectL_enterWord(translator.butLangSPol, translator.butLangTChe, "okno");
        String actualWord = "okno";
        String exceptedWord = translator.getTword2(actualWord, translator.transWord);
        Assert.assertEquals(exceptedWord, actualWord);
    }

    @Test
    public void chePol1() throws InterruptedException {
        translator.selectL_enterWord(translator.butLangSChe, translator.butLangTPol, "kola");
        String actualWord ="koła" ;
        String exceptedWord = translator.getTword2(actualWord, translator.transWord);
        Assert.assertEquals(exceptedWord, actualWord);
    }
    @Test
    public void chePol2() throws InterruptedException {
        translator.selectL_enterWord(translator.butLangSChe, translator.butLangTPol, "pruhaty");
        String actualWord ="paski" ;
        String exceptedWord = translator.getTword2(actualWord, translator.transWord);
        Assert.assertEquals(exceptedWord, actualWord);
    }@Test
     public void chePol3() throws InterruptedException {
        translator.selectL_enterWord(translator.butLangSChe, translator.butLangTPol, "dveře");
        String actualWord ="drzwi" ;
        String exceptedWord = translator.getTword2(actualWord, translator.transWord);
        Assert.assertEquals(exceptedWord, actualWord);
    }

}
