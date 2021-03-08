package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ExercisePage;
import pages.Utils;

public class ExerciseSteps {

    WebDriver driver;
    ExercisePage exercisePage;
    Utils utils;

    public ExerciseSteps(ExercisePage exercisePage, Utils utils) {
        this.exercisePage = exercisePage;
        this.utils = utils;
    }

    @Given("I am on the exercise1.com webpage")
    public void i_am_on_the_exercise1_com_webpage() {
        utils.goToURL("https://www.exercise1.com/values");
        utils.maximizeWindow();
    }

    @When("values are entered in the input boxes")
    public void values_are_entered_in_the_input_boxes(DataTable dataTable) {

    }

    @Then("validate the total count of the values is {double}")
    public void validate_the_total_count_of_the_values_is(Double double1) {

    }
}
