package StepDefinitions.LoginStepDefinition;

import StepDefinitions.Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;


public class LoginSteps {
    LoginPage lp = new LoginPage(Hooks.driver);
    DashboardPage dp = new DashboardPage(Hooks.driver);

    @When("^user inserts valid username \"(.*)\"$")
    public void entersUsername(String username)
    {
        lp.insertUsername(username);
    }
    @And("^inserts valid password \"(.*)\"$")
    public void entersPassword(String password)
    {
        lp.insertPassword(password);
    }

    @And("clicks on submit button")
    public void logIn()
    {
        lp.clickSubmit();
    }

    @Then("user is logged-in to his account")
    public void loginSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        dp.successfulLogin();
    }
    @And("dashboard interface is displayed")
    public void dashbaordDisplayed()
    {
        dp.displayedDashboard();
    }
}
