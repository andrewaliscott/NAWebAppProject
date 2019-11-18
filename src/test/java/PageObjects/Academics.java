package PageObjects;

import org.openqa.selenium.By;

public class Academics {
    public By getAcademics() {
        return academics;
    }

    private By academics=By.linkText ( "Academics" );

    }

