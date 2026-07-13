package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUsersPage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-user']")WebElement footerinfo;
	@FindBy(xpath = "//a[@href='javascript:void(0)']") WebElement search;
	@FindBy(xpath ="//input[@id='un']") WebElement name;
	@FindBy(xpath = "//button[@name='Search']")WebElement searchbutton;
	@FindBy(xpath = "//p[text() = 'Dashboard']") WebElement dashboard;
	 public ManageUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	 public void manageUsersMoreInfo()
	 {
		 footerinfo.click();
	 }
	 public void clickManageUsersSearch()
	 {
		 search.click();
	 }
	 public void addNameForSearching(String namevalue)
	 {
		 name.sendKeys(namevalue);
	 }
	 public void clickSearchbutton()
	 {
		 searchbutton.click();
	 }
	 public boolean isDashBoardDisplayed()
	 {
	 	return dashboard.isDisplayed();
	 }
	 public boolean isSearchResultDisplayed()
	 {
	 	 return searchbutton.isDisplayed();
	 }
}
