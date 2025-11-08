package calculator.carbohydrate;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	public WebDriver invokingDriver() throws IOException {
		
		FileInputStream fis =  new FileInputStream(System.getProperty("user.dir")+"/src/main/java/calculator/carbohydrate/utils.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		System.out.println("Invoking Url: "+url);
		
		
		if(browserName.contains("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-print-preview");
			options.addArguments("--disable-popup-blocking");
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}else if (browserName.contains("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver();
			options.addArguments("--disable-print-preview");
			options.addArguments("--disable-popup-blocking");
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			
		}
		else {
			System.out.print("Setup the name of the broswer in the property file");
		}
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(15));
		return driver;
	}

}
