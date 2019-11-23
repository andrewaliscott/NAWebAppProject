package StepDefinitionFiles;

import NauWebProject.Driver;
import NauWebProject.SeleniumUtil;
import PageObjects.StudentPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.util.List;
import java.util.Set;

public class YKStudentUS005 {
    StudentPage sp=new StudentPage();
    SeleniumUtil sU=new SeleniumUtil();
    @When("^User able to see myNAuLogin button  and click$")
    public void user_able_to_see_myNAuLogin_button_and_click() throws Throwable {
        // on the quick links myNauLogin and NauMoodleLOgin doesnot work
        Assert.assertTrue(sU.findElements(sp.NAUEmailLogin).size()>0);
        System.out.println("bigger than zero");
        sU.click(sp.NAUEmailLogin);
    }

    @Then("^User shoudl able to access \"([^\"]*)\" on an ew tab$")
    public void user_shoudl_able_to_access_on_an_ew_tab(String arg1) throws Throwable {
        List<String> pageID=
        sU.getListMultiplePage();
        Driver.getDriver().switchTo().window(pageID.get(1));//i want to get second page url to verfication
        Assert.assertTrue(sU.getUrl().contains(arg1));
        Driver.getDriver().switchTo().window(pageID.get(0));







        /*
        int i=0;
        Set<String> id=Driver.getDriver().getWindowHandles();
        String parent="";
        String child="";
        for(String windowValue : id)
        {
            i++;
            if(i==1){
                parent=windowValue;
            }
            else
            {
                child=windowValue;
            }
            System.out.println(i+". windows title is:"+Driver.getDriver().getTitle());
        }

        Driver.getDriver().switchTo().window(parent);
        System.out.println("parent url:"+sU.getUrl());
        Driver.getDriver().switchTo().window(child);
        System.out.println("child url:"+sU.getUrl());
        System.out.println(arg1);
        Assert.assertTrue(sU.getUrl().contains(arg1));
        System.out.println("i have the arg1 in url");

        */






    }
}
