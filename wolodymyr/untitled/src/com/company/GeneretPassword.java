package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.company.PassGenforTest.Systt;
import static com.company.PassGenforTest.w;

/**
 * Created by user on 8/1/14.
 */
public class GeneretPassword {

    public static void masterParol(String mparol){
        WebElement a = w.findElement(By.xpath("//input[@type='password']"));
        a.clear();
        a.sendKeys(mparol);

    }
    public static void site(String site){
        WebElement a = w.findElement(By.xpath("//input[@autocorrect='off']"));
        a.clear();
        a.sendKeys(site);

    }
    public static void gener (){
        WebElement Butt = w.findElement(By.xpath("//input[@value='Generate']"));
        Butt.click();
    }
    public static String getPas(){
        WebElement a = w.findElement(By.xpath("//input[@type='password']"));
        System.out.println(a.getAttribute("value"));
        return a.getAttribute("value");

    }
    public static String getSite(){
        WebElement a = w.findElement(By.xpath("//input[@autocorrect='off']"));
        System.out.println(a.getAttribute("value"));
        return a.getAttribute("value");

    }
    public static String getGenSite(){
        WebElement genPass  = w.findElement(By.xpath("//input[@name='password']"));
        String passw=genPass.getAttribute("value");
        return passw;

    }




}
