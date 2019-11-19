package StepDefinitionFiles;

import NauWebProject.Base;
import NauWebProject.Driver;
import PageObjects.Main;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class HYMain extends Base {

    private Main main = new Main();

    @Given("^User navigates to page \"([^\"]*)\"$")
    public void user_navigates_to_page(String arg1) throws Throwable {
        seleniumUtil.goToPage(arg1);
    }

    @When("^User hover on \"([^\"]*)\" button$")
    public void user_hover_on_button(String arg1) throws Throwable {
        //mainPage.mouseOver(arg1);
        //Thread.sleep(2000);
    }

    @Then("^Color of \"([^\"]*)\" button should change$")
    public void color_of_button_should_change(String arg1) throws Throwable {
        main.verifyColor(arg1);
    }

    @Then("^\"([^\"]*)\" should be a link$")
    public void should_be_a_link(String arg1) throws Throwable {
        main.verifyLink(arg1);
    }

    @When("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) throws Throwable {
        main.clickOn(arg1);
        Thread.sleep(3000);
    }

    @Then("^User should navigate to page \"([^\"]*)\"$")
    public void user_should_navigate_to_page(String arg1) throws Throwable {
        System.out.println("actual : " + seleniumUtil.getUrl());
        System.out.println("expected : " + Driver.getProp(arg1));
/*
        if(arg1.equals("search")) {
            seleniumUtil.enter(main.getLocator(arg1));
            System.out.println("actual : " + seleniumUtil.getUrl());
            System.out.println("expected : " + (Driver.getProp(arg1)+main.getElement(arg1).getText()));
            Assert.assertEquals((Driver.getProp(arg1)+main.getElement(arg1).getText()),seleniumUtil.getUrl());
        }

 */
        System.out.println("actual : " + seleniumUtil.getUrl());
        System.out.println("expected : " + Driver.getProp(arg1));
        Assert.assertEquals(Driver.getProp(arg1),seleniumUtil.getUrl());
    }

    @When("^User sees \"([^\"]*)\" box on right side of menu bar$")
    public void user_sees_box_on_right_side_of_menu_bar(String arg1) throws Throwable {

    }

    @Then("^\"([^\"]*)\" box should hold \"([^\"]*)\" watermark$")
    public void box_should_hold_watermark(String arg1, String arg2) throws Throwable {
        main.verifyWatermark(arg1,arg2);

    }

    @When("^User types \"([^\"]*)\" on \"([^\"]*)\" box$")
    public void userTypesOnBox(String arg1, String arg2) throws Throwable {
        main.inputKey(arg1,arg2);
        System.out.println(arg1 + " on " +arg2);
        main.verifyInput(arg2);
    }
}
