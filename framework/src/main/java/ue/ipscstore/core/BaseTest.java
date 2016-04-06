package ue.ipscstore.core;

import ue.ipscstore.utils.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ue.ipscstore.utils.Browser;
import ue.ipscstore.utils.WebDriverUtils;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    private static final ThreadLocal<WebDriver> WEB_DRIVER_CONTAINER = new  ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return WEB_DRIVER_CONTAINER.get();
    }



    @BeforeClass
    public void setUp() {
        WebDriver driver;

        switch (Browser.getBrowser(System.getProperty("browser", "firefox"))) {
            case CHROME:
                WebDriverUtils.setChromeDriverPath();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
            default:
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().timeouts().implicitlyWait((PropertiesUtils.getWaitTime()), TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WEB_DRIVER_CONTAINER.set(driver);
    }



    @AfterClass
    public void tearDown(){
        if (getDriver() != null){
            getDriver().quit();
            WEB_DRIVER_CONTAINER.remove();
        }
    }

}
