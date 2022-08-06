package utilities;

import drivers.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Common {

    public static SoftAssert soft_assert = null;

    public static SoftAssert softAssert() {
        if (soft_assert == null) {
            soft_assert = new SoftAssert();
        }
        return soft_assert;
    }

    public static String getTitle() {
        return Page.getCurrentDriver().getTitle();
    }

    public static void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public static void elementHover(WebElement element) {
        Actions actions = new Actions(Page.getCurrentDriver());
        actions.clickAndHold(element).build().perform();
    }

    public static void selectitem(WebElement element, String value) {
        Select selectItems = new Select(element);
        selectItems.selectByValue(value);
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Page.getCurrentDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void waitForPageLoad() {
        WebDriverWait wait = new WebDriverWait(Page.getCurrentDriver(), Duration.ofSeconds(30));
        wait.until((ExpectedCondition<Boolean>) wd -> {
            assert wd != null;
            return ((JavascriptExecutor) wd)
                    .executeScript("return document.readyState;")
                    .equals("complete");
        });
    }

}
