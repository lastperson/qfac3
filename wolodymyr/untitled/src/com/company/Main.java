package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        WebDriver w=new ChromeDriver();
       w.get("http://google.com");
       WebElement e = w.findElement(By.name("q"));
        e.sendKeys("QA Factory");
        WebElement b = w.findElement(By.id("gbqfb"));
        b.click();
        List<WebElement> c= w.findElements(By.id("rso"));
        while (c.size()==0){
            c= w.findElements(By.id("rso"));
        };
        List<WebElement> l =c.get(0).findElements(By.tagName("a"));


        WebElement link1 = l.get(0);
        String address = link1.getAttribute("href");
        System.out.print(address);
        String fa ="http://qafactory.com.ua/";
        if (address.equals(fa)){
         System.out.print(l.size());

        }


    //w.quit();
// write your code here
    }
}
