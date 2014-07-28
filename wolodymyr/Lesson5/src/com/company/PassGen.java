package com.company;

/**
 * Created by user on 7/16/14.
 */
public class PassGen {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava на Мамин ноутбук ASUS (192.168.9.88)\\chromedriver.exe");
        WebDriver w=new ChromeDriver();

        w.get("http://google.com");
        /* write your code here */
    }

}
