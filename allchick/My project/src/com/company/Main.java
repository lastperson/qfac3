package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");
        WebElement searchFiled = webDriver.findElement(By.name("q"));
        searchFiled.sendKeys("QA Factory");

        WebElement searchButton = webDriver.findElement(By.id("gbqfb"));
        searchButton.click();



        while (webDriver.findElements(By.id("rso")).size() == 0);
        WebElement searchResult = webDriver.findElement(By.id("rso")).findElement(By.tagName("a"));
        searchResult.click();

        //List<WebElement> list =searchResult.findElements(By.tagName("a"));

        //WebElement link = searchResult.findElement(By.tagName("a"));
        //link.click();


        //System.out.println(list.size());

        //int i;
        //for (i = 0; i != list.size(); i++)
        //{
          //  WebElement result = list.get(i);
          //  String address = result.getAttribute("href");
           // System.out.println(address);
       // }

        //webDriver.quit();



    }
}
