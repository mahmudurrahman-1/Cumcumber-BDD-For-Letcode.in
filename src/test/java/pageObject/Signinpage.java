package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Signinpage extends Common {
    public Signinpage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /***************
     * Locators
     */
    @FindBy(css = "input[name='email']")
    public WebElement inputEmail;
    @FindBy(css = "input[name='password']")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'LOGIN')]")
    public WebElement loginButton;

    /***************
     * Action
     */

    public void loginHandler(String email, String password) {
        sendText(inputEmail, email);
        sendText(inputPassword, password);
        loginButton.click();
    }
}
