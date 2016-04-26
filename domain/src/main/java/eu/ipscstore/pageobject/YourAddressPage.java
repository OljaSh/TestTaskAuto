package eu.ipscstore.pageobject;

import ru.yandex.qatools.allure.annotations.Step;
import ue.ipscstore.core.BasePage;
import org.openqa.selenium.By;

public class YourAddressPage extends BasePage{

    private By inputFirstName = By.id("firstname");
    private By inputLastName = By.id("lastname");
    private By inputAddress = By.id("address1");
    private By inputPostalCode = By.id("postcode");
    private By inputCity = By.id("city");
    private By selectCountry = By.id("id_country");
    private By selectState = By.id("id_state");
    private By inputAlias = By.id("alias");
    private By inputMobilePhone = By.id("phone_mobile");
    private By buttonSave = By.id("submitAddress");

    @Step("Set First Name = {0}")
    public YourAddressPage setFirstName(String firstName){
        setText(inputFirstName, firstName);
        return this;
    }

    @Step("Set Last Name = {0}")
    public YourAddressPage setLastName(String lastName){
        setText(inputLastName, lastName);
        return this;
    }

    @Step("Set Address = {0}")
    public YourAddressPage setAddress(final String address){
        setText(inputAddress, address);
        return this;
    }

    @Step("Set Postal Code = {0}")
    public YourAddressPage setPostalCode(final String postalCode){
        setText(inputPostalCode, postalCode);
        return this;
    }

    @Step("Set City = {0}")
    public YourAddressPage setCity(final String city){
        setText(inputCity, city);
        return this;
    }

    @Step("Set Country = {0}")
    public YourAddressPage selectCountry(final String country){
        selectFromDropDownList(selectCountry, country);
        return this;
    }

    @Step("Set State = {0}")
    public YourAddressPage selectState(final String state){
        selectFromDropDownList(selectState, state);
        return this;
    }

    @Step("Set Alias = {0}")
    public  YourAddressPage setAlias(final String alias){
        setText(inputAlias, alias);
        return this;
    }

    @Step("Set Mobile Phone = {0}")
    public YourAddressPage setMobilePhone(final String mobilePhone){
        setText(inputMobilePhone,mobilePhone);
        return this;
    }

    @Step("Click Save button")
    public ShoppingCartPage clickSaveButton() {
        click(buttonSave);
        return new ShoppingCartPage();
    }

}
