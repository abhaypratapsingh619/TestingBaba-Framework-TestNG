package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class Menu_page extends Base_Library
{
	public Menu_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#widget\']")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[text()=\'menu\']")
	private WebElement menu;
	
	@FindBy(xpath = "//*[@id=\'navbar\']/ul/li[1]")
	private WebElement home;
	
	@FindBy(xpath = "//*[@id=\'navbar\']/ul/li[2]")
	private WebElement about;
	
	@FindBy(xpath = "//*[@id=\'navbar\']/ul/li[3]")
	private WebElement services;
	
	@FindBy(xpath = "//*[@id=\'navbar\']/ul/li[4]")
	private WebElement blog;
	
	@FindBy(xpath = "//*[@id=\'navbar\']/ul/li[5]")
	private WebElement contact;
	
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
	
	public void clickonmenubutton()
	{
		menu.click();
	}
	
	public void mousehoveronhomebutton()
	{
		mousehover(home);
	}
	
	public void mousehoveronaboutbutton()
	{
		mousehover(about);
	}
	
	public void mousehoverandclickonservicesdropdown()
	{
		mousehover_click(services, "Mobile Development");
	}
	
	public void mousehoverandclickonblogdropdown()
	{
		mousehover_click(blog, "JavaScript");
	}
	
	public void mousehoveroncontactbutton()
	{
		mousehover(contact);
	}
}
