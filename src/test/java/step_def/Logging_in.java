package step_def;


import PageObject.Home;
import PageObject.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logging_in {
    /**********
     * Instances
     */
    Home homepage = new Home();
    Login login_page = new Login();

    /**********
     * Action Scenario
     */
    @Given("^Go to login page$")
    public void login() {
        homepage.login();
    }

    @When("^Give input (.+) and (.+)$")
    public void loginHandle(String email, String pass) {
        login_page.loginHandler(email, pass);
        login_page.loginSubmit();
    }

    @Then("^Successful login$")
    public void Confirmation() {
        System.out.println("Successfully login");
    }
}
