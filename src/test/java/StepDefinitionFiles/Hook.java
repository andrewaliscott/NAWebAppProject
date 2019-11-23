package StepDefinitionFiles;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import NauWebProject.Base;
import NauWebProject.Driver;

public class Hook extends Base {

    @Before ("@US001")
    public void beforeTest() {
        Driver.setDriver();
    }

    @After("@US001")
    public void afterTest() {
        Driver.closeDriver();
    }
}
