package StepDefinitionFiles;

import NauWebProject.SeleniumUtil;
import PageObjects.StudentPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class YKStudentUS008 {
    StudentPage sp=new StudentPage();
    SeleniumUtil sU= new SeleniumUtil();
    @When("^User click on International Students Button$")
    public void user_click_on_International_Students_Button() throws Throwable {
        sU.click(sp.internationalButton);

    }

    @Then("^User should able too \"([^\"]*)\",\"([^\"]*)\"and \"([^\"]*)\" menus$")
    public void user_should_able_too_and_menus(String arg1, String arg2, String arg3) throws Throwable {

    }

    @Then("^User able to see (\\d+) panel collapse button$")
    public void user_able_to_see_panel_collapse_button(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
