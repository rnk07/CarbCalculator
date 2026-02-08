package calculator.carbohydrate.stepDefs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import calculator.carbohydrate.Base;
import calculator.carbohydrate.objects.calculatorPageObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class unitConversionValidationSteps extends Base {
	calculatorPageObject cp = new calculatorPageObject(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@When("user clicks on Other Units")
	public void user_clicks_on_other_units() {
		wait.until(ExpectedConditions.elementToBeClickable(cp.otherUnitBtn()));
		
		cp.otherUnitBtn().click();
		
		
		
	    
	}

	@Then("system shows unit convertor window")
	public void system_shows_unit_coverton_window() {
		
		driver.switchTo().frame(cp.converterFrame());
		wait.until(ExpectedConditions.elementToBeClickable(cp.lengthBtn()));
		String converterHeaderText = cp.converterHeading().getText();
		System.out.println(converterHeaderText);
		Assert.assertEquals(converterHeaderText,"Use this converter to convert to the unit accepted by the calculator.", "Unit Convertor is Displaying." );
		
		driver.switchTo().defaultContent();
	    
//		 Set<String>windowHandle = driver.getWindowHandles();	    
//		    Iterator<String> it =windowHandle.iterator();
//		    it.next();
//		    String childId =it.next();
//		    driver.switchTo().window(childId);
		
		
		
		 driver.findElement(By.id("IdName"));
		 driver.findElement(By.name("Name"));
		 driver.findElement(By.className("ClassName"));
		 driver.findElement(By.tagName("tagName"));
		 driver.findElement(By.linkText("linkText"));
		 driver.findElement(By.partialLinkText("partialLink"));
		 driver.findElement(By.cssSelector("tag#id"));
		 driver.findElement(By.cssSelector("tag.class"));
		 driver.findElement((By.cssSelector("tag[attribute =value]")));
		 driver.findElement((By.cssSelector("tag.classSelecotr[attribut=value]")));
		 
		 
		driver.findElement(By.xpath("xpath"));
		driver.findElement((By.xpath("//*[@id='email']")));
		driver.findElement(By.xpath("//tag[@attriName='value']"));
		
		
		driver.findElement(By.xpath("//*[contains(@atriName,'value')]"));
		//  "//input[contains(@id,'email')]"
		
		driver.findElement((By.xpath("//tagName[text()='text']")));
		
		// "//tagName[@id='text']/following:: nextSyntex"

		
		
		
		
		
		
	}

		
	
	
	
	
	
	
}
