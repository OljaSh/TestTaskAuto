package eu.ipscstore.pageobject;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;
import ue.ipscstore.core.BasePage;

import static eu.ipscstore.preset.PageObjectSupplier.$;


public class LoginPage extends BasePage {

    //@FindBy(id = "asd")
    //private WebElement el;

    private By inputEmailAddress = By.id("email_create");
    private By buttonCreateAnAccount = By.id("SubmitCreate");
    private By inputEmailAddressRegistered = By.id("email");
    private By inputPassword = By.id("passwd");
    private By buttonLogin = By.id("SubmitLogin");

    // Create your account section
    @Step("Create account.")
    public CreateAccountPage clickButtonCreateAnAccount(){
        click(buttonCreateAnAccount);
        return $(CreateAccountPage.class);
    }

    @Step("Set email = {0}")
    public LoginPage setEmailAddress(String emailAddress){
        setText(inputEmailAddress, emailAddress);
        return this;
    }

    @Step("Login with email = {0}")//Already registered? section
    public LoginPage setRegisteredEmailAddress(String emailAddress){
        setText(inputEmailAddressRegistered, emailAddress);
        return this;
    }

    @Step("Enter password")
    public LoginPage setRegisteredPassword(String password){
        setText(inputPassword, password);
        return this;
    }

    @Step("Clict on Login button")
    public HomePage clickButtonLogin(){
        click(buttonLogin);
        return $(HomePage.class);
    }

}