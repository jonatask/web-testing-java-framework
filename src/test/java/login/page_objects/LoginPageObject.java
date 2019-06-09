package login.page_objects;

import my_account.page_objects.MyAccountPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

    @FindBy(id = "input-email")
    private WebElement user;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    private WebElement loginButton;

    public WebElement getUser() {
        return user;
    }

    public WebElement getPassword() {
        return password;
    }

    public MyAccountPageObject clickLoginButton(WebDriver driver) {
        loginButton.click();
        MyAccountPageObject myAccountPageObject = new MyAccountPageObject();
        PageFactory.initElements(driver, myAccountPageObject);
        return myAccountPageObject;
    }
}
