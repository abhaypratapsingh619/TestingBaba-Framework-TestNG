package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class NestedFrames_page extends Base_Library
{
	public NestedFrames_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[text()=\'×\']")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practicebutton;
	
	@FindBy(xpath = "//*[@data-target=\'#alerts\']")
	private WebElement alertsframeandwindow;
	
	@FindBy(xpath = "//*[text()=\'nested frames\']")
	private WebElement nestedframes;
	
	@FindBy(xpath = "//*[text()=\'Parent\']")
	private WebElement parent;
	
	@FindBy(xpath = "//*[text()=\'Child\']")
	private WebElement child;
	
	@FindBy(xpath = "//*[text()=\'Click Here\']")
	private WebElement clickhere;
	
	@FindBy(xpath = "//*[@id=\'tab_14\']/iframe")
	private WebElement iframe1;
	
	@FindBy(xpath = "//*[@height=\'400\']")
	private WebElement iframe2;
	
	@FindBy(xpath = "//*[@height=\'300\']")
	private WebElement iframe3;
	
	@FindBy(xpath = "/html/body/p")
	private WebElement clickheretext;
	
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
	
	public void clickonnestedframes()
	{
		nestedframes.click();
	}
	
	public void clickonparentbutton()
	{
		getdriver().switchTo().frame(iframe1);
		getdriver().switchTo().frame(iframe2);
		System.out.println(parent.getText());
	}
	
	public void clickonchildbutton()
	{
		getdriver().switchTo().frame(iframe3);
		System.out.println(child.getText());
		clickhere.click();
		System.out.println(clickheretext.getText());
		getdriver().switchTo().defaultContent();
	}	
}
