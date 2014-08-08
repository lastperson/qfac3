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
public class test1 {
    @Test
    public void checkText() {
        WebDriver gt = GT.gtLaunch();
        GT.fillSourceText("fish", gt);
        Assert.assertEquals("fish", GT.getSourceText(gt));
    }
    @Test
    public void langEnable() {
        WebDriver gt = GT.gtLaunch();
        boolean l1=GT.language1Xpath(gt).isEnabled();
        int i=0,j=0;
        if(GT.language1Xpath(gt).getAttribute("aria-pressed").equals("true")){i=1;}
        boolean l2=GT.language2Xpath(gt).isEnabled();
        if(GT.language2Xpath(gt).getAttribute("aria-pressed").equals("true")){i=i+1;}
        boolean l3=GT.language3Xpath(gt).isEnabled();
        if(GT.language3Xpath(gt).getAttribute("aria-pressed").equals("true")){i=i+1;}
        boolean l7=false;
        if (i==1){l7=true;}
        boolean l4=GT.language4Xpath(gt).isEnabled();
        if(GT.language3Xpath(gt).getAttribute("aria-pressed").equals("true")){j=1;}
        boolean l5=GT.language5Xpath(gt).isEnabled();
        if(GT.language4Xpath(gt).getAttribute("aria-pressed").equals("true")){j=j+1;}
        boolean l6=GT.language6Xpath(gt).isEnabled();
        if(GT.language5Xpath(gt).getAttribute("aria-pressed").equals("true")){j=j+1;}
        boolean l8=false;
        if (j==1){l8=true;}
        boolean result=l1==l2==l3==l4==l5==l6==l7==l8;
        Assert.assertEquals(true,result);
        gt.close();
    }
    @Test
    public void swapEnable() {
        Assert.assertEquals(true,GT.swapButton(GT.gtLaunch()).isEnabled());
    }
    @Test
    public void lang3Enable() {
        Assert.assertEquals(true,GT.language3Xpath(GT.gtLaunch()).isEnabled());
    }

}
