package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageUsersPage;
import utilities.ExcelUtility;

public class ManageUsersTest extends Base {
	HomePage homepage;
	ManageUsersPage manageuserspage;

	@Test(description = "to test Manage users")
	public void createNewManageNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		// loginpage.password(passwordvalue);
		homepage = loginpage.signIn();
		String namevalue = ExcelUtility.getStringData(1, 0, "Manageuserspage");
		// ManageUsersPage manageuserspage = new ManageUsersPage(driver);
		manageuserspage = homepage.clickManageUsersMoreInfo();
		manageuserspage.clickManageUsersSearch().addNameForSearching(namevalue).clickSearchbutton();
		boolean searchbutton = manageuserspage.isSearchResultDisplayed();
		Assert.assertTrue(searchbutton, Constant.MANAGEUSERSEARCH);

	}
}
