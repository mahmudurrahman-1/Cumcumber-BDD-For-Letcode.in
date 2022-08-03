package cucumber_op;

import driver.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.Properties;

import utilities.DataParser;

public class Hook extends BaseDriver {
    Properties prop = DataParser.loadProperties("environment.properties");

    @Before
    public void setup() {
        driver = setup(prop.getProperty("browser1"));
        driver.get(prop.getProperty("baseUrl"));
    }

    @After
    public void close() {
        driver.quit();
    }
}
