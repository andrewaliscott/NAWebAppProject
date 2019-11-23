package NauWebProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver==null) {
            setDriver();
        }
        return driver;
    }

    public static void setDriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }

    public static void closeDriver() {
        if(driver!=null) {
        driver.quit();
        driver=null;
        }
    }

    public static String getProp(String url) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis=new FileInputStream("src/test/java/NauWebProject/global.properties");
        prop.load(fis);
        return prop.getProperty(url);
    }
}
