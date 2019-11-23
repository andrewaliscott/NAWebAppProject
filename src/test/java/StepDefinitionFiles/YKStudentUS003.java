package StepDefinitionFiles;

import NauWebProject.SeleniumUtil;
import PageObjects.StudentPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class YKStudentUS003 {
    SeleniumUtil sU = new SeleniumUtil();
    StudentPage sp = new StudentPage();

    @When("^User able to see search box at right top$")
    public void user_able_to_see_search_box_at_right_top() throws Throwable {

        Assert.assertTrue(sU.findElements(sp.studentPageSeearchBox).size() > 0);

    }

    @Then("^Search box should  have \"([^\"]*)\"$")
    public void search_box_should_have(String arg1) throws Throwable {

        Assert.assertEquals(sU.getAttribute(sp.studentPageSeearchBox, "placeholder"), arg1);

        //System.out.println(arg1);

        //System.out.println(sU.findElement(sp.studentPageSeearchBox).getAttribute("placeholder"));

    }

    @When("^User enter a key word includes lowercase, uppercase letters and numbers \"([^\"]*)\"$")
    public void user_enter_a_key_word_includes_lowercase_uppercase_letters_and_numbers(String arg1) throws Throwable {
        sU.sendKeys(sp.studentPageSeearchBox, arg1);
        sU.findElement(sp.studentPageSeearchBox).sendKeys(Keys.ENTER);

    }

    @Then("^Current url contains the exact key word \"([^\"]*)\"$")
    public void current_url_contains_the_exact_key_word(String arg1) throws Throwable {

        System.out.println(sU.getUrl());
        Assert.assertTrue(sU.getUrl().contains(arg1));

    }
    @When("^User enters any special character \"([^\"]*)\"$")
    public void user_enters_any_special_character(String arg1) throws Throwable {
        sU.sendKeys(sp.studentPageSeearchBox,arg1);
        sU.findElement(sp.studentPageSeearchBox).sendKeys(Keys.ENTER);
    }

    @Then("^user able see oops! message$")
    public void user_able_see_oops_message() throws Throwable {
        Assert.assertTrue(sU.findElements(sp.oops).size()>0);


    }


    @When("^User click on search box$")
    public void user_click_on_search_box() throws Throwable {
        sU.findElement(sp.studentPageSeearchBox).click();

    }

    @Then("^user able to see search history \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_able_to_see_search_history_and(String arg1, String arg2) throws Throwable {

        //System.out.println(sp.getAllOptions(sp.studentPageSeearchBox));
        //System.out.println(Arrays.toString(sp.getAllOptions(sp.studentPageSeearchBox)));
        //String str=sp.getAllOptions(sp.studentssearchbox2).get(0);




    }

}