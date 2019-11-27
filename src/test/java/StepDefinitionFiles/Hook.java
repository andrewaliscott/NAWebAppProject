package StepDefinitionFiles;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import NauWebProject.Base;
import NauWebProject.Driver;

import java.io.IOException;

public class Hook extends Base {

    @Before
    public void beforeTest() throws IOException {
        Driver.setDriver();
        seleniumUtil.goToPage("main");
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void afterTest() {
        Driver.closeDriver();
    }

}
