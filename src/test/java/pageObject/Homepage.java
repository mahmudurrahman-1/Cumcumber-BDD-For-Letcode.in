package pageObject;

import driver.PageDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Homepage extends Common {
    public Homepage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

}
