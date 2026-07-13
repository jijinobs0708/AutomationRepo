package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageDeliveryBoyPage {
	 public WebDriver driver;
	 @FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']") WebElement footerinfo;
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
	 
	 public ManageDeliveryBoyPage(WebDriver driver) 
	 {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	 }
	 public void manageDeliveryBoyMoreInfo()
	 {
		 footerinfo.click();
	 }
	 public void manageDeliveryBoyClickNew()
	 {
		 newdelivery.click();
	 }
	 public void addName(String namevalue)
	 {
		 name.sendKeys(namevalue);
	 }
	 public void addEmail(String emailvalue)
	 {
		 email.sendKeys(emailvalue);
	 }
	 public void addPhone(int phonevalue)
	 {
		phone.sendKeys(String.valueOf(phonevalue));
	 }
	 public void addAddress(String addressvalue)
	 {
		 address.sendKeys(addressvalue);
	 }
	 public void addUsername(String usernamevalue1)
	 {
		 username.sendKeys(usernamevalue1);
	 }
	 public void addPassword(String passwordvalue1)
	 {
		 password.sendKeys(passwordvalue1);
	 }
	 public void pageScroll()
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,150)","");
	 }
	 public void clickSave()
	 {
		 waitutility.waitForElementToBeClickable(driver, save);
		 save.click();
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
