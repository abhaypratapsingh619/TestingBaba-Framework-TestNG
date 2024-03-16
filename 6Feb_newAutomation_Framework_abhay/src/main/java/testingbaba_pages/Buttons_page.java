package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class Buttons_page extends Base_Library
{
	
	public Buttons_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#elements\']")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()=\'buttons\']")
	private WebElement buttons;
	
	@FindBy(xpath = "//*[@ondblclick=\'doubletext()\']")
	private WebElement doubleclickbutton;
	
	@FindBy(xpath = "//*[@oncontextmenu=\'righttext()\']")
	private WebElement rightclickbutton;
	
	@FindBy(xpath = "//*[@onclick=\'clicktext()\']")
	private WebElement clickmebutton;
	
	@FindBy(xpath = "//*[@id=\'double-content\']")
	private WebElement doubleclicktext;
	
	@FindBy(xpath = "//*[@id=\'right-content\']")
	private WebElement rightclicktext;
	
	@FindBy(xpath = "//*[@id=\'click-content\']")
	private WebElement clickmetext;
	
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
	
	public void clickonbuttonsbutton()
	{
		buttons.click();
	}
	
	public void clickondoubleclickbutton()
	{
		doubleclick(doubleclickbutton);
		System.out.println(doubleclicktext.getText());
	}
	
	public void clickonrightclickbutton()
	{
		rightclick(rightclickbutton);
		System.out.println(rightclicktext.getText());
	}
	
	public void clickonclickmebutton()
	{	
		clickmebutton.click();
		System.out.println(clickmetext.getText());
	}
	
}
