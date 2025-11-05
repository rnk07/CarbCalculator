package calculator.carbohydrate.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/featureFile/"}, 
glue="",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	      "pretty","json:target/cucumber-reports/Cucumber.json"},
			monochrome = true )

public class calculatorRunner extends AbstractTestNGCucumberTests {

}
