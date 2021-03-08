package pages;

import locators.ExerciseLocators;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

import java.text.DecimalFormat;
import java.util.List;

public class ExercisePage {

    private WebDriver driver;
    ExerciseLocators exerciseLocators;

    public ExercisePage(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        exerciseLocators = new ExerciseLocators(driver);
    }

    //Need to verify the right count of values appear on the screen
    public void enterValueEqualsToGivenValue(List<String> inputTextBox) {
        exerciseLocators.txt_value1.sendKeys(inputTextBox.get(0));
        exerciseLocators.txt_value2.sendKeys(inputTextBox.get(1));
        exerciseLocators.txt_value3.sendKeys(inputTextBox.get(2));
        exerciseLocators.txt_value4.sendKeys(inputTextBox.get(3));
        exerciseLocators.txt_value5.sendKeys(inputTextBox.get(4));
    }

    public void valuesFormattedCurrency() {
        DecimalFormat moneyFormat = new DecimalFormat("$0.00");
    }

    //Need to verify the total balance matches the sum of the values
    public void sumOfTotalValuesMatches(double totalValue) {
        DecimalFormat moneyFormat = new DecimalFormat("$0.00");
        double val1 = convertToDoubleAndCheckGreaterThanZero(exerciseLocators.txt_value1.getText());
        double val2 = convertToDoubleAndCheckGreaterThanZero(exerciseLocators.txt_value2.getText());
        double val3 = convertToDoubleAndCheckGreaterThanZero(exerciseLocators.txt_value3.getText());
        double val4 = convertToDoubleAndCheckGreaterThanZero(exerciseLocators.txt_value4.getText());
        double val5 = convertToDoubleAndCheckGreaterThanZero(exerciseLocators.txt_value5.getText());
        double sum = val1 + val2 + val3 + val4 + val5;
        Assert.assertEquals(totalValue, sum);
        Assert.assertEquals(totalValue, convertToDoubleAndCheckGreaterThanZero(exerciseLocators.txt_total_value.getText()));

    }

    //Need to verify the values on the screen are greater than 0
    public double convertToDoubleAndCheckGreaterThanZero(String str) {
        double value = 0;
        try {
            value = Double.valueOf(str.replace("\\$", "").trim());
            Assert.assertTrue(value > 0);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return value;
    }
}
