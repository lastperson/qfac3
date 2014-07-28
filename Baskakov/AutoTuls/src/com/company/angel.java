package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * Created by user on 7/16/14.
 */
public class angel {

    public static void main(String[] args) throws IOException, UnsupportedFlavorException {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "D:\\Baskakov_Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String[] pwds = new String[5];
        int y=0;
        while (pwds.length>y){
            pwds[y]=""+(y+1);
            y=y+1;
        }
        String[] sites = new String[5];
        int u=0;
        while (sites.length>u){
            sites[u]=""+(u+1);
            u=u+1;
        }
        driver.get("http://angel.net/~nic/passwd.current.html");

        int a=0;
        int b=0;
        while (true) {
            WebElement YMP = driver.findElement(By.xpath("//input[@name='master' and @type='password']"));
            YMP.click();
            YMP.sendKeys(pwds[a]);

            WebElement SN = driver.findElement(By.xpath("//input[@name='site' and @autocorrect='off']"));
            SN.click();
            SN.sendKeys(sites[b]);

            WebElement Generate = driver.findElement(By.xpath("//input[@type='submit' and @value='Generate']"));
            Generate.click();


            WebElement GP = driver.findElement(By.name("password"));
            GP.click();


            GP.getText();
            System.out.println(GP.getAttribute("value"));

            YMP.clear();
            SN.clear();


            a=a+1;
            b=b+1;
            if (pwds.length==a && pwds.length==b){

                break;
            }

             /*GP.sendKeys(Keys.chord(Keys.CONTROL + "A"));
        GP.sendKeys(Keys.chord(Keys.CONTROL + "C"));
        String GP = (String) Toolkit.getDefaultToolkit().getSystemClipboard()
                .getData(DataFlavor.stringFlavor);

        System.out.println(GP);*/




        }
        driver.quit();

    }




}
