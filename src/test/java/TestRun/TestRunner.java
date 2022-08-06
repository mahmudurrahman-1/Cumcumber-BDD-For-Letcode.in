package TestRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/signup.feature",
        glue = "step_def",
        plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
