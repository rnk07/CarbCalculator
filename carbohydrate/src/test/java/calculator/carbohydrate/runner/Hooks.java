package calculator.carbohydrate.runner;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import calculator.carbohydrate.Base;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	Base b = new Base();

	
	@Before
	public void setup() throws IOException {
		b.invokingDriver();

	}

	@After
	public void shutdown() throws IOException {


	Base.driver.quit();
	Base.driver = null;

	}

	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {

		// capture screenshot on validate if scenario has failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
						}

		}

}
