package com.company.GoogleTranslate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 8/4/14.
 */
public class GT {
    public static WebDriver gt() {
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava\\chromedriver_win32\\chromedriver.exe");
        WebDriver gt = new ChromeDriver();
        gt.get("http://translate.google.com");
        return (gt);
    }
    public static WebElement languageSelect (WebDriver angelNet){
        return (angelNet.findElement(By.xpath("//div[@id='gt-sl-gms']/div[1]")));
    }

    public static WebElement siteInputXpath (WebDriver angelNet) {
        return (angelNet.findElement(By.xpath("//input[@name='site']")));
    }
}
