package forall.utils;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

import java.util.Arrays;

/**
 * Created by oljashabanova on 21/03/16.
 */
public class PropertiesUtils {

    private static final CompositeConfiguration MIXED_CONFIG;

    public static final class Constants{
        public static final String PROD_URL = "prod.url.arg";
        public static final String MAC_CHROME_BROWSER = "chrome.mac.driver";
        public static final String WIN_CHROME_BROWSER = "chrome.win.driver";
        public static final String LINUX23_CHROME_BROWSER = "chrome.linux32.driver";
        public static final String LINUX64_CHROME_BROWSER = "chrome.linux64.driver";


        private Constants(){

        }
    }



    static {
        try{
            MIXED_CONFIG = new CompositeConfiguration(Arrays.asList(new SystemConfiguration(),
                    new PropertiesConfiguration("properties/config.properties")));
        }
        catch (Exception ex){
            throw new IllegalArgumentException("Can not load properties");
        }
    }

    public static String getStringValue(final String key){
        return MIXED_CONFIG.getString(key);
    }

    private PropertiesUtils(){

    }

}
