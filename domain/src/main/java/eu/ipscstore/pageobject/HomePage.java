package eu.ipscstore.pageobject;

import forall.core.BasePage;
import org.openqa.selenium.By;


public class HomePage extends BasePage {

    private By labelUserName = By.className("account");
    public  By buttonLogOut = By.className("logout");
    private By buttonShopingCart = By.id("shopping_cart");


    public String getUserName(){
        return getText(labelUserName);
    }

    public LoginPage clickLogOutButton(){
        click(buttonLogOut);
        return new LoginPage();
    }

    //only new user gets address page after pressing on Cart menu
    public YourAddressPage clickShopingCart(){
        click(buttonShopingCart);
        return new YourAddressPage();
    }


}
