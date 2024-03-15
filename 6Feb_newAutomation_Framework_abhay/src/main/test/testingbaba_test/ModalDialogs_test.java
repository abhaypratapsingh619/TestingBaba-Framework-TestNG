package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.ModalDialogs_page;

public class ModalDialogs_test extends Base_Library
{
	ModalDialogs_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new ModalDialogs_page();	
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
	public void clickonmodaldialogsbutton()
	{
		ob.clickonmodaldialogsbutton();
	}
	
	@Test(priority = 4)
	public void clickonsmallmodalbutton() throws InterruptedException
	{
		ob.clickonsmallmodalbutton();
	}
	
	@Test(priority = 5)
	public void clickonlargemodalbutton() throws InterruptedException
	{
		ob.clickonlargemodalbutton();
	}
	
}
