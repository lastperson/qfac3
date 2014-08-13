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

        /*System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
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

        Select noCrashYearsQty = new Select(webDriver.findElement(By.xpath("//select[@id = 'no_crash_years_qty']")));
        noCrashYearsQty.selectByVisibleText("6 лет и более");

        Select period = new Select(webDriver.findElement(By.xpath("//select[@id = 'period']")));
        period.selectByVisibleText("8 месяцев");

        Select dgo = new Select(webDriver.findElement(By.xpath("//select[@id = 'dgo']")));
        dgo.selectByVisibleText("нет");

        String firstPrice = webDriver.findElement(
                By.xpath("//table[@class='osago_result']/tbody/tr[1]/td[@class = 'center']/span[@class = 'price']"))
                .getText().trim();
        System.out.println(firstPrice);

        String secondPrice = webDriver.findElement(
                By.xpath("//table[@class='osago_result']/tbody/tr[2]/td[@class = 'center']/span[@class = 'price']"))
                .getText().trim();
        System.out.println(secondPrice);


        webDriver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/button[@type='submit']")).click();
        while (webDriver.findElements(By.id("main")).size() == 0);

        webDriver.findElement(By.xpath("//a/strong[contains(text(), 'без регистрации')]/..")).click();
        while (webDriver.findElements(By.xpath("//div[@class = 'service osago-service']")).size() == 0);

        webDriver.findElement(By.xpath("//a[@role = 'button' and contains(text(), 'Купить на 20 гривен дешевле')]")).click();
        while (webDriver.findElements(By.xpath("//div[@class = 'row-fluid']")).size() == 0);

        webDriver.findElement(By.xpath("//label [@class='radio']/input[not(@checked)]")).click();
        String placeholder1 = webDriver.findElement(By.xpath("//input [@id = 'policy_last_name']")).getAttribute("placeholder").toString();
        String placeholder2 = webDriver.findElement(By.xpath("//input [@id = 'policy_first_name']")).getAttribute("placeholder").toString();
        String placeholder3 = webDriver.findElement(By.xpath("//input [@id = 'policy_parent_name']")).getAttribute("placeholder").toString();

        System.out.println(placeholder1);
        System.out.println(placeholder2);
        System.out.println(placeholder3);

        webDriver.findElement(By.xpath("//a[contains(text(), 'Главная')]")).click();
        while (webDriver.findElements(By.xpath("//div[@class = 'content']")).size() == 0);*/

        /*String text1 = webDriver.findElement(By.xpath("//i[@class= 'icon-file-text']/../a")).getText().toString();
        String text2 = webDriver.findElement(By.xpath("//i[@class= 'icon-leaf']/../a")).getText().toString();
        String text3 = webDriver.findElement(By.xpath("//i[@class= 'icon-shield']/../a")).getText().toString();
        String text4 = webDriver.findElement(By.xpath("//i[@class= 'icon-globe']/../a")).getText().toString();
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);*/
        ChromeWebDriver.OpenSite("https://translate.google.com/");
        while (ChromeWebDriver.webDriver.findElements(By.id("source")).size() == 0);
        ChromeWebDriver.webDriver.findElement(By.id("gt-sl-gms")).click();
        int test = ChromeWebDriver.webDriver.findElements(By.xpath("//div[@class='goog-menuitem-checkbox']")).size();
        for (int i=0; i!=test; i++){
            WebElement test2 = ChromeWebDriver.webDriver.findElements(By.xpath("//div[@class='goog-menuitem-checkbox']/..")).get(i);
            String test3 = test2.getText();
            System.out.print("\"" + test3 + "\"" + "," + " ");
        }


        ChromeWebDriver.webDriver.quit();
    }

    public static String returnValue(int value){

        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://strahovator.com.ua/");
        while (webDriver.findElements(By.xpath("//a[text()='ОСАГО']")).size() == 0);

        String valueForReturn;

        switch (value){
            case 1:
                valueForReturn = webDriver.findElement(By.xpath("//i[@class= 'icon-file-text']/../a")).getText().toString();
                break;
            case 2:
                valueForReturn = webDriver.findElement(By.xpath("//i[@class= 'icon-leaf']/../a")).getText().toString();
                break;
            case 3:
                valueForReturn = webDriver.findElement(By.xpath("//i[@class= 'icon-shield']/../a")).getText().toString();
                break;
            case 4:
                valueForReturn = webDriver.findElement(By.xpath("//i[@class= 'icon-globe']/../a")).getText().toString();
                break;
            default:
                valueForReturn = "Incorrect input value";
                break;
        }

        return valueForReturn;
    }
}
