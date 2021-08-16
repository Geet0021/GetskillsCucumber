package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PublicCourses {
    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Public Courses']")
    WebElement Courses;

    @FindBy(xpath = "//tbody/tr[4]/td[7]/a[1]")
    WebElement join;


    //Initialize the page object
    public PublicCourses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }
    //action methods

public WebElement getPublicCourses(){return  Courses;}
    public WebElement getJoin(){return join;}

    public void click ( ) {
        getPublicCourses ().click ();
    }
    public void join_click(){ getPublicCourses ().click ();}
}


