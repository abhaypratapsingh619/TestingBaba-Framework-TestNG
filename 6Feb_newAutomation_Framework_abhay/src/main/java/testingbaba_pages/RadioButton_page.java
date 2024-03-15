package testingbaba_pages;

import static org.testng.Assert.assertEquals;

//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class RadioButton_page extends Base_Library
{
	String path = "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\testdata\\testingbaba_testdata.XLSX";
	public RadioButton_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\"Practice\"]")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()=\"radio buttons\"]")
	private WebElement radiobutton;
	
	@FindBy(xpath = "//*[@class=\"form-check-label\"]")
	private List<WebElement> checkbuttonlist;
	
	@FindBy(xpath = "//*[@id=\"radio-content\"]")
	private WebElement value;
	
	@FindBy(xpath = "//*[@value=\"yes\"]")
	private WebElement yescheckbox;
	
	@FindBy(xpath = "//*[@value=\"impressive\"]")
	private WebElement impressivecheckbox;
	
	@FindBy(xpath = "//*[@value=\"no\"]")
	private WebElement nocheckbox;
	
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
	
	public void clickonradiobutton()
	{
		radiobutton.click();
	}
	
	public void clickonyescheckbox()
	{
		yescheckbox.click();
		assertEquals(value.getText(), Excelreaddata(path, 3, 1, 1));
	}
	
	public void clickonimpressivecheckbox()
	{
		impressivecheckbox.click();
		assertEquals(value.getText(), Excelreaddata(path, 3, 1, 2));
	}
	
	public void clickonnocheckbox()
	{
		nocheckbox.click();
		assertEquals(value.getText(), Excelreaddata(path, 3, 1, 3));
	}
	
//	public ArrayList<String> clickoncheckboxs()
//	{
//		ArrayList<String> expectedlist = new ArrayList<String>();
//		for(WebElement checkbox:checkbuttonlist)
//		{
//			checkbox.click();
//			expectedlist.add(value.getText());
//		}
//		return expectedlist;
//	}
//	
//	public void getdetailsverify()
//	{
//		ArrayList<String> actual = new ArrayList<String>();
//		actual.add(Excelreaddata(path, 3, 1, 1));
//		actual.add(Excelreaddata(path, 3, 1, 2));
//		actual.add(Excelreaddata(path, 3, 1, 3));
//		
//		RadioButton_page ob = new RadioButton_page();
//		ArrayList<String> expected = ob.clickoncheckboxs();
//		for(String act:actual)
//		{
//			for(String exp:expected)
//			{
//				assertEquals(act, exp);     // Hard Assert
////				sf.assertEquals(act, exp);  // Soft Assert
//				expected.remove(exp);
//				break;
//			}
//		}
////		sf.assertAll();  // Soft Assert
//	}
}
