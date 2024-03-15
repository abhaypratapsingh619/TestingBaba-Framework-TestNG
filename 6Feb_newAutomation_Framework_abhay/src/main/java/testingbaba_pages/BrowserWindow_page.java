package testingbaba_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class BrowserWindow_page extends Base_Library {
	public BrowserWindow_page() {
		PageFactory.initElements(getdriver(), this);
	}

	@FindBy(xpath = "//*[text()=\"×\"]")
	private WebElement closebutton;

	@FindBy(xpath = "//*[text()=\"Practice\"]")
	private WebElement practicebutton;

	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement alertsframeandwindow;

	@FindBy(xpath = "//*[text()=\"browser windows\"]")
	private WebElement browserwindowsbutton;

	@FindBy(xpath = "//*[@id=\"tab_11\"]/div[1]/a")
	private WebElement newtab;

	@FindBy(xpath = "//*[@id=\"tab_11\"]/div[2]/a")
	private WebElement newwindow;

	@FindBy(xpath = "//*[@id=\"tab_11\"]/div[3]/a")
	private WebElement newwindowmessage;

	@FindBy(xpath = "//*[@id=\"APjFqb\"]")
	private WebElement googlesearch;

	@FindBy(xpath = "/html/body/p")
	private WebElement newwindowmessagetext;

	@FindBy(xpath = "//*[\"display: block\"]/p")
	private WebElement newwindowmessagetext2;

	@FindBy(xpath = "//*['display: block']/p/text()")
	private WebElement newwindowmessagetext3;

	// @FindBy(tagName = "p")
//	private WebElement newwindowmessagetext4;

	public void clickonclosebutton() {
		closebutton.click();
	}

	public void clickonpracticebutton() {
		practicebutton.click();
	}

	public void clickonalertsframeandwindow() {
		alertsframeandwindow.click();
	}

	public void clickonbrowserwindowsbutton() {
		browserwindowsbutton.click();
	}

	public void clickonnewtabbutton() {
		newtab.click();
		changewindow(1);
		googlesearch.sendKeys("abhay");
		googlesearch.sendKeys(Keys.ENTER);
		getdriver().close();
		changewindow(0);
	}

	public void clickonnewwindowbutton() {
		newwindow.click();
		changewindow(1);
		getdriver().manage().window().maximize();
		googlesearch.sendKeys("abhay");
		googlesearch.sendKeys(Keys.ENTER);
		getdriver().close();
		changewindow(0);
	}

	public void clickonnewwindowmessagebutton() throws InterruptedException {
		newwindowmessage.click();
		changewindow(1);
		Thread.sleep(1000);
//		getdriver().manage().window().maximize();
		// System.out.println("test message");
//		System.out.println(newwindowmessagetext3.getText());
		// System.out.println(newwindowmessagetext4.getText());
//		System.out.println(getdriver().switchTo().alert().getText());

//		WebElement ele = getdriver().findElement(By.tagName("p"));
//		String tet = ele.getText();
//		System.out.println(tet);
		getdriver().close();
		changewindow(0);
	}

}
