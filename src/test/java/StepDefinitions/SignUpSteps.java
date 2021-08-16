package StepDefinitions;

import Cucumber.TestContext;
import Managers.DriverManager;
import Managers.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignUpSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    //public WebDriver driver;
    public SignUpSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }

    @Given("Click on SignUp button")
    public void click_on_sign_up_button ( ) {
       pageObjectManager.getSignUpPage ().openWebsite ( "https://getskills.co.nz/#&panel1-1" );
    }

    @Given("Enter Email Address")
    public void enter_email_address ( ) {
        pageObjectManager.getSignUpPage ().getEmailAddress ();
    }

    @Given("Enter First Name")
    public void enter_first_name ( ) {
        pageObjectManager.getSignUpPage ().getFirstname ();
    }

    @Given("Enter Last Name")
    public void enter_last_name ( ) {
     pageObjectManager.getSignUpPage ().getLastname ();
    }

    @Given("Enter Mobile")
    public void enter_mobile ( ) {
        pageObjectManager.getSignUpPage ().getMobile ();
    }

    @Given("Enter Password")
    public void enter_password ( ) {
        pageObjectManager.getSignUpPage ().getPassword ();
    }

    @Given("Enter Confirm Password")
    public void enter_confirm_password ( ) {
       pageObjectManager.getSignUpPage ().getConfirmPassword ();
    }

    @Given("Enter Code")
    public void enter_code ( ) {
       pageObjectManager.getSignUpPage ().getCode ();
    }

    @Given("Click on Terms&conditions")
    public void click_on_terms_conditions ( ) {
        pageObjectManager.getSignUpPage ().getTerms ();
    }

    @Then("Click on RegisterNow")
    public void click_on_register_now ( ) {
        pageObjectManager.getSignUpPage ( ).getRegisterNow ( );
    }

//    @Then("MyClassroom text will be shown on screen")
//    public void my_classroom_text_will_be_shown_on_screen() {
//
//    }
}
