package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "D:\\Baskakov_Automation\\chromedriver.exe");

        WebDriver w = new ChromeDriver();
        w.get("http://google.com.ua");
        WebElement e = w.findElement(By.name("q"));
        e.sendKeys("QA Factory");
        e.sendKeys(Keys.ENTER);
        System.out.println("Passed");

        WebElement b = w.findElement(By.name("btnG"));
        b.click();
        System.out.println("Passed2");

        while (w.findElements(By.id("rso")).size()==0){

        }

        WebElement c = w.findElement(By.id("rso"));
        int i=0;
        while (i==0){
            if (i <= w.findElement(By.tagName("a"))){
                i=i+1;
            }

        }
        List<WebElement> l = c.findElements(By.tagName("a"));
        
        WebElement link1 = l.get(0);
        String address = link1.getAttribute("href");
        System.out.println(address);



        /*if (address != null) {
                System.out.println("Failed");
                        }
             if (address.equals("http://qafactory.com.ua/")){
                 System.out.println("Passed3");
             }*/






        w.quit();




    }

}

