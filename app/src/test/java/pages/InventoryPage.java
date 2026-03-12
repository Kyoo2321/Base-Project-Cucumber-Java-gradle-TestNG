package pages;

import driverFactory.DriverFactory;
import utilities.WaitHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    WebDriver driver;
    WaitHelper wait;

    public InventoryPage() {

        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WaitHelper(driver);

    }

    @FindBy(className = "title")
    WebElement inventoryTitle;

    public boolean isInventoryDisplayed() {

        wait.waitForElementVisible(inventoryTitle);
        return inventoryTitle.isDisplayed();

    }

}