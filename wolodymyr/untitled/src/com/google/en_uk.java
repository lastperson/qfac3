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
public class en_uk {
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
    public void enUa1() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSEn, translator.butLangTUk, "keyboard");
        Assert.assertEquals(gettingWord, "клавіатура");
    }
    @Test
    public void enUa2() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSEn, translator.butLangTUk, "go");
        Assert.assertEquals(gettingWord, "перейти");
    }
    @Test
      public void enUa3() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSEn, translator.butLangTUk, "ring");
        Assert.assertEquals(gettingWord, "кільце");
    }
    @Test
    public void uaEn1() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSUk, translator.butLangTEn, "дівчина");
        Assert.assertEquals(gettingWord, "girl");
    }
    @Test
    public void uaEn2() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSUk, translator.butLangTEn, "стіл");
        Assert.assertEquals(gettingWord, "table");
    }@Test
     public void uaEn3() throws InterruptedException {
        String gettingWord =translator.selectL_enterWord(translator.butLangSUk, translator.butLangTEn, "стрибати");
        Assert.assertEquals(gettingWord, "jump");
    }

}
