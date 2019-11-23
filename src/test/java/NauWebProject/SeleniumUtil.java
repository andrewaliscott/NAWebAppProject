package NauWebProject;

import PageObjects.StudentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.CSS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumUtil  {

    public void goToPage(String url) throws IOException {


        Driver.getDriver().get(Driver.getProp(url));
        Driver.driver.manage().window().maximize();
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

    public String getText(By locator) {

        return findElement(locator).getText();
    }

    public boolean isDisplayed(By locator) {

        return findElement(locator).isDisplayed();
    }


    public List<WebElement> findElements(By locator) {

        return Driver.driver.findElements(locator);
    }
    public  Actions getActions(){
        return new Actions(Driver.getDriver());

    }
    public void mouseOver(By element){

        getActions().moveToElement(findElement(element)).perform();
    }
    public String getUrl(){

        return Driver.driver.getCurrentUrl();
    }
    public String getAttribute(By element, String elementAttribute ){
        return findElement(element).getAttribute(elementAttribute);

    }
    public String getCSSvalue(By element, String CSSValue){

        return findElement(element).getCssValue(CSSValue);
    }

    public void getThread (int milliSeccond) throws InterruptedException {
        Thread.sleep(milliSeccond);
    }

    public List<String> getListMultiplePage () {//multiple page get pages and Set but to use i need in List
        Set<String> id=Driver.getDriver().getWindowHandles();
        List<String> listMultiplePage=new ArrayList<>();
        for (String t:id)
            listMultiplePage.add(t);
        return listMultiplePage;

    }
    public Select getSelect(By element){
        return new Select(Driver.getDriver().findElement(element));
    }

}
