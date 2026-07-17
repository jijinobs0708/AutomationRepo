package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;

public class ManageDeliveryBoyTest extends Base{
	HomePage homepage;
	ManageDeliveryBoyPage managedeliveryboypage;
	@Test(description = "to test Manage delivery Boy")
	public void createNewManageDeliveryBoy() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue).enterPassword(passwordvalue);
		//loginpage.password(passwordvalue);
		homepage =loginpage.signIn();
		String namevalue = ExcelUtility.getStringData(1, 0,"Managedeliveryboypage");
		String emailvalue = ExcelUtility.getStringData(1, 1,"Managedeliveryboypage");
		int phonevalue = ExcelUtility.getIntData(1, 2,"Managedeliveryboypage");
		String addressvalue = ExcelUtility.getStringData(1, 3,"Managedeliveryboypage");
		String usernamevalue1 = ExcelUtility.getStringData(1, 4,"Managedeliveryboypage");
		String passwordvalue1 = ExcelUtility.getStringData(1, 5,"Managedeliveryboypage");
		//ManageDeliveryBoyPage managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage = homepage.clickManageDeliveryBoyMoreInfo();
		managedeliveryboypage.manageDeliveryBoyClickNew().addName(namevalue).addEmail(emailvalue).addPhone(phonevalue).addAddress(addressvalue).addUsername(usernamevalue1).addPassword(passwordvalue1).pageScroll().clickSave();
		/*managedeliveryboypage.addName(namevalue);
		managedeliveryboypage.addEmail(emailvalue);
		managedeliveryboypage.addPhone(phonevalue);
		managedeliveryboypage.addAddress(addressvalue);
		managedeliveryboypage.addUsername(usernamevalue1);
		managedeliveryboypage.addPassword(passwordvalue1);
		managedeliveryboypage.pageScroll();
		managedeliveryboypage.clickSave();*/
		boolean alert = managedeliveryboypage.isAlertDisplayed();
		Assert.assertTrue(alert,Constant.DELIVERYBOYCREATION);
		
		
	}
}
