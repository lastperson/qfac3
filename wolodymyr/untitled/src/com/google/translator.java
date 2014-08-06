package com.google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by user on 8/6/14.
 */

public class translator {
    public static WebDriver Driwer;
    public static void Start(){
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--lang=en-us");
        WebDriver cw=new ChromeDriver(o);
        cw.get("https://translate.google.com.ua/");
        Driwer=cw;
    }
    public static void selectLanguageS (String id, String xpath){
        Driwer.findElement(By.id(id)).click();
        Driwer.findElement(By.xpath(xpath)).click();

    }


}

