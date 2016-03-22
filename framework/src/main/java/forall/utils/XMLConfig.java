package forall.utils;

import java.util.Map;

/**
 * Created by oljashabanova on 18/03/16.
 */
public class XMLConfig {

    private final Map<String, String> parameters;

    public XMLConfig(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getParameter(String key) {
        return parameters.get(key);
    }
}
