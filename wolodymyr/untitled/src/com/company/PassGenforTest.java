package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/30/14.
 */
public class PassGenforTest {
    public static WebDriver w;


       public static void Systt (){
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        WebDriver cw=new ChromeDriver();
        cw.get("http://angel.net/~nic/passwd.current.html");
        w=cw;
    }
    public static String Pas1(String password, String siteName){
        Systt();
        GeneretPassword.masterParol(password);
        GeneretPassword.site(siteName);
        GeneretPassword.gener();
        return GeneretPassword.getGenSite();

    }
    public static String Pas1(String password){
        GeneretPassword.masterParol(password);
        GeneretPassword.clearSite();
        GeneretPassword.gener();
        return GeneretPassword.getGenSite();
    }
    public static String Pas2(String siteName){
        GeneretPassword.clearPass();
        GeneretPassword.site(siteName);
        GeneretPassword.gener();
        //w.quit();
        return GeneretPassword.getGenSite();


    }

}
