package PageObject;

import drivers.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home {
    public Home() {
        PageFactory.initElements(Page.getCurrentDriver(), this);
    }

    /************
     * Locators
     */
    @FindBy(xpath = "//a[normalize-space()='Sign up']")
    WebElement signupButton;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginButton;
    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    List<WebElement> signoutButton;

    /************
     * Actions
     */
    public void login() {
        loginButton.click();
    }

    public void Signup() {
        signupButton.click();
    }

    public int Signout() {
        return signoutButton.size();
    }
}
