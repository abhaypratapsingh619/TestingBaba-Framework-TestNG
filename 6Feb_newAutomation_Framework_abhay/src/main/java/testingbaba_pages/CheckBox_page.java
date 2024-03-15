package testingbaba_pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Base_Library;

public class CheckBox_page extends Base_Library
{
	String path = "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\testdata\\testingbaba_testdata.XLSX";
	public CheckBox_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\"Practice\"]")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()=\"check box\"]")
	private WebElement checkboxbutton;
	
	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/iframe")
	private WebElement iframe;
	
	@FindBy(xpath = "//*[@id=\"myCheck\"]")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath = "//*[@id=\"mylaptop\"]")
	private WebElement laptopcheckbox;
	
	@FindBy(xpath = "//*[@id=\"mydesktop\"]")
	private WebElement desktopcheckbox;
	
	@FindBy(xpath = "//*[@style=\"display: block;\"]")
	private List<WebElement> details;
	
	@FindBy(xpath = "//*[@id=\"text\"]")
	private WebElement mobiletext;
	
	@FindBy(xpath = "//*[@id=\"text1\"]")
	private WebElement laptoptext;
	
	@FindBy(xpath = "//*[@id=\"text2\"]")
	private WebElement desktoptext;
	
	public void clickonclosebutton()
	{
		closebutton.click();
	}
	
	public void clickonpracticebutton()
	{
		practice.click();
	}
	
	public void clickonelement()
	{
		elements.click();
	}
	
	public void clickoncheckboxbutton()
	{
		checkboxbutton.click();
	}
	
	public void clickonmobilebutton()
	{
		getdriver().switchTo().frame(iframe);
		mobilecheckbox.click();
		assertEquals(mobiletext.getText(), Excelreaddata(path, 2, 1, 1));
	}
	
	public void clickonlaptopbutton()
	{
		laptopcheckbox.click();
		assertEquals(laptoptext.getText(), Excelreaddata(path, 2, 1, 2));
	}
	
	public void clickondesktopbutton()
	{
		desktopcheckbox.click();
		assertEquals(desktoptext.getText(), Excelreaddata(path, 2, 1, 3));
		getdriver().switchTo().defaultContent();
	}
	
//	public void clickoncheckbox()
//	{
//		driver.switchTo().frame(iframe);
//		mobilecheckbox.click();
//		laptopcheckbox.click();
//		desktopcheckbox.click();
//		driver.switchTo().defaultContent();
//	}
//	
//	public void getdetailsverify()
//	{
//		ArrayList<String> actual = new ArrayList<String>();
//		actual.add(Excelreaddata(path, 2, 1, 1));
//		actual.add(Excelreaddata(path, 2, 1, 2));
//		actual.add(Excelreaddata(path, 2, 1, 3));
//		
//		ArrayList<String> expected = new ArrayList<String>();
//		for(int i=0; i<details.size(); i++)
//		{
//			String data = details.get(i).getText();
//			expected.add(data);		
//		}
//		
//		SoftAssert sf = new SoftAssert();
//		for(String act:actual)
//		{
//			for(String exp:expected)
//			{
////				assertEquals(act, exp);     // Hard Assert
//				sf.assertEquals(act, exp);  // Soft Assert
//				expected.remove(exp);
//				break;
//			}
//			sf.assertAll();  // Soft Assert
//		}
//		
//	}
	
}
