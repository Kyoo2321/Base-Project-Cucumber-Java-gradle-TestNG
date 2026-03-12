package pages;

import driverFactory.DriverFactory;
import utilities.WaitHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    WaitHelper wait;

    public LoginPage() {

        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WaitHelper(driver);

    }

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void login(String user, String pass) {

        wait.waitForElementVisible(username);

        username.sendKeys(user);
        password.sendKeys(pass);

        wait.waitForElementClickable(loginBtn);
        loginBtn.click();

    }

}