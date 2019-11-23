package StepDefinitionFiles;

import NauWebProject.Base;
import NauWebProject.Driver;
import PageObjects.Main;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class HYMain extends Base {

    private Main main = new Main();
    public String search;

    @Given("^User navigates to page \"([^\"]*)\"$")
    public void user_navigates_to_page(String arg1) throws Throwable {
        seleniumUtil.goToPage(arg1);
    }

    @When("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) throws Throwable {
        main.clickOn(arg1);
        Thread.sleep(3000);
    }

    @Then("^User should navigate to page \"([^\"]*)\"$")
    public void user_should_navigate_to_page(String arg1) throws Throwable {

        if(arg1.equals("search")) {
            seleniumUtil.enter(main.getLocator(arg1));
            System.out.println("actual : " + seleniumUtil.getUrl());
            System.out.println("expected ending: " + search);
            Assert.assertTrue(seleniumUtil.getUrl().contains(search));
        }

        System.out.println("actual : " + seleniumUtil.getUrl());
        System.out.println("expected : " + Driver.getProp(arg1));
        Assert.assertEquals(Driver.getProp(arg1),seleniumUtil.getUrl());
    }

    @When("^User will sign in with following information$")
    public void user_will_sign_in_with_following_information(DataTable arg1) throws Throwable {
        List<List<String>> obj = arg1.raw();
        main.signInPortal(obj.get(0).get(0), obj.get(0).get(1));
    }

    @When("^User sees \"([^\"]*)\" box on right side of menu bar$")
    public void user_sees_box_on_right_side_of_menu_bar(String arg1) throws Throwable {

    }

    @Then("^\"([^\"]*)\" box should hold watermark$")
    public void box_should_hold_watermark(String arg1) throws Throwable {
        main.verifyWatermark(arg1, "placeholder");

    }

    @When("^User types \"([^\"]*)\" on \"([^\"]*)\" box$")
    public void user_types_on_box(String arg1, String arg2) throws Throwable {
        search = arg1;
        main.inputKey(arg1,arg2);
        System.out.println(arg1 + " on " +arg2);
        main.verifyInput(arg2);
    }

    @Then("^Logo should be there in specific conditions$")
    public void logo_should_be_there_in_specific_conditions() throws Throwable {
        main.verifyLogo();
    }

    /*
    @When("^User hover on \"([^\"]*)\" button$")
    public void user_hover_on_button(String arg1) throws Throwable {
        //main.verifyColor(arg1);
        //main.mouseOver(arg1);
    }

    @Then("^Color of \"([^\"]*)\" button should change$")
    public void color_of_button_should_change(String arg1) throws Throwable {
        main.verifyColor(arg1);
    }

    @Then("^\"([^\"]*)\" should be a link$")
    public void should_be_a_link(String arg1) throws Throwable {
        main.verifyLink(arg1);
    }
    */
}
