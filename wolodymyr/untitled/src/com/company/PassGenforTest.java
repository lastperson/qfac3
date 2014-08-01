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
        WebElement a = w.findElement(By.xpath("//input[@type='password']"));
        a.clear();
        a.sendKeys(password);
        WebElement b=w.findElement(By.xpath("//input[@autocorrect='off']"));
        b.clear();
        WebElement Butt = w.findElement(By.xpath("//input[@value='Generate']"));
        Butt.click();
        WebElement genPass  = w.findElement(By.xpath("//input[@name='password']"));
        String passw=genPass.getAttribute("value");
        return passw;
    }
    public static String Pas2(String siteName){
        WebElement a = w.findElement(By.xpath("//input[@type='password']"));
        a.clear();
        WebElement b=w.findElement(By.xpath("//input[@autocorrect='off']"));
        b.clear();
        b.sendKeys(siteName);
        WebElement Butt = w.findElement(By.xpath("//input[@value='Generate']"));
        Butt.click();
        WebElement genPass  = w.findElement(By.xpath("//input[@name='password']"));
        String passw=genPass.getAttribute("value");
        w.quit();
        return passw;


    }

}
