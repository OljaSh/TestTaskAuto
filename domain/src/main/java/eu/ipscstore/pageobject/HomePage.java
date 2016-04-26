package eu.ipscstore.pageobject;

import ru.yandex.qatools.allure.annotations.Step;
import ue.ipscstore.core.BasePage;
import org.openqa.selenium.By;


public class HomePage extends BasePage {

    private By labelUserName = By.className("account");
    public  By buttonLogOut = By.className("logout");
    private By buttonShopingCart = By.id("shopping_cart");

    public String getUserName(){
        return getText(labelUserName);
    }

    @Step("Click Logout button")
    public LoginPage clickLogOutButton(){
        click(buttonLogOut);
        return new LoginPage();
    }

    @Step("Click Shoping cart button")
    public YourAddressPage clickShopingCart(){
        click(buttonShopingCart);
        return new YourAddressPage();
    }

}
