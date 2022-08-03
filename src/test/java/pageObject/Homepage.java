package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

import java.util.List;

public class Homepage extends Common {
    public Homepage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /*******************
     * Locators
     */
    @FindBy(xpath = "//a[contains(text(),'Sign up')]")
    public WebElement signupbutton;
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    public WebElement loginbutton;
    @FindBy(xpath = "//a[contains(text(),'Sign out')]")
    public WebElement signoutbutton;
    @FindBy(xpath = "//a[contains(text(),'Sign out')]")
    List<WebElement> signoutbuttonsize;

    /********************
     * Action goes here
     */
    public void signup() {
        signupbutton.click();
    }

    public void login() {
        loginbutton.click();
    }

    public void signout() {
        signoutbutton.click();
    }
    public int signOutbutton(){
       return signoutbuttonsize.size();
    }
}
