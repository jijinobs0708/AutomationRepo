package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
HomePage homepage;
@Test(description= "Testcase for logging with valid credentials")
	public void verifyUserIsAbleToLoginWithValidCredentials() throws IOException
	{
	//String usernamevalue = "admin";
	//String passwordvalue = "admin";
	
	String usernamevalue = ExcelUtility.getStringData(1, 0, "Loginpage");
	String passwordvalue = ExcelUtility.getStringData(1, 1, "Loginpage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
	// loginpage.password(passwordvalue);
	homepage = loginpage.signIn();
	boolean homepage = loginpage.isDashBoardDisplayed();
	Assert.assertTrue(homepage,Constant.LOGINVALIDCREDENTIALS);
	}
@Test(description= "Testcase for logging with valid email and invalid password")
public void verifyUserIsNotAbleToLoginWithInvalidPassword() throws IOException
{
	//String usernamevalue = "admin";
	//String passwordvalue = "ABCadmin";
	String usernamevalue = ExcelUtility.getStringData(2, 0, "Loginpage");
	String passwordvalue = ExcelUtility.getStringData(2, 1, "Loginpage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue).signIn();
	//loginpage.password(passwordvalue);
	//homepage =loginpage.signIn();
	boolean alert = loginpage.isAlertDisplayed();
	Assert.assertTrue(alert,Constant.LOGININVALIDPASSWORD);
}
@Test(description= "Testcase for logging with invalid email and valid password")
public void verifyUserIsNotAbleToLoginWithInvalidEmail() throws IOException
{
	//String usernamevalue = "ABCadmin";
	//String passwordvalue = "admin";
	String usernamevalue = ExcelUtility.getStringData(3, 0, "Loginpage");
	String passwordvalue = ExcelUtility.getStringData(3, 1, "Loginpage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue).signIn();
	//loginpage.password(passwordvalue);
	boolean alert = loginpage.isAlertDisplayed();
	Assert.assertTrue(alert,Constant.LOGININVALIDEMAIL);
}
@Test(description= "Testcase for logging with invalid credentials")
public void verifyUserIsNotAbleToLoginWithInvalidCredentials() throws IOException
{
	//String usernamevalue = "ABCadmin";
	//String passwordvalue = "ABCadmin";
	String usernamevalue = ExcelUtility.getStringData(4, 0, "Loginpage");
	String passwordvalue = ExcelUtility.getStringData(4, 1, "Loginpage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue).signIn();
	//loginpage.password(passwordvalue);
	//homepage =loginpage.signIn();
	boolean alert = loginpage.isAlertDisplayed();
	Assert.assertTrue(alert,Constant.LOGININVALIDCREDENTIALS);
}
}
