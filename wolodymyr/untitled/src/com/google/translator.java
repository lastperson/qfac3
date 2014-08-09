package com.google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by user on 8/6/14.
 */

public class translator {
    public static WebDriver Driwer;
    public static void Start(){
        System.setProperty("webdriver.chrome.driver", "//media//Data//Instal//Driver//chromedriver");
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--lang=en-us");
        WebDriver cw=new ChromeDriver(o);
        cw.get("https://translate.google.com.ua/");
        Driwer=cw;
    }
    public static void selectLanguageS (String id, String xpath) {
        Driwer.findElement(By.id(id)).click();
        Driwer.findElement(By.xpath(xpath)).click();
    }
    public static boolean isButonAvbyid (String idButton) {
        return Driwer.findElement(By.id(idButton)).isEnabled();
    }
    public static boolean isButonAvbyxpath (String idButton) {
        return Driwer.findElement(By.xpath(idButton)).isEnabled();
    }
    public static String getTword() throws InterruptedException {
        Thread.sleep(500L);
        if (Driwer.findElement(By.xpath("//span[@class='hps']")).isEnabled()){
            return Driwer.findElement(By.xpath("//span[@class='hps']")).getText();
        } else {
            return "";}
    }
    public static void enterWord(String word){
        Driwer.findElement(By.id("source")).sendKeys(word);
    }
    public static void ClickButtonbyID (String id){
        Driwer.findElement(By.id("gt-submit")).click();
    }
    public static void ClickButtonbyXpath(String xpath){
        Driwer.findElement(By.xpath(xpath)).click();
    }
    public static String getAriaPressed(String xpath){
        return  Driwer.findElement(By.xpath(xpath)).getAttribute("aria-pressed");
    }



}

