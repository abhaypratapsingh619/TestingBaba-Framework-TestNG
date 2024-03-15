package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.RadioButton_page;

public class RadioButton_test extends Base_Library
{
	RadioButton_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new RadioButton_page();	
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
	public void clickonradiobutton()
	{
		ob.clickonradiobutton();
	}
	
	@Test(priority = 4)
	public void clickonyescheckbox()
	{
		ob.clickonyescheckbox();
	}
	
	@Test(priority = 5)
	public void clickonimpressivecheckbox()
	{
		ob.clickonimpressivecheckbox();
	}
	
	@Test(priority = 6)
	public void clickonnocheckbox()
	{
		ob.clickonnocheckbox();
	}
	
//	@Test(priority = 4)
//	public void clickoncheckboxs()
//	{
//		ob.clickoncheckboxs();
//	}
//	
//	@Test(priority = 5)
//	public void getdetailsverify()
//	{
//		ob.getdetailsverify();
//	}
}
