package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;


public class ManageNewsPage {
 public WebDriver driver;
 //@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement managenewsmoreinfo;
 @FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
 @FindBy(xpath = "//textarea[@id='news']") WebElement enternews;
 @FindBy(xpath = "//button[@type='submit']") WebElement save;
 @FindBy(xpath = "//p[text() = 'Dashboard']") WebElement dashboard;
 @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
 //WaitUtility waitutility = new WaitUtility();
 PageUtility pageutility = new PageUtility();
 
 public ManageNewsPage(WebDriver driver) {
	 this.driver = driver;
		PageFactory.initElements(driver, this);
}
 
 /*public void pageScroll()
 {
pageutility.javaScriptExecutorFullDocumentScroll(driver);
 }
 /*public void clickManageNewsMoreInfo()
 {
     //waitutility.waitForElementToBeClickable(driver, footerinfo);
	 managenewsmoreinfo.click();
 }*/

 
 public ManageNewsPage clickManageNewsNewButton()
 {
	 newbutton.click();
	 return this;
 }
 
 public ManageNewsPage enterNews(String discountvalue)
 {
	 enternews.sendKeys(discountvalue);
	 return this;
 }
 public ManageNewsPage clickSave()
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
