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
        System.setProperty("webdriver.chrome.driver", "D:\\Baskakov_Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://strahovator.com.ua/");

        WebElement OSAGO = driver.findElement(By.xpath("//a[text()='ОСАГО']"));
        OSAGO.click();

        Select zastrahovat = new Select(driver.findElement(By.xpath("//select[@name='ts_type']")));
        zastrahovat.selectByVisibleText("легковой автомобиль");

        Select Details = new Select(driver.findElement(By.xpath("//select[@name='ts_details_type']")));
        Details.selectByValue("b1");

        Select Zareg = new Select(driver.findElement(By.xpath("//select[@name='ts_zone']")));
        Zareg.selectByVisibleText("Ясиноватая");

        Select Stag = new Select (driver.findElement(By.xpath("//select[@name='no_crash_years_qty']")));
        Stag.selectByVisibleText("2 года");

        Select Srok = new Select (driver.findElement(By.xpath("//select[@name='period']")));
        Srok.selectByVisibleText("10 месяцев");

        Select Dogovor = new Select (driver.findElement(By.xpath("//select[@name='dgo']")));
        Dogovor.selectByVisibleText("да, на 200 000 грн");

        WebElement pricee = driver.findElement(By.xpath("//tbody/tr[1]//span[@class='price'] "));
        pricee.getText();
        System.out.println("Price =>"+pricee.getText());

        WebElement buy = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/button[1][@class='btn btn-success osago_order' and text()='купить']"));
        buy.click();

        WebElement with_out_reg = driver.findElement(By.xpath("//div[@class='content']/div/div/ul/li/a/strong[text()='без регистрации']"));
        with_out_reg.click();

        WebElement by_20_grn = driver.findElement(By.xpath("//div[@class='service osago-service']/div/a[text()='Купить на 20 гривен дешевле']"));
        by_20_grn.click();

        WebElement last_name = driver.findElement(By.xpath("//div/input[@id='policy_last_name']"));

        System.out.println("Last name =>" + last_name.getAttribute("placeholder"));

        WebElement name = driver.findElement(By.xpath("//div/input[@id='policy_first_name']"));

        System.out.println("name=>"+name.getAttribute("placeholder"));

        WebElement theard_name = driver.findElement(By.xpath("//div/input[@id='policy_parent_name']"));
        System.out.println("Last name =>" + theard_name.getAttribute("placeholder"));

        WebElement radio_button_VD = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
        radio_button_VD.click();

        WebElement radio_button_passport = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
        radio_button_passport.click();

        WebElement glavnaya = driver.findElement(By.xpath("//a[text()='Главная']"));
        glavnaya.click();

        System.out.println("text osago=>"+doo(1, driver));

        System.out.println("text osago=>"+doo(2, driver));

        System.out.println("text osago=>"+doo(3, driver));

        System.out.println("text osago=>"+doo(4, driver));



       driver.quit();
    }

    public static String doo (int b,WebDriver driver ) {

            WebElement osago_text_link = driver.findElement(By.xpath("//div[@class='main-content']/../div[2]/div["+b+"]/div/span/a"));

            return osago_text_link.getText();

    }



}
