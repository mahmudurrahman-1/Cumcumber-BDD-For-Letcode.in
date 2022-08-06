package PageObject;

import drivers.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Sign_up extends Common {
    public Sign_up() {
        PageFactory.initElements(Page.getCurrentDriver(), this);
    }

    /***********
     * Locators
     */

    @FindBy(id = "name")
    public WebElement inputName;
    @FindBy(css = "input[name='email']")
    public WebElement inputEmail;
    @FindBy(css = "input[name='password']")
    public WebElement inputPassword;
    @FindBy(css = "label[class='checkbox']")
    public WebElement checkbox;
    @FindBy(xpath = "//button[text()='SIGN UP']")
    public WebElement signupbutton;


    /***********
     * Actions
     */
    public void singupHandler(String name, String email, String password) {
        sendText(inputName, name);
        sendText(inputEmail, email);
        sendText(inputPassword, password);
        checkbox.click();
    }

    public void signupButtonhandler() {
        signupbutton.click();
    }

}
