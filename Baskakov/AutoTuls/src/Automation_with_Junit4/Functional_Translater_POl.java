package Automation_with_Junit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Automation_with_Junit4.Translater.empty_left_field;
import static Automation_with_Junit4.Translater.selectLanguage_left;

/**
 * Created by user on 8/8/14.
 */
@RunWith(JUnit4.class)
public class Functional_Translater_POl extends Bas{

public static List<WebElement> carriba(){
    return driver.findElements(By.xpath("jhgsj"));
}
    public static WebElement Chesh(){
        WebElement cheskiy = driver.findElement(By.xpath("//*[text()='чешский']"));
        cheskiy.click();
        return cheskiy;
    }
    public static void WhileWaiter1(int a, int b, int c) throws InterruptedException {
        Thread.sleep(a);
        if (b < c) {
            Assert.fail();
        }

    }
    @Test
    public void test_03() throws InterruptedException {
        //while (carriba().size()==0){
        //        }
        int a=0;
        while (driver.findElements(By.xpath("//*[@id='gt-sl-gms']")).size()==0){
        a++;
            WhileWaiter1(1000, 5, a);
        }
        a=0;
        selectLanguage_left ();
        while (driver.findElements(By.xpath("//*[text()='чешский']")).size()==0){
            a++;
            WhileWaiter1(1000,5,a);
        }
        Chesh();

        empty_left_field("Привет");

    }




}
