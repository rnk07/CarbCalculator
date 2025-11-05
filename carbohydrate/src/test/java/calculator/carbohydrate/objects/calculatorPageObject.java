package calculator.carbohydrate.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class calculatorPageObject {
	
	
	public WebDriver driver;

	public calculatorPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	 private By headerValidation  =By.xpath("//h1");
	 public WebElement headerValidation() {
		 return driver.findElement(headerValidation);
	 }
	
	 private By onUnitChecker  = By.cssSelector("#topmenu li#menuon");
	 public WebElement onUnitChecker() {
		 return driver.findElement(onUnitChecker);
	 }
	
	
	 private By ageField  = By.cssSelector("#cage");
	 public WebElement ageField() {
		 return driver.findElement(ageField);
	 }

	 
	 private By maleRadio  = By.cssSelector("#csex1");
	 public WebElement maleRadio() {
		 return driver.findElement(maleRadio);
	 }
	 
	 private By femaleRadio  = By.cssSelector("#csex2");
	 public WebElement femaleRadio() {
		 return driver.findElement(femaleRadio);
	 }

	 
	 private By heightField  = By.cssSelector("#cheightmeter");
	 public WebElement heightField() {
		 return driver.findElement(heightField);
	 }
	 
	 private By weightField  = By.cssSelector("#ckg");
	 public WebElement weightField() {
		 return driver.findElement(weightField);
	 }
	 
	 
	 private By activityDropDown  = By.cssSelector("#cactivity");
	 public WebElement activityDropDown() {
		 return driver.findElement(activityDropDown);
	 }
	 
	 
	 private By settingLink  = By.cssSelector("div[id=ccsettingtitle] b");
	 public WebElement settingLink() {
		 return driver.findElement(settingLink);
	 }
	 
	 private By bmrFormula1  = By.cssSelector("label[for=cformula1]");
	 public WebElement bmrFormula1() {
		 return driver.findElement(bmrFormula1);
	 }
	 
	 private By bmrFormula2  = By.cssSelector("label[for=cformula2]");
	 public WebElement bmrFormula2() {
		 return driver.findElement(bmrFormula2);
	 }
	 private By fatField  = By.name("cfatpct");
	 public WebElement fatField() {
		 return driver.findElement(fatField);
	 }
	 
	 private By submitBtn  = By.cssSelector("input[type=submit]");
	 public WebElement submitBtn() {
		 return driver.findElement(submitBtn);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
