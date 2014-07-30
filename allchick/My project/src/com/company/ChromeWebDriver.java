package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/30/14.
 */
public class ChromeWebDriver {

    public static WebDriver webDriver;
    public static boolean isOpened = false;

    public static void OpenSite (String url){

        if (!isOpened) {
            System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
            webDriver = new ChromeDriver();

            isOpened = true;
        }
        webDriver.get(url);
    }

    public static void CloseWebDriver (){

        if (isOpened) {
            webDriver.quit();
            isOpened = false;
        }
    }

}
