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

public class LoginPageSteps{
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    //public WebDriver driver;
       public LoginPageSteps(TestContext testContext) {
            this.testContext = testContext;
            pageObjectManager = testContext.getPageObjectManager();
            driverManager = testContext.getWebDriverManager();
        }
        //How do you instantiate a page object here
   @Before
    public void BeforeEachScenario() {
//        DriverManager driverManager = new DriverManager ();
//        driver = driverManager.getDriver ();

        WebDriverManager.chromedriver ( ).setup ( );
       // driver = new ChromeDriver ( );
        //driver.manage ( ).timeouts ( ).implicitlyWait ( 2, TimeUnit.SECONDS );
    }
    @After
    public void AfterEachScenario() {
        //driver.quit ( );
    }

    @Given("User Navigate to Getskills website")
   public void user_navigate_to_getskills_website() {
      // LoginPage loginPage = new LoginPage (driver);
        pageObjectManager.getLoginPage().openWebsite();;
   }

    @And ( "Click on login button" )
    public void click_on_login_button() {
       // LoginPage loginPage = new LoginPage (driver);
        pageObjectManager.getLoginPage ().getLogin ();
    }

    @And ("enter valid Username" )
    public void enter_valid_username() {
        //LoginPage loginPage =new LoginPage (driver);
        pageObjectManager.getLoginPage ().getUsername ();

//        @And ("enter valid Password")
//        public void enter_valid_password() {
//            pageObjectManager.getLoginPage ().getPassword ();
//        }

    } @When("click on the loginbutton")
    public void click_on_the_loginbutton() {
       // LoginPage loginPage =new LoginPage (driver);
        pageObjectManager.getLoginPage ().getUsername ();


    }

    @When("click on the loginbutton user is inside the loginpage")
    public void click_on_the_loginbutton_user_is_inside_the_loginpage() {
        //LoginPage loginPage = new LoginPage (driver);
        pageObjectManager.getLoginPage ().getLogin ();
    }

//    @Then("MyClassroom text will be shown on screen")
//    public void my_classroom_text_will_be_shown_on_screen() {
//
//    }


    }



