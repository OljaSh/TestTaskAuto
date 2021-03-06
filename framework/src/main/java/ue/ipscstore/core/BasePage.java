package ue.ipscstore.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ue.ipscstore.utils.PropertiesUtils;

import static ue.ipscstore.utils.PropertiesUtils.getLongValue;


public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;


    public BasePage (){
        driver = BaseTest.getDriver();
        wait = new WebDriverWait(driver, getLongValue(PropertiesUtils.Constants.DEFAULT_TIMEOUT));
    }

    public WebElement findElement(By element){
        return driver.findElement(element);
    }

    public void setText(By element, String text){
        findElement(element).sendKeys(text);
    }

    public void click(By element){
        findElement(element).click();
    }

    public void clickAndWait(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public String getText(By element){
        return findElement(element).getText();
    }

    public void setRadioSelected(By element, String text){
        findElement(element).click();
    }

    public void selectFromDropDownList(By element, String text){
        new Select(findElement(element)).selectByVisibleText(text);
    }

    public void selectValueFromDropDownList(By element, String text){
        new Select(findElement(element)).selectByValue(text);
    }
}
