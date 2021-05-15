package api.automation.utils;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {

    public static Properties readPropertyFile (String fileName) throws IOException {
        BufferedReader reader;
        final String propertyFilePath = System.getProperty("user.dir")+ "/src/main/resources/" + fileName;
        System.out.println(propertyFilePath);

        reader = new BufferedReader(new FileReader(propertyFilePath));
        Properties properties=new Properties();
        try {
            properties.load(reader);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

}
