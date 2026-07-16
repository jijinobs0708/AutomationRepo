package testscript;

import pages.LoginPage;

import org.testng.annotations.Test;

import pages.HomePage;

public class LogoutTest extends Base {
	HomePage homepage;

	@Test
	public void verifyUserIsAbleToLogOutSuccessfullyFromDashboard() {
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		// loginpage.password(passwordvalue);
		homepage = loginpage.signIn();
		HomePage logoutpage = new HomePage(driver);
		logoutpage.clickOnAdminButton();
		logoutpage.clickOnLogOutButton();
	}
}
