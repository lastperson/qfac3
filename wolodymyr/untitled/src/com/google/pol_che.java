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
    @Test
    public void polChe1() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSPol, translator.butLangTChe, "ściana");
        Assert.assertEquals(gettingWord, "zeď");
    }
    @Test
    public void polChe2() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSPol, translator.butLangTChe, "okno");
        Assert.assertEquals(gettingWord, "okno");
    }
    @Test
    public void polChe3() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSPol, translator.butLangTChe, "ulica");
        Assert.assertEquals(gettingWord, "ulice");
    }
    @Test
    public void chePol1() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSChe, translator.butLangTPol, "kola");
        Assert.assertEquals(gettingWord, "koła");
    }
    @Test
    public void chePol2() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSChe, translator.butLangTPol, "pruhaty");
        Assert.assertEquals(gettingWord, "paski");
    }@Test
     public void chePol3() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSChe, translator.butLangTPol, "dveře");
        Assert.assertEquals(gettingWord, "drzwi");
    }

}
