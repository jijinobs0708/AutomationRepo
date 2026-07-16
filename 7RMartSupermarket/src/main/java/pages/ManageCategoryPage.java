package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
public WebDriver driver;
//@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement managecategorymoreinfo;
@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newcategory;
@FindBy(xpath = "//input[@id='category']")WebElement category;
@FindBy(xpath ="//li[@id=\"1-selectable\"]" )WebElement goodness ;
@FindBy(xpath = "//li[@id=\"2-selectable\"]")WebElement vegan;
@FindBy(xpath = "//li[@id=\"3-selectable\"]")WebElement glutenfree;
@FindBy(xpath = "//li[@id=\"4-selectable\"]")WebElement organic ;
@FindBy(xpath = "//input[@id='main_img']") WebElement choosefile;
@FindBy(xpath = "//button[@type='submit']")WebElement save;
@FindBy(xpath = "//p[text() = 'Dashboard']") WebElement dashboard;
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
FileUploadUtility fileuploadutility = new FileUploadUtility();
WaitUtility waitutility = new WaitUtility();
PageUtility pageutility = new PageUtility();



public ManageCategoryPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
/*public void clickManageCategoryMoreInfo()
{
	managecategorymoreinfo.click();
}*/
public ManageCategoryPage clickNewCategory()
{
	newcategory.click();
	return this;
}
public ManageCategoryPage addCategory(String categoryvalue)
{
	category.sendKeys(categoryvalue);
	return this;
	
}
public ManageCategoryPage clickGoodness()
{
	goodness.click();
	return this;
}
public ManageCategoryPage clickVegan()
{
	vegan.click();
	return this;
}
public ManageCategoryPage clickGlutenfree()
{
	glutenfree.click();
	return this;
}
public ManageCategoryPage clickOrganic()
{
	organic.click();
	return this;
}

public ManageCategoryPage clickChooseFile()
{
	fileuploadutility.fileUploadUsingSendKeys(choosefile, Constant.FRUITIMG);
	return this;
}

public ManageCategoryPage clickSave()
{
	waitutility.waitForElementToBeClickable(driver, save);
	 pageutility.javaScriptExecutorClick(driver, save);
	//save.click();
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
