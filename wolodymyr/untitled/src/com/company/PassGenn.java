package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/16/14.
 */
public class PassGenn {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        WebDriver w=new ChromeDriver();
        w.get("http://angel.net/~nic/passwd.current.html");
        WebElement a = w.findElement(By.xpath("//input[@type='password']"));
        String[] passwords=new String[]{"123123p","123123o","123123i"};
        String[] sites = new String[]{"http://shop.ck.ua/","http://shop.lego.com/en-US/","http://www.status-shop.com/"};
        int r;
        for (r=0;r<passwords.length;r++) {

            a.clear();
            a.sendKeys(passwords[r]);
            WebElement SiteN = w.findElement(By.xpath("//input[@autocorrect='off']"));
            System.out.println(SiteN.getAttribute("value"));
            SiteN.clear();
            SiteN.sendKeys(sites[r]);
            //SiteN.sendKeys(Keys.ENTER);
            WebElement Butt=w.findElement(By.xpath("//input[@value='Generate']"));
            Butt.click();
            WebElement GenPas = w.findElement(By.xpath("//input[@name='password']"));
            String pass = GenPas.getAttribute("value");
            System.out.println(pass);

        }
        w.quit();


    }

}
