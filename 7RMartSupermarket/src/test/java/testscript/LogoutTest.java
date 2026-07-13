package testscript;

import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends Base{
	public void verifyUserIsAbleToLogOutSuccessfullyFromDashboard()
	{
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.password(passwordvalue);
		loginpage.signIn();
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickOnAdminButton();
		logoutpage.clickOnLogOutButton();
	}
}
