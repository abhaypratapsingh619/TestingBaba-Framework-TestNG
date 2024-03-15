package testingbaba_pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class WebTables_page extends Base_Library
{
	String path = "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\testdata\\testingbaba_testdata.XLSX";
	public WebTables_page()
	{
		PageFactory.initElements(getdriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebutton;
	
	@FindBy(xpath = "//*[text()=\"Practice\"]")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()=\"web tables\"]")
	private WebElement webtablesbutton;
	
	@FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
	private WebElement iframe;
	
	@FindBy(xpath = "//*[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement name;
	
	@FindBy(xpath = "//*[@name=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//*[text()=\"Save\"]")
	private WebElement save;
	
	@FindBy(xpath = "//*[@class=\"container-fluid\"]/table/tbody/tr/td[1]")
	private List<WebElement> nametextvalue;
	
	@FindBy(xpath = "//*[@class=\"container-fluid\"]/table/tbody/tr/td[2]")
	private List<WebElement> emailtextvalue;
	
	@FindBy(xpath = "//*[text()=\"Edit\"]")
	private List<WebElement> editbutton;
	
	@FindBy(xpath = "//*[@name=\"edit_name\"]")
	private WebElement editname;
	
	@FindBy(xpath = "//*[@name=\"edit_email\"]")
	private WebElement editemail;
	
	@FindBy(xpath = "//*[text()=\"Update\"]")
	private WebElement updatebutton;
	
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
	
	public void clickonwebtablesbutton() throws InterruptedException
	{
		Thread.sleep(100);
		webtablesbutton.click();
	}
	
	public void filldetails()
	{
		getdriver().switchTo().frame(iframe);
		for(int i=1;i<=10;i++)
		{
			name.clear();
			name.sendKeys(Excelreaddata(path, 1, 0, i));
			email.clear();
			email.sendKeys(Excelreaddata(path, 1, 1, i));
			save.click();
		}
		getdriver().switchTo().defaultContent();
	}
	
	public void getfilldetailsverify()
	{
		ArrayList<String> actualname = new ArrayList<String>();
		for(int i=1;i<=11;i++)
		{
			actualname.add(Excelreaddata(path, 1, 0, i));
		}
		
		
		for(WebElement expectedname:nametextvalue)
		{
			for(String actual:actualname)
			{
				assertEquals(expectedname.getText(), actual);
				System.out.println(expectedname.getText() +" - "+ actual);
				actualname.remove(actual);
			}
		}
		
		
		ArrayList<String> actualemail = new ArrayList<String>();
		for(int i=1;i<=11;i++)
		{
			actualemail.add(Excelreaddata(path, 1, 1, i));
		}
		
		
		for(WebElement expectedemail:emailtextvalue)
		{
			for(String actual:actualemail)
			{
				assertEquals(expectedemail.getText(), actual);
				System.out.println(expectedemail.getText() +" - "+ actual);
				actualemail.remove(actual);
			}
		}
		
	}
	
	public void updatedetails()
	{
		getdriver().switchTo().frame(iframe);
		int i=1;
		for(WebElement edit:editbutton)
		{
			edit.click();
			editname.clear();
			editname.sendKeys(Excelreaddata(path, 1, 2, i));
			editemail.clear();
			editemail.sendKeys(Excelreaddata(path, 1, 3, i));
			updatebutton.click();
			i++;
		}
		getdriver().switchTo().defaultContent();
	}
	
	public void getupdatedetailsverify()
	{
		ArrayList<String> updatedactualname = new ArrayList<String>();
		for(int i=1;i<=11;i++)
		{
			updatedactualname.add(Excelreaddata(path, 1, 2, i));
		}
		System.out.println(updatedactualname);
		
		
		for(WebElement updatedexpectedname:nametextvalue)
		{
			for(String actual:updatedactualname)
			{
				assertEquals(updatedexpectedname.getText(), actual);
				System.out.println(updatedexpectedname.getText() +" - "+ actual);
				updatedactualname.remove(actual);
			}
		}
		
		
		ArrayList<String> updatedactualemail = new ArrayList<String>();
		for(int i=1;i<=11;i++)
		{
			updatedactualemail.add(Excelreaddata(path, 1, 3, i));
		}
		
		
		for(WebElement updatedexpectedemail:emailtextvalue)
		{
			for(String actual:updatedactualemail)
			{
				assertEquals(updatedexpectedemail.getText(), actual);
				System.out.println(updatedexpectedemail.getText() +" - "+ actual);
				updatedactualemail.remove(actual);
			}
		}
		
	}
	
	
	
	
}
