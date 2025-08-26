package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import utils.ScreenshotUtil;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Initialization is handled in BaseTest
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtil.takeScreenshot(DriverFactory.getDriver(), scenario.getName());
        }
        DriverFactory.quitDriver();
    }
}