package testscript;

import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;

public class HomeTest extends Base {
	HomePage homepage;
	LoginPage loginpage;
	@Test(description ="Testcase for logout")
	public void verifyUserIsAbleToLogOutSuccessfullyFromDashboard() {
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		// loginpage.password(passwordvalue);
		homepage = loginpage.signIn();
		homepage.clickOnAdminButton();
		loginpage = homepage.clickOnLogOutButton();
		boolean login = homepage.isLoginPageDisplayed();
		Assert.assertTrue(login,Constant.LOGOUT);
	}
}
