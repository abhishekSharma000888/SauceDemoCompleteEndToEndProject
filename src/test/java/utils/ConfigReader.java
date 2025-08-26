package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    private final String propertyFilePath = "src/test/resources/config.properties";

    public ConfigReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath))) {
            properties = new Properties();
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public long getTimeout() {
        return Long.parseLong(properties.getProperty("timeout"));
    }
}