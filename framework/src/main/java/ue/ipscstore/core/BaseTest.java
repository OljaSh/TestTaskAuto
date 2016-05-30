package ue.ipscstore.core;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import ue.ipscstore.utils.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ue.ipscstore.utils.Browser;
import ue.ipscstore.utils.WebDriverUtils;

import java.util.concurrent.TimeUnit;

import static ue.ipscstore.utils.PropertiesUtils.getLongValue;


public class BaseTest {

    private static final ThreadLocal<WebDriver> WEB_DRIVER_CONTAINER = new  ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return WEB_DRIVER_CONTAINER.get();
    }

    @BeforeClass
    //@Parameters({"browser"})
    public void setUp(ITestContext context) {
        String browser = context.getCurrentXmlTest().getAllParameters().get("browser");
        WebDriver driver;

        switch (Browser.getBrowser(browser/*System.getProperty("browser", "firefox")*/)) {
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

    @AfterClass
    public void tearDown(){
        if (getDriver() != null){
            getDriver().quit();
            WEB_DRIVER_CONTAINER.remove();
        }
    }
}
