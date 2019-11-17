package StepDefinitionFiles;

import NauWebProject.Base;
import NauWebProject.Driver;
import PageObjects.Main;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HYMainUS01 extends Base {

    Main main = new Main();

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
        System.out.println("actual : "+seleniumUtil.getUrl());
        System.out.println("expected : "+Driver.getProp(arg1));

        Assert.assertEquals(Driver.getProp(arg1),seleniumUtil.getUrl());
    }
}
