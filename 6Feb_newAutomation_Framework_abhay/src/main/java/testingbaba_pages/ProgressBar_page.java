package testingbaba_pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class ProgressBar_page extends Base_Library
{
	String path = "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\testdata\\testingbaba_testdata.XLSX";
	public ProgressBar_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#widget\']")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[text()=\'progress bar\']")
	private WebElement progressbar;
	
	@FindBy(xpath = "//*[@id=\'my-progress\']/div")
	private WebElement widthpercentage;
	
	@FindBy(xpath = "//*[@onclick=\'move()\']")
	private WebElement start;
	
	public void clickonclosebutton()
	{
		closebutton.click();
	}
	
	public void clickonpracticebutton()
	{
		practice.click();
	}
	
	public void clickonwidgetsbutton() throws InterruptedException
	{
		widgets.click();
		Thread.sleep(1000);
	}
	
	public void clickonprogressbarbutton()
	{
		progressbar.click();
	}
	
	public void getverifyprogressbar() throws InterruptedException
	{
		String width_1 = widthpercentage.getAttribute("style");
		System.out.println(width_1);
		start.click();
		Thread.sleep(2000);
		String width_2 = widthpercentage.getAttribute("style");
		System.out.println(width_2);
		assertEquals(width_1, Excelreaddata(path, 4, 1, 1));
		assertEquals(width_2, Excelreaddata(path, 4, 1, 2));
	}	
}
