package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends BasePage {

	public ResultsPage(WebDriver driver) {
		super(driver);
	}
	
	private By number_of_results = By.xpath("//*[@id=\"result-stats\"]");
	private By time_of_results = By.xpath("//*[@id=\"result-stats\"]/nobr");
	
	public boolean is_numOfResults_displayed() {
		wait_for_elements(BasePageDriver, 15, number_of_results);
		return BasePageDriver.findElement(number_of_results).isDisplayed();
	}

	public boolean is_timeOfResults_diplayed() {
		wait_for_elements(BasePageDriver, 15, time_of_results);
		return BasePageDriver.findElement(time_of_results).isDisplayed();
	}

}
