package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class NewsfeedPage {

    /****************************************************ATTRIBUTES****************************************************/
    private WebDriver driver;


    /****************************************************CONSTRUCTORS**************************************************/
    public NewsfeedPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /****************************************************WEB-ELEMENTS**************************************************/

    @FindBy(xpath = "//div[contains(text(),'Write your post here')]")
    WebElement writePostHere;

    @FindBy(xpath = "//div[contains(@data-intercom-target,\"add-attachment button\")]")
    WebElement uploadFilesBtn;

    @FindBy(xpath = "//div[contains(@data-intercom-target,\"live-video button\")]")
    WebElement liveVideoBtn;

    @FindBy(xpath = "//div[contains(@data-intercom-target,\"add-inspiration button\")]")
    WebElement addInspirationBtn;

    @FindBy(id = "Recipients")
    WebElement recipientsSearchTxt;

    @FindBy(xpath = "//span[contains(text(),'Hamed Institute (Children and staff)')]")
    WebElement child_and_staff;

    @FindBy(xpath = "(//h2[contains(@class,'transaction-tab')])[2]")
    WebElement privateinspiration;

    @FindBy(id = "inspirationItem0")
    WebElement selectPost;
    @FindBy(name = "addInspiration")
    WebElement doneBtn;

    @FindBy(xpath = "//div[@class='ql-editor ql-blank'][@data-placeholder = 'Write your post here']")
    WebElement writePostTxtArea;

    @FindBy(id = "pushActionRefuse")
    WebElement alertBoxNoThanksBtn;

    @FindBy(id ="postDataBtn" )
    WebElement postButton;

   //@FindBy(xpath = "//span[@class='picon picon-dots menu-icon-dots ng-tns-c350-13']")
    //@FindBy(className = "span.picon.picon-dots.menu-icon-dots.ng-tns-c350-13")
   @FindBy(id = "dropdownMenu_0")
    WebElement editDots;

    @FindBy (id = "editPostBtn_0")
    WebElement editPostBtn;
    @FindBy(xpath = "//div[contains(@class,'ql-editor')]")
    WebElement editBox;

    @FindBy(id = "deletePostBtn_0")
    WebElement deletePost;
    @FindBy(id = "modalMainBtn")
    WebElement confirmDelete;

 //   @FindBy(className  = "ng-tns-c119-27 toast-message ng-star-inserted")
   // WebElement assertDelete;






    /****************************************************METHODS*******************************************************/

    public void clickWritePostHere()
    {
        writePostHere.click();
    }

    public void chooseRecipient()
    {
        recipientsSearchTxt.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        child_and_staff.click();
    }

    public void writePostContext(String statement)
    {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(alertBoxNoThanksBtn))
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(alertBoxNoThanksBtn.isDisplayed()){
        alertBoxNoThanksBtn.click();}
        writePostTxtArea.click();
        writePostTxtArea.sendKeys(statement);

    }

    public void clickUploadFiles()
    {
        uploadFilesBtn.click();
    }

    public void clickLiveVideo()
    {
        liveVideoBtn.click();
    }

    public void clickAddInspiration()
    {
        addInspirationBtn.click();
    }

    public void selectPublicInspiration()
    {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        privateinspiration.click();
        selectPost.click();
   //alertBoxNoThanksBtn.click();
      /*  try {
        Thread.sleep(3000);}
        catch (InterruptedException e){}


        try {
        Thread.sleep(3000);}
        catch (InterruptedException e){}
        doneBtn.click();
   */
    }


    public void clickPostBtn(){
        postButton.click();
    }

    public void EditPostBtn( ){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        editDots.click();
        editPostBtn.click();
        editBox.clear();

    }

    public void EditText(String newPost){
        editBox.sendKeys(newPost);

    }
    public void DeletePost(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        editDots.click();
        deletePost.click();
        confirmDelete.click();


    }

    public void AssertDelete(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      //  Assert.assertTrue(assertDelete.isDisplayed()," News post deleted ");

    }






}
