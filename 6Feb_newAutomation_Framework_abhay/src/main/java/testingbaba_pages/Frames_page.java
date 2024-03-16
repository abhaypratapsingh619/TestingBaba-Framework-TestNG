package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class Frames_page extends Base_Library
{
	public Frames_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[text()=\'×\']")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practicebutton;
	
	@FindBy(xpath = "//*[@data-target=\'#alerts\']")
	private WebElement alertsframeandwindow;
	
	@FindBy(xpath = "//*[text()=\'frames\']")
	private WebElement framesbutton;
	
	@FindBy(xpath = "//*[@id=\'tab_13\']/iframe[1]")
	private WebElement iframe1;
	
	@FindBy(xpath = "(//html/body/h1)[1]")
	private WebElement frametext1;
	
	@FindBy(xpath = "//*[@id=\'tab_13\']/iframe[2]")
	private WebElement iframe2;
	
//	@FindBy(xpath = "(//html/body/h1)[2]")
//	private WebElement frametext2;
	
	@FindBy(xpath = "(//html/body/h1)[1]")
	private WebElement frametext2;
	
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
	
	public void clickonframesbutton() throws InterruptedException
	{
		framesbutton.click();
		Thread.sleep(1000);
	}
	
	public void getframetext1()
	{
		getdriver().switchTo().frame(iframe1);
		System.out.println(frametext1.getText());
		getdriver().switchTo().defaultContent();
	}
	
	public void getframetext2()
	{
		getdriver().switchTo().frame(iframe2);
		System.out.println(frametext2.getText());
		getdriver().switchTo().defaultContent();
	}
	
	
	
	
	
	
}
