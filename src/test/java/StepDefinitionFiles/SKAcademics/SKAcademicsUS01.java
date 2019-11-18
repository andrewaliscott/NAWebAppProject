package StepDefinitionFiles.SKAcademics;
import NauWebProject.Base;
import NauWebProject.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import PageObjects.Academics;
@RunWith(Cucumber.class)

public class SKAcademicsUS01 extends Base {

    Academics academy=new Academics ();

    @Given("^User navigates the main page$")
    public void user_navigates_the_main_page() throws Throwable {
        seleniumUtil.click (academy.getAcademics ());
        Assert.assertEquals (seleniumUtil.findElement (academy.getAcademics ()).getAttribute ( "Academics" ), Driver.prop ( "urlAcademics" ));

    }

    @When("^User clicks Academics text link under NAU logo$")
    public void user_clicks_academics_text_link_under_nau_logo() throws Throwable {

    }

    @When("^User clicks Academics menu$")
    public void user_clicks_academics_menu() throws Throwable {

    }

    @When("^User does hover over on Academics$")
    public void user_does_hover_over_on_academics() throws Throwable {

    }

    @Then("^User will be able to navigate to the page$")
    public void user_will_be_able_to_navigate_to_the_page() throws Throwable {

    }

    @Then("^ User click logo of NAU in Academics page$")
    public void user_click_logo_of_nau_in_academics_page() throws Throwable {

    }

    @Then("^User should be able see the sub section menu$")
    public void user_should_be_able_see_the_sub_section_menu() throws Throwable {

    }

    @And("^User will be able to see url at the browser$")
    public void user_will_be_able_to_see_url_at_the_browser() throws Throwable {

    }

    @And("^User should navigate to the main page$")
    public void user_should_navigate_to_the_main_page() throws Throwable {

    }

    @And("^The background color of Academic text link should change$")
    public void the_background_color_of_academic_text_link_should_change() throws Throwable {

    }

}

