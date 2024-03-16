package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class ToolTips_page extends Base_Library
{
	public ToolTips_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#widget\']")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[text()=\'tool tips\']")
	private WebElement tooltips;

	@FindBy(xpath = "//*[@id=\'tab_22\']/button")
	private WebElement hovermetoseebutton;

	@FindBy(xpath = "//*[@id=\'tab_22\']/input")
	private WebElement hovermetoseesearchbox;
	
	@FindBy(xpath = "(//*[@id=\'tab_22\']/p)[2]")
	private WebElement pagetext;

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
	
	public void clickontooltipsbutton()
	{
		tooltips.click();
	}
	
	public void mousehoveronhovermetoseebutton()
	{
		mousehover(hovermetoseebutton);
		System.out.println(hovermetoseebutton.getAttribute("title"));
	}
	
	public void mousehoveronhovermetoseesearchbox()
	{
		mousehover(hovermetoseesearchbox);
		System.out.println(hovermetoseesearchbox.getAttribute("title"));
	}
	
	public void printpagetext()
	{
		System.out.println(pagetext.getText());
	}	
}
