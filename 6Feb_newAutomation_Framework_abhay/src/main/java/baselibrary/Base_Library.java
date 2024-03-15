package baselibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import applicationutility.Application_utility;
import excelutility.Excel_ReadData;
import propertyutility.propertyutility;
import screenshot.Screenshot_utility;

public class Base_Library implements Excel_ReadData, Application_utility, propertyutility, Screenshot_utility
{

//	public static WebDriver driver;
	public static ThreadLocal<WebDriver> driver = new InheritableThreadLocal<WebDriver>();
	
	public void setdriver(WebDriver driver)
	{
		Base_Library.driver.set(driver);
	}
	
	public WebDriver getdriver()
	{
		return Base_Library.driver.get();
	}
	
	public void launchUrl(String url, String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\drivers\\chromedriver.exe");	
//			driver = new ChromeDriver();
			setdriver(new ChromeDriver());
		}
		else if(browsername.equalsIgnoreCase("mozila"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\drivers\\geckodriver.exe");	
			setdriver(new FirefoxDriver());
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.msedge.driver", "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\drivers\\msedgedriver.exe");	
			setdriver(new EdgeDriver());
		}
//		driver.get(url);
//		driver.manage().window().maximize();
		getdriver().get(url);
		getdriver().manage().window().maximize();
//		getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try 
		{
			Thread.sleep(1000);
//			getdriver().findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		} 
		catch (Exception e) {	
		}
		
	}
	
	@AfterTest
	public void teardown()
	{
		getdriver().quit();  // close the browser
//		driver.close(); // close the current tab
	}

	@Override
	public String Excelreaddata(String path, int sheet_no, int column_no, int row_no) {
		String value = "";
		try
		{
			FileInputStream file = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(sheet_no);
			value = sheet.getRow(row_no).getCell(column_no).getStringCellValue();
			wb.close();
		}
		catch(Exception ex)
		{
			System.out.println("issue in file read "+ex);
		}
		return value;
	}

	@Override
	public void doubleclick(WebElement element) 
	{
		Actions act = new Actions(getdriver());
		act.doubleClick(element).perform();
	}

	@Override
	public void rightclick(WebElement element) 
	{
		Actions act = new Actions(getdriver());
		act.contextClick(element).perform();
	}

	@Override
	public void changewindow(int index_no) 
	{
		Set<String> tabs = getdriver().getWindowHandles();
		ArrayList<String> tabs_no = new ArrayList<String>(tabs);
		getdriver().switchTo().window(tabs_no.get(index_no));
	}

	@Override
	public void acceptalert() 
	{
		getdriver().switchTo().alert().accept();	
	}

	@Override
	public void dismissalert() 
	{		
		getdriver().switchTo().alert().dismiss();
	}

	@Override
	public void sendkeys_alert(String value) 
	{
		getdriver().switchTo().alert().sendKeys(value);
	}

	@Override
	public void fileuploading(String path) 
	{
		try 
		{
			StringSelection sel = new StringSelection(path);
			Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
			clip.setContents(sel, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} 
		catch (Exception e) 
		{
			System.out.println("issue in file upload"+e);
		}
		
	}

	@Override
	public int ExcelRowcount(String path, int sheet_no) {
		int rowcount = 0;
		try
		{
			FileInputStream file = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(sheet_no);
			rowcount = sheet.getLastRowNum()-1;
			wb.close();
		}
		catch(Exception ex)
		{
			System.out.println("issue in getting row count");
		}
		return rowcount;
	}

	@Override
	public void dropdown_text(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	@Override
	public void dropdown_value(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);		
	}

	@Override
	public void dropdown_index(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	@Override
	public void mousehover(WebElement element) {
		Actions acts = new Actions(getdriver());
		acts.moveToElement(element).perform();
	}

	@Override
	public void mousehover_click(WebElement element, String value) {
		Actions acts = new Actions(getdriver());
		acts.moveToElement(element).build().perform();
		getdriver().findElement(By.linkText(value)).click();
	}

	String configpath = "C:\\JAVA\\workspace\\6Feb_newAutomation_Framework_abhay\\testdata\\config.properties";
	@Override
	public String getreaddata(String key) 
	{
		String value = "";
		try 
		{
			FileInputStream file = new FileInputStream(configpath);
			Properties prop = new Properties();
			prop.load(file);
			value = prop.getProperty(key);
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in get read data "+e);
		}
		return value;
	}

	@Override
	public void getScreenshot(String foldername, String filename) 
	{
		try 
		{
			String loc = System.getProperty("user.dir");
			String finalpath = loc+"//Screenshots//"+foldername+"//"+filename+".png";
			EventFiringWebDriver efwd = new EventFiringWebDriver(getdriver());
			File src = efwd.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(finalpath));
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in getting screenshot "+e);
		}
		
	}
	
	@AfterMethod
	public void getResultAnalysis(ITestResult result)
	{
		String methodname = result.getMethod().getMethodName();
		try 
		{
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				getScreenshot("pass", methodname);
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				getScreenshot("fail", methodname);
			}
			else
			{
				getScreenshot("skip", methodname);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in get screenshot result analysis "+e);
		}
	}
}
