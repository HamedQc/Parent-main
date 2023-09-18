package StepDefinitions.Hooks;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Hooks {
    /********************************************ATTRIBUTES*************************************/
    public static WebDriver driver;

    /*********************************************METHODS****************************************************/

    @Before
    public void setUpEnvironment()
    {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver.get("https://portal-staging.parent.cloud/login");
        driver.manage().window().maximize();

        String expectedResult = "https://portal-staging.parent.cloud/login";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"SETUP ENVIRONMENT ASSERTION");
    }

    @After
    public void clearUpEnvironment() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
