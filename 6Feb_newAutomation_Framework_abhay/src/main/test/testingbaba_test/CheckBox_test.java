package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.CheckBox_page;

public class CheckBox_test extends Base_Library
{
	CheckBox_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new CheckBox_page();	
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
	public void clickonelement()
	{
		ob.clickonelement();
	}
	
	@Test(priority = 3)
	public void clickoncheckboxbutton()
	{
		ob.clickoncheckboxbutton();
	}
	
	@Test(priority = 4)
	public void clickonmobilebutton()
	{
		ob.clickonmobilebutton();
	}
	
	@Test(priority = 5)
	public void clickonlaptopbutton()
	{
		ob.clickonlaptopbutton();
	}
	
	@Test(priority = 6)
	public void clickondesktopbutton()
	{
		ob.clickondesktopbutton();
	}
	
//	@Test(priority = 4)
//	public void clickoncheckbox()
//	{
//		ob.clickoncheckbox();
//	}
//	
//	@Test(priority = 5)
//	public void getdetailsverify()
//	{
//		ob.getdetailsverify();
//	}
}
