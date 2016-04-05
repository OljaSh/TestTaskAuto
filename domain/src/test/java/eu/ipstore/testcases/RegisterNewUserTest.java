package eu.ipstore.testcases;

import eu.ipscstore.data.User;
import eu.ipscstore.pageobject.HomePage;
import eu.ipscstore.pageobject.ShoppingCartPage;
import eu.ipscstore.preset.URL;
import forall.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static eu.ipscstore.preset.PageObjectSupplier.$;
import static eu.ipscstore.preset.PageObjectSupplier.loadSiteUrl;


public class RegisterNewUserTest extends BaseTest{


    private static User user;

    @DataProvider(name = "testDP")
    public static Iterator<Object[]> dataProvider() {
        if (user == null) {
            user = new User("123456", "fName", "sName", 10, 5, 1980, "Ms.", "Maiami", "Brazil", "1234", "Tuvalu", "55555", "ALIAS");
        }

        ArrayList<Object[]> output = new ArrayList<>();
        output.add(new Object[]{user});
        return output.iterator();
    }

    @Test(priority=1, dataProvider = "testDP")
    public void registerNewUserTest(User user){
        loadSiteUrl(URL.PROD)
                .clickLoginButton()
                .setEmailAddress(user.getEmail())
                .clickButtonCreateAnAccount()
                .setTitle()
                .setFirstName (user.getFirstName())
                .setLastName(user.getLastName())
                .setPassword(user.getPassword())
                .setBirthDate(user.getBirthDate())
                .setSignUpNewsletter()
                .setIAgree()
                .clickRegisterButton();

        Assert.assertEquals($(HomePage.class).getUserName(), $(HomePage.class).getUserName());
        //Assert.assertEquals(true, $(HomePage.class).buttonLogOut );

        $(HomePage.class).clickLogOutButton();
    }

    @Test(priority=2, dataProvider = "testDP")
    public void loginWithCreatedUser(User user) {
        loadSiteUrl(URL.PROD)
                .clickLoginButton()
                .setRegisteredEmailAddress(user.getEmail())
                .setRegisteredPassword(user.getPassword())
                .clickButtonLogin()
                .clickShopingCart()
                .setAddress(user.getAddress())
                .setCity(user.getCity())
                .setPostalCode(user.getPostalCode())
                .selectCountry(user.getCountry())
                .setMobilePhone(user.getMobilePhone())
                .setAlias(user.getAlias())
                .clickSaveButton();
        Assert.assertEquals($(ShoppingCartPage.class).getWarningMessage(), "Your shopping cart is empty.");

        $(HomePage.class).clickLogOutButton();
    }
}