package steps;

import pages.LoginPage;
import pages.InventoryPage;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Given("the user is on the login page")
    public void user_on_login_page() {

    }

    @When("the user logs in with valid credentials")
    public void login_valid_credentials() {

        loginPage.login("standard_user", "secret_sauce");

    }

    @Then("the user should see the inventory page")
    public void verify_inventory() {

        Assert.assertTrue(inventoryPage.isInventoryDisplayed());

    }

}