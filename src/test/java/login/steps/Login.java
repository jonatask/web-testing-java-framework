package login.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.Step;
import org.openqa.selenium.support.PageFactory;
import login.page_objects.LoginPageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Login extends Step {

    private LoginPageObject loginPageObject;
    private String textInMyAccount;

    public void loadPage() {
        this.loginPageObject = new LoginPageObject();
        PageFactory.initElements(driver, this.loginPageObject);
    }

    @Given("I accessed the login page")
    public void oUsuarioAcessouAPaginaDeLogin() {
        goToPage("/index.php?route=account/login");
    }

    @When("I type the email {string} password {string} and click the login button")
    public void digitarOEmailEASenha(String email, String senha) {
        loadPage();
        loginPageObject.getUser().sendKeys(email);
        loginPageObject.getPassword().sendKeys(senha);
        implicitlyWait();
        textInMyAccount = loginPageObject.clickLoginButton(driver)
                .myAccountText();
    }

    @Then("system should open the My Account page")
    public void systemShouldOpenMyAccount() {
        assertThat(textInMyAccount, is("My Account"));
    }
}
