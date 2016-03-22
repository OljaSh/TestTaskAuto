package eu.ipscstore.pageobject;

import org.openqa.selenium.By;
import forall.core.BasePage;


public class LoginPage extends BasePage {

    private By inputEmailAddress = By.id("email_create");
    private By buttonCreateAnAccount = By.id("SubmitCreate");

    public CreateAccountPage clickButtonCreateAnAccount(){
        click(buttonCreateAnAccount);
        return new CreateAccountPage();
    }

    public LoginPage setEmailAddress(String emailAddress){
        setText(inputEmailAddress, emailAddress);
        return this;
    }
}