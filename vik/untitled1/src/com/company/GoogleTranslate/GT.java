package com.company.GoogleTranslate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vitaliy on 06.08.2014.
 */
 public class GT {
    public static WebDriver gtEmpty () {
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava\\chromedriver_win32\\chromedriver.exe");
        WebDriver gt = new ChromeDriver();
        return (gt);
    }
    public static WebDriver gtLaunch () {
        WebDriver gt=gtEmpty();
        gt.get("http://translate.google.com.ua");
        return (gt);
    }
    public static WebDriver urlUkEn () {
        WebDriver gt=gtEmpty();
        gt.get("http://translate.google.com.ua/#uk/en/");
        return (gt);
    }
    public static WebDriver urlEnUk () {
        WebDriver gt=gtEmpty();
        gt.get("http://translate.google.com.ua/#en/uk/");
        return (gt);
    }
    public static WebDriver urlPlCs () {
        WebDriver gt=gtEmpty();
        gt.get("http://translate.google.com.ua/#pl/cs/");
        return (gt);
    }
    public static WebDriver urlCsPl () {
        WebDriver gt=gtEmpty();
        gt.get("http://translate.google.com.ua/#cs/pl/");
        return (gt);
    }
    public static WebElement swapButton (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id='gt-swap']")));
    }

    public static WebElement languageSelect (WebDriver gt){
        return (gt.findElement(By.xpath("//div[@id='gt-sl-gms']/div[1]")));
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
    public static WebElement siteInputXpath (WebDriver gt) {
        return (gt.findElement(By.xpath("//input[@name='site']")));
    }
    public static void fillSourceText (String word, WebDriver gt) {
        WebElement wordToTranslate = GT.sourceTextXpath(gt);
        wordToTranslate.sendKeys(word);
    }
    public static String getSourceText (WebDriver gt) {
        WebElement wordToTranslate = GT.sourceTextXpath(gt);
        return wordToTranslate.getAttribute("value");
    }
    public static WebElement pressedSourceButton (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id='gt-sl-sugg']/div[@aria-pressed='true']")));
    }
    public static WebElement pressedTranslateButton (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id='gt-tl-sugg']/div[@aria-pressed='true']")));
    }
    public static WebElement sourceLangChoice (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id='gt-sl-gms']")));
    }
    public static WebElement transLangChoice (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id='gt-tl-gms']")));
    }
    public static WebElement sourceLangUa (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id=':1z']/div[text()='украинский']")));
    }
    public static WebElement sourceLangEn (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id=':7']/div[text()='английский']")));
    }
    public static WebElement sourceLangPl (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id=':1k']/div[text()='польский']")));
    }
    public static WebElement sourceLangCs (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id=':27']/div[text()='чешский']")));
    }
    public static WebElement transLangUa (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id=':49']/div[text()='украинский']")));
    }
    public static WebElement transLangEn (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id=':2g']/div[text()='английский']")));
    }
    public static WebElement transLangPl (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id=':3u']/div[text()='польский']")));
    }
    public static WebElement transLangCs (WebDriver gt) {
        return (gt.findElement(By.xpath("//div[@id=':4h']/div[text()='чешский']")));
    }
 }