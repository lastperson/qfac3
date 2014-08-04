package com.company;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/30/14.
 */
public class passWordInput {
    public static boolean input(String mk, String site1,String site2) {
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava\\chromedriver_win32\\chromedriver.exe");
        WebDriver angelNet = new ChromeDriver();
        angelNet.get("http://angel.net/~nic/passwd.current.html");
        WebElement masterKey = angelNet.findElement(By.xpath("//input[@name='master']"));
        masterKey.sendKeys(mk);

        WebElement site01 = angelNet.findElement(By.xpath("//input[@name='site']"));
        site01.sendKeys(site1);
        WebElement submit1 = angelNet.findElement(By.xpath("//input[@type='submit']"));
        submit1.click();
        WebElement pass1 = angelNet.findElement(By.xpath("//input[@name='password']"));
        String password1 = pass1.getAttribute("value");
        site01.clear();


        WebElement site02 = angelNet.findElement(By.xpath("//input[@name='site']"));
        site02.sendKeys(site2);
        WebElement submit2 = angelNet.findElement(By.xpath("//input[@type='submit']"));
        submit1.click();
        WebElement pass2 = angelNet.findElement(By.xpath("//input[@name='password']"));
        String password2 = pass2.getAttribute("value");
        return (password1.equals(password2));
    }
    //public static boolean equal(String firstPW, String secondPW) {return (firstPW == secondPW);}
    public static WebDriver angelNet () {
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava\\chromedriver_win32\\chromedriver.exe");
        WebDriver angelNet = new ChromeDriver();
        angelNet.get("http://angel.net/~nic/passwd.current.html");
        return (angelNet);
    }
    public static void masterKey (String mk, WebDriver angelNet){
        WebElement masterKey = angelNet.findElement(By.xpath("//input[@name='master']"));
        masterKey.sendKeys(mk);
    }
    public static void siteName (String site, WebDriver angelNet) {
        WebElement siteName = angelNet.findElement(By.xpath("//input[@name='site']"));
        siteName.sendKeys(site);
    }
    public static void generate (WebDriver angelNet) {
        WebElement generate = angelNet.findElement(By.xpath("//input[@type='submit']"));
        generate.click();
    }
    public static String getMasterKey (WebDriver angelNet) {
        WebElement getMasterKey = angelNet.findElement(By.xpath("//input[@name='master']"));
        return (getMasterKey.getAttribute("value"));
    }
    public static String getSiteName (WebDriver angelNet) {
        WebElement getSiteName = angelNet.findElement(By.xpath("//input[@name='site']"));
        return (getSiteName.getAttribute("value"));
    }
    public static String getPassword (WebDriver angelNet) {
        WebElement getPassword = angelNet.findElement(By.xpath("//input[@name='password']"));
        System.out.print(getPassword.getAttribute("value"));
        return (getPassword.getAttribute("value"));
    }
}
