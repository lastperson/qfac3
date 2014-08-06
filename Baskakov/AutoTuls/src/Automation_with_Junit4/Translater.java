package Automation_with_Junit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 8/6/14.
 */
@RunWith(JUnit4.class)
public class Translater extends  Bas{

    public  static WebElement english_left (){
        WebElement button_english_left = driver.findElement(By.xpath("//*[@id=\"gt-sl-sugg\"]/div[1]"));
        button_english_left.click();
        return button_english_left;
    }
    public  static WebElement russion_left (){
        WebElement button_russion_left = driver.findElement(By.xpath("//*[@id=\"gt-sl-sugg\"]/div[2]"));
        button_russion_left.click();
        return button_russion_left;
    }
    public  static WebElement ukrainian_left (){
        WebElement button_ukrainian_left = driver.findElement(By.xpath("//*[@id=\"gt-sl-sugg\"]/div[2]"));
        return button_ukrainian_left;
    }
    public  static WebElement selectLanguage_left (){
        WebElement button_selectLanguage_left = driver.findElement(By.xpath("//*[@id=\"gt-sl-sugg\"]/div[4]"));
        return button_selectLanguage_left;
    }


    public  static WebElement english_right (){
        WebElement button_english_right = driver.findElement(By.xpath("//*[@id=\"gt-tl-sugg\"]/div[2]"));
        button_english_right.click();
        return button_english_right;
    }
    public  static WebElement russion_right(){
        WebElement button_russion_right = driver.findElement(By.xpath("//*[@id=\"gt-tl-sugg\"]/div[1]"));
        button_russion_right.click();
        return button_russion_right;
    }
    public  static WebElement ukrainian_right (){
        WebElement button_ukrainian_right = driver.findElement(By.xpath("//*[@id=\"gt-tl-sugg\"]/div[1]"));
        return button_ukrainian_right;
    }
public static WebElement button_translate(){
    WebElement button_translate = driver.findElement(By.xpath("//*[@id=\"gt-submit\"]"));
    return button_translate;
}
    public static void empty_left_field(String a){
        WebElement left_field_fro_letters = driver.findElement(By.xpath("//*[@id='source']"));
        left_field_fro_letters.clear();
        left_field_fro_letters.click();
        left_field_fro_letters.sendKeys(a);
    }
    public static WebElement right_field_for_traslate_words(){
        WebElement right_field_for_traslate_words = driver.findElement(By.xpath("//*[@id=\"result_box\"]"));
        right_field_for_traslate_words.click();
        return right_field_for_traslate_words;
    }

    //Polskiy  --   //table/tbody/tr/td[5]/div/div[11]/div


@Test
public void test_1(){
    WebElement button_english_left = english_left();
    Assert.assertEquals(true,button_english_left.isEnabled());

    WebElement button_russion_left = russion_left();
    Assert.assertEquals(true,button_russion_left.isEnabled());

    WebElement button_ukrainian_left = ukrainian_left();
    Assert.assertEquals(true,button_ukrainian_left.isEnabled());

    WebElement button_selectLanguage_left = selectLanguage_left();
    Assert.assertEquals(true,button_selectLanguage_left.isEnabled());



    WebElement button_english_right = english_right();
    Assert.assertEquals(true,button_english_right.isEnabled());

    WebElement button_russion_right = russion_right();
    Assert.assertEquals(true,button_russion_right.isEnabled());

    WebElement button_ukrainian_right = ukrainian_right();
    Assert.assertEquals(true,button_ukrainian_right.isEnabled());

    WebElement button_translate = button_translate();
    Assert.assertEquals(true,button_translate.isEnabled());

}








    }