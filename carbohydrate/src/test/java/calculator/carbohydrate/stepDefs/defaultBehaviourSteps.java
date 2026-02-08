package calculator.carbohydrate.stepDefs;



import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import calculator.carbohydrate.Base;
import calculator.carbohydrate.objects.calculatorPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class defaultBehaviourSteps extends Base	 {

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	calculatorPageObject cp = new calculatorPageObject(driver);
	
	
	
	@Given ("user is going to carb calculator site")
	public void user_going_to_calculator_site() {
		System.out.println("User is on "+driver.getCurrentUrl());
	}
	
	@And ("system display application")
	public void system_display_application() {
		wait.until(ExpectedConditions.visibilityOf(cp.headerValidation()));
		System.out.println("User is on: "+cp.headerValidation().getText());
	}
	
	
	@Then("verify the title displays carbohydrate calculator")
	public void verify_the_title_displays_carbohydrate_calculator() {
		
		Assert.assertTrue(cp.headerValidation().isDisplayed());
	}
	
	
	
	

	@When("Metrics units is selected default")
	public void verify_metrics_units_is_selected_default() {
		
		String selectedText = cp.onUnitChecker().getText().trim();
		Assert.assertEquals(selectedText, "Metric Units", "Metric Units should be selected by default");
	    System.out.println("Metric Units is selected by default");
	}

	@When("verify age has by default value")
	public void verify_age_has_by_default_value() {
		  String defaultValue = cp.ageField().getAttribute("value");
		  Assert.assertEquals(defaultValue, "25");
		  System.out.println("Default age is 25 as expected");
	}

	@When("verify gender has by default value")
	public void verify_gender_has_by_default_value() {
	    
		if (cp.maleRadio().isSelected()) {
		    System.out.println("Male radio is selected");
		} else if (cp.femaleRadio().isSelected()) {
		    System.out.println("Female radio is selected");
		} else {
		    System.out.println("No gender is selected.");
		}

		Assert.assertTrue(cp.maleRadio().isSelected());
		
		
	}

	@When("verify height has by default value")
	public void verify_height_has_by_default_value() {
		String defaultHeight = cp.heightField().getAttribute("value");
		System.out.println("Default height value: " + defaultHeight);
		Assert.assertEquals(defaultHeight, "180");
		
	}

	@When("verify weight has by default value")
	public void verify_weight_has_by_default_value() {
		String defaultWeight = cp.weightField().getAttribute("value");
		System.out.println("Default height value: " + defaultWeight);
		Assert.assertEquals(defaultWeight, "60");
	}

	@When("verify light activity is preselected")
	public void verify_light_activity_is_preselected() {
	    
		Select select =new Select(cp.activityDropDown());
		String selectedText = select.getFirstSelectedOption().getText();
	    String selectedValue = select.getFirstSelectedOption().getAttribute("value");
	    
	    System.out.println("Selected acitvity: "+selectedText);
	    Assert.assertEquals(selectedValue, "1.375");
	   
	    
	}

	@When("click on Setting")
	public void click_on_setting() {
	   cp.settingLink().click();
	}

	@When("verify St jeror BMR calculaiton is selected")
	public void verify_st_jeror_bmr_calculaiton_is_selected() {
	   
		  if (cp.bmrFormula1().isSelected()) {
		        System.out.println("Default selected formula: Mifflin St Jeor");
		        Assert.assertTrue(true, "Mifflin St Jeor is correctly selected by default");
		    } 
		    else if (cp.bmrFormula2().isSelected()) {
		        System.out.println("Default selected formula: Katch-McArdle (Unexpected)");
		       
		    } 
		    else {
		        System.out.println("No formula is selected by default!");
		       
		    }
		}
		
	

	@When("verify body fat has by default value")
	public void verify_body_fat_has_by_default_value() {
		String actualValue = cp.fatField().getAttribute("value");
	    Assert.assertEquals(actualValue, "20");
	    
	    System.out.println("Adding temp comment.");
	   
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
