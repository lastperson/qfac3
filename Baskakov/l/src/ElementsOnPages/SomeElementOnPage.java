package ElementsOnPages;

import FrameClasses.BaseFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Baskakov on 10.08.2014.
 */
public class SomeElementOnPage extends BaseFrame{

    public static WebElement ButtonSignUp(){
      return driver.findElement(By.xpath("//*[@id=\"anonymPageContent\"]/div[2]/div[1]/a"));

    }

    public static List<WebElement> ButtonSignUps(){
        return driver.findElements(By.xpath("//*[@id=\"anonymPageContent\"]/div[2]/div[1]/a"));
    }

    public static WebElement FirstName(){
        return driver.findElement(By.xpath("//*[@id=\"field_name\"]"));
    }
    public static WebElement LastName(){
        return driver.findElement(By.xpath("//*[@id=\"field_surname\"]"));
    }

    public static WebElement DateOfBirth_day(){
        return driver.findElement(By.xpath("//*[@id=\"field_bday\"]"));
    }

    public static List<WebElement> DateOfBirth_day_5(){
        return driver.findElements(By.xpath("//*[@id=\"field_bday\"]/option[4]"));
    }

    public static WebElement DateOfBirth_month(){
        return driver.findElement(By.xpath("//*[@id=\"field_bmonth\"]"));
    }

    public static List<WebElement> DateOfBirth_month_January(){
        return driver.findElements(By.xpath("//*[@id=\"field_bday\"]/option[4]"));
    }

    public static WebElement DateOfBirth_year(){
        return driver.findElement(By.xpath("//*[@id=\"field_byear\"]"));
    }

    public static List<WebElement> DateOfBirth_year_1990(){
        return driver.findElements(By.xpath("//*[@id=\"field_byear\"]/option[20]"));
    }

    public static WebElement City(){
        return driver.findElement(By.xpath("//*[@id=\"field_rcity\"]"));
    }

    public static WebElement EmailOrUserName(){
        return driver.findElement(By.xpath("//*[@id=\"field_emlgn\"]"));
    }

    public static WebElement NewPassword(){
        return driver.findElement(By.xpath("//*[@id=\"field_pwdshwn\"]"));
    }

    public static WebElement SignUp_Button(){
        return driver.findElement(By.xpath("//*[@id=\"hook_FormButton_button_continue\"]"));
                                           ////*[@id="hook_FormButton_button_continue"]
    }
}
