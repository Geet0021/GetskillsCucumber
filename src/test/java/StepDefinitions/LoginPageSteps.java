package StepDefinitions;

import Cucumber.TestContext;
import Managers.DriverManager;
import Managers.PageObjectManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    //public WebDriver driver;
    public LoginPageSteps (TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager ( );
        driverManager = testContext.getWebDriverManager ( );
    }

    //How do you instantiate a page object here
    @Before
    public void BeforeEachScenario ( ) {
    }

    @After
    public void AfterEachScenario ( ) {
    }

    @Given("User Navigate to Getskills website")
    public void user_navigate_to_getskills_website ( ) {
        pageObjectManager.getLoginPage ( ).openWebsite ( );
    }

    @And("Click on login button")
    public void click_on_login_button ( ) {
        pageObjectManager.getLoginPage ( ).getLogin ( );
    }

    @And("enter valid Username")
    public void enter_valid_username ( ) {
        pageObjectManager.getLoginPage ( ).getUsername ( );
    }

    @And("enter valid Password")
    public void enter_valid_password ( ) {
        pageObjectManager.getLoginPage ( ).getPassword ( );
    }

    @When("click on the loginbutton user is inside the loginpage")
    public void click_on_the_loginbutton_user_is_inside_the_loginpage ( ) {
    }

    @Given("enter valid Username {string}")
    public void enter_valid_username(String string) {
        pageObjectManager.getLoginPage ().getUsername().sendKeys (string );
    }

    @Given("enter valid Password {string}")
    public void enter_valid_password(String string) {
        pageObjectManager.getLoginPage ().getPassword ().sendKeys ( string );

    }


}







