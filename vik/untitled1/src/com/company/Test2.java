package com.company;

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
    @Test
    public void qwertyFBtw(){
        boolean result=passWordInput.input("qwerty","FB","tw");
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
        passWordInput.siteName("fb",angelNet);
        passWordInput.generate(angelNet);
        Assert.assertEquals("qwertyfb",passWordInput.getMasterKey(angelNet)+passWordInput.getSiteName(angelNet));
    }
    @Test
    public void smokeTest() {
        WebDriver angelNet = passWordInput.angelNet();

        WebElement chekMKFild = angelNet.findElement(By.xpath("//input[@name='master']"));
        boolean result1 = chekMKFild.isEnabled();

        WebElement chekMKFildName = angelNet.findElement(By.xpath("//input[@name='master']//../../td[1]"));
        boolean result11 = (chekMKFildName.getText().equals("Your master password"));

        WebElement chekSiteFild = angelNet.findElement(By.xpath("//input[@name='site']"));
        boolean result2 = chekSiteFild.isEnabled();

        WebElement chekSiteFildName = angelNet.findElement(By.xpath("//input[@name='site']/../../td[1]"));
        boolean result22 = (chekSiteFildName.getText().equals("Site name"));

        WebElement chekPWFild = angelNet.findElement(By.xpath("//input[@name='password']"));
        boolean result3 = chekPWFild.isEnabled();

        WebElement chekPWFildName = angelNet.findElement(By.xpath("//input[@name='password']/../../td[1]"));
        boolean result33 = (chekPWFildName.getText().equals("Generated password"));

        WebElement chekSubmitButton = angelNet.findElement(By.xpath("//input[@type='submit']"));
        boolean result4 = chekSubmitButton.isEnabled();
        boolean result44 = (chekSubmitButton.getAttribute("value").equals("Generate"));

        boolean result = result1 ==result2==result3==result4==result44==result11==result22==result33;
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, result);
    }
}