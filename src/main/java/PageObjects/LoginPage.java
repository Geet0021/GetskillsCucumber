package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    //declaration of WebElements
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement login;

    @FindBy(xpath = "//input[@value='Forgot Password']")
    WebElement ForgotPassword;

    //Initialize the page objects
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }
    //Action ,different features
    public WebElement getUsername ( ) {
        return username;
    }
    public WebElement getPassword ( ) {
        return password;
    }
    public WebElement getLogin ( ) {
        return login;
    }
    public WebElement getForgotPassword(){return  ForgotPassword;}



    public void loginAsAStudent(String username,String password){
        getUsername ().sendKeys (username);
        getPassword ().sendKeys (password);
        getLogin ().click ();
        getForgotPassword ().click ();
    }
    public void openWebsite() {
        driver.get( "https://getskills.co.nz/#&panel1-1" );
    }


   // public void openWebsite(String url){
        //driver.get ( "https://getskills.co.nz/#&panel1-1" );
    //}


//    public void clickLogin(){
//        getLogin ().click ();
//    }
}

