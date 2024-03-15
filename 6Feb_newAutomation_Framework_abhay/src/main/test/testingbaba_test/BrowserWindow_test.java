package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.BrowserWindow_page;

public class BrowserWindow_test extends Base_Library
{
	BrowserWindow_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new BrowserWindow_page();
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
	public void clickonalertsframeandwindow()
	{
		ob.clickonalertsframeandwindow();
	}
	
	@Test(priority = 3)
	public void clickonbrowserwindowsbutton()
	{
		ob.clickonbrowserwindowsbutton();
	}
	
	@Test(priority = 4)
	public void clickonnewtabbutton()
	{
		ob.clickonnewtabbutton();
	}
	
	@Test(priority = 5)
	public void clickonnewwindowbutton()
	{
		ob.clickonnewwindowbutton();
	}
	
	@Test(priority = 6)
	public void clickonnewwindowmessagebutton() throws InterruptedException
	{
		ob.clickonnewwindowmessagebutton();
	}
}
