package utils;

import exceptions.BadConfigurationException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyFileManager {

    private static Map<String, Properties> propReaders = new HashMap<>();

    public static Properties getProperties(String pathToPropsFile) {
        Properties properties = propReaders.get(pathToPropsFile);
        if (properties == null) {
            try (FileInputStream fileStream = new FileInputStream(pathToPropsFile)) {
                properties = new Properties();
                properties.load(fileStream);
                propReaders.put(pathToPropsFile, properties);
            } catch (IOException e) {
                throw new BadConfigurationException("Properties file [" + pathToPropsFile + "] cannot be read.", e);
            }
        }
        return properties;
    }
}
