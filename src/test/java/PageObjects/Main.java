package PageObjects;

import NauWebProject.Base;
import NauWebProject.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.*;

public class Main extends Base {

    private String color = "";

    private By requestL = By.xpath("//span[text()='Request Info']/..");
    private By applyL = By.xpath("//span[text()='Apply Now']/..");
    private By portalL = By.xpath("//span[text()='365 Portal']/..");
    private By logoL = By.cssSelector("img[alt='North American University Logo']");
    private By searchL = By.cssSelector(".ubermenu-search-input");
    private By submitL = By.cssSelector("input[type='submit']");
    private By portalSign = By.cssSelector("input[type='email']");
    private By portalPass = By.cssSelector("input[type='password']");
    private By portalSubmit = By.cssSelector("input[type='submit']");
    private By portalSubmit2 = By.cssSelector("input[id='idBtn_Back']");
    private By admissionsL = By.xpath("//span[text()='Admissions']");
    private By academicsL = By.xpath("//span[text()='Academics']");
    private By facultyL = By.xpath("//span[text()='Faculty & Staff']");
    private By campusL = By.xpath("//span[text()='Campus Life']");
    private By studentsL = By.xpath("//span[text()='Students']");
    private By aboutNauL = By.xpath("//span[text()='About NAU']");
    private By underGraduateL = By.cssSelector("#menu-item-1754 > a > span");
    private By applyUnderGL = By.cssSelector("#menu-item-1772 > a > span");
    private By degreePUnderGL = By.cssSelector("#menu-item-1773 > a > span");
    private By tuitionUnderGL = By.cssSelector("#menu-item-1774 > a > span");
    private By scholarshipUnderGL = By.cssSelector("#menu-item-1775 > a > span");
    private By internationalUnderGL = By.cssSelector("#menu-item-1776 > a > span");

    private By graduateL = By.cssSelector("#menu-item-1756 > a > span");
    private By applyNGL = By.cssSelector("#menu-item-2264 > a > span");
    private By graduateDGL = By.cssSelector("#menu-item-2264 > a > span");
    private By tuitionGL = By.cssSelector("#menu-item-2341 > a > span");
    private By distanceEGL = By.cssSelector("#menu-item-2344 > a > span");
    private By internationalGL = By.cssSelector("#menu-item-2344 > a > span");

    private By gulfLSL = By.cssSelector("#menu-item-1759 > a > span");
    private By applyNGLSL = By.cssSelector("#menu-item-2482 > a > span");
    private By glsAGLSL = By.cssSelector("#menu-item-2483 > a > span");
    private By glsPGLSL = By.cssSelector("#menu-item-2484 > a > span");
    private By glsSGLSL = By.cssSelector("#menu-item-2485 > a > span");
    private By glsFGLSL = By.cssSelector("#menu-item-2486 > a > span");

    private By imageAdmL = By.cssSelector("#menu-item-1758 > div > img");

    private By undergPL = By.xpath("//span[text()='Undergraduate Programs']");
    private By graduatePL = By.xpath("//span[text()='Graduate Programs']");
    private By glsPL = By.xpath("//*[@id='menu-item-5679']/div/ul/li[3]/a/span");
    private By distanceEL = By.xpath("//*[@id='menu-item-5679']/div/ul/li[4]/a/span");
    private By educatorCL = By.xpath("//*[@id='menu-item-5679']/div/ul/li[4]/a/span");
    private By certificationPL = By.xpath("//*[@id='menu-item-5679']/div/ul/li[6]/a/span");

    private By academicResL = By.cssSelector("#menu-item-5681 > a > span");
    private By academicClbL = By.cssSelector("#menu-item-1751 > a > span");
    private By nauLL = By.cssSelector("#menu-item-5682 > a > span");
    private By facultyML = By.cssSelector("#menu-item-5683 > a > span");
    private By brochuresL = By.cssSelector("#menu-item-5684 > a > span");

    private By academicCatL = By.cssSelector("#menu-item-5686 > div > ul > li:nth-child(1) > a > span");
    private By academicCalL = By.cssSelector("#menu-item-5686 > div > ul > li:nth-child(2) > a > span");
    private By studentAchL = By.cssSelector("#menu-item-5686 > div > ul > li:nth-child(3) > a > span");
    private By courseSL = By.cssSelector("#menu-item-5686 > div > ul > li:nth-child(4) > a > span");
    private By finalsSL = By.cssSelector("#menu-item-5686 > div > ul > li:nth-child(5) > a > span");

    private By imageAcdL = By.cssSelector("#menu-item-5720 > div > img");

    private By office365FL = By.xpath("//*[@id='menu-item-5723']/div/ul/li[1]/a/span[1]");
    private By feesAndDepFL = By.xpath("//*[@id='menu-item-5723']/div/ul/li[2]/a/span[1]");
    private By passwordRFL = By.xpath("//*[@id='menu-item-5723']/div/ul/li[3]/a/span[1]");
    private By itServicesFL = By.xpath("//*[@id='menu-item-5723']/div/ul/li[4]/a/span[1]");

    private By employeeCL = By.cssSelector("#menu-item-5733 > a > span");
    private By humanRL = By.cssSelector("#menu-item-5739 > a > span");
    private By employeeFL = By.cssSelector("#menu-item-5742 > a > span");
    private By facultyMemL = By.cssSelector("#menu-item-5743 > a > span");
    private By employeeHbL = By.cssSelector("#menu-item-5745 > a > span");

    private By newsAndEL = By.cssSelector("#menu-item-5734 > a > span");
    private By headlinesL = By.cssSelector("#menu-item-5746 > a > span");
    private By announcementsL = By.cssSelector("#menu-item-5747 > a > span");
    private By calenderOfEFL = By.cssSelector("#menu-item-5749 > a > span");
    private By studentWL = By.cssSelector("#menu-item-5750 > a > span");

    private By imageFacL = By.cssSelector("#menu-item-5736 > div > img");

    private By studentSerL = By.cssSelector("#menu-item-5751 > a > span");
    private By studentOrgL = By.cssSelector("#menu-item-5754 > a > span");
    private By calenderOfECL = By.cssSelector("#menu-item-5755 > a > span");
    private By nauAtlL = By.cssSelector("#menu-item-5756 > a > span");
    private By healthSerL = By.cssSelector("#menu-item-5757 > a > span");

    private By residentialLL = By.cssSelector("#menu-item-5752 > a > span");
    private By housingL = By.cssSelector("#menu-item-5758 > a > span");
    private By diningANL = By.cssSelector("#menu-item-5759 > a > span");
    private By residentsHbL = By.cssSelector("#menu-item-5761 > a > span");
    private By feesAndDepCL = By.cssSelector("#menu-item-5762 > a > span");

    private By parkingSecL = By.cssSelector("#menu-item-5753 > a > span");
    private By parkingEnfL = By.cssSelector("#menu-item-5763 > a > span");
    private By campusSecL = By.cssSelector("#menu-item-5764 > a > span");
    private By emergencyGL = By.cssSelector("#menu-item-5765 > a > span");
    private By campusCRL = By.cssSelector("#menu-item-5767 > a > span");

    private By imageCamL = By.cssSelector("#menu-item-5770 > div > img");

    private By office365SL = By.xpath("//*[@id='menu-item-5772']/div/ul/li[1]/a/span[1]");
    private By feesAndDepSL = By.xpath("//*[@id='menu-item-5772']/div/ul/li[2]/a/span[1]");
    private By passwordRSL = By.xpath("//*[@id='menu-item-5772']/div/ul/li[3]/a/span[3]");
    private By itServicesSL = By.xpath("//*[@id='menu-item-5772']/div/ul/li[4]/a/span[1]");

    private By officesSL = By.cssSelector("#menu-item-5773 > a > span");
    private By bursarsOL = By.cssSelector("#menu-item-5774 > a > span");
    private By registrarSL = By.cssSelector("#menu-item-5775 > a > span");
    private By intStudentsL = By.cssSelector("#menu-item-5779 > a > span");
    private By studentsSucL = By.cssSelector("#menu-item-5780 > a > span");

    private By studentHbL = By.xpath("//span[text()='Student Handbook']");
    private By academicCatSL = By.xpath("//*[@id='menu-item-5782']/div/ul/li[2]/a/span");
    private By academicCalSL = By.xpath("//*[@id='menu-item-5782']/div/ul/li[3]/a/span");
    private By studentAchSL = By.xpath("//span[text()='Student Handbook']");
    private By financialAidSL = By.xpath("//span[text()='Financial Aid']");
    private By studentsJobSL = By.xpath("//span[text()='Student Jobs']");
    private By careerSerSL = By.xpath("//span[text()='Career Services']");

    private By imageStuL = By.cssSelector("#menu-item-5784 > div > img");

    private By missionSL = By.xpath("//span[text()='Mission Statement']");
    private By statementL = By.cssSelector("#menu-item-5790 > div > div");

    private By officeOfPL = By.cssSelector("#menu-item-5788 > a > span");
    private By welcomeML = By.cssSelector("#menu-item-5791 > a > span");
    private By boardOfTL = By.cssSelector("#menu-item-5792 > a > span");
    private By accreditationL = By.cssSelector("#menu-item-5793 > a > span");
    private By brochuresANL = By.cssSelector("#menu-item-5794 > a > span");

    private By detailsANL = By.cssSelector("#menu-item-5789 > a > span");
    private By nauHistoryL = By.cssSelector("#menu-item-5795 > a > span");
    private By aboutHouL = By.cssSelector("#menu-item-5796 > a > span");
    private By nauPolL = By.cssSelector("#menu-item-5797 > a > span");
    private By studentAchANL = By.cssSelector("#menu-item-5798 > a > span");

    private By imageAboL = By.cssSelector("#menu-item-5800 > div > img");


    private List<By> admissionsList = new ArrayList<>(
            Arrays.asList(underGraduateL,applyUnderGL,degreePUnderGL,tuitionUnderGL,scholarshipUnderGL,internationalUnderGL,
                    graduateL,applyNGL,graduateDGL,tuitionGL,distanceEGL,internationalGL,
                    gulfLSL,applyNGLSL,glsAGLSL,glsPGLSL,glsSGLSL,glsFGLSL,
                    imageAdmL)
    );

    private List<By> academicsList = new ArrayList<>(
            Arrays.asList(undergPL,graduatePL,glsPL,distanceEL,educatorCL,certificationPL,
                    academicResL,academicClbL,nauLL,facultyML,brochuresL,
                    academicCatL,academicCalL,studentAchL,courseSL,finalsSL,
                    imageAcdL)
    );

    private List<By> facultyList = new ArrayList<>(
            Arrays.asList(office365FL,feesAndDepFL,passwordRFL,itServicesFL,
                    employeeCL,humanRL,employeeFL,facultyMemL,employeeHbL,
                    newsAndEL,headlinesL,announcementsL,calenderOfEFL,studentWL,
                    imageFacL)
    );

    private List<By> campusList = new ArrayList<>(
            Arrays.asList(studentSerL,studentOrgL,calenderOfECL,nauAtlL,healthSerL,
                    residentialLL,housingL,diningANL,residentsHbL,feesAndDepCL,
                    parkingSecL,parkingEnfL,campusSecL,emergencyGL,campusCRL,
                    imageCamL)
    );

    private List<By> studentsList = new ArrayList<>(
            Arrays.asList(office365SL,feesAndDepSL,passwordRSL,itServicesSL,
                    officesSL,bursarsOL,registrarSL,intStudentsL,studentsSucL,
                    studentHbL,academicCatSL,academicCalSL,studentAchSL,financialAidSL,studentsJobSL,careerSerSL,
                    imageStuL)
    );

    private List<By> aboutNauList = new ArrayList<>(
            Arrays.asList(missionSL,statementL,
                    officeOfPL,welcomeML,boardOfTL,accreditationL,brochuresANL,
                    detailsANL,nauHistoryL,aboutHouL,nauPolL,studentAchANL,
                    imageAboL)
    );

    public void submenusIsDisplayed(String menu) {
        List<By> menuL=null;
        switch (menu){
            case "Admissions" : menuL = admissionsList; break;
            case "Academics" : menuL = academicsList; break;
            case "Faculty&Staff" : menuL = facultyList; break;
            case "CampusLife" : menuL = campusList; break;
            case "Students" : menuL = studentsList; break;
            case "AboutNAU" : menuL = aboutNauList; break;
        }

        assert menuL != null;
        for (Object o : menuL) {
                seleniumUtil.isDisplayed((By) o);
            }
    }

    public void clickOn(String locator) {
        switch (locator){
            case "request" : seleniumUtil.click(requestL); break;
            case "apply" : seleniumUtil.click(applyL); break;
            case "portal" : seleniumUtil.click(portalL); break;
            case "logo" : seleniumUtil.click(logoL); break;
            case "submit" : seleniumUtil.click(submitL); break;
            default:break;
        }
    }

    public void signInPortal(String username, String password) throws IOException, InterruptedException {
        Set<String> page = Driver.getDriver().getWindowHandles();
        Iterator<String> myWindows = page.iterator();
        String main = myWindows.next();
        String portal = myWindows.next();
        Driver.getDriver().switchTo().window(portal);

        seleniumUtil.sendKeys(portalSign, Driver.getProp(username));
        seleniumUtil.enter(portalSign);
        Thread.sleep(1000);
        seleniumUtil.sendKeys(portalPass,Driver.getProp(password));
        seleniumUtil.enter(portalPass);
        Thread.sleep(1000);
        seleniumUtil.click(portalSubmit2);
    }

    private WebElement getElement(String locator) {
        WebElement element=null;
        switch (locator) {
            case "request" : element = seleniumUtil.findElement(requestL); break;
            case "apply" : element = seleniumUtil.findElement(applyL); break;
            case "portal" : element = seleniumUtil.findElement(portalL); break;
            case "logo" : element = seleniumUtil.findElement(logoL); break;
            case "Admissions" : element = seleniumUtil.findElement(admissionsL); break;
            case "Academics" : element = seleniumUtil.findElement(academicsL); break;
            case "Faculty&Staff" : element = seleniumUtil.findElement(facultyL); break;
            case "CampusLife" : element = seleniumUtil.findElement(campusL); break;
            case "Students" : element = seleniumUtil.findElement(studentsL); break;
            case "AboutNAU" : element = seleniumUtil.findElement(aboutNauL); break;
        }
        return element;
    }

    private By getLocator(String locator) {

        By locatorL = null;
        switch (locator) {
            case "request" : locatorL = requestL; break;
            case "apply" : locatorL = applyL; break;
            case "portal" : locatorL = portalL; break;
            case "search" : locatorL = searchL; break;
            case "logo" : locatorL = logoL; break;
            case "Admissions" : locatorL = admissionsL; break;
            case "Academics" : locatorL = academicsL; break;
            case "Faculty&Staff" : locatorL = facultyL; break;
            case "CampusLife" : locatorL = campusL; break;
            case "Students" : locatorL = studentsL; break;
            case "AboutNAU" : locatorL = aboutNauL; break;
        }
        return locatorL;
    }

    public void inputKey(String locator, String input) {
        seleniumUtil.sendKeys(getLocator(locator),input);
    }

    public void verifyInput(String locator) {
        String text = seleniumUtil.findElement(getLocator(locator)).getAttribute("placeholder");
        System.out.println("input value : "+text);
    }

    public void verifyWatermark() {
        Assert.assertEquals(seleniumUtil.findElement(searchL).getAttribute("placeholder"),"Search...");
    }

    public void verifyLogoIsDisplayed() {
        Assert.assertTrue(seleniumUtil.isDisplayed(logoL));
    }

    public void verifyLogo() {
        String color = getElement("logo").getCssValue("color");
        String bColor = getElement("logo").getCssValue("background-color");
        String expectedColor = "rgba(0, 93, 135, 1)";
        String expectedBColor = "rgba(0, 0, 0, 0)";

        Assert.assertEquals(expectedColor,color);
        Assert.assertEquals(expectedBColor,bColor);
    }

    public void mouseOver(String locator) throws InterruptedException {
        color = getElement(locator).getCssValue("color");
        seleniumUtil.getActions().moveToElement(getElement(locator)).build().perform();
        Thread.sleep(1000);
    }

    public void verifyColor(String locator) {
        Assert.assertNotEquals(color,getElement(locator).getCssValue("color"));
    }

    public void verifyLink(String locator) {
        WebElement element = getElement(locator);
        Assert.assertTrue(seleniumUtil.isClickable(element));
    }
}