package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base {
	HomePage homepage;
	ManageCategoryPage managecategorypage;

	@Test(description = "to test Manage Category")
	public void createNewManageCategory() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		// loginpage.password(passwordvalue);
		homepage = loginpage.signIn();
		// String categoryvalue = ExcelUtility.getStringData(1, 0,
		// "Managecategorypage");
		// ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		FakerUtility faker = new FakerUtility();
		String categoryvalue = faker.generateCategory();
		managecategorypage = homepage.clickManageCategoryMoreInfo();
		managecategorypage.clickNewCategory().addCategory(categoryvalue).clickGoodness().clickVegan().clickGlutenfree()
				.clickOrganic().clickChooseFile().clickSave();
		/*
		 * managecategorypage.addCategory(categoryvalue);
		 * managecategorypage.clickGoodness(); managecategorypage.clickVegan();
		 * managecategorypage.clickGlutenfree(); managecategorypage.clickOrganic();
		 * managecategorypage.clickChooseFile(); managecategorypage.clickSave();
		 */
		boolean alert = managecategorypage.isAlertDisplayed();
		Assert.assertTrue(alert);

	}

}
