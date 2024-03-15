package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.ProgressBar_page;


public class ProgressBar_test extends Base_Library
{
	ProgressBar_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new ProgressBar_page();
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
	public void clickonprogressbarbutton()
	{
		ob.clickonprogressbarbutton();
	}
	
	@Test(priority = 4)
	public void getverifyprogressbar() throws InterruptedException
	{
		ob.getverifyprogressbar();
	}
}
