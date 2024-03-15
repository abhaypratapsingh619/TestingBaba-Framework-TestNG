package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class Alerts_page extends Base_Library
{
	public Alerts_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[text()=\"×\"]")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\"Practice\"]")
	private WebElement practicebutton;
	
	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement alertsframeandwindow;
	
	@FindBy(xpath = "//*[text()=\"alerts\"]")
	private WebElement alerts;
	
	@FindBy(xpath = "(//*[text()=\"Click me\"])[1]")
	private WebElement seealertbutton;
	
	@FindBy(xpath = "//*[@onclick=\"aftersec5()\"]")
	private WebElement after5secondbutton;
	
	@FindBy(xpath = "//*[@onclick=\"myconfirm()\"]")
	private WebElement confirmboxbutton;
	
	@FindBy(xpath = "(//*[text()=\"Click me\"])[2]")
	private WebElement promptboxbutton;
	
//	@FindBy(xpath = "//*[text()=\"alerts\"]")
//	private WebElement ;
	
	public void clickonclosebutton()
	{
		closebutton.click();
	}
	
	public void clickonpracticebutton()
	{
		practicebutton.click();
	}
	
	public void clickonalertsframeandwindow()
	{
		alertsframeandwindow.click();
	}
	
	public void clickonalertsbutton()
	{
		alerts.click();
	}
	
	public void clickonseealertbutton()
	{
		seealertbutton.click();
		acceptalert();
	}
	
	public void clickonafter5secondbutton() throws InterruptedException
	{
		after5secondbutton.click();
		Thread.sleep(5000);
		acceptalert();
	}
	
	public void clickonconfirmboxbutton()
	{
		confirmboxbutton.click();
		dismissalert();
	}
	
	public void clickonpromptboxbutton()
	{
		promptboxbutton.click();
		sendkeys_alert("Abhay");
		acceptalert();
	}
	
	
	
	
}
