package eu.ipscstore.pageobject;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;
import ue.ipscstore.core.BasePage;

import java.time.LocalDate;


public class CreateAccountPage extends BasePage {

    private By radioButtonUnknown = By.id("id_gender4");
    private By inputFirstName = By.id("customer_firstname");
    private By inputLastName = By.id("customer_lastname");
    private By inputEmailAddress = By.id("email");
    private By inputPassword = By.id("passwd");
    private By selectDays = By.id("days");
    private By selectMonths = By.id("months");
    private By selectYears = By.id("years");
    private By checkboxSignUpNewsletter = By.id("newsletter");
    private By checkboxSpesialOffers = By.id("optin");
    private By checkboxIAgree = By.id("customer_privacy");
    private By buttonRegister = By.id("submitAccount");

    @Step("Select gender = {0} ")
    public  CreateAccountPage setTitle() {
        click(radioButtonUnknown);
        return this;
    }

    @Step("Set First Name = {0}")
    public CreateAccountPage setFirstName(final String firstName) {
        setText(inputFirstName, firstName);
        return this;
    }

    @Step("Set Last Name = {0}")
    public CreateAccountPage setLastName(final String lastName) {
        setText(inputLastName, lastName);
        return this;
    }

    @Step("Set Email address = {0}")
    public CreateAccountPage setEmailAddress(final String emailAddress) {
        setText(inputEmailAddress, emailAddress);
        return this;
    }

    @Step("Set Password = {0}")
    public CreateAccountPage setPassword(final String password) {
        setText(inputPassword, password);
        return this;
    }


    public CreateAccountPage setBirthDate(final LocalDate date) {
        selectDay(date.getDayOfMonth());
        selectMonth(date.getMonth().getValue());
        selectYear(date.getYear());
        return this;
    }

    @Step("Set birthday = {0}")
    public CreateAccountPage selectDay(final int day) {
        selectValueFromDropDownList(selectDays, String.valueOf(day));
        return this;
    }

    @Step("Set Month = {0}")
    public CreateAccountPage selectMonth(final int month) {
        selectValueFromDropDownList(selectMonths, String.valueOf(month));
        return this;
    }

    @Step("Set Year = {0}")
    public CreateAccountPage selectYear(final int year) {
        selectValueFromDropDownList(selectYears, String.valueOf(year));
        return this;
    }

    @Step("Select mandatory field Sign up for our newsletter")
    public  CreateAccountPage setSignUpNewsletter() {
        click(checkboxSignUpNewsletter);
        return this;
    }

    @Step("Select not mandatiry field 'Receive special offers from our partners' ")
    public  CreateAccountPage setSpesialOffers() {
        click(checkboxSpesialOffers);
        return this;
    }

    @Step("Select 'I Agree'")
    public  CreateAccountPage setIAgree() {
        click(checkboxIAgree);
        return this;
    }

    @Step("Click  Register button")
    public HomePage clickRegisterButton() {
        click(buttonRegister);
        return new HomePage();
    }

}