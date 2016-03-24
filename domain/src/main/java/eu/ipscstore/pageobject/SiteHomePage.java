package eu.ipscstore.pageobject;

import forall.core.BasePage;
import org.openqa.selenium.By;

import static eu.ipscstore.preset.PageObjectSupplier.$;

/**
 * Created by oljashabanova on 18/03/16.
 */
public class SiteHomePage extends BasePage {

    //private By buttonCreateAnAccount = By.className("header_link_createanaccount");
    private By buttonLogin = By.className("login");

    /*public LoginPage clickCreateAnAccountButton(){
        click(buttonCreateAnAccount);
        return new LoginPage();
    }*/

    public LoginPage clickLoginButton(){
        click(buttonLogin);
        return $(LoginPage.class);
    }

}
