package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.security.auth.callback.LanguageCallback;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 8/4/14.
 */
public class GoogleTranslatePage {

    public static String[] CountriesForTranslate = {"Detect language", "Afrikaans", "Albanian", "Arabic", "Armenian", "Azerbaijani",
            "Basque", "Belarusian", "Bengali", "Bosnian", "Bulgarian", "Catalan", "Cebuano", "Chinese", "Croatian",
            "Czech", "Danish", "Dutch", "English", "Esperanto", "Estonian", "Filipino", "Finnish", "French", "Galician",
            "Georgian", "German", "Greek", "Gujarati", "Haitian Creole", "Hausa", "Hebrew", "Hindi", "Hmong", "Hungarian",
            "Icelandic", "Igbo", "Indonesian", "Irish", "Italian", "Japanese", "Javanese", "Kannada", "Khmer", "Korean",
            "Lao", "Latin", "Latvian", "Lithuanian", "Macedonian", "Malay", "Maltese", "Maori", "Marathi", "Mongolian",
            "Nepali", "Norwegian", "Persian", "Polish", "Portuguese", "Punjabi", "Romanian", "Russian", "Serbian",
            "Slovak", "Slovenian", "Somali", "Spanish", "Swahili", "Swedish", "Tamil", "Telugu", "Thai", "Turkish",
            "Ukrainian", "Urdu", "Vietnamese", "Welsh", "Yiddish", "Yoruba", "Zulu"};

    public static Map<String, String> LanguageAbbreviation = new HashMap<String, String>();
    static {
        LanguageAbbreviation.put("English", "en");
        LanguageAbbreviation.put("Ukrainian", "uk");
        LanguageAbbreviation.put("Czech", "cs");
        LanguageAbbreviation.put("Polish", "pl");
    }

    public static void OpenGoogleTranslatePage(){
        ChromeWebDriver.OpenSite("https://translate.google.com/");
        while (ChromeWebDriver.webDriver.findElements(By.id("source")).size() == 0);
    }

    public static void SwapLanguage(){
        ChromeWebDriver.webDriver.findElement(By.id("gt-swap")).click();
    }

    public static void TranslateText(){
        ChromeWebDriver.webDriver.findElement(By.id("gt-lang-submit")).click();
    }

    public static void ChooseLanguageForTranslation(String language){
        ChromeWebDriver.webDriver.findElement(By.id("gt-sl-gms")).click();
        String xpathForObject = "//div[@id='gt-sl-gms-menu']//div[contains(text(), '" + language + "')]";
        ChromeWebDriver.webDriver.findElement(By.xpath(xpathForObject)).click();
        CheckLanguageForTranslation(language);
    }

    public static void SetURLUsingLanguageForTranslation(String languageForTranslate, String languageNative){
        String languageForTranslateAbbr = LanguageAbbreviation.get(languageForTranslate);
        String languageNativeAbbr = LanguageAbbreviation.get(languageNative);
        ChromeWebDriver.OpenSite("https://translate.google.com/" + "#" + languageForTranslateAbbr + "/" + languageNativeAbbr);
        while (ChromeWebDriver.webDriver.findElements(By.id("source")).size() == 0);
        CheckLanguageForTranslation(languageForTranslate);
        CheckNativeLanguage(languageNative);
    }

    public static void CheckLanguageForTranslation(String language){
        String getActiveButtonText = ChromeWebDriver.webDriver.findElement(
                By.xpath("//div[@id = 'gt-sl-sugg']//div[contains(@class, 'jfk-button-checked')]")).getText();
        Assert.assertTrue(getActiveButtonText.contains(language));
    }

    public static void ChooseYourNativeLanguage(String language){
        ChromeWebDriver.webDriver.findElement(By.id("gt-tl-gms")).click();
        String xpathForObject = "//div[@id='gt-tl-gms-menu']//div[contains(text(), '" + language + "')]";
        ChromeWebDriver.webDriver.findElement(By.xpath(xpathForObject)).click();
        CheckNativeLanguage(language);
    }

    public static void CheckNativeLanguage(String language){
        String getActiveButtonText = ChromeWebDriver.webDriver.findElement(
                By.xpath("//div[@id = 'gt-lang-tgt']//div[contains(@class, 'jfk-button-checked')]")).getText();
        Assert.assertTrue(getActiveButtonText.contains(language));
    }

    public static void CheckUrlBeforeTranslation(String languageForTranslate, String languageNative){

        String languageForTranslateAbbr = LanguageAbbreviation.get(languageForTranslate);
        String languageNativeAbbr = LanguageAbbreviation.get(languageNative);
        String expectedUrl ="https://translate.google.com/#" + languageForTranslateAbbr + "/" + languageNativeAbbr + "/";
        Assert.assertTrue(ChromeWebDriver.webDriver.getCurrentUrl().contains(expectedUrl));
    }

    public static void enterTextForTranslation(String textForTranslation){
        ControlTextForTranslation().sendKeys(textForTranslation);
    }

    public static void checkTextForTranslation(String textForTranslation){
        Assert.assertEquals(textForTranslation, ControlTextForTranslation().getAttribute("value"));
    }

    public static void checkTranslatedText(String translatedText){
        Assert.assertEquals(translatedText, ActualTranslatedText());
    }

    private static WebElement ControlTextForTranslation(){
        WebElement controlTextForTranslation = ChromeWebDriver.webDriver.
                findElement(By.xpath("//textarea[@id = 'source']"));
        return controlTextForTranslation;
    }

    private static WebElement ControlTranslatedText(){
        while (ChromeWebDriver.webDriver.findElements(By.xpath("//span[@id = 'result_box']/span")).size() == 0);
        WebElement controlTranslatedText = ChromeWebDriver.webDriver.
                findElement(By.xpath("//span[@id = 'result_box']/span"));
        return controlTranslatedText;
    }

    private static String ActualTranslatedText(){
        while (ChromeWebDriver.webDriver.findElements(By.xpath("//span[@id = 'result_box']/span")).size() == 0);
        List<WebElement> controlTranslatedText = ChromeWebDriver.webDriver.
                findElement(By.xpath("//span[@id = 'result_box']")).findElements(By.tagName("span"));
        int textLength = controlTranslatedText.size();
        String actualTranslatedText = "";
        int spanCounter = 1;
        int brAllCounter = 0;
        int brCurrentCounter;
        do{
            boolean isNewLineExist = ChromeWebDriver.webDriver.
                    findElements(By.xpath("//span[@id = 'result_box']/span[" + spanCounter +"]/preceding-sibling::br")).size() != 0;
            if (isNewLineExist && spanCounter!=1){
                int quantityOfNewLine = ChromeWebDriver.webDriver.
                        findElements(By.xpath("//span[@id = 'result_box']/span[" + spanCounter +"]/preceding-sibling::br")).size();
                brCurrentCounter = quantityOfNewLine - brAllCounter;
                brAllCounter = quantityOfNewLine;
                for (int j= 0; j< brCurrentCounter; j++){
                    actualTranslatedText = actualTranslatedText + "\n";

                }
            }
            actualTranslatedText = actualTranslatedText + ChromeWebDriver.webDriver.
                    findElement(By.xpath("//span[@id = 'result_box']/span[" + spanCounter + "]")).getText() + " ";
            spanCounter++;
        }while (spanCounter <= textLength);

        return actualTranslatedText.trim();
    }

    public static void ExecuteSetLanguagesForTranslate(String languageForTranslate, String languageNative){
        GoogleTranslatePage.OpenGoogleTranslatePage();
        GoogleTranslatePage.ChooseLanguageForTranslation(languageForTranslate);
        GoogleTranslatePage.CheckLanguageForTranslation(languageForTranslate);
        GoogleTranslatePage.ChooseYourNativeLanguage(languageNative);
        GoogleTranslatePage.CheckNativeLanguage(languageNative);
        GoogleTranslatePage.CheckUrlBeforeTranslation(languageForTranslate, languageNative);
    }

    public static void ExecuteTranslationText(String textForTranslate) throws InterruptedException {
        GoogleTranslatePage.enterTextForTranslation(textForTranslate);
        GoogleTranslatePage.checkTextForTranslation(textForTranslate);
        GoogleTranslatePage.TranslateText();
        Thread.sleep(1000);
    }

    public static void CheckLanguagesForTranslation(){
        ChromeWebDriver.webDriver.findElement(By.id("gt-sl-gms")).click();
        int test = ChromeWebDriver.webDriver.findElements(By.xpath("//div[@class='goog-menuitem-checkbox']")).size();
        for (int i= 0; i!=test; i++){
            String xpathForObject = "//div[@id='gt-sl-gms-menu']//div[contains(text(), '" + GoogleTranslatePage.CountriesForTranslate[i] + "')]";
            ChromeWebDriver.webDriver.findElement(By.xpath(xpathForObject)).click();
        }
    }
}

