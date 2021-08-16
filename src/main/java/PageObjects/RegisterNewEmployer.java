package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class RegisterNewEmployer {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='companyname']")
    WebElement companyname;

    @FindBy(xpath = "//textarea[@id='description']")
    WebElement description;

    @FindBy(xpath = "//input[@id='address']")
    WebElement address;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='fname']")
    WebElement fname;

    @FindBy(xpath = "//input[@id='lname']")
    WebElement lname;

    @FindBy(xpath = "//input[@id='pno']")
    WebElement pno;

    @FindBy(xpath = "//input[@id='pwd']")
    WebElement pwd;

    @FindBy(xpath = "//input[@id='pwdconfirm']")
    WebElement pwdconfirm;

    @FindBy(xpath = "//input[@name='captcha_code']")
    WebElement captcha_code;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submit;

    //Initialize the page objects
    public RegisterNewEmployer (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    //Action ,different features
    public WebElement getCompanyname(){return companyname;}
    public WebElement getDescription(){return description;}
    public WebElement getAddress(){return address;}
    public WebElement getEmail(){return email;}
    public WebElement getFname(){return fname;}
    public WebElement getLname ( ) {return lname;}
    public WebElement getPno(){return pno;}
    public WebElement getPwd ( ) {return pwd;}
    public WebElement getPwdconfirm() {return pwdconfirm;}
    public  WebElement getCaptcha_code ( ) {return captcha_code;}
    public  WebElement  getSubmit(){return  submit;}

public void RegisterAsEmployer(Map<String,String> registrationData)
{
    getCompanyname ().sendKeys ( registrationData.get("Company Name") );
    getDescription ().sendKeys ( (CharSequence) description );
    getAddress ().sendKeys ( (CharSequence) address );
    getEmail ().sendKeys ( email.getAttribute ( toString ()) );
    getFname ().sendKeys ( (CharSequence) fname );
    getLname ().sendKeys ( (CharSequence) lname );
    getPno ().sendKeys ( (CharSequence) pno );
    getPwd ().sendKeys ( (CharSequence) pwd );
    getPwdconfirm ().sendKeys ( (CharSequence) pwdconfirm);
    getCaptcha_code ().sendKeys ( (CharSequence) captcha_code);
    getSubmit ().click ();

}
}
