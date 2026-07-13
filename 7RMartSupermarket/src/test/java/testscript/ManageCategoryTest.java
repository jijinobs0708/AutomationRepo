package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{
	@Test
	public void createNewManageCategory() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.password(passwordvalue);
		loginpage.signIn();
		String categoryvalue = ExcelUtility.getStringData(1, 0, "Managecategorypage");
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickManageCategoryMoreInfo();
		managecategorypage.clickNewCategory();
		managecategorypage.addCategory(categoryvalue);
		managecategorypage.clickGoodness();
		managecategorypage.clickVegan();
		managecategorypage.clickGlutenfree();
		managecategorypage.clickOrganic();
		managecategorypage.clickChooseFile();
		managecategorypage.clickSave();
		boolean alert = managecategorypage.isAlertDisplayed();
		Assert.assertTrue(alert);
		
		
	}
	
}
