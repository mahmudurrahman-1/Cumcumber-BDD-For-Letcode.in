package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utilities.Dataparser;

import java.time.Duration;
import java.util.Properties;

public class Base {
    public WebDriver driver = null;
    Properties prop = Dataparser.loadProperties("browser.properties");
    public String Baseurl = prop.getProperty("baseurl");

    public WebDriver setup(String browser) {
        if (browser.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Page.Instance().setDriver(driver);
        driver.get(Baseurl);
        return driver;
    }

}
