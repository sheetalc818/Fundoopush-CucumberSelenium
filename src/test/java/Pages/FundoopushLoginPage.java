
/**
 * Description  : This file contain web elements and Method for Successful Loggedin to Facebook
 * Author       : Sheetal Chaudhari
 * Created date : 26/07/2019
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundoopushLoginPage extends BasicActions
{
	@FindBy(id = "mat-input-0")
	private WebElement Email;

	@FindBy(id = "mat-input-1")
	private WebElement Password;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	private WebElement loginBtn;

	// Initialization
	public FundoopushLoginPage(WebDriver driver) 
	{
		super(driver);
	}

	// Login using Valid Email and Valid Password
	public FundoopushDashboardPage successfulLogin(String email, String password) throws InterruptedException 
	{
		sendKeys(this.Email, email);
		Thread.sleep(100);
		sendKeys(this.Password, password);
		Thread.sleep(100);
		takeScreenshot();
		Thread.sleep(1000);
		click(loginBtn);
		Thread.sleep(2000);
		return new FundoopushDashboardPage(getDriver());
	}

}


