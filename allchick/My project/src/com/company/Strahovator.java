package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 7/16/14.
 */
public class Strahovator {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://strahovator.com.ua/");
        while (webDriver.findElements(By.xpath("//a[text()='ОСАГО']")).size() == 0);

        webDriver.findElement(By.xpath("//a[text()='ОСАГО']")).click();
        while (webDriver.findElements(By.xpath("//ul[@id='osago_calc']")).size() == 0);

        Select tsType = new Select(webDriver.findElement(By.xpath("//select[@id='ts_type']")));
        tsType.selectByVisibleText("легковой автомобиль");

        Select tsDetailsType = new Select(webDriver.findElement(By.xpath("//select[@id='ts_details_type']")));
        tsDetailsType.selectByVisibleText("объем двигателя от 1601 до 2000 см³");

        Select tsZone = new Select(webDriver.findElement(By.xpath("//select[@id='ts_zone']")));
        tsZone.selectByVisibleText("Борисполь");

        Select noCrashYearsQty = new Select(webDriver.findElement(By.xpath("no_crash_years_qty")));
        noCrashYearsQty.selectByVisibleText("6 лет и более");

        Select period = new Select(webDriver.findElement(By.xpath("period")));
        period.selectByVisibleText("8 месяцев");

        Select dgo = new Select(webDriver.findElement(By.xpath("dgo")));
        dgo.selectByVisibleText("нет");

        //webDriver.quit();

    }
}
