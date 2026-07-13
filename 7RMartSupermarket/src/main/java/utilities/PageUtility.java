package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropDownVisibleText(WebElement elementname,String visibletext)
	{
		Select select = new Select(elementname);
		select.selectByVisibleText(visibletext);
	}
}
