package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.Frames_page;

public class Frames_test extends Base_Library
{
	Frames_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new Frames_page();
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
	public void clickonalertsframeandwindow() throws InterruptedException
	{
		ob.clickonalertsframeandwindow();
	}
	
	@Test(priority = 3)
	public void clickonframesbutton() throws InterruptedException
	{
		ob.clickonframesbutton();
	}
	
	@Test(priority = 4)
	public void getframetext1()
	{
		ob.getframetext1();
	}
	
	@Test(priority = 5)
	public void getframetext2()
	{
		ob.getframetext2();
	}
	
}
