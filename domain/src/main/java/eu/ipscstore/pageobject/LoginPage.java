package eu.ipscstore.pageobject;

import org.openqa.selenium.By;
import forall.core.BasePage;

import static eu.ipscstore.preset.PageObjectSupplier.$;


public class LoginPage extends BasePage {

    private By inputEmailAddress = By.id("email_create");
    private By buttonCreateAnAccount = By.id("SubmitCreate");

    public CreateAccountPage clickButtonCreateAnAccount(){
        click(buttonCreateAnAccount);
        return $(CreateAccountPage.class);
    }

    public LoginPage setEmailAddress(String emailAddress){
        setText(inputEmailAddress, emailAddress);
        return this;
    }
}