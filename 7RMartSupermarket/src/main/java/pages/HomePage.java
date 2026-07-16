package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement managenewsmoreinfo;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-user']")WebElement manageusersmoreinfo;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement adminusersmoreinfo;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement managecategorymoreinfo;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']") WebElement managedeliveryboymoreinfo;
	@FindBy(xpath = "//a[@data-toggle='dropdown']")WebElement admin;
	@FindBy(xpath = "//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
	PageUtility pageutility = new PageUtility();
	
	
		public HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		 public ManageNewsPage clickManageNewsMoreInfo()
		 {
			 managenewsmoreinfo.click();
			 return new ManageNewsPage(driver);
		 }	
		 
		 public HomePage pageScroll()
		 {

		pageutility.javaScriptExecutorFullDocumentScroll(driver);
		return this;

		 }
		 
		 public ManageUsersPage clickManageUsersMoreInfo()
		 {
			 manageusersmoreinfo.click();
			 return new ManageUsersPage(driver);
		 }
		 public AdminUsersPage clickAdminUsersMoreInfo()
		 {
			 adminusersmoreinfo.click();
			 return new AdminUsersPage(driver);
		 }
		 public ManageCategoryPage clickManageCategoryMoreInfo()
		 {
		 	managecategorymoreinfo.click();
			return new ManageCategoryPage(driver);
		 }
		 public ManageDeliveryBoyPage clickManageDeliveryBoyMoreInfo()
		 {
			 managedeliveryboymoreinfo.click();
			 return new ManageDeliveryBoyPage(driver);
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
