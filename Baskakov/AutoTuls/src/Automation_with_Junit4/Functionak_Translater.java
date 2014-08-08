package Automation_with_Junit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebElement;

import static Automation_with_Junit4.Translater.*;

/**
 * Created by user on 8/6/14.
 */
@RunWith(JUnit4.class)
public class Functionak_Translater extends Bas {

    public void WhileWaiter(int a, int b, int c, String o) throws InterruptedException {
        Thread.sleep(a);
        if (b < c) {
            Assert.fail(o);
        }
    }

    public static void WhileWaiter1(int a, int b, int c) throws InterruptedException {
        Thread.sleep(a);
        if (b < c) {
            Assert.fail();
        }

    }

    @Test
    public void test_01() {

        WebElement select_english_language = english_left();

        WebElement clic_on_ridht_russion_button = russion_right();

        empty_left_field("Hello");


        while (right_field_for_traslate_words().getText().length() == 0) {

        }
        WebElement right_field_for_traslate_words = right_field_for_traslate_words();
        String first_word = "Привет";
        Assert.assertEquals(first_word, right_field_for_traslate_words.getText());

    }

    @Test
    public void test_02() throws InterruptedException {
        int y = 0;
        int x = 10;

        WebElement russsion_button_left = russion_left();

        WebElement english_button_right = english_right();

        empty_left_field("Привет");

        int i = 0;
        while (!right_field_for_traslate_words().getText().equals("Hi")) {

            i = i + 1;
            System.out.println(" " + i);
            WhileWaiter(2000, 20, i, "Expected Hi " + " Actual=>" + right_field_for_traslate_words().getText());

        }

        WebElement right_field_for_traslate_words = right_field_for_traslate_words();
        String Second_word = "Hi";
        Assert.assertEquals(Second_word, right_field_for_traslate_words.getText());

    }



}


