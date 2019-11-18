package StepDefinitionFiles.HYMain;

import NauWebProject.Base;
import NauWebProject.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import NauWebProject.Driver;

public class HYMainUS01 extends Base {



    @Given("^User navigates to page \"([^\"]*)\"$")
    public void user_navigates_to_page(String arg1) throws Throwable {
        //seleniumUtil.goToPage();


    }

    @When("^User hover on \"([^\"]*)\" button$")
    public void user_hover_on_button(String arg1) throws Throwable {
        //seleniumUtil.getActions();

    }

    @Then("^Color of button should change$")
    public void color_of_button_should_change() throws Throwable {

    }

    @Then("^Button should be a link$")
    public void button_should_be_a_link() throws Throwable {

    }

    @When("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) throws Throwable {

    }

    @Then("^User should navigate to page \"([^\"]*)\"$")
    public void user_should_navigate_to_page(String arg1) throws Throwable {
//        seleniumUtil.goToPage(arg1);
//        System.out.println(arg1);
//        System.out.println(seleniumUtil.getUrl());
//        Assert.assertEquals(Driver.prop(arg1),seleniumUtil.getUrl());
    }
}
