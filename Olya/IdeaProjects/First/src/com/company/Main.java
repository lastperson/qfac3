package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {

       /* int a;
        a = 10;
        System.out.println(a);

        System.out.println(a + 20);

        float m;
        m = 10.5f;
        System.out.println(m);

        float c;
        c = a * m;

        System.out.println(c);

        String s;
        s = "web driver";
        System.out.println(s);

        String ss;
        ss = s + s;
        System.out.println(ss);


        int q;
        q = 10;
        q--;
        System.out.println(q); */

        /*int a;
        int b;

        a = 6;
        b = 3;*/

       /* if (a < b) {
        System.out.print(a + "<" + b);
        }

        else {
        System.out.print(a + ">=" + b);

        }*/


       /* String s;
        s = "abc";

        if (s == "a") {

        System.out.print(s);

        }

        else if (s == "b") {
        System.out.print(s);

        }
        else if (s == "c") {
            System.out.print(s);

        }

        else if (s == "abc") {
            System.out.print(s);

        }*/

       /* int d;
        d = 1;

        switch (d) {
            case 1:
                System.out.print("Hello");
                break;

            case 2:
                System.out.print("World");
                break;

            default:
                System.out.print("def");
                break;
        }*/

        /*int a;
        a = 26;

        while (a != -1) {
            System.out.println(a);
            a--;
        }*/

       /* int a;
        a = 0;

        while (a < 1000) {


            if (a%3 == 0) {
                System.out.println(a);

            }
            a++;
          }

        //вывести все значения массива*/

        System.setProperty("webdriver.chrome.driver", "E:\\Course\\2AutomationCourseJava\\chromedriver.exe");

        WebDriver w = new ChromeDriver();
       // w.quit();
        w.get("http://google.com");
       WebElement e = w.findElement(By.name("q"));
        e.sendKeys("QA factory");

        WebElement r = w.findElement(By.name("btnG"));
         r.click();

        while (w.findElements (By.id("rso")).size() == 0);

        WebElement t = w.findElement(By.id("rso"));

        List<WebElement> l = t.findElements(By.tagName("a"));

        WebElement link1 = l.get(0);
        String address = link1.getAttribute("href");
        //System.out.println(address);

        String a;
        a = "ok";

        if ( address.equals("http://qafactory.com.ua/"))  {
            System.out.println(a);

        }

        for (address = 0; address < 10; address++ );
        






















    }





}
