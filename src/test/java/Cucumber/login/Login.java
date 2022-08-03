package Cucumber.login;

import pageObject.Homepage;

public class Login {
    /***********
     * Instances
     */
    Homepage home = new Homepage();
    /***********
     * Actions
     */
    public void Login(){
        home.login();
    }
}
