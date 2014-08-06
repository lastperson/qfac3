package Automation_with_Junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

/**
 * Created by user on 7/30/14.
 */
public class Bas {
 public static WebDriver driver = null;


    @Before
    public void test0() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "D:\\Baskakov_Automation\\chromedriver.exe");
        if(driver==null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //driver.get("http://angel.net/~nic/passwd.current.html");
            driver.get("https://translate.google.com.ua");
            //driver.navigate().refresh();

        }
        System.out.println("DONE");

    }
    @AfterClass
    public static void test9(){

        //driver.quit();
    }
}
