package testingbaba_pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class AutoComplete_page extends Base_Library
{
	public AutoComplete_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#widget\']")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[text()=\'auto complete\']")
	private WebElement autocomplete;
	
	@FindBy(xpath = "//*[@id=\'tab_17\']/div/iframe")
	private WebElement iframe;
	
	@FindBy(xpath = "//*[@id=\'myInput\']")
	private WebElement searchbox;
	
	@FindBy(xpath = "//*[@id=\'myInputautocomplete-list\']/div")
	private List<WebElement> searchlist;
	
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
	
	public void clickonautocompletebutton()
	{
		autocomplete.click();
	}
	
	public void searchinsearchbox()
	{
		getdriver().switchTo().frame(iframe);
		searchbox.sendKeys("i");
		searchlist.get(1).click();
		getdriver().switchTo().defaultContent();
	}
}
