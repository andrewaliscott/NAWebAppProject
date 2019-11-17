package PageObjects;

import NauWebProject.Base;
import NauWebProject.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main extends Base {

    private By requestL = By.xpath("//span[text()='Request Info']/..");
    private By applyL = By.xpath("//span[text()='Apply Now']/..");
    private By portalL = By.xpath("//span[text()='365 Portal']/..");
    private By logoL = By.cssSelector("img[alt='North American University Logo']");

    public void mouseOver(String locator) {
        seleniumUtil.getActions().moveToElement(getElement(locator)).build().perform();
    }

    public void verifyLink(String locator) {
        WebElement element = getElement(locator);
        Assert.assertTrue(seleniumUtil.isClickable(element, Driver.getDriver()));
    }

    public void clickOn(String locator) {
        switch (locator){
            case "request" : seleniumUtil.click(requestL); break;
            case "apply" : seleniumUtil.click(applyL); break;
            case "portal" : seleniumUtil.click(portalL); break;
            default:break;
        }
    }

    public void verifyColor(String locator) throws InterruptedException {
        String b4C = getElement(locator).getCssValue("color");
        //System.out.println(b4C);
        mouseOver(locator);
        String afterC = getElement(locator).getCssValue("color");
        //System.out.println(afterC);
        Assert.assertEquals(b4C, afterC);
    }

    public WebElement getElement(String locator) {
        WebElement element=null;
        switch (locator) {
            case "request" : element = seleniumUtil.findElement(requestL); break;
            case "apply" : element = seleniumUtil.findElement(applyL); break;
            case "portal" : element = seleniumUtil.findElement(portalL); break;
        }
        return element;
    }

}
