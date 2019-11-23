package PageObjects;

import NauWebProject.Base;
import NauWebProject.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Main extends Base {

    private By requestL = By.xpath("//span[text()='Request Info']/..");
    private By applyL = By.xpath("//span[text()='Apply Now']/..");
    private By portalL = By.xpath("//span[text()='365 Portal']/..");
    private By logoL = By.cssSelector("img[alt='North American University Logo']");
    private By searchL = By.cssSelector(".ubermenu-search-input");
    private By portalSign = By.cssSelector("input[type='email']");
    private By portalPass = By.cssSelector("input[type='password']");
    private By portalSubmit = By.cssSelector("input[type='submit']");
    private By portalSubmit2 = By.cssSelector("input[id='idBtn_Back']");


    public void mouseOver(String locator) {
        seleniumUtil.getActions().moveToElement(getElement(locator)).build().perform();
    }

    public void verifyLink(String locator) {
        WebElement element = getElement(locator);
        Assert.assertTrue(seleniumUtil.isClickable(element));
    }

    public void clickOn(String locator) {
        switch (locator){
            case "request" : seleniumUtil.click(requestL); break;
            case "apply" : seleniumUtil.click(applyL); break;
            case "portal" : seleniumUtil.click(portalL); break;
            case "logo" : seleniumUtil.click(logoL); break;
            default:break;
        }
    }

    public void signInPortal(String username, String password) throws IOException, InterruptedException {
        Set<String> page = Driver.getDriver().getWindowHandles();
        Iterator<String> myWindows = page.iterator();
        String main = myWindows.next();
        String portal = myWindows.next();
        Driver.getDriver().switchTo().window(portal);

        seleniumUtil.sendKeys(portalSign, Driver.getProp(username));
        seleniumUtil.enter(portalSign);
        Thread.sleep(1000);
        seleniumUtil.sendKeys(portalPass,Driver.getProp(password));
        seleniumUtil.enter(portalPass);
        Thread.sleep(1000);
        seleniumUtil.click(portalSubmit2);
    }

    public WebElement getElement(String locator) {
        WebElement element=null;
        switch (locator) {
            case "request" : element = seleniumUtil.findElement(requestL); break;
            case "apply" : element = seleniumUtil.findElement(applyL); break;
            case "portal" : element = seleniumUtil.findElement(portalL); break;
            case "logo" : element = seleniumUtil.findElement(logoL); break;
        }
        return element;
    }

    public By getLocator(String locator) {

        By locatorL = null;
        switch (locator) {
            case "request" : locatorL = requestL; break;
            case "apply" : locatorL = applyL; break;
            case "portal" : locatorL = portalL; break;
            case "search" : locatorL = searchL; break;
            case "logo" : locatorL = logoL; break;
        }
        return locatorL;
    }

    public void inputKey(String input, String locator) {
        seleniumUtil.sendKeys(getLocator(locator),input);
    }

    public void verifyInput(String locator) {

        String text = seleniumUtil.findElement(getLocator(locator)).getAttribute("placeholder");
        System.out.println("input value : "+text);

    }

    public void verifyWatermark(String locator, String text) {
        System.out.println(seleniumUtil.findElement(getLocator(locator)).getAttribute(text));
    }

    public void verifyLogo() {
        String color = getElement("logo").getCssValue("color");
        String bColor = getElement("logo").getCssValue("background-color");
        System.out.println("Color of Logo : "+color);
        System.out.println("Background color of Logo : "+bColor);
        String expectedColor = "rgba(0, 93, 135, 1)";
        String expectedBColor = "rgba(0, 0, 0, 0)";
        Assert.assertEquals(expectedColor,color);
        Assert.assertEquals(expectedBColor,bColor);
    }

    public void verifyColor(String locator) {
        String b4C = getElement(locator).getCssValue("color");
        System.out.println(b4C);
        mouseOver(locator);
        String afterC = getElement(locator).getCssValue("color");
        System.out.println(afterC);
        Assert.assertEquals(b4C, afterC);
    }
}