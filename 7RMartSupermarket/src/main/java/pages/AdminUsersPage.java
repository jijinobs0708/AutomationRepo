package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUsersPage {
public WebDriver driver;
//@FindBy(xpath = "//p[text() ='Admin Users']")WebElement adminuser;
//@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement adminmoreinfo;
@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newuser;
@FindBy(xpath = "//input[@id='username']")WebElement username1;
@FindBy(xpath = "//input[@id='password']")WebElement password1;
@FindBy(xpath = "//select[@id='user_type']")WebElement usertype;
@FindBy(xpath = "//button[@name='Create']")WebElement save;
@FindBy(xpath = "//p[text() = 'Dashboard']") WebElement dashboard;
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
PageUtility pageutility = new PageUtility();

public AdminUsersPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}

 /*public void clickAdminMoreInfo()
 {
	 adminmoreinfo.click();
 }*/
public AdminUsersPage clickNew()
{
	newuser.click();
	return this;
}

public AdminUsersPage enterUserName(String usernamevalue1)
{
	 username1.sendKeys(usernamevalue1);
	 return this;
}
public AdminUsersPage enterPassword(String passwordvalue1)
{
	password1.sendKeys(passwordvalue1);
	return this;
}

public AdminUsersPage selectUserType(String userType)
{
	
	pageutility.dropDownVisibleText(usertype, userType);
	return this;
}

public AdminUsersPage save()
{
	save.click();
	return this;
}
public boolean isDashBoardDisplayed()
{
	return dashboard.isDisplayed();
}
public boolean isAlertDisplayed()
{
	 return alert.isDisplayed();
}
}
