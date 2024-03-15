package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.Tabs_page;

public class Tabs_test extends Base_Library
{
	Tabs_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new Tabs_page();
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
	public void clickontabsbutton()
	{
		ob.clickontabsbutton();
	}
	
	@Test(priority = 4)
	public void clickontab1()
	{
		ob.clickontab1();
	}
	
	@Test(priority = 5)
	public void clickontab2() throws InterruptedException
	{
		ob.clickontab2();
	}
	
	@Test(priority = 6)
	public void clickontab3() throws InterruptedException
	{
		ob.clickontab3();
	}
	
}
