package StepDefinitions;

import Cucumber.TestContext;
import Managers.DriverManager;
import Managers.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class RegisterNewEmployerSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public RegisterNewEmployerSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }

    @Given("User click register as employer")
    public void user_click_register_as_employer() {
    }

    @Then("getskills user fill following fields with values")
    public void getskills_user_fill_following_fields_with_values(io.cucumber.datatable.DataTable dataTable) {

        Map<String,String> registrationData = dataTable.asMap ( String.class,String.class );
        pageObjectManager.getRegisterNewEmployer ().RegisterAsEmployer (registrationData);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Then("click on RegisterNow")
    public void click_on_register_now() {

    }

}



