package pages;

import locators.ExerciseLocators;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class ExercisePage {

    private WebDriver driver;
    ExerciseLocators exerciseLocators;

    public ExercisePage(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        exerciseLocators = new ExerciseLocators(driver);
    }

}
