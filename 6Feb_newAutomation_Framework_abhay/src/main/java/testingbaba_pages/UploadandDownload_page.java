package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class UploadandDownload_page extends Base_Library
{
	
	public UploadandDownload_page()
	{
		 PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\"Practice\"]")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()=\"upload and download\"]")
	private WebElement uploadanddownloadbutton;
	
	@FindBy(xpath = "//*[text()=\"Download\"]")
	private WebElement downloadbutton;
	
	@FindBy(xpath = "//*[text()=\"Select a file\"]")
	private WebElement selectfilebutton;
	
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
		Thread.sleep(100);
	}
	
	public void clickonuploadanddownloadbutton()
	{
		uploadanddownloadbutton.click();
		
	}
	
	public void clickondownloadbutton()
	{
		downloadbutton.click();
	}
	
	String path = "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\testdata\\testingbaba_testdata.XLSX";
	public void clickonuploadfilebutton() throws InterruptedException
	{
		selectfilebutton.click();
		Thread.sleep(1000);
		fileuploading(path);
	}
	
}
