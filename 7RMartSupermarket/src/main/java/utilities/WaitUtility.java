package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
		public static final int IMPLICITWAIT = 5;
		public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
			WebDriverWait waitutility = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITWAIT));
			waitutility.until(ExpectedConditions.elementToBeClickable(element));
		}
}
