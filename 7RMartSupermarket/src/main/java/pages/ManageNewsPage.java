package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.WaitUtility;

public class ManageNewsPage {
 public WebDriver driver;
 @FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement footerinfo;
 @FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
 @FindBy(xpath = "//textarea[@id='news']") WebElement enternews;
 @FindBy(xpath = "//button[@type='submit']") WebElement save;
 @FindBy(xpath = "//p[text() = 'Dashboard']") WebElement dashboard;
 @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
 WaitUtility waitutility = new WaitUtility();
 
 public ManageNewsPage(WebDriver driver) {
	 this.driver = driver;
		PageFactory.initElements(driver, this);
}
 
 public void pageScroll()
 {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
 }
 public void clickManageNewsMoreInfo()
 {
     waitutility.waitForElementToBeClickable(driver, footerinfo);
     footerinfo.click();
 }

 
 public void clickManageNewsNewButton()
 {
	 newbutton.click();
 }
 
 public void enterNews(String discountvalue)
 {
	 enternews.sendKeys(discountvalue);
 }
 public void clickSave()
 {
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
