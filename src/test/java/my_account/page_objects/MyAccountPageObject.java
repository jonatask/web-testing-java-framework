package my_account.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageObject {

    @FindBy(xpath = "/html/body/div[2]/div/div/h2[1]")
    private WebElement myAccount;

    public String myAccountText(){
        return myAccount.getText();
    }
}
