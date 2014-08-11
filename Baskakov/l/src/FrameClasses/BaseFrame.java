package FrameClasses;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Baskakov on 10.08.2014.
 */
public class BaseFrame {
           private static ChromeDriverService service;
        public static WebDriver driver;

        @BeforeClass
        public static void createAndStartService() throws IOException {
            service = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File("D:\\Baskakov_Automation\\chromedriver.exe"))
                    .usingPort(9515)
                    .usingAnyFreePort()
                    .build();
            service.start();
        }

     /*  @AfterClass
       public static void createAndStopService() {
            service.stop();
        }*/

        @Before
        public void createDriver() {
            driver = new ChromeDriver(service);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://www.odnoklassniki.ru/");
        }

      /* @After
       public void quitDriver() {

            driver.quit();
       }*/
    }
