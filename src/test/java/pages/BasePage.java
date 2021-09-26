package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver BasePageDriver;

	BasePage(WebDriver driver) {
		BasePageDriver = driver;
	}

	public void wait_for_elements(WebDriver driver, int time, By element_name) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element_name));
	}

}
