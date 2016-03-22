package eu.ipscstore.preset;

import forall.utils.PropertiesUtils;

import java.util.Optional;

import static forall.utils.PropertiesUtils.getStringValue;

/**
 * Created by oljashabanova on 21/03/16.
 */
public enum URL {

    PROD(getStringValue(PropertiesUtils.Constants.PROD_URL));

    private String address;

    URL(final String address){
        this.address = address;
    }

    public String toString(){
        return Optional.ofNullable(System.getenv("URL")).orElse(address);
    }
}
