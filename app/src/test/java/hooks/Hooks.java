package hooks;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

    @Before
    public void setup() {

        driver = DriverFactory.getDriver();
        driver.get("https://www.saucedemo.com/");

    }

    @After
    public void tearDown() {

        DriverFactory.quitDriver();

    }
}