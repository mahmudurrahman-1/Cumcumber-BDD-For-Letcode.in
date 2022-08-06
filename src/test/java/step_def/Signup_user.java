package step_def;

import PageObject.Home;
import PageObject.Sign_up;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import utilities.Dataparser;

import java.util.Properties;

public class Signup_user {
    /************
     * Instances
     */
    Home home_page = new Home();
    Sign_up registration_page = new Sign_up();
    SoftAssert softly = new SoftAssert();

    /************
     * Actions
     */
    @Given("^Go to sign up page$")
    public void Signup() {
        home_page.Signup();
    }

    @When("^Enter \"([^\"]*)\" user informations$")
    public void RegistationHandler(String users) {
        String name, email, pass;
        Properties prop = Dataparser.loadProperties("signupuserinfo.properties");
        if (users.equals("1st")) {
            name = prop.getProperty("name1");
            email = prop.getProperty("email1");
            pass = prop.getProperty("pass1");

        } else if (users.equals("2nd")) {
            name = prop.getProperty("name2");
            email = prop.getProperty("email2");
            pass = prop.getProperty("pass2");

        } else {
            name = email = pass = "";

        }
        registration_page.singupHandler(name, email, pass);
        registration_page.signupButtonhandler();
    }

    @Then("^Successful Registration$")
    public void ConfirmationReg() {
        System.out.println("Registration Successful");
    }
}
