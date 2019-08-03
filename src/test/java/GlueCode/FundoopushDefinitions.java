
/**
 * Description  : All Scenarios description is written into the FacebookDefinitions.java file
 * Author       : Sheetal Chaudhari
 * Created date : 26/07/2019
 */

package GlueCode;

import org.openqa.selenium.WebDriver;
import Pages.FundoopushDashboardPage;
import Pages.FundoopushLoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FundoopushDefinitions 
{
	private WebDriver driver = GenerateDefinitions.getDriver();
	private FundoopushLoginPage fundoopushloginpage;
	private FundoopushDashboardPage fundoopushDashboardPage;

 	@When("Successfully Loggedin to Fundoopush using Valid Mail id {string} and Password {string}")
 	public void successfulLoginToFundoopushWithSpecifiedCredentials(String email, String password) throws InterruptedException 
 	{
 		fundoopushloginpage = new FundoopushLoginPage(driver);
 		fundoopushDashboardPage = fundoopushloginpage.successfulLogin(email, password);
 	}
 	
 	@When("Story card added Successfully by loggedin with Valid Mail id {string} and Password {string}")
 	public void validateAddedStoryCard(String email, String password) throws InterruptedException  
 	{
		fundoopushloginpage = new FundoopushLoginPage(driver);
		fundoopushDashboardPage = fundoopushloginpage.successfulLogin(email, password);
		fundoopushDashboardPage = new FundoopushDashboardPage(driver);
		fundoopushDashboardPage.validateAddStory();
	}
	
	@When("Article added Successfully by loggedin with Valis Mail id {string} and Password {string}")
	public void validateAddedArticle(String email, String password) throws InterruptedException 
	{
		fundoopushloginpage = new FundoopushLoginPage(driver);
		fundoopushDashboardPage = fundoopushloginpage.successfulLogin(email, password);
		fundoopushDashboardPage = new FundoopushDashboardPage(driver);
		fundoopushDashboardPage.validateAddArticle();
	}
	
	@Then("Fundoopush dashboard page successfully displayed")
	public void validateFundoopushDashboardPage()  
	{
		fundoopushDashboardPage.validateDashboardPage();
	}
}
