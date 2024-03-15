package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.SelectMenu_page;

public class SelectMenu_test extends Base_Library
{
	SelectMenu_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new SelectMenu_page();
	}
	
	@Test(priority = 0)
	public void clickonclosebutton()
	{
		ob.clickonclosebutton();
	}
	
	@Test(priority = 1)
	public void clickonpracticebutton()
	{
		ob.clickonpracticebutton();
	}
	
	@Test(priority = 2)
	public void clickonwidgetsbutton() throws InterruptedException
	{
		ob.clickonwidgetsbutton();
	}
	
	@Test(priority = 3)
	public void clickonselectmenu()
	{
		ob.clickonselectmenu();
	}
	
	@Test(priority = 4)
	public void clickonselectvaluedropdown()
	{
		ob.clickonselectvaluedropdown();
	}
	
	@Test(priority = 5)
	public void clickonselectonedropdown()
	{
		ob.clickonselectonedropdown();
	}
	
	@Test(priority = 6)
	public void clickonoldstyleselectmenudropdown()
	{
		ob.clickonoldstyleselectmenudropdown();
	}
	
	@Test(priority = 7)
	public void clickonstandardmultiselectdropdown()
	{
		ob.clickonstandardmultiselectdropdown();
	}
	
	
	
}
