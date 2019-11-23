package StepDefinitionFiles;

import NauWebProject.Base;
import NauWebProject.Driver;
import NauWebProject.SeleniumUtil;
import PageObjects.StudentPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;

public class YKStudentUS001 extends Base {
    String str;
    StudentPage sp=new StudentPage();
    SeleniumUtil sU= new SeleniumUtil();
    @Given("^User access \"([^\"]*)\"$")
    public void user_access(String arg1) throws Throwable {
        sU.goToPage(arg1);


    }
    @When("^User hover on the student button$")
    public void user_hover_on_the_student_button() throws Throwable {
        String str=sU.getCSSvalue(sp.getStudentPageButtonText,"color");
        sU.mouseOver(sp.getStudentPageButtonText);


    }

    @Then("^Button supposed to be clickable$")
    public void button_supposed_to_be_clickable() throws Throwable {
        Assert.assertTrue(sU.findElement(sp.studentPageButton).isEnabled());

    }

    @Then("^The color of the button should change$")
    public void the_color_of_the_button_should_change() throws Throwable {
       // Assert.assertEquals("qwertyu",sU.findElement(sp.studentPageButton).getCssValue("background-color"),"rgba(0, 0, 0, 0)");
        System.out.println(str);
       Assert.assertNotEquals(sU.getCSSvalue(sp.getStudentPageButtonText,"color"),str);
        System.out.println(sU.getCSSvalue(sp.getStudentPageButtonText,"color"));



    }

    @When("^User clicks the student button$")
    public void user_clicks_the_student_button() throws Throwable {
        sU.click(sp.studentPageButton);

    }

    @Then("^User navigates student page and verify \"([^\"]*)\"$")
    public void user_navigates_student_page_and_verify(String arg1) throws Throwable {
        Assert.assertEquals(Driver.getProp(arg1),sU.getUrl());

    }


}
