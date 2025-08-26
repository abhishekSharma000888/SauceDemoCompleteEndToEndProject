package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isOnLoginPage());
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to inventory page")
    public void i_should_be_redirected_to_inventory_page() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isOnHomePage());
    }

    @Then("I should see products")
    public void i_should_see_products() {
        Assert.assertTrue(homePage.hasProducts());
    }

    @Then("I should see error message {string}")
    public void i_should_see_error_message(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}