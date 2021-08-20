package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Cucumber.TestContext;
import Managers.DriverManager;
import Managers.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class BackgroundDemoSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public WebDriver driver;

    public BackgroundDemoSteps (TestContext testContext) {
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

    @Given("user navigate to getskills website")
    public void user_navigate_to_getskills_website() {
        pageObjectManager.getBackgroundDemoPage ().viewWebsite ();
    }

    @Given("User click on loginbutton")
    public void user_click_on_loginbutton() {
        pageObjectManager.getBackgroundDemoPage ().getLogin ();
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        pageObjectManager.getBackgroundDemoPage ().getUsername ();
        pageObjectManager.getBackgroundDemoPage ().getPassword ();

    }

    @Then("user navigated to homepage")
    public void user_navigated_to_homepage() {

    }

    @When("User click on Dashboard button")
    public void user_click_on_dashboard_button() {
        pageObjectManager.getBackgroundDemoPage ().getDashboard ();
    }

    @Then("user can see MyClassroom Text")
    public void user_can_see_my_classroom_text() {

    }

    @When("User click on Test button")
    public void user_click_on_test_button() {
        pageObjectManager.getBackgroundDemoPage ().getTests ();
    }

    @Then("Number of test displayed")
    public void number_of_test_displayed() {

    }

    @When("User click on Work request button")
    public void user_click_on_work_request_button() {
        pageObjectManager.getBackgroundDemoPage ().getWorkRequests ();

    }

    @Then("Work request sheet displayed")
    public void work_request_sheet_displayed() {

    }

}
