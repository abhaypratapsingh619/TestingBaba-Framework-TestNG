package testingbaba_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.TextBox_page;

public class TextBox_test extends Base_Library
{
	
	TextBox_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new TextBox_page();	
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
	public void clickontextbox()
	{
		ob.clickontextbox();
	}
	
	@Test(priority = 4)
	public void filldetailstextbox()
	{
		ob.filldetailstextbox();
	}
	
	@Test(priority = 5)
	public void getdetails()
	{
		ob.getdetails();
	}
	
	@Test(priority = 6)
	public void getverify()
	{
		ob.getverify();
	}
}
