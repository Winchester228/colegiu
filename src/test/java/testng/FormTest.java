package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.FormPom;

public class FormTest {

    WebDriver driver;
    static public String URL = "https://demoqa.com/automation-practice-form";
    static public String USER_NAME = "Maxim";


    @BeforeClass
    public void beforeTest() {
        driver = Driver.getRemoteDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void fillFormTest() {
        driver.get(URL);
        FormPom form = new FormPom(driver);
        form.setFirstName(USER_NAME);
    }

    @AfterClass
    public void afterTest() {
        driver.quit();
    }
}