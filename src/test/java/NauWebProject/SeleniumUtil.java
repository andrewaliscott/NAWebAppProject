package NauWebProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class SeleniumUtil {

    public void goToPage(String url) throws IOException {
        Driver.getDriver().get(Driver.getProp(url));
    }

    public WebElement findElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void enter(By locator) {
        findElement(locator).sendKeys(Keys.ENTER);
    }

    public void clear(By locator) {
        findElement(locator).clear();
    }

    public void sendKeys(By locator, String text) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    public String getText(By locator) {
        return findElement(locator).getText();
    }

    public boolean isDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    public List<WebElement> findElements(By locator) {
        return Driver.driver.findElements(locator);
    }

    public Actions getActions() {
        return new Actions(Driver.getDriver());
    }

    public String getUrl() {
        return Driver.getDriver().getCurrentUrl();
    }

    public WebDriverWait waitFor(){
        return new WebDriverWait(Driver.getDriver(),10);
    }

    public boolean isClickable(WebElement element, WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver,5);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
