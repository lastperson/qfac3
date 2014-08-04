package com.company;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 7/30/14.
 */
public class passWordInput {
    public static WebDriver angelNet () {
        System.setProperty("webdriver.chrome.driver", "D:\\2AutomationCourseJava\\chromedriver_win32\\chromedriver.exe");
        WebDriver angelNet = new ChromeDriver();
        angelNet.get("http://angel.net/~nic/passwd.current.html");
        return (angelNet);
    }
    public static WebElement mKeyXpath (WebDriver angelNet){
        return (angelNet.findElement(By.xpath("//input[@name='master']")));
    }

    public static WebElement siteInputXpath (WebDriver angelNet) {
        return (angelNet.findElement(By.xpath("//input[@name='site']")));
    }

    public static WebElement submitXpath (WebDriver angelNet) {
        return (angelNet.findElement(By.xpath("//input[@type='submit']")));
    }

    public static WebElement passWordXpath (WebDriver angelNet) {
        return (angelNet.findElement(By.xpath("//input[@name='password']")));
    }

    public static WebElement mKeyTextXpath (WebDriver angelNet) {
        return (angelNet.findElement(By.xpath("//input[@name='master']//../../td[1]")));
    }

    public static WebElement siteNameTextXpath (WebDriver angelNet) {
        return (angelNet.findElement(By.xpath("//input[@name='site']/../../td[1]")));
    }

    public static WebElement passWordTextXpath (WebDriver angelNet) {
        return (angelNet.findElement(By.xpath("//input[@name='password']/../../td[1]")));
    }
    public static boolean input(String mk, String site1,String site2, WebDriver angelNet) {
        WebElement masterKey = passWordInput.mKeyXpath(angelNet);
        masterKey.sendKeys(mk);

        WebElement site01 = passWordInput.siteInputXpath(angelNet);
        site01.sendKeys(site1);

        WebElement submit1 = passWordInput.submitXpath(angelNet);
        submit1.click();

        WebElement pass1 = passWordInput.passWordXpath(angelNet);
        String password1 = pass1.getAttribute("value");
        site01.clear();

        WebElement site02 = passWordInput.siteInputXpath(angelNet);
        site02.sendKeys(site2);

        WebElement submit2 = passWordInput.submitXpath(angelNet);
        submit2.click();
        WebElement pass2 = passWordInput.passWordXpath(angelNet);
        String password2 = pass2.getAttribute("value");
        return (password1.equals(password2));
    }
    //public static boolean equal(String firstPW, String secondPW) {return (firstPW == secondPW);}

    public static void masterKey (String mk, WebDriver angelNet){
        WebElement masterKey = passWordInput.mKeyXpath(angelNet);
        masterKey.sendKeys(mk);
    }
    public static void siteName (String site, WebDriver angelNet) {
        WebElement siteName = passWordInput.siteInputXpath(angelNet);
        siteName.sendKeys(site);
    }
    public static void generate (WebDriver angelNet) {
        WebElement generate = passWordInput.submitXpath(angelNet);
        generate.click();
    }
    public static String getMasterKey (WebDriver angelNet) {
        WebElement getMasterKey = passWordInput.mKeyXpath(angelNet);
        return (getMasterKey.getAttribute("value"));
    }
    public static String getSiteName (WebDriver angelNet) {
        WebElement getSiteName = passWordInput.siteInputXpath(angelNet);
        return (getSiteName.getAttribute("value"));
    }
    public static String getPassword (WebDriver angelNet) {
        WebElement getPassword = passWordInput.passWordXpath(angelNet);
        System.out.print(getPassword.getAttribute("value"));
        return (getPassword.getAttribute("value"));
    }
    public static void close(WebDriver angelNet){
        angelNet.quit();
    }
}
