package eu.ipscstore.preset;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import com.gargoylesoftware.htmlunit.javascript.host.URL;
import eu.ipscstore.pageobject.LoginPage;

import static forall.core.BaseTest.getDriver;

/**
 * Created by oljashabanova on 21/03/16.
 */
public class PageObjectSupplier {

    public static <T> T $(Class<T> pageObject) {
        return ConstructorAccess.get(pageObject).newInstance();
    }

    public static LoginPage loadSiteUrl(final URL url) {
        getDriver().get(url.toString());
        return $(LoginPage.class);
    }



    private PageObjectSupplier(){

    }
}
