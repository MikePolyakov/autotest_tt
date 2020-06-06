package utils;

import org.openqa.selenium.NotFoundException;

import java.io.IOException;
import java.util.Properties;

public class Property {
    private static final String PROP_FILE = "/project.properties";

    public static String load(String name) {
        Properties props = new Properties();
        try {
            props.load(Property.class.getResourceAsStream(PROP_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (name != null) {
            if (System.getenv().containsKey(name)) {
                return System.getenv(name);
            }
            return props.getProperty(name);
        }
        throw new NotFoundException("The property is not found!");
    }
}
