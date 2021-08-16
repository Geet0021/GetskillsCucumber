package PageObjects;

import Cucumber.TestContext;
import Managers.DriverManager;
import Managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.locks.Condition;

public class SignUpPage {
    WebDriver driver;
    //Declare WebElements
    @FindBy(xpath = "//input[@id='username']")
    WebElement EmailAddress;

    @FindBy(xpath = "//input[@id='fname']")
    WebElement FirstName;

    @FindBy(xpath = "//input[@id='lname']")
    WebElement LastName;

    @FindBy(xpath = "//input[@id='pno']")
    WebElement Mobile;

    @FindBy(xpath = "//input[@id='pno']")
    WebElement Password;

    @FindBy(xpath = "//input[@id='cpassword']")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//input[@name='captcha_code']")
     WebElement Code;

    @FindBy(xpath = "//input[@id='condition']")
    WebElement Terms;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement RegisterNow;

    //Initialize the page object
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }
    //action methods

    public WebElement getEmailAddress ( ) {
        return EmailAddress;
    }
    public WebElement getFirstname ( ) {
        return FirstName;
    }
    public WebElement getLastname ( ) {
        return LastName;
    }
    public WebElement getMobile ( ) {
        return Mobile;
    }
    public WebElement getPassword() {return Password;}
    public WebElement getConfirmPassword() {return ConfirmPassword;}
    public WebElement getCode() {return Code;}
    public WebElement getTerms(){return Terms;}
    public WebElement getRegisterNow(){return RegisterNow;}


    public void signUpAsANewStudent(String EmailAddress,String FirstName, String LastName,int Mobile, String Password,String ConfirmPassword){
        getEmailAddress ().sendKeys (EmailAddress);
        getFirstname ().sendKeys (FirstName);
        getLastname ().sendKeys (LastName);
        getMobile ().sendKeys (String.valueOf (Mobile));
        getPassword ().sendKeys (Password);
        getConfirmPassword ().sendKeys ( ConfirmPassword );
        getCode ().sendKeys ( (CharSequence) Code );
        getTerms ().click ();
        getRegisterNow ().click ();

    }
    public void openWebsite(String url){
        driver.get ( "https://getskills.co.nz/#&panel1-1" );
    }

    public void clickSignUP (){
         getRegisterNow ().click ();
    }

}

