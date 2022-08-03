package cucumber_op;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "login/login.feature",
        glue = "",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
