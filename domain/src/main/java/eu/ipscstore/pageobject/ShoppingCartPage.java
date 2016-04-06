package eu.ipscstore.pageobject;

import ue.ipscstore.core.BasePage;
import org.openqa.selenium.By;


public class ShoppingCartPage extends BasePage {

    private By textWarning = By.className("warning");

    public String  getWarningMessage(){
        return getText(textWarning);
    }
}
