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
public class GTTestPlCs {
    @Test
    public void rybPlCs() {
        WebDriver gt = GT.gtLaunch();
        GT.sourceLangChoice(gt).click();
        GT.sourceLangPl(gt).click();
        GT.transLangChoice(gt).click();
        GT.transLangCs(gt).click();
        GT.fillSourceText("ryb", gt);
        while (!GT.resultTextXpath(gt).getText().equals("ryby"));
        Assert.assertEquals("ryby", GT.resultTextXpath(gt).getText());
        gt.close();
    }
    @Test
    public void rybCsPl() {
        WebDriver gt = GT.gtLaunch();
        GT.sourceLangChoice(gt).click();
        GT.sourceLangCs(gt).click();
        GT.transLangChoice(gt).click();
        GT.transLangPl(gt).click();
        GT.fillSourceText("ryby", gt);
        while (!GT.resultTextXpath(gt).getText().equals("ryb"));
        Assert.assertEquals("ryb", GT.resultTextXpath(gt).getText());
        gt.close();
    }
    @Test
    public void urlPlCs() {
        WebDriver gt = GT.urlPlCs();
        String result=GT.pressedSourceButton(gt).getText()+GT.pressedTranslateButton(gt).getText();
        Assert.assertEquals("польскийчешский", result);
        gt.close();
    }
    @Test
    public void urlCsPl() {
        WebDriver gt = GT.urlCsPl();
        String result=GT.pressedSourceButton(gt).getText()+GT.pressedTranslateButton(gt).getText();
        Assert.assertEquals("чешскийпольский", result);
        gt.close();
    }
}
