package cucumber_op.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pageObject.Homepage;
import pageObject.Signinpage;

public class Login_step {

    /******************
     * Instances
     */
    Homepage home = new Homepage();
    Signinpage login = new Signinpage();
    SoftAssert softly = new SoftAssert();

    /******************
     * Actions
     */
    @Given("^Goto login page$")
    public void clickLogin(){
        home.login();
    }
     @When("^User give inputs as (.+) and (.+)$")
    public void handlelogin(String useremail, String password){
         login.loginHandler(useremail,password);
     }
     @Then("^Successfully logged in$")
     public void verifyLogin(){
      boolean verifySignoutCondition = home.signOutbutton()>0;
      if (verifySignoutCondition){
          System.out.println("Successfully login");
      }
       else {
             System.out.println("Not Successfully login");
         }
       softly.assertTrue(verifySignoutCondition);
       softly.assertAll();

     }
}
