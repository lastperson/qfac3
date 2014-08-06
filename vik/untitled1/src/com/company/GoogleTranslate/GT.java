package com.company.GoogleTranslate;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vitaliy on 06.08.2014.
 */
public class GT {

    public static WebDriver gtLaunch () {
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava\\chromedriver_win32\\chromedriver.exe");
        WebDriver gt = new ChromeDriver();
        gt.get("http://translate.google.com");
        return (gt);
    }

    public static WebElement sourceTextXpath (WebDriver gt){
        return (gt.findElement(By.xpath("//textarea[@id='source']")));
    }
    public static WebElement resultTextXpath (WebDriver gt){
        return (gt.findElement(By.xpath("//span[@id='result_box']")));
    }
    public static WebElement language1Xpath (WebDriver gt){
        return (gt.findElement(By.xpath("//div[@id='gt-sl-sugg']/div[1]")));
    }
    public static WebElement language2Xpath (WebDriver gt){
        return (gt.findElement(By.xpath("//div[@id='gt-sl-sugg']/div[2]")));
    }
    public static WebElement language3Xpath (WebDriver gt){
        return (gt.findElement(By.xpath("//div[@id='gt-sl-sugg']/div[3]")));
    }
    public static WebElement languageDetectXpath (WebDriver gt){
        return (gt.findElement(By.xpath("//div[@id='gt-sl-sugg']/div[5]")));
    }
    public static WebElement language4Xpath (WebDriver gt){
        return (gt.findElement(By.xpath("//div[@id='gt-tl-sugg']/div[1]")));
    }
    public static WebElement language5Xpath (WebDriver gt){
        return (gt.findElement(By.xpath("//div[@id='gt-tl-sugg']/div[2]")));
    }
    public static WebElement language6Xpath (WebDriver gt){
        return (gt.findElement(By.xpath("//div[@id='gt-tl-sugg']/div[3]")));
    }


    public static void fillSourceText (String word, WebDriver gt) {
        WebElement wordToTranslate = GT.sourceTextXpath(gt);
        wordToTranslate.sendKeys(word);
    }
    public static String getSourceText (WebDriver gt) {
        WebElement wordToTranslate = GT.sourceTextXpath(gt);
        return wordToTranslate.getAttribute("value");
    }
    /*public static void masterKey (String mk, WebDriver angelNet){
        WebElement masterKey = passWordInput.mKeyXpath(angelNet);
        masterKey.sendKeys(mk);*/
    ////div[text()='Ukrainian']
}
