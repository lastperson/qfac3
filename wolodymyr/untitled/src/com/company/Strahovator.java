package com.company;

import com.sun.naming.internal.FactoryEnumeration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 7/16/14.
 */
public class Strahovator {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://strahovator.com.ua/");
        WebElement link = w.findElement(By.xpath("//a[text()='ОСАГО']"));
        link.click();
        Select dropdown = new Select(w.findElement(By.xpath("//select[@name='ts_type']")));
        dropdown.selectByVisibleText("автобус");
        Select dropdown1=new Select(w.findElement(By.xpath("//select[@name='ts_details_type']")));
dropdown1.selectByValue("d1");
        Select drop2=new Select(w.findElement(By.xpath("//select[@name='ts_zone']")));
        drop2.selectByValue("6");
        Select drop3=new Select(w.findElement(By.xpath("//select[@name='no_crash_years_qty']")));
        drop3.selectByValue("4");
        Select drop4=new Select(w.findElement(By.xpath("//select[@name='no_crash_years_qty']")));
        drop4.selectByValue("5");
        Select drop5=new Select(w.findElement(By.xpath("//select[@id='period']")));
        drop5.selectByValue("11");
        Select drop6=new Select(w.findElement(By.xpath("//select[@name='dgo']")));
        drop6.selectByValue("100000");
        WebElement price = w.findElement(By.xpath("//tr[1]/td/span[@class='price']"));
        System.out.println(price.getText());
        WebElement submet = w.findElement(By.xpath("//tr[1]/td[3]/button[@type='submit']"));
        submet.click();
        WebElement withou= w.findElement(By.xpath("//li/a/strong"));
        withou.click();
        WebElement buy20=w.findElement(By.xpath("//div[3]/div/div[@class='span3']/div/div/a[contains(text(), '2')]"));
        buy20.click();
        WebElement LastName = w.findElement(By.xpath("//form/div/div[1]/div/input[1]"));
        System.out.println(LastName.getAttribute("placeholder"));
        WebElement FirstName = w.findElement(By.xpath("//form/div/div[1]/div/input[2]"));
        System.out.println(FirstName.getAttribute("placeholder"));

        WebElement radio = w.findElement(By.xpath("//div/label[2]/input"));
        radio.click();
        WebElement Home = w.findElement(By.xpath("//div/ul[count(li)='7']/li[1]/a"));
        Home.click();
        int n=1;

        for(n=1; n<5; n++){
            String path="//div/div["+n+"]/div/span/a";
        WebElement a1= w.findElement(By.xpath(path));
        System.out.println(a1.getText());}



        w.quit();

    }
}
