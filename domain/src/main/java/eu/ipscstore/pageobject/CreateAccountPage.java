package eu.ipscstore.pageobject;

import forall.core.BasePage;
import org.openqa.selenium.By;


public class CreateAccountPage extends BasePage {

    private By radioButtonUnknown = By.id("id_gender4");
    private By inputFirstName = By.id("customer_firstname");
    private By inputLastName = By.id("customer_lastname");
    private By inputEmailAddress = By.id("email"); //  Сделать проверку что email уже введен
    private By inputPassword = By.id("passwd");
    private By selectDays = By.id("days");
    private By selectMonths = By.id("months");
    private By selectYears = By.id("years");
    private By checkboxSignUpNewsletter = By.id("newsletter");
    private By checkboxSpesialOffers = By.id("optin");
    private By checkboxIAgree = By.id("customer_privacy");
    private By buttonRegister = By.id("submitAccount");
    //  Select select = new Select();



    public  CreateAccountPage setTitle() {
        click(radioButtonUnknown);
        return this;
    }

    public CreateAccountPage setFirstName(final String firstName) {
        setText(inputFirstName, firstName);
        return this;
    }

    public CreateAccountPage setLastName(final String lastName) {
        setText(inputLastName, lastName);
        return this;
    }

    public CreateAccountPage setEmailAddress(final String emailAddress) {
        setText(inputEmailAddress, emailAddress);
        return this;
    }

    public CreateAccountPage setPassword(final String password) {
        setText(inputPassword, password);
        return this;
    }

    /*public CreateAccountPage setBirthDate(final LocalDate date) {
        selectBirthday(date.getDayOfMonth());
        selectMonth(date.getMonth().getDisplayName()); // see javadocs to fill in missing args
        selectYear(date.getYear());
        return this;
    }*/

    public CreateAccountPage selectDay(final String day) {
        selectFromDropDownList(selectDays, String.valueOf(day));
        return this;
    }

    public CreateAccountPage selectMonth(final String month) {
        selectFromDropDownList(selectMonths, month);
        return this;
    }

    public CreateAccountPage selectYear(final String year) {
        selectFromDropDownList(selectYears, String.valueOf(year));
        return this;
    }

    public  CreateAccountPage setSignUpNewsletter() {
        click(checkboxSignUpNewsletter);
        return this;
    }

    public  CreateAccountPage setSpesialOffers() {
        click(checkboxSpesialOffers);
        return this;
    }

    public  CreateAccountPage setIAgree() {
        click(checkboxIAgree);
        return this;
    }

    public HomePage clickRegisterButton() {
        click(buttonRegister);
        return new HomePage();
    }

}