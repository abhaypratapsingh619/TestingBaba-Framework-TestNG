package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class Links_page extends Base_Library
{
	
	public Links_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#elements\']")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()=\'links\']")
	private WebElement links;
	
	@FindBy(xpath = "//*[text()=\'Demo Page\']")
	private WebElement demopagelink;
	
	@FindBy(xpath = "//*[text()=\'Created\']")
	private WebElement createdlink;
	
	@FindBy(xpath = "//*[text()=\'No Content\']")
	private WebElement nocontentlink;
	
	@FindBy(xpath = "//*[text()=\'Moved\']")
	private WebElement movedlink;
	
	@FindBy(xpath = "//*[text()=\'Bad Request\']")
	private WebElement badrequestlink;
	
	@FindBy(xpath = "//*[text()=\'Unauthorized\']")
	private WebElement unauthorisedlink;
	
	@FindBy(xpath = "//*[text()=\'Forbidden\']")
	private WebElement forbiddenlink;
	
	@FindBy(xpath = "//*[text()=\'Not Found\']")
	private WebElement notfoundlink;
	
	@FindBy(xpath = "//*[@id=\'link-result\']")
	private WebElement linkresulttext;
	
	
	public void clickonclosebutton()
	{
		closebutton.click();
	}
	
	public void clickonpracticebutton()
	{
		practice.click();
	}
	
	public void clickonelement() throws InterruptedException
	{
		
		elements.click();
		Thread.sleep(1000);
	}
	
	public void clickonlinksbutton()
	{
		links.click();
	}
	
	public void clickondemopagelink()
	{
		demopagelink.click();
	}
	
	public void switchwindow()
	{
		changewindow(1);
		getdriver().close();
		changewindow(0);
	}
	
	public void clickoncreatedlink()
	{
		createdlink.click();
		System.out.println(linkresulttext.getText());
	}
	
	public void clickonnocontentlink()
	{
		nocontentlink.click();
		System.out.println(linkresulttext.getText());
	}
	
	public void clickonmovedlink()
	{
		movedlink.click();
		System.out.println(linkresulttext.getText());
	}
	
	public void clickonbadrequestlink()
	{
		badrequestlink.click();
		System.out.println(linkresulttext.getText());
	}
	
	public void clickonunauthorisedlink()
	{
		unauthorisedlink.click();
		System.out.println(linkresulttext.getText());
	}
	
	public void clickonforbiddenlink()
	{
		forbiddenlink.click();
		System.out.println(linkresulttext.getText());
	}
	
	public void clickonnotfoundlink()
	{
		notfoundlink.click();
		System.out.println(linkresulttext.getText());
	}
}
