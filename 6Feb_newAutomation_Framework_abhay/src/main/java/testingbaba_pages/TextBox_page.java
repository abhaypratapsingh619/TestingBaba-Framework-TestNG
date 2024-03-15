package testingbaba_pages;

//import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Base_Library;

public class TextBox_page extends Base_Library 
{
	String path = "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\testdata\\testingbaba_testdata.XLSX";
	public TextBox_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\"Practice\"]")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()=\"text box\"]")
	private WebElement text_box;
	
	@FindBy(xpath = "//*[@id=\"fullname1\"]")
	private WebElement full_name;
	
	@FindBy(xpath = "//*[@id=\"fullemail1\"]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
	private WebElement current_address;
	
	@FindBy(xpath = "//*[@id=\"paddresh1\"]")
	private WebElement permanent_address;
	
	@FindBy(xpath = "//input[@value=\"Submit\"]")
	private WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/div[2]/label")
	private List<WebElement> datalist;
	
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
	
	public void clickontextbox()
	{
		text_box.click();
	}
	
	public void filldetailstextbox()
	{
		full_name.sendKeys(Excelreaddata(path, 0, 0, 1));
		email.sendKeys(Excelreaddata(path, 0, 1, 1));
		current_address.sendKeys(Excelreaddata(path, 0, 2, 1));		
		permanent_address.sendKeys(Excelreaddata(path, 0, 3, 1));
		submit.click();
	}

	public ArrayList<String> getdetails()
	{
		ArrayList<String> expectedlist = new ArrayList<String>();
		for(int i=1; i<datalist.size(); i=i+2)
		{
			String data = datalist.get(i).getText();
			System.out.println(data);
			expectedlist.add(data);		
		}
		return expectedlist;
	}
	
	public void getverify()
	{
		SoftAssert sf = new SoftAssert();
		ArrayList<String> actual = new ArrayList<String>();
		actual.add(Excelreaddata(path, 0, 0, 1));
		actual.add(Excelreaddata(path, 0, 1, 1));
		actual.add(Excelreaddata(path, 0, 2, 1));
		actual.add(Excelreaddata(path, 0, 3, 1));
		
		TextBox_page ob = new TextBox_page();
		ArrayList<String> expected = ob.getdetails();
		for(String act:actual)
		{
			for(String exp:expected)
			{
//				assertEquals(act, exp);     // Hard Assert
				sf.assertEquals(act, exp);  // Soft Assert
				expected.remove(exp);
				break;
			}
		}
		sf.assertAll();
	}
}
