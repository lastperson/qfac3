package Tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

/**
 * Created by Baskakov on 10.08.2014.
 */
@RunWith(JUnit4.class)
public class Tests {

    @Test

            public  void Test_01() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baskakov\\Desktop\\AutomationLibreries\\ChromrDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://vk.com");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"quick_email\"]"));
        email.clear();
        email.click();
        email.sendKeys("baskakov_b@ukr.net");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"quick_pass\"]"));
        password.clear();
        password.clear();
        password.sendKeys("3w6aosPMbq");

        WebElement login_button = driver.findElement(By.xpath("//*[@id=\"quick_login_button\"]"));
        login_button.click();



    }
}
