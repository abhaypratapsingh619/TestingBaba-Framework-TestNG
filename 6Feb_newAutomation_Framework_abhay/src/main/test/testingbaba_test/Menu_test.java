package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.Menu_page;

public class Menu_test extends Base_Library
{
	Menu_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new Menu_page();
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
	public void clickonmenubutton()
	{
		ob.clickonmenubutton();
	}
	
	@Test(priority = 4)
	public void mousehoveronhomebutton()
	{
		ob.mousehoveronhomebutton();
	}
	
	@Test(priority = 5)
	public void mousehoveronaboutbutton()
	{
		ob.mousehoveronaboutbutton();
	}
	
	@Test(priority = 6)
	public void mousehoverandclickonservicesdropdown()
	{
		ob.mousehoverandclickonservicesdropdown();
	}
	
	@Test(priority = 7)
	public void mousehoverandclickonblogdropdown()
	{
		ob.mousehoverandclickonblogdropdown();
	}
	
	@Test(priority = 8)
	public void mousehoveroncontactbutton()
	{
		ob.mousehoveroncontactbutton();
	}
}
