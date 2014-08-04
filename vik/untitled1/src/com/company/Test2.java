package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/30/14.
 */
@RunWith(JUnit4.class)
public class Test2 {
    //@Before
    //public void launch(){WebDriver angelNet=passWordInput.angelNet();}

    @Test
    public void qwertyFBtw(){
        boolean result=passWordInput.input("qwerty","FB","TW",passWordInput.angelNet());
        boolean expectedResult=false;
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void qwertyfb(){
        WebDriver angelNet=passWordInput.angelNet();
        passWordInput.masterKey("qwerty",angelNet);
        passWordInput.siteName("fb",angelNet);
        passWordInput.generate(angelNet);
        Assert.assertEquals("zN6ci8v9JgLyb@1a",passWordInput.getPassword(angelNet));
    }
    @Test
    public void sameFilds(){
        WebDriver angelNet=passWordInput.angelNet();
        passWordInput.masterKey("qwerty",angelNet);
        passWordInput.siteName("fb", angelNet);
        passWordInput.generate(angelNet);
        Assert.assertEquals("qwertyfb",passWordInput.getMasterKey(angelNet)+passWordInput.getSiteName(angelNet));

    }
    @Test
    public void smokeTest() {
        WebDriver angelNet = passWordInput.angelNet();

        WebElement chekMKFild = passWordInput.mKeyXpath(angelNet);
        boolean result1 = chekMKFild.isEnabled();

        WebElement chekMKFildName = passWordInput.mKeyTextXpath(angelNet);
        boolean result11 = (chekMKFildName.getText().equals("Your master password"));

        WebElement chekSiteFild = passWordInput.siteInputXpath(angelNet);
        boolean result2 = chekSiteFild.isEnabled();

        WebElement chekSiteFildName = passWordInput.siteNameTextXpath(angelNet);
        boolean result22 = (chekSiteFildName.getText().equals("Site name"));

        WebElement chekPWFild = passWordInput.passWordXpath(angelNet);
        boolean result3 = chekPWFild.isEnabled();

        WebElement chekPWFildName = passWordInput.passWordTextXpath(angelNet);
        boolean result33 = (chekPWFildName.getText().equals("Generated password"));

        WebElement chekSubmitButton = passWordInput.submitXpath(angelNet);
        boolean result4 = chekSubmitButton.isEnabled();
        boolean result44 = (chekSubmitButton.getAttribute("value").equals("Generate"));

        boolean result = result1 ==result2==result3==result4==result44==result11==result22==result33;
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, result);
    }
    //@After
    //public void close(WebDriver angelNet){
        //passWordInput.close(angelNet);}
}