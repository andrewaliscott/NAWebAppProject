package StepDefinitionFiles;

import NauWebProject.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HYMainUS001 extends Base {

    @Given("^User navigates to page \"([^\"]*)\"$")
    public void user_navigates_to_page(String arg1) throws Throwable {
        seleniumUtil.goToPage(arg1);
    }

    @When("^User hover on \"([^\"]*)\" button$")
    public void user_hover_on_button(String arg1) throws Throwable {


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
    }
}
