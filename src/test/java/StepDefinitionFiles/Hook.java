package StepDefinitionFiles;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import NauWebProject.Base;
import NauWebProject.Driver;

public class Hook extends Base {

    @Before
    public void beforeTest() {
        Driver.setDriver();
    }

    @After
    public void afterTest() {
        Driver.closeDriver();
    }
}
