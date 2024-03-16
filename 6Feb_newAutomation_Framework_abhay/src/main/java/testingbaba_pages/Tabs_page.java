package testingbaba_pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class Tabs_page extends Base_Library
{
	public Tabs_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#widget\']")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[text()=\'tabs\']")
	private WebElement tabs;
	
	@FindBy(xpath = "(//*[@data-toggle=\'tab\'])[1]")
	private WebElement tab1;
	
	@FindBy(xpath = "//*[@id=\'tab_21\']/div/div/div[1]/p")
	private WebElement tab1text;

	@FindBy(xpath = "(//*[@data-toggle=\'tab\'])[2]")
	private WebElement tab2;

	@FindBy(xpath = "//*[@id=\'tab_21\']/div/div/div[2]/p")
	private List<WebElement> tab2text;

	@FindBy(xpath = "(//*[@data-toggle=\'tab\'])[3]")
	private WebElement tab3;

	@FindBy(xpath = "//*[@id=\'tab_21\']/div/div/div[3]/p")
	private List<WebElement> tab3text;

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
	
	public void clickontabsbutton()
	{
		tabs.click();
	}
	
	public void clickontab1()
	{
		tab1.click();
		System.out.println(tab1text.getText());
	}
	
	public void clickontab2() throws InterruptedException
	{
		tab2.click();
		Thread.sleep(1000);
		for(WebElement tabtext:tab2text)
		{
			System.out.println(tabtext.getText());
		}
	}
	
	public void clickontab3() throws InterruptedException
	{
		tab3.click();
		Thread.sleep(1000);
		for(WebElement tabtext:tab3text)
		{
			System.out.println(tabtext.getText());
		}
	}
	
}
