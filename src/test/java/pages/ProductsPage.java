package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.beans.Visibility;

public class ProductsPage extends BasePage {

    private final By title = By.xpath("//*[text()='Products']");
    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public boolean isPageOpen(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return driver.findElement(title).isDisplayed();
    }
}
