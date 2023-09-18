package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DashboardPage {
    /****************************************************ATTRIBUTES****************************************************/
    private WebDriver driver;

    /****************************************************CONSTRUCTORS**************************************************/
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /****************************************************WEB-ELEMENTS**************************************************/
    //Dashboard tab element
    @FindBy(id = "dashboardTab")
    WebElement dashboardTab;

   @FindBy(id = "newsfeedTab")
     WebElement newsfeedTab;
  //  WebElement newsfeedTab = driver.findElement(By.id("newsfeedTab"));
    /****************************************************METHODS*******************************************************/

    public void clickNewsfeedTab()
    {
        newsfeedTab.click();
    }

    /**********************************************ASSERTIONS-METHODS**************************************************/

    public void successfulLogin()
    {
        String expectedResult = "https://portal-testing.parent.cloud/overview";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"SUCCESSFUL LOGIN ASSERTION");
    }

    public void displayedDashboard()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(dashboardTab.isDisplayed(),"DASHBOARD IS DISPLAYED ASSERTION");
    }
}

