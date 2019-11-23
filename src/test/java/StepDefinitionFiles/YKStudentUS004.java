package StepDefinitionFiles;

import NauWebProject.SeleniumUtil;
import PageObjects.StudentPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class YKStudentUS004 {
    StudentPage sp=new StudentPage();
    SeleniumUtil sU=new SeleniumUtil();
    String [] quickLinksColor=new String [sp.getQuickLinks().size()];
    String [] afterMouseoverQuickLinksColor=new String [sp.getQuickLinks().size()];
    @When("^User able to see Quick links and mouser over all links$")
    public void user_able_to_see_Quick_links_and_mouser_over_all_links() throws Throwable {
        for (int i=0;i<sp.getQuickLinks().size();i++){
            sU.getThread(2000);
            quickLinksColor[i]= sU.getCSSvalue(sp.getQuickLinks().get(i),"color");
            sU.getThread(2000);
            sU.mouseOver(sp.getQuickLinks().get(i));
            sU.getThread(2000);
            afterMouseoverQuickLinksColor[i]=sU.getCSSvalue(sp.getQuickLinks().get(i),"color");
            sU.getThread(2000);
            System.out.println("before"+i+quickLinksColor[i]);
            System.out.println("after"+i+afterMouseoverQuickLinksColor[i]);
            }

        //sU.mouseOver(sp.NAULibrary);
        //System.out.println(sU.getCSSvalue(sp.NAULibrary,"color"));
       // sU.getThread(2000);
       //sU.mouseOver(sp.myNAULogin);
       //System.out.println(sU.getCSSvalue(sp.myNAULogin,"color"));
       // sU.getThread(2000);
        //sU.mouseOver(sp.NAUMoodleLogin);
       // System.out.println(sU.getCSSvalue(sp.NAUMoodleLogin,"color"));
        //sU.getThread(2000);
        //sU.mouseOver(sp.NAUEmailLogin);
        //System.out.println(sU.getCSSvalue(sp.NAUEmailLogin,"color"));
        //sU.getThread(2000);
        //sU.mouseOver(sp.NAUBrochures);
        //System.out.println(sU.getCSSvalue(sp.NAUBrochures,"color"));
        //sU.getThread(2000);
        //sU.mouseOver(sp.GulfLanguageSchool);
        //System.out.println(sU.getCSSvalue(sp.GulfLanguageSchool,"color"));
        //sU.getThread(2000);

    }

    @Then("^All quick links items should be clickable$")
    public void all_quick_links_items_should_be_clickable() throws Throwable {
        for (int i=0;i<sp.getQuickLinks().size();i++){
            Assert.assertTrue(sU.findElement(sp.getQuickLinks().get(i)).isEnabled());
            System.out.println("button "+i+"clickable");

        }
    }

    @Then("^Link text shoudl be change when user mouse over$")
    public void link_text_shoudl_be_change_when_user_mouse_over() throws Throwable {

        Assert.assertNotEquals(quickLinksColor[0],afterMouseoverQuickLinksColor[0]);
        Assert.assertEquals(quickLinksColor[1],afterMouseoverQuickLinksColor[1]);
        Assert.assertEquals(quickLinksColor[2],afterMouseoverQuickLinksColor[2]);
        Assert.assertNotEquals(quickLinksColor[3],afterMouseoverQuickLinksColor[3]);
        Assert.assertNotEquals(quickLinksColor[4],afterMouseoverQuickLinksColor[4]);
        Assert.assertNotEquals(quickLinksColor[5],afterMouseoverQuickLinksColor[5]);
         /*
        for (int i=0;i<sp.getQuickLinks().size();i++){
            Assert.assertNotEquals(quickLinksColor[i],afterMouseoverQuickLinksColor[i]);
        }


          */



    }
}
