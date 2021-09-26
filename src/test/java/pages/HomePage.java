package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By logo = By.xpath("/html/body/div[1]/div[2]/div/a/picture");
	private By search_box = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
	private By search_button = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");

	public boolean is_logo_displayed() {
		wait_for_elements(BasePageDriver, 15, logo);
		return BasePageDriver.findElement(logo).isDisplayed();
	}

	public boolean is_searchbox_diplayed() {
		wait_for_elements(BasePageDriver, 15, search_box);
		return BasePageDriver.findElement(search_box).isDisplayed();
	}

	public void click_on_search() {
		wait_for_elements(BasePageDriver, 15, search_button);
		BasePageDriver.findElement(search_button).click();
	}

	public void press_enter_to_search() {
		wait_for_elements(BasePageDriver, 15, search_button);
		BasePageDriver.findElement(search_button).sendKeys(Keys.ENTER);
	}

	public void insert_search_keyword(String search_keyword) {
		wait_for_elements(BasePageDriver, 15, search_box);
		BasePageDriver.findElement(search_box).sendKeys(search_keyword);
	}

}
