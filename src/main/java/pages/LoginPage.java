package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    /****************************************************ATTRIBUTES*************************************************/
    private WebDriver driver;

    /****************************************************CONSTRUCTORS***********************************************/
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /****************************************************WEB-ELEMENTS****************************************************/
    //login-username element
    @FindBy(id = "txtEmail")
    WebElement usernameTxtBox;

    //login-password element
    @FindBy(id="txtPassword")
    WebElement passwordTxtBox;

    //Submit button element
    @FindBy(id="submitBtn")
    WebElement submitBtn;

//    @FindBy(xpath = "//span[contains(text(),'Let’s sign you in.')]")
//    WebElement loginMsg;


    /****************************************************METHODS****************************************************/

    public void insertUsername(String username)
    {
        usernameTxtBox.sendKeys(username);
    }

    public void insertPassword(String password)
    {
        passwordTxtBox.sendKeys(password);
    }

    public void clickSubmit()
    {
        submitBtn.click();
    }


    public void login()
    {
        usernameTxtBox.sendKeys();
        passwordTxtBox.sendKeys();
        submitBtn.click();
    }

    /*******************************************************ASSERTIONS-METHODS**************************************************/



}
