package applicationutility;

import org.openqa.selenium.WebElement;

public interface Application_utility 
{
	public void doubleclick(WebElement element);
	public void rightclick(WebElement element);
	public void changewindow(int index_no);
	public void acceptalert();
	public void dismissalert();
	public void sendkeys_alert(String value);
	public void fileuploading(String path);
	public void dropdown_text(WebElement element, String text);
	public void dropdown_value(WebElement element, String value);
	public void dropdown_index(WebElement element, int index);
	public void mousehover(WebElement element);
	public void mousehover_click(WebElement element, String value);
}
