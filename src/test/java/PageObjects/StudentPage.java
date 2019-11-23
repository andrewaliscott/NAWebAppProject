package PageObjects;

import NauWebProject.Base;
import NauWebProject.Driver;
import NauWebProject.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentPage extends Base {
    SeleniumUtil sU=new SeleniumUtil();
    public By studentPageButton = By.id("menu-item-898");
    public By getStudentPageButtonText=By.cssSelector("#menu-item-898 > a");
    public By studentButton=By.cssSelector("a[href='http://qatest2119.na.edu/students/']");
    public By registrarButton=By.cssSelector("a[href='http://qatest2119.na.edu/students/registrar/']");
    public By bursarButton=By.cssSelector("a[href='http://qatest2119.na.edu/students/bursars-office/']");
    public By internationalButton=By.cssSelector("a[href='http://qatest2119.na.edu/students/international-student-office/']");
    public By itServicesButton=By.cssSelector("a[href='http://qatest2119.na.edu/students/it-services/']");
    public By grievanceButton=By.cssSelector("a[href='http://qatest2119.na.edu/students/grievance-procedure/']");
    public By studentPageSeearchBox=By.className("ubermenu-search-input");
    public By oops=By.className("oops");

    public By NAULibrary=By.cssSelector("a[href='/academics/library/']");
    public By myNAULogin=By.cssSelector("a[href='https://portal.office.com/myapps']");
    public By NAUMoodleLogin=By.cssSelector("a[href='https://portal.office.com/myapps']");
    public By NAUEmailLogin=By.cssSelector("a[href='https://outlook.office365.com/owa']");
    public By NAUBrochures=By.cssSelector("a[href='/brochures/']");
    public By GulfLanguageSchool=By.cssSelector("a[href='/gls']");

    public List<By> getQuickLinks (){
        List<By> quickLinks= new ArrayList<By>(Arrays.asList(NAULibrary,myNAULogin,NAUMoodleLogin,NAUEmailLogin,NAUBrochures,GulfLanguageSchool));
        //quickLinks.add(NAULibrary);
       // quickLinks.add(myNAULogin);
       // quickLinks.add(NAUMoodleLogin);
       // quickLinks.add(NAUEmailLogin);
       // quickLinks.add(NAUBrochures);
       // quickLinks.add(GulfLanguageSchool);
        return quickLinks;
    }

    public By studentssearchbox2=By.cssSelector("#menu-item-4549 > div > div > div > form > input.ubermenu-search-input");


    public List<String> getAllOptions(By by) {
        List<String> options = new ArrayList<>();
        for (WebElement option : new Select(Driver.getDriver().findElement(by)).getOptions()) {
            String txt = option.getText();
            //System.out.println(txt);
            if (option.getAttribute("value") != "") options.add(option.getText());
        }
        return options;

    }

}