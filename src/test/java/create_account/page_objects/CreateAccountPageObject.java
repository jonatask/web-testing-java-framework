package create_account.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPageObject {

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-telephone")
    private WebElement phoneNumber;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "input-confirm")
    private WebElement repeatPassword;

    @FindBy(name = "agree")
    private WebElement checkboxTermsAndConditions;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/div/input[2]")
    private WebElement continueButton;

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getRepeatPassword() {
        return repeatPassword;
    }

    public WebElement getCheckboxTermsAndConditions() {
        return checkboxTermsAndConditions;
    }

    public CreateAccountConfirmationPageObject clickContinueButton(WebDriver driver) {
        continueButton.click();
        CreateAccountConfirmationPageObject createAccountConfirmationPageObject = new CreateAccountConfirmationPageObject();
        PageFactory.initElements(driver, createAccountConfirmationPageObject);
        return  createAccountConfirmationPageObject;
    }
}
