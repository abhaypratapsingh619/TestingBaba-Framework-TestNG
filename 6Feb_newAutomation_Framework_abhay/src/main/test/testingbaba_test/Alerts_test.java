package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.Alerts_page;


public class Alerts_test extends Base_Library
{
	Alerts_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new Alerts_page();
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
	public void clickonalertsbutton()
	{
		ob.clickonalertsbutton();
	}
	
	@Test(priority = 4)
	public void clickonseealertbutton()
	{
		ob.clickonseealertbutton();
	}
	
	@Test(priority = 5)
	public void clickonafter5secondbutton() throws InterruptedException
	{
		ob.clickonafter5secondbutton();
	}
	
	@Test(priority = 6)
	public void clickonconfirmboxbutton()
	{
		ob.clickonconfirmboxbutton();
	}
	
	@Test(priority = 7)
	public void clickonpromptboxbutton()
	{
		ob.clickonpromptboxbutton();
	}
	
	
	
	
}
