package forall.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static forall.utils.Browser.getBrowser;

/**
 * Created by oljashabanova on 18/03/16.
 */
public class BaseTest {

    private static final ThreadLocal<WebDriver> WEB_DRIVER_CONTAINER = new  ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return WEB_DRIVER_CONTAINER.get();
    }



    @BeforeClass
    public void setUp() {
        WebDriver driver;

        switch (getBrowser(System.getProperty("browser", "firefox"))) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/Users/oljashabanova/_dev/_AutomationPractice/browser_driver/macchromedriver"); // read path from resources
                driver = new ChromeDriver();
                break;
            case FIREFOX:
            default:
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
