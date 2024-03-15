package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.NestedFrames_page;

public class NestedFrames_test extends Base_Library
{
	NestedFrames_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new NestedFrames_page();	
	}
	
	@Test(priority = 0)
	public void clickonclosebutton()
	{
		ob.clickonclosebutton();
	}
	
	@Test(priority = 1)
	public void clickonpractice()
	{
		ob.clickonpracticebutton();
	}
	
	@Test(priority = 2)
	public void clickonalertsframeandwindow() throws InterruptedException
	{
		ob.clickonalertsframeandwindow();
	}
	
	@Test(priority = 3)
	public void clickonnestedframes()
	{
		ob.clickonnestedframes();
	}
	
	@Test(priority = 4)
	public void clickonparentbutton()
	{
		ob.clickonparentbutton();
	}
	
	@Test(priority = 5)
	public void clickonchildbutton()
	{
		ob.clickonchildbutton();
	}	
}
