package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseLocators {

    WebDriver driver;

    public ExerciseLocators(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "lbl_val_1")
    WebElement lbl_value1;

    @FindBy(id = "lbl_val_2")
    WebElement lbl_value2;

    @FindBy(id = "lbl_val_3")
    WebElement lbl_value3;

    @FindBy(id = "lbl_val_4")
    WebElement lbl_value4;

    @FindBy(id = "lbl_val_5")
    WebElement lbl_value5;

    @FindBy(id = "txt_val_1")
    WebElement txt_value1;

    @FindBy(id = "txt_val_2")
    WebElement txt_value2;

    @FindBy(id = "txt_val_3")
    WebElement txt_value3;

    @FindBy(id = "txt_val_4")
    WebElement txt_value4;

    @FindBy(id = "txt_val_5")
    WebElement txt_value5;

    @FindBy(id = "lbl_ttl_val")
    WebElement lbl_total_value;

    @FindBy(id = "txt_ttl_val")
    WebElement txt_total_value;

}
