package eu.ipscstore.pageobject;

import forall.core.BasePage;
import org.openqa.selenium.By;

import static eu.ipscstore.preset.PageObjectSupplier.$;


public class SiteHomePage extends BasePage {

    private By buttonLogin = By.className("login");

    public LoginPage clickLoginButton(){
        click(buttonLogin);
        return $(LoginPage.class);
    }

}
