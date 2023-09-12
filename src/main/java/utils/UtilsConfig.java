package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilsConfig {

    public static Properties getProperty(String filename) {
        Properties myProperties = new Properties();
        try {
            File propertiesFile = new File("src/main/resources" + filename + ".properties");
            if (propertiesFile.exists()) {
                myProperties.load(new FileInputStream(propertiesFile));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found:"+filename);
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return myProperties;

    }
}

