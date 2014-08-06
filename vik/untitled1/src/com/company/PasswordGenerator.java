package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 7/16/14.
 */
public class PasswordGenerator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\2AutomationCourseJava\\chromedriver_win32\\chromedriver.exe");
        /*WebDriver w=new ChromeDriver();
        w.get("http://angel.net/~nic/passwd.current.html");
        WebElement we1=w.findElement(By.name("master"));
        we1.sendKeys("abrakadabra");
        WebElement we2=w.findElement(By.name("site"));
        we2.sendKeys("facebook");

        WebElement we3=w.findElement(By.xpath("//input[@type='submit']"));
        we3.click();

        WebElement we4=w.findElement(By.name("password"));
        //Thread.sleep(3000);
        String password=we4.getAttribute("value");
        System.out.println(password);*/
        //w.quit();
       /* int i=0,j=0, k=1;
        String[] pwds=new String[]{"pwd1","pwd2","pwd3"};
        String[] sites=new String[]{"site1","site2","site3"};
        for (i=0;i<3;i++)   {
            WebElement pwd=w.findElement(By.name("master"));
            pwd.sendKeys(pwds[i]);
                for (j=0;j<3;j++){
                    WebElement site=w.findElement(By.name("site"));
                    site.sendKeys(sites[j]);
                    WebElement pressbut=w.findElement(By.xpath("//input[@type='submit']"));
                    we3.click();
                    WebElement newpassword=w.findElement(By.name("password"));
                    String passwords=newpassword.getAttribute("value");
                    System.out.println(passwords);

                    }
            pwd.clear();

            j=0;
        }*/
        WebDriver insh=new ChromeDriver();
        insh.get("http://strahovator.com.ua/");
        WebElement inshOsago=insh.findElement(By.xpath("//a[text()='ОСАГО']"));
        inshOsago.click();
        WebElement item=insh.findElement(By.xpath("//select[@name='ts_type']"));
        Select tsType= new Select(item);
        tsType.selectByVisibleText("прицеп");
        Select det= new Select(insh.findElement(By.xpath("//select[@name='ts_details_type']")));
        det.selectByVisibleText("для легкового автомобиля");
        Select reg= new Select(insh.findElement(By.xpath("//select[@name='ts_zone']")));
        reg.selectByVisibleText("Киев");
        Select crash= new Select(insh.findElement(By.xpath("//select[@name='no_crash_years_qty']")));
        crash.selectByVisibleText("3 года");
        Select period= new Select(insh.findElement(By.xpath("//select[@name='period']")));
        period.selectByVisibleText("1 год");
        Select dgo= new Select(insh.findElement(By.xpath("//select[@name='dgo']")));
        dgo.selectByVisibleText("нет");
        WebElement firstPrice=insh.findElement(By.xpath("//div[@id='osago_calc_result']//tbody/tr[1]//span[@class='price']"));
        String price=firstPrice.getText();
        System.out.println(price);
        WebElement getinsh=insh.findElement(By.xpath("//div[@id='osago_calc_result']//tbody/tr[1]//button"));
        getinsh.click();
        WebElement noReg=insh.findElement(By.xpath("//div[@class='content']//div[@class='row']/ul[1]/li[1]/a"));
        noReg.click();
        WebElement prime=insh.findElement(By.xpath("//a[@class='btn btn-success']"));
        prime.click();
        WebElement driverLicence=insh.findElement(By.xpath("//input[@id='policy_document_type_driver_licence']"));
        driverLicence.click();
        WebElement lastName=insh.findElement(By.xpath("//input[@id='policy_last_name']"));
        String lastNameUA=lastName.getAttribute("placeholder");
        System.out.println(lastNameUA);
        WebElement addressSity=insh.findElement(By.xpath("//input[@id='policy_registration_address_city']"));
        String adsressSityUA=addressSity.getAttribute("placeholder");
        System.out.println(adsressSityUA);
        WebElement addressApp=insh.findElement(By.xpath("//input[@id='policy_registration_address_app']"));
        String adsressAppUA=addressApp.getAttribute("placeholder");
        System.out.println(adsressAppUA);
        WebElement homePage=insh.findElement(By.xpath("//h1//img"));
        homePage.click();
        WebElement osago=insh.findElement(By.xpath("(//div[@class='service'])[1]/*/a[@class='underlined stronger']"));
        String osagoPrint=osago.getText();
        System.out.println(osagoPrint);

        WebElement greenCard=insh.findElement(By.xpath("(//div[@class='service'])[2]/*/a[@class='underlined stronger']"));
        String greenCardPrint=greenCard.getText();
        System.out.println(greenCardPrint);

        WebElement kasko=insh.findElement(By.xpath("(//div[@class='service'])[3]/*/a[@class='underlined stronger']"));
        String kaskoPrint=kasko.getText();
        System.out.println(kaskoPrint);

        WebElement medInsh=insh.findElement(By.xpath("(//div[@class='service'])[4]/*/a[@class='underlined stronger']"));
        String medInshPrint=medInsh.getText();
        System.out.println(medInshPrint);



        insh.quit();




    }
 }



        /*w.get("http://google.com");
        WebElement we1=w.findElement(By.name("q"));
        we1.sendKeys("QA Factory");
        WebElement we2=w.findElement(By.id("gbqfb"));
        we2.click();
        while (w.findElements(By.id("res")).size()<10) {}
        WebElement we3=w.findElement(By.id("res"));

        List<WebElement> l=we3.findElements(By.tagName("a"));
        int i;
        for(i=0;i<9;i=i+1){
        WebElement j=l.get(i);
        WebElement link=l.get(i);
        String address=j.getAttribute("href");
        System.out.println(address);
        i=i+1;}*/