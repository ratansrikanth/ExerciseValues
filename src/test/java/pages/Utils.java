package pages;

import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class Utils {
    private WebDriver driver;

    public Utils(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
    }

    public void goToURL(String url) {
        driver.get(url);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }
}
