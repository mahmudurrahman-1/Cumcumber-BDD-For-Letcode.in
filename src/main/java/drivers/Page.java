package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Page {
    private Page() {

    }

    private static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();
    private static Page instance = null;

    public static Page Instance() {
        if (instance == null) {
            instance = new Page();
        }
        return instance;
    }

    public void setDriver(WebDriver driver) {
        webdriver.set(driver);
    }

    public static WebDriver getDriver() {
        return webdriver.get();
    }

    public static WebDriver getCurrentDriver() {
        return Instance().getDriver();
    }
}
