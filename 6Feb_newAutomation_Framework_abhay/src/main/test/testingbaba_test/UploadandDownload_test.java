package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.UploadandDownload_page;

public class UploadandDownload_test extends Base_Library
{
	
	UploadandDownload_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new UploadandDownload_page();	
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
	public void clickonuploadanddownloadbutton()
	{
		ob.clickonuploadanddownloadbutton();
	}
	
	@Test(priority = 4)
	public void clickonuploadfilebutton() throws InterruptedException
	{
		ob.clickonuploadfilebutton();
	}
	
//	@Test(priority = 5)
//	public void clickondownloadbutton()
//	{
//		ob.clickondownloadbutton();
//	}
}
