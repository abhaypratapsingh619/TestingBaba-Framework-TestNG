package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.ToolTips_page;

public class ToolTips_test extends Base_Library
{
	ToolTips_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new ToolTips_page();
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
	public void clickontooltipsbutton()
	{
		ob.clickontooltipsbutton();
	}
	
	@Test(priority = 4)
	public void mousehoveronhovermetoseebutton()
	{
		ob.mousehoveronhovermetoseebutton();
	}
	
	@Test(priority = 5)
	public void mousehoveronhovermetoseesearchbox()
	{
		ob.mousehoveronhovermetoseesearchbox();
	}
	
	@Test(priority = 6)
	public void printpagetext()
	{
		ob.printpagetext();
	}
	
	
	
	
}
