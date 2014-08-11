package Tests;

import FrameClasses.BaseFrame;
import Helper.RandomedValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;

import static ElementsOnPages.SomeElementOnPage.*;


/**
 * Created by Baskakov on 10.08.2014.
 */
@RunWith(JUnit4.class)
public class odnoklasniki extends BaseFrame {
    @Test
    public void Test01() throws InterruptedException, StaleElementReferenceException, ElementNotVisibleException {
        int a=6333546;
        while (a < a+20) {
            while (ButtonSignUps().size() == 0) {

            }

            WebElement SignUp = ButtonSignUp();
            SignUp.click();

            WebElement FirstName = FirstName();
            FirstName.clear();
            FirstName.click();
            FirstName.sendKeys(RandomedValue.AA("Name"));

            WebElement LastName = LastName();
            LastName.clear();
            LastName.click();
            LastName.sendKeys(RandomedValue.AA("Name"));

            WebElement DateOfBirth_day = DateOfBirth_day();
            DateOfBirth_day.click();


            while (DateOfBirth_day_5().size() == 0) {

            }
            WebElement select_5 = driver.findElement(By.xpath("//*[@id=\"field_bday\"]/option[4]"));
            select_5.click();

            WebElement DateOfBirth_month = DateOfBirth_month();
            DateOfBirth_month.click();


            while (DateOfBirth_month_January().size() == 0) {

            }
            WebElement select_january = driver.findElement(By.xpath("//*[@id=\"field_bmonth\"]/option[2]"));
            select_january.click();

            WebElement DateOfBirth_year = DateOfBirth_year();
            DateOfBirth_year.click();


            while (DateOfBirth_year_1990().size() == 0) {

            }
            WebElement select_1990 = driver.findElement(By.xpath("//*[@id=\"field_byear\"]/option[20]"));
            select_1990.click();

            WebElement City = City();
            City.clear();
            City.click();
            City.sendKeys("Odessa");
            Thread.sleep(1000);
            City.sendKeys(Keys.TAB);


            WebElement EmailOrUserName = EmailOrUserName();
            EmailOrUserName.clear();
            EmailOrUserName.clear();
            EmailOrUserName.sendKeys(RandomedValue.AA("Name") + a);
            System.out.println(" "+EmailOrUserName().getAttribute("value"));
            Thread.sleep(2000);

            WebElement NewPassword = NewPassword();
            NewPassword.clear();
            NewPassword.click();
            NewPassword.sendKeys(RandomedValue.AA("Password")+a);
            System.out.println(" "+NewPassword().getAttribute("value"));
            Thread.sleep(2000);

            WebElement SighnUp_Button = SignUp_Button();
            SighnUp_Button.click();
            Thread.sleep(2000);

            if(driver.findElements(By.xpath("//*[@id=\"field_emlgnPromptErr\"]")).size()!=0){
                EmailOrUserName().clear();
                EmailOrUserName().click();
                EmailOrUserName().sendKeys("Donotlaytome"+a+RandomedValue.AA("Name"));
                System.out.println(driver.findElement(By.xpath("//*[@id=\"field_emlgnPromptErr\"]")).getText());

                while (driver.findElements(By.xpath("//*[@id=\"hook_FormButton_button_continue\"]")).size()==0){

                }
                SignUp_Button().click();
            }





            while (driver.findElements(By.xpath("//*[@id=\"portal-headline_login\"]/a[2]")).size()==0 || driver.findElement(By.xpath("//*[@id=\"portal-headline_login\"]/a[2]")).isDisplayed()==false){

            }
            WebElement logout = driver.findElement(By.xpath("//*[@id=\"portal-headline_login\"]/a[2]"));
            logout.click();

            while (driver.findElements(By.xpath("//*[@id=\"hook_FormButton_button_logoff\"]")).size()==0 ||
                    driver.findElement(By.xpath("//*[@id=\"hook_FormButton_button_logoff\"]")).isDisplayed()==false){
System.out.println("No one element , try again");
            }
            System.out.println("I see the element logout");


            WebElement out = driver.findElement(By.xpath("//*[@id=\"hook_FormButton_button_logoff\"]"));

            out.click();
            a++;
            System.out.println(a);
//            System.out.println(" "+EmailOrUserName.getText()+" "+NewPassword.getText());


        }

    }
}
