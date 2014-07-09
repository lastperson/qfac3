package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\2AutomationCourseJava\\chromedriver.exe");

        WebDriver w = new ChromeDriver();

        w.get("http://google.com");

        WebElement e = w.findElement(By.name("q"));
        e.sendKeys("QA Factory");

        WebElement b = w.findElement(By.id("gbqfb"));
        b.click();
        WebElement c = w.findElement(By.id("rso"));
        List<WebElement> l = c.findElements(By.tagName("a"));
        WebElement link1 = l.get(0);
        String address = link1.getAttribute("href");
        System.out.println(address);
        //w.quit();
    }
}
