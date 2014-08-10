package com.google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by user on 8/6/14.
 */

public class translator {
    public static WebDriver Driwer;
    public static String butS1 ="//div[@id='gt-sl-sugg']/div[1]";
    public static String butS2 ="//div[@id='gt-sl-sugg']/div[2]";
    public static String butS3 ="//div[@id='gt-sl-sugg']/div[3]";
    public static String butT1 ="//div[@id='gt-tl-sugg']/div[1]";
    public static String butT2 ="//div[@id='gt-tl-sugg']/div[2]";
    public static String butT3 ="//div[@id='gt-tl-sugg']/div[3]";
    public static String butChangeId="gt-swap";
    public static String butInspectL="//div[@id='gt-sl-sugg']/div[5]";
    public static String butSubmit="gt-submit";

    public static void Start() {
        System.setProperty("webdriver.chrome.driver", "//media//Data//Instal//Driver//chromedriver");
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--lang=en-us");
        WebDriver cw = new ChromeDriver(o);
        cw.get("https://translate.google.com.ua/");
        Driwer = cw;
    }

    public static void selectLanguageS(String id, String xpath) {
        Driwer.findElement(By.id(id)).click();
        Driwer.findElement(By.xpath(xpath)).click();
    }

    public static boolean isButonAvbyid(String idButton) {
        return Driwer.findElement(By.id(idButton)).isEnabled();
    }

    public static boolean isButonAvbyxpath(String idButton) {
        return Driwer.findElement(By.xpath(idButton)).isEnabled();
    }

    public static String getTword() throws InterruptedException {
        Thread.sleep(500L);
        if (Driwer.findElement(By.xpath("//span[@class='hps']")).isEnabled()) {
            return Driwer.findElement(By.xpath("//span[@class='hps']")).getText();
        } else {
            return "";
        }
    }

    public static void enterWord(String word) {
        Driwer.findElement(By.id("source")).sendKeys(word);
    }

    public static void ClickButtonbyID(String id) {
        Driwer.findElement(By.id(id)).click();
    }

    public static void ClickButtonbyXpath(String xpath) {
        Driwer.findElement(By.xpath(xpath)).click();
    }

    public static String getAriaPressed(String xpath) {
       return Driwer.findElement(By.xpath(xpath)).getAttribute("aria-pressed");
    }
    public static String getLangValue (String xpath) {
       return Driwer.findElement(By.xpath(xpath)).getAttribute("value");
    }
    public static String getActiveL(String but1, String but2, String but3) {
        String Language ="";
        if (getAriaPressed(but1).equals("true")) {
            Language = getLangValue(but1);
        } else if (getAriaPressed(but2).equals("true")) {
            Language=getLangValue(but2);
        } else if (getAriaPressed(but3).equals("true")) {
            Language=getLangValue(but3);
        }
        System.out.println(Language);
        return Language;
    }

    public static  String getInspectLang (){
        return Driwer.findElement(By.xpath(butInspectL)).getText();
    }
    public static String isSelectedClickedButton(String xpath) {
        ClickButtonbyXpath(xpath);
        return getAriaPressed(xpath);
    }


}

