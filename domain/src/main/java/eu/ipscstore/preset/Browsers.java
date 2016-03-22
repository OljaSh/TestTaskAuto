package eu.ipscstore.preset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by oljashabanova on 22/03/16.
 */
public enum Browsers {
    CHROME {
        public WebDriver create(){
            return new ChromeDriver();
        }
    },


    FIREFOX {
        public WebDriver create() {
            return new FirefoxDriver();
        }
    };

    public WebDriver create(){
        return null;
    }
}

