package StepDefinitions;

import Cucumber.TestContext;
import Managers.DriverManager;
import Managers.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PublicCoursesSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public PublicCoursesSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }

@Given("User is inside my classroom")
    public void userIsInsideMyClassroom ( ) {
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
}
