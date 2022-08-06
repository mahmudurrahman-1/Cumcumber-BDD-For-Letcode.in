package step_def;

import drivers.Base;

import java.util.Properties;

import drivers.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Dataparser;


public class DriverRunner extends Base {
    Properties prop = Dataparser.loadProperties("browser.properties");

    @Before
    public void StartBrowsers() {
        driver = setup(prop.getProperty("chromeBrowser"));
    }

    @After
    public void CloseBrowsers() {
        Page.getCurrentDriver().quit();
    }
}
