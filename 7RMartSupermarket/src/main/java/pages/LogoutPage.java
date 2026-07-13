package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@data-toggle='dropdown']")WebElement admin;
	@FindBy(xpath = "//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
		public LogoutPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	 public void clickOnAdminButton()
	 {
		 admin.click();
		
	 }
	  public void clickOnLogOutButton()
	  {
		  logout.click();
	  }
}
