package eu.ipscstore.pageobject;

import ru.yandex.qatools.allure.annotations.Step;
import ue.ipscstore.core.BasePage;
import org.openqa.selenium.By;

import static eu.ipscstore.preset.PageObjectSupplier.$;


public class SiteHomePage extends BasePage {

    private By buttonLogin = By.className("login");

    @Step("Click on login Button")
    public LoginPage clickLoginButton(){
        click(buttonLogin);
        return $(LoginPage.class);
    }

}
