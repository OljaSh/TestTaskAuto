package forall.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by oljashabanova on 18/03/16.
 */
public class BaseTest {

    private static final ThreadLocal<WebDriver> DRIVER = new  ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return DRIVER.get();
    }


    //пока для отладки запускаем только Firefox
    @BeforeMethod
    public void setUP(){
        case
        DRIVER.set(new FirefoxDriver());
    }

    @AfterMethod
    public void tearDown(){
        if (getDriver() != null){
            getDriver().quit();
        }
    }

}
