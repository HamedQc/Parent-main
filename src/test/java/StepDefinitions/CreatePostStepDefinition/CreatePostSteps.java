package StepDefinitions.CreatePostStepDefinition;


import StepDefinitions.Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import pages.NewsfeedPage;

public class CreatePostSteps {

    LoginPage lp = new LoginPage(Hooks.driver);
    DashboardPage dp = new DashboardPage(Hooks.driver);
    NewsfeedPage np = new NewsfeedPage(Hooks.driver);

    @Given("^Organization-Admin inserts valid username \"(.*)\"$")
    public void insertUsername(String username)
    {
        lp.insertUsername(username);
    }

    @And("^inserts valid password \"(.*)\"$")
    public void insertPassword(String password)
    {
        lp.insertPassword(password);
    }

    @When("clicks on submit button")
    public void submit()
    {
        lp.clickSubmit();
    }

    @Then("Dashboard webpage is displayed by default")
    public void dashboardDisplayed()
    {
        dp.displayedDashboard();
    }

    @When("Organization-Admin clicks on Newsfeed tab")
    public void openNewsfeed()
    {
        dp.clickNewsfeedTab();
    }

    @And("clicks on \"Write your post here\"")
    public void openCreatePostWindow()
    {
        np.clickWritePostHere();
    }

    @And("clicks on \"search for recipients\"")
    public void selectRecipient()
    {
        np.chooseRecipient();
    }

    @And("^writes \"(.*)\"$")
    public void writePostContext(String statement)
    {
        np.writePostContext(statement);
    }
    @And("clicks on post button")
    public void clicksOnPostButton() {
        np.clickPostBtn();

    }
    @And("clicks on \"Upload Files\"")
    public void openUploadFilesWindow(){
        np.clickUploadFiles();}

    @And("clicks on \"Live Video\"")
    public void openLiveVideoWindow(){ np.clickLiveVideo();}

    @And("clicks on \"Add Inspiration\"")
    public void openAddInspirationWindow(){ np.clickAddInspiration();}

    @And("selects \"Public Inspiration\"")
    public void selectPublicInspiration(){ np.selectPublicInspiration();}

    @When("clicks on Edit button")
    public void clicksOnEditButton() {
        np.EditPostBtn();
    }


    @And("Edit post {string}")
    public void editPost(String newPost) {

        np.EditText(newPost);

    }
    @When("clicks on Delete Post")
    public void clicksOnDeletePost() {
    np.DeletePost();

    }

    @And("Confirm post is deleted")
    public void confirmPostIsDeleted() {
    }
}
