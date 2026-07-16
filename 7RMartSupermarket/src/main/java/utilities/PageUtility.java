package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility { // helps page class.we create repeat methods used in page class here

	public void dropDownVisibleText(WebElement elementname, String visibletext) {
		Select select = new Select(elementname);
		select.selectByVisibleText(visibletext);
	}

	public void dropDownValue(WebElement elementname, String value) {
		Select select = new Select(elementname);
		select.selectByValue(value);
	}

	public void dropDownIndex(WebElement elementname, int index) {
		Select select = new Select(elementname);
		select.selectByIndex(index);
	}

	public void dragAndDrop(WebDriver driver, WebElement drag, WebElement drop) {
		Actions obj = new Actions(driver);
		obj.dragAndDrop(drag, drop).perform();
	}

	public void mouseHover(WebDriver driver, WebElement mousehover) {
		Actions obj = new Actions(driver);
		obj.moveToElement(mousehover).perform();
	}

	public void rightClick(WebDriver driver, WebElement rightclick) {
		Actions obj = new Actions(driver);
		obj.contextClick(rightclick).perform();
	}

	public void doubleClick(WebDriver driver, WebElement doubleclick) {
		Actions obj = new Actions(driver);
		obj.doubleClick(doubleclick).perform();
	}

	public void click(WebDriver driver, WebElement click) {
		Actions obj = new Actions(driver);
		obj.click(click).perform();
	}

	public void javaScriptExecutorInputValue(WebDriver driver, WebElement elementname, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'value';", elementname);
	}

	public void javaScriptExecutorClick(WebDriver driver, WebElement elementname) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elementname);
	}

	public void javaScriptExecutorScroll(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(x,y)", "",x,y);
		js.executeScript("window.scrollBy(" + x + "," + y + ");");
	}

	public void javaScriptExecutorFullDocumentScroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
}
