package testingbaba_pages;

import baselibrary.Base_Library;

public class Login_page extends Base_Library
{	
//	public void getTitle()
//	{
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
	public void getTitle()
	{
		String title = getdriver().getTitle();
		System.out.println(title);
	}
}