package eu.ipscstore.preset;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import eu.ipscstore.pageobject.SiteHomePage;

import static forall.core.BaseTest.getDriver;


public class PageObjectSupplier {

    public static <T> T $(Class<T> pageObject) {
        return ConstructorAccess.get(pageObject).newInstance();
    }

    public static SiteHomePage loadSiteUrl(final URL url) {
        getDriver().get(url.toString());
        return $(SiteHomePage.class);
    }



    private PageObjectSupplier(){

    }
}
