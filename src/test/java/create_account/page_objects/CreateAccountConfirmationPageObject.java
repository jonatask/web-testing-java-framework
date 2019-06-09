package create_account.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountConfirmationPageObject {

    @FindBy(xpath = "/html/body/div[2]/div/div/h1")
    private WebElement confirmationText;

    public String getConfirmationText() {
        return confirmationText.getText();
    }
}
