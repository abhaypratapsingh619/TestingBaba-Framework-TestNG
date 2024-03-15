package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.Base_Library;
import testingbaba_pages.WebTables_page;

public class WebTables_test extends Base_Library
{
	WebTables_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new WebTables_page();	
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
	public void clickonwebtablesbutton() throws InterruptedException
	{
		ob.clickonwebtablesbutton();
	}
	
	@Test(priority = 4)
	public void filldetails()
	{
		ob.filldetails();
	}
	
	@Test(priority = 5)
	public void getfilldetailsverify()
	{
		ob.getfilldetailsverify();
	}
	
	@Test(priority = 6)
	public void updatedetails()
	{
		ob.updatedetails();
	}
	
	@Test(priority = 7)
	public void getupdatedetailsverify()
	{
		ob.getupdatedetailsverify();
	}
}
