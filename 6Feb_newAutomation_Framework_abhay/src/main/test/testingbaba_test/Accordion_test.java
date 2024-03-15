package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Base_Library;
import testingbaba_pages.Accordion_page;

public class Accordion_test extends Base_Library
{
	Accordion_page ob;
	
	@Parameters({"environment","browsername"})
	@BeforeTest
	public void getLaunch_testingbabaUrl(String environment, String browsername)
	{
		launchUrl(getreaddata(environment),browsername);
		ob = new Accordion_page();
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
	public void clickonaccordionbutton()
	{
		ob.clickonaccordionbutton();
	}
	
	@Test(priority = 4)
	public void clickonparagraph1() throws InterruptedException
	{
		ob.clickonparagraph1();
	}
	
	@Test(priority = 5)
	public void clickonparagraph2() throws InterruptedException
	{
		ob.clickonparagraph2();
	}
	
	@Test(priority = 6)
	public void clickonparagraph3() throws InterruptedException
	{
		ob.clickonparagraph3();
	}
}
