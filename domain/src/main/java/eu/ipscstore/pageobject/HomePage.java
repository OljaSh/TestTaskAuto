package eu.ipscstore.pageobject;

import ue.ipscstore.core.BasePage;
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

    public YourAddressPage clickShopingCart(){
        click(buttonShopingCart);
        return new YourAddressPage();
    }

}
