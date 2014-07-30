package Automation_with_Junit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;

/**
 * Created by user on 7/30/14.
 */
@RunWith(JUnit4.class)
public class Second extends Bas{



    @Test
    public void test100(){
        //System.setProperty("webdriver.chrome.driver", "D:\\Baskakov_Automation\\chromedriver.exe");
        driver.get("http://angel.net/~nic/passwd.current.html");

        WebElement YMP = driver.findElement(By.xpath("//input[@name='master' and @type='password']"));
        YMP.click();
        YMP.sendKeys("1");

        WebElement SN = driver.findElement(By.xpath("//input[@name='site' and @autocorrect='off']"));
        SN.click();
        SN.sendKeys("2");

        WebElement Generate = driver.findElement(By.xpath("//input[@type='submit' and @value='Generate']"));
        Generate.click();


        WebElement GP = driver.findElement(By.name("password"));
        String b = "+a3uoIjg2PvIm@1a";
        GP.click();

        System.out.println(GP.getAttribute("value"));
        Assert.assertEquals(b, GP.getAttribute("value"));

        YMP.clear();
        SN.clear();

        //driver.quit();
    }

    @Test
    public  void test200(){

            driver.get("http://angel.net/~nic/passwd.current.html");

            WebElement Generate = driver.findElement(By.xpath("//input[@type='submit' and @value='Generate']"));
            Generate.click();


            WebElement GP = driver.findElement(By.name("password"));

        GP.click();
        String c = "BaefBs8/Z/cm2@1a";
            System.out.println(GP.getAttribute("value"));
        Assert.assertEquals(c, GP.getAttribute("value"));
        //driver.quit();
    }

    @Test
    public void test300(){
           driver.get("http://angel.net/~nic/passwd.current.html");

        WebElement YMP = driver.findElement(By.xpath("//input[@name='master' and @type='password']"));
        YMP.click();
        YMP.sendKeys("!@#$^%$");

        WebElement SN = driver.findElement(By.xpath("//input[@name='site' and @autocorrect='off']"));
        SN.click();
        SN.sendKeys("^!%$@#$");

        WebElement Generate = driver.findElement(By.xpath("//input[@type='submit' and @value='Generate']"));
        Generate.click();

        WebElement GP = driver.findElement(By.name("password"));

        GP.click();
        String d = "EviLEKYZa0YIF@1a";
        String y = GP.getAttribute("value");
        System.out.println(" " +GP.getAttribute("value"));
        Assert.assertEquals(d,y);

        //driver.quit();

    }
}
