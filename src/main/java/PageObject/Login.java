package PageObject;


import drivers.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Login extends Common {
    public Login() {
        PageFactory.initElements(Page.getCurrentDriver(), this);
    }

    /***********
     * Locators
     */
    @FindBy(css = "input[name='email']")
    public WebElement inputEmail;
    @FindBy(css = "input[name='password']")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[normalize-space()='LOGIN']")
    WebElement loginSubmitBtn;

    /***********
     * Actions
     */
    public void loginHandler(String email, String Password) {
        sendText(inputEmail, email);
        sendText(inputPassword, Password);
    }

    public void loginSubmit() {
        loginSubmitBtn.click();
    }
}
