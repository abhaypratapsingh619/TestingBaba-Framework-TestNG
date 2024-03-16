package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class Accordion_page extends Base_Library
{
	public Accordion_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#widget\']")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[text()=\'accordion\']")
	private WebElement accordion;
	
	@FindBy(xpath = "//*[@data-target=\'#collapse1\']")
	private WebElement paragraph1;
	
	@FindBy(xpath = "(//*[@class=\'card-body\'])[5]")
	private WebElement paragraph1text;
	
	@FindBy(xpath = "//*[@data-target=\'#collapse2\']")
	private WebElement paragraph2;
	
	@FindBy(xpath = "(//*[@class=\'card-body\'])[6]")
	private WebElement paragraph2text;
	
	@FindBy(xpath = "//*[@data-target=\'#collapse3\']")
	private WebElement paragraph3;
	
	@FindBy(xpath = "(//*[@class=\'card-body\'])[7]")
	private WebElement paragraph3text;
	
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
	
	public void clickonaccordionbutton()
	{
		accordion.click();
	}
	
	public void clickonparagraph1() throws InterruptedException
	{
//		paragraph1.click();
//		Thread.sleep(2000);
		System.out.println(paragraph1text.getText());
	}
	
	public void clickonparagraph2() throws InterruptedException
	{
		paragraph2.click();
		Thread.sleep(1000);
		System.out.println(paragraph2text.getText());
	}
	
	public void clickonparagraph3() throws InterruptedException
	{
		paragraph3.click();
		Thread.sleep(1000);
		System.out.println(paragraph3text.getText());
	}
	
}
