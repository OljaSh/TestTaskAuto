package eu.ipstore.testcases;

import eu.ipscstore.data.User;
import eu.ipscstore.pageobject.HomePage;
import forall.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import static eu.ipscstore.preset.PageObjectSupplier.$;
import static eu.ipscstore.preset.PageObjectSupplier.loadSiteUrl;

/**
 * Created by oljashabanova on 21/03/16.
 */
public class RegisterNewUserTest extends BaseTest{

    private String newUserEmailAddress = "shseven@hotmail.com";
    private String Password = "test1234";
    private static final String PROD_URL = "www.ipscstore.eu";

    private static User user;

    @DataProvider(name = "testDP")
    public static Iterator<Object[]> dataProvider() {
        if (user == null) {
            user = new User("123456", "fName", "sName", LocalDate.now(), "Ms.");
        }

        ArrayList<Object[]> output = new ArrayList<>();
        output.add(new Object[]{user});
        return output.iterator();
    }

    @Test(dataProvider = "testDP")
    public void RegisterMewUserTest(User user){

        loadSiteUrl(PROD_URL) //PageObjectSuplier can not be applied to (java.lang.String)
            .clickLoginButton()
            .setEmailAddress(user.getEmail())
            .clickButtonCreateAnAccount()
                .setRadioButton()
                .setFirstName (user.getFirstName())
                .setLastName(user.getLastName())
                .setPassword(user.getPassword())
                .selectBirthDate(user.getBirthDate())
                .setSignUpNewsletter()
                .setIAgree()
                .clickRegisterButton();
        Assert.assertEquals($(HomePage.class).getUserName(), "Welcome FirstName LastName");

        $(HomePage.class).clickLogOutButton();
    }

    @Test(dataProvider = "testDP")
    public void login() {}
}
