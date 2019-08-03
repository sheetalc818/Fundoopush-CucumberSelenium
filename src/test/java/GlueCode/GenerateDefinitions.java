
/**
 * Description  : GenerateDefinition.java file contain code to launch Selenium WebDriver to execute script
 * Author       : Sheetal Chaudhari
 * Created date : 26/07/2019
 */

package GlueCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenerateDefinitions 
{
	public static WebDriver driver;
	
	//To open the Browser with URL
	@Before
	public void openBrowserWithLink()
	{
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver");
		driver = new ChromeDriver(options);
		driver.get("https://fundoopush-dev.bridgelabz.com/login");
		driver.manage().window().maximize();
	}
	
	//To close WebDriver after running script
	@After
	public void closeBrowser() 
	{
		driver.quit();
	}
	
	//Method getDriver used into the FacebookDefinitions.java
	public static WebDriver getDriver()
	{
		return driver;
	}
}