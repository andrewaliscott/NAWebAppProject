package StepDefinitionFiles;

import NauWebProject.Driver;
import NauWebProject.SeleniumUtil;
import PageObjects.StudentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class YKStudentUS002 {
    StudentPage sp=new StudentPage();
    SeleniumUtil sU=new SeleniumUtil();
    //String str1,str2,str3,str4,str5,str6;

    List<String> menuItems=new ArrayList<String>();

    @Given("^User navigates \"([^\"]*)\" page$")
    public void user_navigates_page(String arg1) throws Throwable {
        sU.goToPage(arg1);
    }

    @When("^Check the menu items$")
    public void check_the_menu_items() throws Throwable {
        menuItems.add(sU.getText(sp.studentButton));
        menuItems.add(sU.getText(sp.registrarButton));
        menuItems.add(sU.getText(sp.bursarButton));
        menuItems.add(sU.getText(sp.internationalButton));
        menuItems.add(sU.getText(sp.itServicesButton));
        menuItems.add(sU.getText(sp.grievanceButton));
    }
    @Then("^Verify the menu items$")
    public void verify_the_menu_items(DataTable data) throws Throwable {

        List<List<String>> menu=data.raw();
        Assert.assertEquals(menu.get(0).get(0), menuItems.get(0));
        Assert.assertEquals(menu.get(0).get(1), menuItems.get(1));
        Assert.assertEquals(menu.get(0).get(2), menuItems.get(2));
        Assert.assertEquals(menu.get(0).get(3), menuItems.get(3));
        Assert.assertEquals(menu.get(0).get(4), menuItems.get(4));
        Assert.assertEquals(menu.get(0).get(5), menuItems.get(5));

    }

    @When("^Mouse hovers on menu items$")
    public void mouse_hovers_on_menu_items() throws Throwable {
        sU.getThread(2000);
        String str1=sU.getCSSvalue(sp.registrarButton,"color");
        sU.mouseOver(sp.registrarButton);
        Assert.assertNotEquals(str1, sU.getCSSvalue(sp.registrarButton,"color"));
        sU.getThread(2000);
        String str2=sU.getCSSvalue(sp.bursarButton,"color");
        sU.mouseOver(sp.bursarButton);
        Assert.assertNotEquals(str2, sU.getCSSvalue(sp.bursarButton,"color"));
        sU.getThread(2000);
        String str3=sU.getCSSvalue(sp.internationalButton,"color");
        sU.mouseOver(sp.internationalButton);
        Assert.assertNotEquals(str3, sU.getCSSvalue(sp.internationalButton,"color"));
        sU.getThread(2000);
        String str4=sU.getCSSvalue(sp.itServicesButton,"color");
        sU.mouseOver(sp.itServicesButton);
        Assert.assertNotEquals(str4, sU.getCSSvalue(sp.itServicesButton,"color"));
        sU.getThread(2000);
        String str5=sU.getCSSvalue(sp.grievanceButton,"color");
        sU.mouseOver(sp.grievanceButton);
        Assert.assertNotEquals(str5, sU.getCSSvalue(sp.grievanceButton,"color"));
        sU.getThread(2000);
        String str6=sU.getCSSvalue(sp.studentButton,"color");
        System.out.println(str6);
        sU.mouseOver(sp.registrarButton);
        Assert.assertNotEquals(str5, sU.getCSSvalue(sp.studentButton,"color"));
        System.out.println(sU.getCSSvalue(sp.studentButton,"color"));


    }

    @Then("^Verify the menu items text color change$")
    public void verify_the_menu_items_text_color_change() throws Throwable {
        //Assert.assertEquals("qwertyu",sU.findElement(sp.studentButton).getCssValue("background-color"),"rgba(0, 0, 0, 0)");


    }
}
