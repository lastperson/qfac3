package com.company.GoogleTranslate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 8/8/14.
 */
@RunWith(JUnit4.class)
public class GTTestEnUa {
    @Test
    public void fishEnUa() {
        WebDriver gt = GT.gtLaunch();
        GT.sourceLangChoice(gt).click();
        GT.sourceLangEn(gt).click();
        GT.fillSourceText("fish", gt);
        GT.transLangChoice(gt).click();
        GT.transLangUa(gt).click();
        while (GT.resultTextXpath(gt).getText()=="");
        Assert.assertEquals("риба", GT.resultTextXpath(gt).getText());
        gt.close();
    }
    @Test
    public void fishUaEn() {
        WebDriver gt = GT.gtLaunch();
        GT.sourceLangChoice(gt).click();
        GT.sourceLangUa(gt).click();
        GT.fillSourceText("риба", gt);
        GT.transLangChoice(gt).click();
        GT.transLangEn(gt).click();
        while (GT.resultTextXpath(gt).getText()=="") ;
        Assert.assertEquals("fish", GT.resultTextXpath(gt).getText());
        //gt.close();
    }
    @Test
    public void urlUkEn() {
        WebDriver gt = GT.urlUkEn();
        String result=GT.pressedSourceButton(gt).getText()+GT.pressedTranslateButton(gt).getText();
        Assert.assertEquals("украинскийанглийский", result);
        gt.close();
    }
    @Test
    public void urlEnUk() {
        WebDriver gt = GT.urlEnUk();
        String result=GT.pressedSourceButton(gt).getText()+GT.pressedTranslateButton(gt).getText();
        Assert.assertEquals("английскийукраинский", result);
        gt.close();
    }
    @Test
    public void swapUkEn() {
        WebDriver gt = GT.urlUkEn();
        GT.swapButton(gt).click();
        String result = GT.pressedSourceButton(gt).getText() + GT.pressedTranslateButton(gt).getText();
        Assert.assertEquals("английскийукраинский", result);
        gt.close();
    }
}

