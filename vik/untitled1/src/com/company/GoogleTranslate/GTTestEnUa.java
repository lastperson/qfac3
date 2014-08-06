package com.company.GoogleTranslate;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 8/6/14.
 */
public class GTTestEnUa {
    @Test
    public void gtLaunch() {
        WebDriver gt = GT.gtLaunch();
        GT.fillSourceText("fish", gt);
        Assert.assertEquals("fish", GT.getSourceText(gt));
        gt.close();
    }*/
}
