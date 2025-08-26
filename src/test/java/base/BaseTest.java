package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {
    protected WebDriver driver;
    protected ConfigReader configReader;

    @Before
    public void setUp() {
        configReader = new ConfigReader();
        driver = DriverFactory.getDriver();
        driver.get(configReader.getBaseUrl());
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}