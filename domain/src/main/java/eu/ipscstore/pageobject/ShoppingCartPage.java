package eu.ipscstore.pageobject;

import ru.yandex.qatools.allure.annotations.Step;
import ue.ipscstore.core.BasePage;
import org.openqa.selenium.By;


public class ShoppingCartPage extends BasePage {

    private By textWarning = By.className("warning");

    @Step("Get warning message = {0}")
    public String  getWarningMessage(){
        return getText(textWarning);
    }
}
