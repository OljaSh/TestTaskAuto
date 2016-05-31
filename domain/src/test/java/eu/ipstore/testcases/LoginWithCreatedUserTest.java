package eu.ipstore.testcases;

import eu.ipscstore.data.User2;
import eu.ipscstore.pageobject.HomePage;
import eu.ipscstore.preset.URL;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ue.ipscstore.core.BaseTest;

import java.util.ArrayList;
import java.util.Iterator;

import static eu.ipscstore.preset.PageObjectSupplier.$;
import static eu.ipscstore.preset.PageObjectSupplier.loadSiteUrl;


public class LoginWithCreatedUserTest extends BaseTest {

    private static User2 user2;

    @DataProvider(name = "testDP")
    public static Iterator<Object[]> dataProvider() {
        if (user2 == null) {
            user2 = new User2("shseven@hotmail.com", "nalT5g8S");
        }

        ArrayList<Object[]> output = new ArrayList<>();
        output.add(new Object[]{user2});
        return output.iterator();
    }


    @Test(dataProvider = "testDP")
    public void loginWithUser(User2 user2){
        loadSiteUrl(URL.PROD)
                .clickLoginButton()
                .setRegisteredEmailAddress(user2.getEmail())
                .setRegisteredPassword(user2.getPassword())
                .clickButtonLogin();
        Assert.assertEquals($(HomePage.class).getUserName(), $(HomePage.class).getUserName());
       // $(HomePage.class).clickLogOutButton();
    }


}
