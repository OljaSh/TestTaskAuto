package eu.ipstore.testcases;

import eu.ipscstore.pageobject.HomePage;
import eu.ipscstore.preset.PageObjectSupplier.$;
import forall.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static eu.ipscstore.preset.PageObjectSupplier.loadSiteUrl;

/**
 * Created by oljashabanova on 21/03/16.
 */
public class RegisterNewUserTest extends BaseTest{

    private String newUserEmailAddress = "shseven@hotmail.com";
    private String Password = "test1234";
    private static final String PROD_URL = "www.ipscstore.eu";



    @Test
    public void RegisterMewUserTest(){

        loadSiteUrl(PROD_URL) //PageObjectSuplier can not be applied to (java.lang.String)
            .clickLoginButton()
            .setEmailAddress(newUserEmailAddress)
            .clickButtonCreateAnAccount()
                .setRadioButton()
                .setFirstName ("FirstName")
                .setLastName("LastName")
                .setPassword("pasword")
                .selectBirthday("13")
                .selectMonth("May")
                .selectYear("1970")
                .setSignUpNewsletter()
                .setIAgree()
                .clickRegisterButton();
        Assert.assertEquals($(HomePage.class).getUserName(), "Welcome FirstName LastName");

    }

}
