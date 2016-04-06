package eu.ipscstore.pageobject;

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

    public YourAddressPage setFirstName(String firstName){
        setText(inputFirstName, firstName);
        return this;
    }

    public YourAddressPage setLastName(String lastName){
        setText(inputLastName, lastName);
        return this;
    }

    public YourAddressPage setAddress(final String address){
        setText(inputAddress, address);
        return this;
    }

    public YourAddressPage setPostalCode(final String postalCode){
        setText(inputPostalCode, postalCode);
        return this;
    }

    public YourAddressPage setCity(final String city){
        setText(inputCity, city);
        return this;
    }

    public YourAddressPage selectCountry(final String country){
        selectFromDropDownList(selectCountry, country);
        return this;
    }

    public YourAddressPage selectState(final String state){
        selectFromDropDownList(selectState, state);
        return this;
    }

    public  YourAddressPage setAlias(final String alias){
        setText(inputAlias, alias);
        return this;
    }

    public YourAddressPage setMobilePhone(final String mobilePhone){
        setText(inputMobilePhone,mobilePhone);
        return this;
    }

    public ShoppingCartPage clickSaveButton() {
        click(buttonSave);
        return new ShoppingCartPage();
    }

}
