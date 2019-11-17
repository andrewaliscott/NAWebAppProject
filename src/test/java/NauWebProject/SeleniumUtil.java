package NauWebProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class SeleniumUtil {

    public void goToPage(String url) throws IOException {
        Driver.getDriver().get(Driver.prop(url));
    }

    public WebElement findElement(By locator) {
        return Driver.driver.findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void clear(By locator) {
        findElement(locator).clear();
    }

    public void sendKeys(By locator, String text) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    public void getText(By locator) {
        findElement(locator).getText();
    }

    public void isDisplayed(By locator) {
        findElement(locator).isDisplayed();
    }

    public List<WebElement> findElements(By locator) {
        return Driver.driver.findElements(locator);
    }
}