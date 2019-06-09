package create_account.steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.Step;
import create_account.page_objects.CreateAccountPageObject;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateAccountSteps extends Step {

    private String confirmationText;
    protected Scenario scenario;

    @Before(value = "@CreateAccount")
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("I accessed the registration page")
    public void registrationPage() {
        goToPage("/index.php?route=account/register");
    }

    @When("register myself as {string} lastname {string} email {string} phone number {string} password {string}")
    public void registerAccount(String firstName, String lastName, String email, String phoneNumber, String password) {
        CreateAccountPageObject createAccountPageObject = new CreateAccountPageObject();
        PageFactory.initElements(driver, createAccountPageObject);

        createAccountPageObject.getFirstName().sendKeys(firstName);
        createAccountPageObject.getLastName().sendKeys(lastName);
        createAccountPageObject.getEmail().sendKeys(email.replace("{random}", new Random().nextInt() + ""));
        createAccountPageObject.getPhoneNumber().sendKeys(phoneNumber);
        createAccountPageObject.getPassword().sendKeys(password);
        createAccountPageObject.getRepeatPassword().sendKeys(password);
        createAccountPageObject.getCheckboxTermsAndConditions().click();

        confirmationText = createAccountPageObject.clickContinueButton(driver)
                .getConfirmationText();
    }

    @Then("system should save the registration")
    public void systemShouldSaveRegistration() {
        assertThat(confirmationText,is("Your Account Has Been Created!"));
    }
}
