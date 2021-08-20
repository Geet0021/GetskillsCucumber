package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackgroundDemoPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement login;
    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement Dashboard;
    @FindBy(xpath = "//a[normalize-space()='Tests']")
    WebElement Tests;
    @FindBy(xpath = "//a[normalize-space()='Work Requests']")
    WebElement WorkRequests;
    //Initialize the page objects
    public BackgroundDemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this );
    }

    public WebElement getUsername () {return username;}
    public WebElement getPassword ( ) {
        return password;
    }
    public WebElement getLogin ( ) {
        return login;
    }
    public WebElement getDashboard(){return Dashboard;}
    public WebElement getTests ( ) {return Tests;}
    public WebElement getWorkRequests(){return WorkRequests;}

    public void setLogin(String username, String password) {
        getUsername ( ).sendKeys ( username );
        getPassword ( ).sendKeys ( password );
        getLogin ( ).click ( );
        getDashboard ().click ();
        getTests ().click ();
        getWorkRequests ().click ();

    }
    public void viewWebsite ( ) {
        driver.get ( "https://getskills.co.nz/#&panel1-1" );
    }
}

