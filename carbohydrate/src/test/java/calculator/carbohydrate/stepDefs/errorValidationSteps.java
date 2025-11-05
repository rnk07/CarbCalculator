package calculator.carbohydrate.stepDefs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import calculator.carbohydrate.Base;
import calculator.carbohydrate.objects.calculatorPageObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class errorValidationSteps extends Base	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	calculatorPageObject cp = new calculatorPageObject(driver);
	
	
	@When("enter invalid input for all the fields")
	public void enter_invalid_input_for_all_the_fields() throws InterruptedException {
	    cp.ageField().sendKeys("5555");
	    cp.heightField().sendKeys("abcd");
	    cp.weightField().sendKeys("abcd");
	   
	    wait.until(ExpectedConditions.elementToBeClickable(cp.settingLink()));
	
	    cp.settingLink().click();
	    wait.until(ExpectedConditions.elementToBeClickable(cp.bmrFormula2()));
	    cp.bmrFormula2().click();
	    cp.fatField().sendKeys("5555");
	    
	    
	}

	@When("Click on calculate button")
	public void click_on_calculate_button() {
		cp.submitBtn().click();
		wait.until(ExpectedConditions.visibilityOf(cp.headerValidation()));
	}

	@Then("Verify if system shows an error or not")
	public void verify_if_system_shows_an_error_or_not() {
		
		
	
		List<WebElement> errorMessages = driver.findElements(By.cssSelector("font[color=red]"));

		System.out.println("------Below are the error showing for invalid input------");
		
		for (int i = 0; i < errorMessages.size(); i++) {
		    System.out.println(errorMessages.get(i).getText());
		}
		
	}
	
	}
	
	
	
	
	
	
	
	
	