package driver;

import org.openqa.selenium.WebDriver;

public class PageDriver {
    private PageDriver() {

    }

    private static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();
    private static PageDriver instance = null;

    public static PageDriver getInstance() {
        if (instance == null) {
            instance = new PageDriver();

        }
        return instance;
    }

    public void setWebdriver(WebDriver driver) {
        webdriver.set(driver);
    }

    public WebDriver getDriver() {
        return webdriver.get();
    }

    public static WebDriver getCurrentDriver() {
        return getInstance().getDriver();
    }
}
