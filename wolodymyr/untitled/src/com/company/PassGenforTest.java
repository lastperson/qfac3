package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/30/14.
 */
public class PassGenforTest {

    public static String Pas1(String password, String siteName){
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        WebDriver w=new ChromeDriver();
        w.get("http://angel.net/~nic/passwd.current.html");
        WebElement a = w.findElement(By.xpath("//input[@type='password']"));
        a.click();
        a.sendKeys(password);
        WebElement b=w.findElement(By.xpath("//input[@autocorrect='off']"));
        b.sendKeys(siteName);
        WebElement Butt = w.findElement(By.xpath("//input[@value='Generate']"));
        Butt.click();
        WebElement genPass  = w.findElement(By.xpath("//input[@name='password']"));
        String passw=genPass.getAttribute("value");
        w.quit();
        return passw;

    }
    public static String Pas1(String password){
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        WebDriver w=new ChromeDriver();
        w.get("http://angel.net/~nic/passwd.current.html");
        WebElement a = w.findElement(By.xpath("//input[@type='password']"));
        a.click();
        a.sendKeys(password);
        WebElement Butt = w.findElement(By.xpath("//input[@value='Generate']"));
        Butt.click();
        WebElement genPass  = w.findElement(By.xpath("//input[@name='password']"));
        String passw=genPass.getAttribute("value");
        w.quit();
        return passw;


    }
    public static String Pas2(String siteName){
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        WebDriver w=new ChromeDriver();
        w.get("http://angel.net/~nic/passwd.current.html");
        WebElement b=w.findElement(By.xpath("//input[@autocorrect='off']"));
        b.sendKeys(siteName);

        WebElement Butt = w.findElement(By.xpath("//input[@value='Generate']"));
        Butt.click();
        WebElement genPass  = w.findElement(By.xpath("//input[@name='password']"));
        String passw=genPass.getAttribute("value");
        w.quit();
        return passw;


    }

}
