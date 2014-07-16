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

        webDriver.get("http://angel.net/~nic/passwd.current.html");
        while (webDriver.findElements(By.className("callout")).size() == 0);

        String[] passwords = new String[] {"123", "456", "789"};
        String[] sites = new String[] {"site1", "site2", "site3"};

        int passwordsLength = passwords.length;
        int sitesLength = sites.length;
        int i=0;

        if (passwordsLength == sitesLength){
            do {
                WebElement masterPasswordField = webDriver.findElement(By.xpath("//input[@type='password']"));
                masterPasswordField.clear();
                masterPasswordField.sendKeys(passwords[i]);

                WebElement siteField = webDriver.findElement(By.xpath("//input[@autocorrect='off']"));
                siteField.clear();
                siteField.sendKeys(sites[i]);

                WebElement generateKey = webDriver.findElement(By.xpath("//input[@type='submit']"));
                generateKey.click();

                WebElement passwordField = webDriver.findElement(By.xpath("//input[@name='password']"));
                String passwordForSite = passwordField.getAttribute("value");

                System.out.println(passwordForSite);

                i++;
            } while (i != passwordsLength);
        };

        //WebElement masterPasswordField = webDriver.findElement(By.name("master"));
        //masterPasswordField.sendKeys("1234567890");

        //WebElement siteField = webDriver.findElement(By.name("site"));
        //siteField.sendKeys("fb.com");

        //WebElement generateKey = webDriver.findElement(By.xpath("//input[@type='submit']"));
        //generateKey.click();

        //WebElement passwordField = webDriver.findElement(By.name("password"));
        //String passwordForSite = passwordField.getAttribute("value");

        //System.out.println(passwordForSite);

        webDriver.quit();


        /*WebElement searchFiled = webDriver.findElement(By.name("q"));
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
       // }*/





    }
}
