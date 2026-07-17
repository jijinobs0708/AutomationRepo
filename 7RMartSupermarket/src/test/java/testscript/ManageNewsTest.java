package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	HomePage homepage;
	ManageNewsPage managenewspage;
	
	@Test(retryAnalyzer=retry.Retry.class,groups= {"regression"},description="for managing news")
	public void createNewManageNews() throws IOException
	 {
		 String usernamevalue = ExcelUtility.getStringData(1, 0, "Loginpage");
			String passwordvalue = ExcelUtility.getStringData(1, 1, "Loginpage");
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
			//loginpage.password(passwordvalue);
			homepage =loginpage.signIn();
			String discountvalue = ExcelUtility.getStringData(1, 0,"Managenewspage");
			//ManageNewsPage managenewspage = new ManageNewsPage(driver);
			managenewspage = homepage.pageScroll().clickManageNewsMoreInfo();
			//managenewspage = homepage.clickManageNewsMoreInfo();
			managenewspage.clickManageNewsNewButton().enterNews(discountvalue).clickSave();
			/*managenewspage.enterNews(discountvalue);
			managenewspage.clickSave();*/
			boolean alert = managenewspage.isAlertDisplayed();
			Assert.assertTrue(alert,Constant.NEWSCREATION);
			
}
}
