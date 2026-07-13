package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageUsersPage;
import utilities.ExcelUtility;

public class ManageUsersTest extends Base {
	
	@Test
	public void createNewManageNews() throws IOException
	 {
		 String usernamevalue = ExcelUtility.getStringData(1, 0, "Loginpage");
			String passwordvalue = ExcelUtility.getStringData(1, 1, "Loginpage");
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUserName(usernamevalue);
			loginpage.password(passwordvalue);
			loginpage.signIn();
			String namevalue = ExcelUtility.getStringData(1, 0,"Manageuserspage");
			ManageUsersPage manageuserspage = new ManageUsersPage(driver);
			manageuserspage.manageUsersMoreInfo();
			manageuserspage.clickManageUsersSearch();
			manageuserspage.addNameForSearching(namevalue);
			manageuserspage.clickSearchbutton();
			boolean searchbutton = manageuserspage.isSearchResultDisplayed();
			Assert.assertTrue(searchbutton);
			
			
	 }
}
