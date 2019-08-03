
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundoopushDashboardPage extends BasicActions
{
	@FindBy(xpath="//app-dashboard[@class='ng-star-inserted']")
	private WebElement dashboardPage;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-article/div/div[3]/div/mat-icon")
	private WebElement ClickAdd;
		
	@FindBy(xpath="//button[contains(text(),'ADD STORY')]")
	private WebElement AddSTORY;
	
	@FindBy(id="mat-input-3")
	private WebElement RedirectLink;
	
	@FindBy(xpath="//span[contains(text(),'Post')]")
	private WebElement Postbtn;
	
	@FindBy(xpath="//button[contains(text(),'ADD ARTICLE')]")
	private WebElement AddArticle;
	
	//==============================Article WebElements=============================================//
	
	@FindBy(xpath="//textarea[@placeholder='Title']")
	private WebElement AddTitle;
	
	@FindBy(className="addMedia")
	private WebElement AddMedia;
	
	//@FindBy(xpath="//span[@class='ng-tns-c1-0']")
	@FindBy(xpath="//div[4]//img[1]")
	private WebElement ClickRedirectBtn;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	private WebElement Sendlink;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	private WebElement DoneBtn;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	private WebElement AddDescription;
	
	@FindBy(xpath="//div[@class='quill-style']")
	private WebElement AddImageBtn;
	
	private static String filePath = System.getProperty("user.dir") + "/home/admin1/eclipse-workspace/CucumberFundoopush/src/test/resources/Image/3D-Nature-Images-Free-Download.jpg";

	//===========================================Methods=============================================//
	
	public FundoopushDashboardPage(WebDriver driver) 
	{
		super(driver);
	}
	//Checking for the dashboard page Element
	public void validateDashboardPage() 
	{
		checkElementPresent(dashboardPage);
	}
	
	//Adding Story Card into the Fundoopush dashboard
	public void validateAddStory() throws InterruptedException 
	{
		checkElementPresent(ClickAdd);
		Thread.sleep(1000); 
		Clickbtn(ClickAdd);
		Thread.sleep(1000);
		Clickbtn(AddSTORY);
		Thread.sleep(1000);
		RedirectL(RedirectLink);
		Thread.sleep(20000);
		Clickbtn(Postbtn);
		Thread.sleep(15000);
	}
	
	//Adding Article Card into the Fundoopush dashboard
	public void validateAddArticle() throws InterruptedException 
	{
		checkElementPresent(ClickAdd);
		Thread.sleep(1000); 
		Clickbtn(ClickAdd);
		Thread.sleep(1000);
		Clickbtn(AddArticle);
		Thread.sleep(1000);
		addTitle(AddTitle);
		Thread.sleep(1000);
		Clickbtn(AddMedia);
		Thread.sleep(500);
		Clickbtn(ClickRedirectBtn);
		Thread.sleep(500);
		RedirectL(Sendlink);
		Thread.sleep(500);
		Clickbtn(DoneBtn);
		Thread.sleep(500);
		addDescription(AddDescription);
		Thread.sleep(500);
		addImage(AddImageBtn);
		Thread.sleep(500);
		uploadFileWithRobot(filePath);
		Thread.sleep(10000);
		
	}
}
