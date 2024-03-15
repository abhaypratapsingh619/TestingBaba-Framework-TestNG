package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.Links_page;

public class Links_test extends Base_Library
{
	Links_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new Links_page();	
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
	public void clickonelement() throws InterruptedException
	{
		ob.clickonelement();
	}
	
	@Test(priority = 3)
	public void clickonlinksbutton()
	{
		ob.clickonlinksbutton();
	}
	
	@Test(priority = 4)
	public void clickondemopagelink()
	{
		ob.clickondemopagelink();
	}
	
	@Test(priority = 5)
	public void switchwindow()
	{
		ob.switchwindow();
	}
	
	@Test(priority = 6)
	public void clickoncreatedlink()
	{
		ob.clickoncreatedlink();
	}
	
	@Test(priority = 7)
	public void clickonnocontentlink()
	{
		ob.clickonnocontentlink();
	}
	
	@Test(priority = 8)
	public void clickonmovedlink()
	{
		ob.clickonmovedlink();
	}
	
	@Test(priority = 9)
	public void clickonbadrequestlink()
	{
		ob.clickonbadrequestlink();
	}
	
	@Test(priority = 10)
	public void clickonunauthorisedlink()
	{
		ob.clickonunauthorisedlink();
	}
	
	@Test(priority = 11)
	public void clickonforbiddenlink()
	{
		ob.clickonforbiddenlink();
	}
	
	@Test(priority = 12)
	public void clickonnotfoundlink()
	{
		ob.clickonnotfoundlink();
	}
	
	
	
}
