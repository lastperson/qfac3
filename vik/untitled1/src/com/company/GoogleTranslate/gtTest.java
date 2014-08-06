package com.company.GoogleTranslate;
    import com.company.passWordInput;
    import org.junit.Assert;
    import org.junit.Before;
    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.junit.runners.JUnit4;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;

/**
 * Created by Vitaliy on 06.08.2014.
 */
@RunWith(JUnit4.class)
public class GTTest {
    @Test
    public void checkText() {
        WebDriver gt = GT.gtLaunch();
        GT.fillSourceText("fish", gt);
        Assert.assertEquals("fish", GT.getSourceText(gt));
    }

    @Test
    public void lang1Enable() {
        WebDriver gt = GT.gtLaunch();
        boolean result=GT.language1Xpath(gt).isEnabled()==GT.language2Xpath(gt).isEnabled()==GT.language3Xpath(gt).isEnabled();
        Assert.assertEquals(true,result);
        gt.close();
    }
    @Test
    public void lang2Enable() {
        Assert.assertEquals(true,GT.language2Xpath(GT.gtLaunch()).isEnabled());
    }
    @Test
    public void lang3Enable() {
        Assert.assertEquals(true,GT.language3Xpath(GT.gtLaunch()).isEnabled());
    }
}
