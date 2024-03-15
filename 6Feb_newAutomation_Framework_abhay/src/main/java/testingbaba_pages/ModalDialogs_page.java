package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class ModalDialogs_page extends Base_Library
{
	public ModalDialogs_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[text()=\"×\"]")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\"Practice\"]")
	private WebElement practicebutton;
	
	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement alertsframeandwindow;
	
	@FindBy(xpath = "//*[text()=\"modal dialogs\"]")
	private WebElement modaldialogs;
	
	@FindBy(xpath = "//*[@data-toggle=\"modal\"][1]")
	private WebElement smallmodalbutton;
	
	@FindBy(xpath = "(//*[@class=\"modal-body\"])[2]")
	private WebElement smallmodaltext;
	
	@FindBy(xpath = "//*[@id=\"exampleModal1\"]/div/div/div[3]/button")
	private WebElement smallmodalclosebutton;
	
	@FindBy(xpath = "(//*[@data-toggle=\"modal\"])[2]")
	private WebElement largemodalbutton;
	
	@FindBy(xpath = "//*[@id=\"exampleModal2\"]/div/div/div[2]")
	private WebElement largemodaltext;
	
	@FindBy(xpath = "//*[@id=\"exampleModal2\"]/div/div/div[3]/button")
	private WebElement largemodalclosebutton;
	
	public void clickonclosebutton()
	{
		closebutton.click();
	}
	
	public void clickonpracticebutton()
	{
		practicebutton.click();
	}
	
	public void clickonalertsframeandwindow() throws InterruptedException
	{
		alertsframeandwindow.click();
		Thread.sleep(1000);
	}
	
	public void clickonmodaldialogsbutton()
	{
		modaldialogs.click();
	}
	
	public void clickonsmallmodalbutton() throws InterruptedException
	{
		smallmodalbutton.click();
		Thread.sleep(1000);
		System.out.println(smallmodaltext.getText());
		smallmodalclosebutton.click();
	}
	
	public void clickonlargemodalbutton() throws InterruptedException
	{
		largemodalbutton.click();
		Thread.sleep(1000);
		System.out.println(largemodaltext.getText());
		largemodalclosebutton.click();
	}
	
	
	
	
}
