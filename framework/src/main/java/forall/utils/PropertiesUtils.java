package forall.utils;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

import java.util.Arrays;

public class PropertiesUtils {

    private static final CompositeConfiguration MIXED_CONFIG;

    public static final class Constants{
        public static final String PROD_URL = "prod.url.arg";

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


    public static long getWaitTime(){
        return Long.parseLong(getStringValue("wait.time.sec"));
    }

    public static long getDefaultTimeOut(){
        return Long.parseLong(getStringValue("default.timeout"));
    }


    private PropertiesUtils(){

    }

}
