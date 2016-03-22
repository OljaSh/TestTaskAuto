package eu.ipscstore.pageobject;

import forall.core.BasePage;
import org.openqa.selenium.By;

/**
 * Created by oljashabanova on 21/03/16.
 */
public class ShoppingCartPage extends BasePage {

    private By textWarning = By.className("warning");

    public String  getWarningMessage(){
        return getText(textWarning);
    }


}
