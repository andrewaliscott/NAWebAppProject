package StepDefinitionFiles;

import NauWebProject.Base;
import NauWebProject.Driver;
import PageObjects.Main;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;

public class HYMain extends Base {

    private Main main = new Main();
    private String search;

    @Given("^User navigates to \"([^\"]*)\" page$")
    public void user_navigates_to_page(String arg1) throws IOException {
        //seleniumUtil.goToPage(arg1);
    }

    @When("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) throws Throwable {
        main.clickOn(arg1);
        Thread.sleep(3000);
    }

    @Then("^User should navigate to \"([^\"]*)\" page$")
    public void user_should_navigate_to_page(String arg1) throws Throwable {

        if(arg1.equals("search")) {
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
    public void user_sees_box_on_right_side_of_menu_bar(String arg1) {

    }

    @Then("^Search box should hold watermark$")
    public void search_box_should_hold_watermark() {
        main.verifyWatermark();
    }

    @When("^User types \"([^\"]*)\" on \"([^\"]*)\" box$")
    public void user_types_on_box(String arg1, String arg2) {
        search = arg1;
        main.inputKey(arg2,arg1);
    }

    @When("^User sees logo on top of main page$")
    public void user_sees_logo_on_top_of_main_page() {
        main.verifyLogoIsDisplayed();
    }

    @Then("^Logo should be there in specific conditions$")
    public void logo_should_be_there_in_specific_conditions() {
        main.verifyLogo();
    }



    @Then("^Color of \"([^\"]*)\" title should change$")
    public void color_of_title_should_change(String arg1) {
        main.verifyColor(arg1);
    }

    @Then("^\"([^\"]*)\" title should be a link$")
    public void title_should_be_a_link(String arg1) {
        main.verifyLink(arg1);
    }

    @When("^User hovers on \"([^\"]*)\" title$")
    public void user_hovers_on_title(String arg1) throws InterruptedException {
        main.mouseOver(arg1);
    }

    @Then("^Submenus should be displayed under \"([^\"]*)\" title$")
    public void submenus_should_be_displayed_under_title(String arg1) {
        main.submenusIsDisplayed(arg1);

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
