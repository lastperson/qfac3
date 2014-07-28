package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class PassGen {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\2AutomationCourseJava\\chromedriver.exe");

        WebDriver w = new ChromeDriver();

        String[] pwds = new String[] {"pwd1", "pwd2", "pwd3"};
        String[] sites = new String[] {"site1", "site2", "site3"};

        w.get("http://angel.net/~nic/passwd.current.html");

        // Заполняем первое поле
        // Заполняем второе поле
        // Во втором поле жмем ЭНТЕР
        // Забираем значение из 3-го поля и печатаем на экран

        Select dropdown = new Select(
                w.findElement(By.name("mySelect"))
            );
        dropdown.selectByVisibleText("прицеп");


        w.quit();
    }
}
