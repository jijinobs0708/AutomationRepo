package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{
	HomePage homepage;
	AdminUsersPage adminuserpage;
	@Test (description = "to test Admin users")
 public void createNewAdminUser() throws IOException
 {
	 String usernamevalue = ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		// loginpage.password(passwordvalue);
		homepage = loginpage.signIn();
		String usernamevalue1 = ExcelUtility.getStringData(1, 0,"Adminuserpage");
		String passwordvalue1 = ExcelUtility.getStringData(1, 1, "Adminuserpage");
		String usertype = ExcelUtility.getStringData(1, 2, "Adminuserpage");
		//AdminUsersPage adminuserpage = new AdminUsersPage(driver);
		adminuserpage = homepage.clickAdminUsersMoreInfo();
		adminuserpage.clickNew().enterUserName(usernamevalue1).enterPassword(passwordvalue1).selectUserType(usertype).save();
		/*adminuserpage.enterUserName(usernamevalue1);
		adminuserpage.enterPassword(passwordvalue1);
		adminuserpage.selectUserType(usertype);
		adminuserpage.save();*/
		boolean alert = adminuserpage.isAlertDisplayed();
		Assert.assertTrue(alert,Constant.ADMINUSERCREATION);
		
	
		
 }
}
