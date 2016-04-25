package ue.ipscstore.core;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.AfterMethod;
import ru.yandex.qatools.allure.annotations.Attachment;
import ue.ipscstore.utils.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ue.ipscstore.utils.Browser;
import ue.ipscstore.utils.WebDriverUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static ue.ipscstore.utils.PropertiesUtils.getLongValue;


public class BaseTest {

    private static final ThreadLocal<WebDriver> WEB_DRIVER_CONTAINER = new  ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return WEB_DRIVER_CONTAINER.get();
    }

    private static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());

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

        driver.manage().timeouts().implicitlyWait(getLongValue(PropertiesUtils.Constants.WAIT_TIME_SEC), TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WEB_DRIVER_CONTAINER.set(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void takeScreenshot() {
        LOGGER.info("Taking screenshot");
        try {
            WebDriver augmentedDriver = new Augmenter().augment(getDriver());
            saveScreenshot("Screenshot", ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BYTES));
        } catch (Exception ex) {
            LOGGER.severe("Unable to take screenshot: " + ex);
        }
    }

    @AfterClass
    public void tearDown(){
        if (getDriver() != null){
            getDriver().quit();
            WEB_DRIVER_CONTAINER.remove();
        }
    }

    @Attachment(value = "{0}", type = "image/png")
    public byte[] saveScreenshot(String name, byte[] screenShot) {
        return screenShot;
    }

}
