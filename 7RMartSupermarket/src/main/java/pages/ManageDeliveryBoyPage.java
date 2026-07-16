package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageDeliveryBoyPage {
	 public WebDriver driver;
	// @FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']") WebElement managedeliveryboymoreinfo;
	 @FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newdelivery;
	 @FindBy(xpath = "//input[@id='name']")WebElement name;
	 @FindBy(xpath = "//input[@id='email']")WebElement email;
	 @FindBy(xpath = "//input[@id='phone']") WebElement phone;
	 @FindBy(xpath = "//textarea[@id='address']")WebElement address;
	 @FindBy(xpath = "//input[@id='username']")WebElement username;
	 @FindBy(xpath = "//input[@id='password']")WebElement password;
	 @FindBy(xpath = "//button[@name = 'create']")WebElement save;
	 @FindBy(xpath = "//p[text() = 'Dashboard']") WebElement dashboard;
	 @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	 WaitUtility waitutility = new WaitUtility();
	 PageUtility pageutility = new PageUtility();
	 
	 public ManageDeliveryBoyPage(WebDriver driver) 
	 {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	 }
	 /*public void clickManageDeliveryBoyMoreInfo()
	 {
		 managedeliveryboymoreinfo.click();
	 }*/
	 public ManageDeliveryBoyPage manageDeliveryBoyClickNew()
	 {
		 newdelivery.click();
		 return this;
	 }
	 public ManageDeliveryBoyPage addName(String namevalue)
	 {
		 name.sendKeys(namevalue);
		 return this;
	 }
	 public ManageDeliveryBoyPage addEmail(String emailvalue)
	 {
		 email.sendKeys(emailvalue);
		 return this;
	 }
	 public ManageDeliveryBoyPage addPhone(int phonevalue)
	 {
		phone.sendKeys(String.valueOf(phonevalue));
		return this;
	 }
	 public ManageDeliveryBoyPage addAddress(String addressvalue)
	 {
		 address.sendKeys(addressvalue);
		 return this;
	 }
	 public ManageDeliveryBoyPage addUsername(String usernamevalue1)
	 {
		 username.sendKeys(usernamevalue1);
		 return this;
	 }
	 public ManageDeliveryBoyPage addPassword(String passwordvalue1)
	 {
		 password.sendKeys(passwordvalue1);
		 return this;
	 }
	 public ManageDeliveryBoyPage pageScroll()
	 {
		 pageutility.javaScriptExecutorFullDocumentScroll(driver);
		 return this;
	
	 }
	 public ManageDeliveryBoyPage clickSave()
	 {
		 waitutility.waitForElementToBeClickable(driver, save);
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
