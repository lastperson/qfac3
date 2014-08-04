package Automation_with_Junit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;

/**
 * Created by user on 7/30/14.
 */
@RunWith(JUnit4.class)
public class Second extends Bas{
    public  static void MasterPwd(String a) {
        WebElement YMP = driver.findElement(By.xpath("//input[@name='master' and @type='password']"));
        YMP.click();
        YMP.sendKeys(a);
    }
    public  static  void YMP_cleare_field_pwd (){
        WebElement YMP = driver.findElement(By.xpath("//input[@name='master' and @type='password']"));
        YMP.clear();
    }

    public static void Site(String y){
        WebElement SN = driver.findElement(By.xpath("//input[@name='site' and @autocorrect='off']"));
        SN.click();
        SN.sendKeys(y);
    }

    public static void Generate_button(){
        WebElement Generate = driver.findElement(By.xpath("//input[@type='submit' and @value='Generate']"));
        Generate.click();
    }

public static void gat_value_from_field(){
    WebElement GP = driver.findElement(By.name("password"));
    String b = "1FaA5RRdSC5U/@1a";
    GP.click();

    System.out.println(GP.getAttribute("value"));
    Assert.assertEquals(b, GP.getAttribute("value"));

    }

    public static void text_from_field_site(){
        WebElement SN = driver.findElement(By.xpath("//input[@name='site' and @autocorrect='off']"));
        System.out.println(SN.getAttribute("value"));

    }

    public static void data_from_field_master_pwd(){
        WebElement YMP = driver.findElement(By.xpath("//input[@name='master' and @type='password']"));
        System.out.println(YMP.getAttribute("value"));

    }

    public static WebElement element_master_pwd(){
        WebElement rte = driver.findElement(By.xpath("//input[@name='master' and @type='password']"));
        return rte;
    }

    public static WebElement element_master_site(){
        WebElement SN = driver.findElement(By.xpath("//input[@name='site' and @autocorrect='off']"));
        return SN;
    }

    public static WebElement element_button_generate(){
        WebElement Generate = driver.findElement(By.xpath("//input[@type='submit' and @value='Generate']"));
        return Generate;
    }
    public static WebElement element_master_paswd(){
        WebElement GP = driver.findElement(By.name("password"));
        return GP;
    }

    public static WebElement text_befor_field_password(){
        WebElement text_field_password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[1]"));
        return text_field_password;
    }

    public static WebElement text_befor_field_site(){
        WebElement text_field_site = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]"));
        return text_field_site;
    }
    public static WebElement text_befor_button_gen(){
        WebElement text_button_gen = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        return text_button_gen;
    }

    @Test
    public void test999() throws InterruptedException {
        WebElement Your_master_password = element_master_pwd();
        Your_master_password.sendKeys("400");

        WebElement Site = element_master_site();
        Site.sendKeys("500");

        String u=Site.getAttribute("value");
        String z = Your_master_password.getAttribute("value");

        WebElement Generate = element_button_generate();
        Generate.click();
        Thread.sleep(9000);

        Assert.assertEquals(u, Site.getAttribute("value"));
        Assert.assertEquals(z, Your_master_password.getAttribute("value"));
    }

    @Test
    public void test87356() {
        WebElement Your_master_password = element_master_pwd();
        Assert.assertEquals(true,Your_master_password.isEnabled());

        WebElement text_befor_field_password = text_befor_field_password();
        String a = "Your master password";
        Assert.assertEquals(a, text_befor_field_password.getText());

        WebElement Site = element_master_site();

        Assert.assertEquals(true, Site.isEnabled());

        WebElement text_site = text_befor_field_site();
        String b = "Site name";
        Assert.assertEquals(b,text_site.getText());

        WebElement Generate = element_button_generate();
        Assert.assertEquals(true, Generate.isEnabled());

        WebElement Master_pwd = element_master_paswd();
        Assert.assertEquals(true, Master_pwd.isEnabled());

        WebElement text_generate = text_befor_button_gen();
                String d = "Generate";
        Assert.assertEquals(d,text_generate.getAttribute("value"));
    }


    @Test
    public void test100(){
        WebElement pwd = element_master_pwd();
        pwd.clear();

        WebElement SN = element_master_site();
        SN.clear();

        WebElement gen = element_button_generate();
        gen.click();

        WebElement result = element_master_paswd();
        result.clear();


        MasterPwd("asd");
        Site("123");
        Generate_button();
      gat_value_from_field();

        text_from_field_site();
data_from_field_master_pwd();


    }

    @Test
    public  void test200(){

        WebElement Generate = driver.findElement(By.xpath("//input[@type='submit' and @value='Generate']"));
        Generate.click();


        WebElement GP = driver.findElement(By.name("password"));

        GP.click();
        String c = "BaefBs8/Z/cm2@1a";
        System.out.println(GP.getAttribute("value"));
        Assert.assertEquals(c, GP.getAttribute("value"));

    }

    @Test
    public void test300(){


        WebElement YMP = driver.findElement(By.xpath("//input[@name='master' and @type='password']"));
        YMP.click();
        YMP.sendKeys("!@#$^%$");

        WebElement SN = driver.findElement(By.xpath("//input[@name='site' and @autocorrect='off']"));
        SN.click();
        SN.sendKeys("^!%$@#$");

        WebElement Generate = driver.findElement(By.xpath("//input[@type='submit' and @value='Generate']"));
        Generate.click();

        WebElement GP = driver.findElement(By.name("password"));

        GP.click();
        String d = "EviLEKYZa0YIF@1a";
        String y = GP.getAttribute("value");
        System.out.println(" " +GP.getAttribute("value"));
        Assert.assertEquals(d,y);

    }
}
