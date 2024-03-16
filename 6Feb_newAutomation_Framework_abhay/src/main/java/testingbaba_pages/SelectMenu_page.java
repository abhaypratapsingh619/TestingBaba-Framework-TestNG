package testingbaba_pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class SelectMenu_page extends Base_Library
{
	public SelectMenu_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\'myModal2\']/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\'Practice\']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\'#widget\']")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[text()=\'select menu\']")
	private WebElement selectmenu;
	
	@FindBy(xpath = "(//*[@class=\'form-control\'])[16]")
	private WebElement selectvalue;
	
	@FindBy(xpath = "//*[@id=\'tab_24\']/form/div/div[2]/select")
	private WebElement selectone;
	
	@FindBy(xpath = "//*[@id=\'tab_24\']/form/div/div[3]/div/select")
	private WebElement oldstyleselectmenu;
	
	@FindBy(xpath = "//*[@id=\'tab_24\']/form/div/div[5]/div/select")
	private WebElement standardmultiselect;
	
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
	
	public void clickonselectmenu()
	{
		selectmenu.click();
	}
	
	public void clickonselectvaluedropdown()
	{
		dropdown_text(selectvalue, "Group 1, Option 2");
		dropdown_text(selectvalue, "Group 2, Option 1");
	}
	
	public void clickonselectonedropdown()
	{
		dropdown_text(selectone, "Java");
		dropdown_text(selectone, "CSS");
	}
	
	public void clickonoldstyleselectmenudropdown()
	{
		dropdown_index(oldstyleselectmenu, 3);
	}
	
	public void clickonstandardmultiselectdropdown()
	{
		try 
		{
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			dropdown_index(standardmultiselect, 1);
			dropdown_index(standardmultiselect, 2);
//			dropdown_index(standardmultiselect, 3);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		} 
		catch (AWTException e) 
		{
			System.out.println(e);
		}
	}
}
