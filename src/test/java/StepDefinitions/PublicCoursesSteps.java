package StepDefinitions;

import Cucumber.TestContext;
import Managers.DriverManager;
import Managers.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PublicCoursesSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public PublicCoursesSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }
    @When("click on the loginbutton")
    public void click_on_the_loginbutton() {
        pageObjectManager.getLoginPage ().getUsername ();
    }

//    @When("click on the loginbutton user is inside the loginpage")
//    public void click_on_the_loginbutton_user_is_inside_the_loginpage() {
//        pageObjectManager.getLoginPage ().getLogin ();
//    }

    @Given("User is inside my classroom")
    public void userIsInsideMyClassroom ( ) {
        pageObjectManager.getPublicCourses ().click ();

    }
    @And("Click on Public Courses button")
    public void clickOnPublicCoursesButton ( ) {
        pageObjectManager.getPublicCourses ().click ();
    }

    @And("Number of courses will be shown along with the Course,code,Subject,Topic,Description,price,action")
    public void numberOfCoursesWillBeShownAlongWithTheCourseCodeSubjectTopicDescriptionPriceAction ( ) {

    }
    @Then("User click on join")
    public void userClickOnJoin ( ) {
        pageObjectManager.getPublicCourses ().join_click ();
    }

    @Then("Payment form is on screen")
    public void paymentFormIsOnScreen ( ) {

    }

    @When("User login  with details {string}  {string}")
    public void userLoginWithDetails (String arg0, String arg1) {

    }
}
