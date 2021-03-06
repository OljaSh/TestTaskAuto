package eu.ipscstore.preset;

import ue.ipscstore.utils.PropertiesUtils;

import java.util.Optional;

import static ue.ipscstore.utils.PropertiesUtils.getStringValue;


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

